package white;

public class whiteboxtest {
	public static String result=null;
	public static void main(String[]args) {
		findMinMax(args);
	}

	public static void findMinMax(String[]args) {
		
		
		int mi,ma;
		if(args.length==0) {//1
			System.out.println("no numbers");
			result="nonumbers";
			
		}else {
			mi=ma=Integer.parseInt(args[0]);
			for(int i=1;i<args.length;i++)//2
			{
				int obs=Integer.parseInt(args[i]);
				if(obs>ma)
					ma=obs;//3
				else if (mi>obs)
					mi=obs;//4
				
				
			}
			System.out.println("minimum="+mi+";maximum="+ma);
			result=mi+","+ma;
		}
		
		
	
	
	
	
	}








}
