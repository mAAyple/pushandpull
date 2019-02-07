package lab3;
public class RabbitModel {
	  private int Population;
	  private int Year;
	  private int yearBefore;
	  public RabbitModel()
	  {
		  Population = 0;
		  Year = 1;
		  yearBefore = 0;
	  }
	  
	  public int getPopulation()
	  {
	    return Population;
	  }
	  
	  public void simulateYear()
	  {
		  Population = Year + yearBefore;
		  yearBefore = Year;
		  Year++;		 
	  }
	  
	  public void reset()
	  {
		  Population = 0;
		  Year = 1;
		  yearBefore = 0;
	  }
}
