public abstract class Account {

    public  boolean open(String clientData, long nr, String state){
       return true;
    }

    public  void depositOrWithdraw(){

    }

    public  void downloadType(){

    }


    public enum AccountType{
        PERSONAL,
        COMPANY
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
