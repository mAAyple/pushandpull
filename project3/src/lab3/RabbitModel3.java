package lab3;

public class RabbitModel3 {
	  private int Population = 500;
	  private int Year = 1;
	  public RabbitModel3()
	  {
	  }
	  
	  public int getPopulation()
	  {
	    return Population;
	  }
	  
	  public void simulateYear()
	  {
		  Population = Population/2;
		  Year ++;
	  }
	  
	  public void reset()
	  {
		  Population = 0;
		  Year = 1;
	  }
}
