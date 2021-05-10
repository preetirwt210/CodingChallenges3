package academy.learnprogramming;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber){
        this.myNumber=myNumber;
        this.myContacts=new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
      if(findContact(contact.getName())<0){
          this.myContacts.add(contact);
          System.out.println(contact.getName() + "has been added successfully!");
          return true;
      }
      System.out.println(contact.getName() + " already exists.");
      return false;
    }
    public boolean updateContact(Contact oldContact, Contact newContact){
        int position=findContact(oldContact);
        if(position <0) {
            System.out.println(oldContact.getName() +", was not found.");
            return false;
        }
        else if(findContact(newContact.getName()) != -1)
        {
            System.out.println("Contact with name " + newContact.getName() +
                    " already exists.  Update was not successful.");
            return false;
        }
        this.myContacts.set(position, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }
    public boolean removeContact(Contact contact){
           if(findContact(contact)>=0){
               this.myContacts.remove(contact);
               System.out.println("Contact has been deleted successfully.");
               return true;
           }
           System.out.println("Contact doesn't exist.");
           return false;
    }
    private int findContact(Contact contact){
        if(this.myContacts.size()>0){
            for(int i = 0; i < this.myContacts.size();i++) {
                if (this.myContacts.get(i).equals(contact)) {
                    return i;
                }
            }
        }
        return -1;
    }
    private int findContact(String contactName){
        if(this.myContacts.size()>0){
            for(int i = 0; i < this.myContacts.size();i++){
                Contact contact = this.myContacts.get(i);
                if(contact.getName().equals(contactName)){
                    return i;
                }
            }
        }
        return -1;

    }
    public Contact queryContact(String name){
        if(findContact(name) >= 0){
            System.out.println(name);
            return this.myContacts.get(findContact(name));
        }
        return null;
    }
    public void printContacts(){
        System.out.println("Contact List: \n");
      for(int i= 0; i<this.myContacts.size(); i++){
          System.out.println((i+1)+ ". "+ this.myContacts.get(i).getName()+ " -> "+ this.myContacts.get(i).getPhoneNumber());
      }
    }

}
