class TeamLead extends Employee {
    public void printpay1() {
      double da = 0.97 * super.pay;
      double hra = 0.1 * super.pay;
      double pf = 0.12 * super.pay;
      double sf = 0.001 * super.pay;
      double gp = super.pay + da + sf + hra;
      double np = gp - pf;
      System.out.print("Name of Employee: ");    
      System.out.println(super.name);
      System.out.println("designation: TeamLead");
      System.out.print("Net Pay: ");    
      System.out.println(np);
      System.out.print("and Gross Pay: ");    
      System.out.println(np);
    }
  }
  