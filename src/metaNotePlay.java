import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;

public class metaNotePlay 
{
	public void playMusic(String filename,ArrayList<Integer> note) throws Exception
	{
		File file = new File(filename);
		if(!file.exists())
			throw new Exception("no file found!");
		String[] list = file.list();
		int size = note.size();
		//String filepath = "C:/Users/biront/Desktop/∏÷«Ÿ“ÙΩ◊“Ù–ß£®88“Ù£©/raw/";
		 
         
		for(int i = 0; i < size; i++)
		{
			String path = filename+list[note.get(i)];
			this.play(path);
			//this.sleep(1000);
			Thread.currentThread().sleep(2000);
		}
		
	}
	public void play(String filePath) {  
        final File file = new File(filePath);  
   
        try {  
            final AudioInputStream in = AudioSystem.getAudioInputStream(file);  
               
            final AudioFormat outFormat = getOutFormat(in.getFormat());  
            final DataLine.Info info = new DataLine.Info(SourceDataLine.class, outFormat);  
   
            final SourceDataLine line = (SourceDataLine) AudioSystem.getLine(info);  
   
            if (line != null) {  
                line.open(outFormat);  
                line.start();  
                stream(AudioSystem.getAudioInputStream(outFormat, in), line);  
                line.drain();  
                line.stop();  
            }  
   
        } catch (Exception e) {  
            throw new IllegalStateException(e);  
        }  
    }  
   
    private AudioFormat getOutFormat(AudioFormat inFormat) 
    {  
        final int ch = inFormat.getChannels();  
        final float rate = inFormat.getSampleRate();  
        return new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, rate, 16, ch, ch * 2, rate, false);  
    }  
   
    private void stream(AudioInputStream in, SourceDataLine line)  
        throws IOException 
    {  
        final byte[] buffer = new byte[65536];  
        for (int n = 0; n != -1; n = in.read(buffer, 0, buffer.length)) 
        {  
            line.write(buffer, 0, n);  
        }  
    }  
 

}
