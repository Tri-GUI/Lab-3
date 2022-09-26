import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> buddies;

    public AddressBook() {
        buddies = new ArrayList<>();
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", 613, "Carleton");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }

    public void addBuddy(BuddyInfo buddy) {

        if (buddy != null){
            buddies.add(buddy);
        }
    }

    public void removeBuddy(BuddyInfo buddy) {
        int index = buddies.indexOf(buddy);
        if (index != -1){
            buddies.remove(index);
        }
    }
    public String buddyMood(BuddyInfo buddy){
        if(buddy != null){
            return "happy";
        }
        else {return "sad";}
    }
}
