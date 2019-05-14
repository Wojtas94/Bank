public class Bank {

    public static void main(String[] args) {
        CompanyAccount ca = new CompanyAccount(1122222, 2233333);
        ca.depositOrWithdraw();
        ca.open("Aleksander", 22233, "stan");
        ca.toString();
        PersonalAccount pa = new PersonalAccount();
        pa.downloadType();
        pa.downloadType();

    }
}
