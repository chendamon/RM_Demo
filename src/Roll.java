import java.util.ArrayList;

public class Roll 
{
	public static void main(String[] args) throws Exception
	{
		ArrayList<Integer> notes = new Random_numbers().geRNS(100);
		for(int i = 0; i < notes.size(); i++)
			System.out.println(notes.get(i));
		//metaNotePlay play = new metaNotePlay();
		//play.playMusic("C:/Users/biront/Desktop/¸ÖÇÙÒô½×ÒôÐ§£¨88Òô£©/raw/",notes);
	}
}
