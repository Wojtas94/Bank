import static javax.swing.text.html.HTML.Tag.HEAD;

public class Bank {

    public static void main(String[] args) {
        CompanyAccount ca = new CompanyAccount(1122222, 2233333);
        ca.depositOrWithdraw();


        ca.open("Aleksander", 22233, "stan");
        ca.toString();
        ca.open("Aleks6ander", 22233, "stan");
        ca.toString();

        ca.open("Aleksande33r", 22233, "stan");
        ca.open("wwww", 22233, "stan");


        PersonalAccount pa = new PersonalAccount();
        pa.downloadType();
        pa.downloadType();

    }
}
