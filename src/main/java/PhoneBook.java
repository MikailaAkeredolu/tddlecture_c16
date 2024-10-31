import java.util.*;

public class PhoneBook {

   private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> phonebook) {
        this.phonebook = phonebook;
    }

    //Constructor that i want to test -
    public PhoneBook() {
        this(new HashMap<>());

    }

    public Map<String, List<String>> getPhonebook() {
        return phonebook;
    }


    public void add(String name, String phoneNumber) {
       List<String> numbers = new ArrayList<>();
       numbers.add(phoneNumber);
       phonebook.put(name, numbers);
    }


//    RED
   public void addAll(String name, String... phoneNumbers) {

        List<String> numbersList = new ArrayList<>();
        for(String number: phoneNumbers){
            numbersList.add(number);
        }
        //updated her map
       phonebook.put(name, numbersList);
    }

    public void remove(String name){

    }

    public boolean hasEntry(String name){

        return false;
    }


    public List<String> lookUp(String name){
        //container to use to store the numbers that i find as i find them
        List<String> phoneNumbers = new ArrayList<>();
        if( phonebook.containsKey(name)){
            phoneNumbers.addAll(phonebook.get(name));
        }
            return phoneNumbers;
    }


}
