public class CompanyAccount extends Account {
    private long Regon;
    private long Nip;

    public CompanyAccount(long regon, long nip) {
        Regon = regon;
        Nip = nip;
    }

    @Override
    public String toString() {
        return Regon + " " + Nip;
    }
}
