public class Main {
  public static void main (String args[]) {
    System.out.println("==============For Programmer=============");
    Programmer nameofemployee1= new Programmer();
    
    System.out.println("==============For AssistantProjectManager=============");
    AssistantProjectManager nameofemployee2= new AssistantProjectManager();
    
    System.out.println("==============For ProjectManager=============");
    ProjectManager nameofemployee3= new ProjectManager();
    
    System.out.println("==============For TeamLead=============");
    TeamLead nameofemployee4= new TeamLead();
    System.out.println("==========================");
    nameofemployee1.printpay1();
    System.out.println("==========================");
    nameofemployee2.printpay1();
    System.out.println("==========================");
    nameofemployee3.printpay1();
    System.out.println("==========================");
    nameofemployee4.printpay1();

  }
}
