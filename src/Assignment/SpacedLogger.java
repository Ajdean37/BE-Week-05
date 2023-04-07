package src.Assignment;

public class SpacedLogger implements Logger {

  private String str;

  public String getStr() {
    return str;
  }

  public void setStr(String str) {
    this.str = str;
  }

  @Override
  public void log() {
   System.out.println("hello");
  }

  @Override
  public void error(String error) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'error'");
  }
  
}
