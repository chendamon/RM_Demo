import java.util.ArrayList;
import java.util.Random;

/*
 *生成特定长度的数字串，作为音符
 *author biront
 *date 2015/12/3
 */
public class Random_numbers 
{
	public ArrayList<Integer> geRNS(int length)
	{
		ArrayList<Integer> note = new ArrayList<Integer>();
		Random random = new Random();
		for(int i = 0; i < length; i++)
		{
			int temp = random.nextInt(88);
			temp = temp%88;
			note.add(temp+1);
			
		}
		return note;
		
	}

}
