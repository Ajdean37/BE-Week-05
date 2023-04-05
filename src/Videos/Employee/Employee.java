package src.Videos.Employee;

public abstract class Employee {

  public Employee(String firstName, String lastName, double pay) {
    this.firstName = firstName;;
    this.lastName = lastName;
    this.pay = pay;
  }

  public abstract double calculatePay();

  public String getInformation(){
    return "Name: " + firstName + " " + lastName + "/nReports to: " + reportsTo + "/nAdress: " + address;
  }
  
  private String firstName;
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  private String lastName;
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  private String address;
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  private String reportsTo;
  public String getReportsTo() {
    return reportsTo;
  }

  public void setReportsTo(String reportsTo) {
    this.reportsTo = reportsTo;
  }

  private double pay;
  public double getPay() {
    return pay;
  }

  public void setPay(double pay) {
    this.pay = pay;
  }


  
}
