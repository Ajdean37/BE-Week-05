package src.Assignment;

public class AsteriskLogger implements Logger{

  public String log {


  @Override
  public String log(String log) {
    public String getLog() {
      return "***" + log + "***";
    }
  }

  public void setLog(String log) {
    this.log = log;
  }

  @Override
  public String error(String error) {
    public String getError() {
      return "**********/n" + "***Error: " + error + "***" + "/n**********";
    }
  }

  public void setError(String error) {
    this.error = error;
  }
}
