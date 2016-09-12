public class Droid {
  
  int batteryLevel;
  
  
  public Droid () {
    
int batteryLevel = 100;
    
}
  public void activate (){
    System.out.println("Activated. How can i help you?");
     batteryLevel = batteryLevel + 100;
    System.out.println("Battery level is: " + batteryLevel + " percent.");
  }
  
  public void chargeBattery (int hours){
    System.out.println("Droid charging");
    batteryLevel = batteryLevel + hours;
    if (batteryLevel > 100) {
      batteryLevel = 100;
      System.out.println(batteryLevel);
    }else{
      System.out.println(batteryLevel);
    }
  }
  
	public int checkbatterylevel() {
		System.out.println("batterylevel is" + batteryLevel + "%");
		return batteryLevel;
  }
  public void hover (int feet){
    if (feet > 2){
      System.out.println("cant hover above two feet" + feet);
    }else{
      System.out.println("HOVERING BITCHES!" + feet + " feet! ");
      batteryLevel = batteryLevel - 20;
    }
  }
  
  public static void main (String[] args){
    Droid dobject = new Droid();
    dobject.activate();
    dobject.chargeBattery(100);
    dobject.hover(2);
   
  }
}