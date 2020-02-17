
// Taken from Java How to Program by Paul Dietel 
// This piece of code is to calculate PI value using monte carlo method

class MonteCarloPI
{
	public static void main(String [] args)
	{
		int iter = 10000;
		int hits = 0;
		for (int i=0; i< iter; i++)
		{
			double rX = 2*Math.random() - 1.0;
			double rY = 2*Math.random() - 1.0;
			double dist = rX*rX + rY*rY;
			if (dist<=0)
				hits++;
			
		}
		double ratio = (double)hits/iter;
		double area = ratio*4.0;
		System.out.println("Estimation of PI: "+area+"versus library PI "+ Math.PI);
	}
}