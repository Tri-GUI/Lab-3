public class BuddyInfo {

    private String address;
    private String name;
    private int phoneNumber;

    public String getName() {
        return name;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public String getAddress() {
        return address;
    }

    public BuddyInfo(String name, int phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public static void main(String[] args) {
        BuddyInfo buddy1 = new BuddyInfo("homer", 905123987, "123 road st");
        System.out.println("Hello, " + buddy1.getName());
    }
}

