import java.util.*;
public class Madlib{
public static void main(String[]args){
Scanner keyboardInput = new Scanner(System.in);
System.out.println("Enter a color: ");
String color = keyboardInput.nextLine();
System.out.println("Enter an plural noun: ");
String pluralNoun = keyboardInput.nextLine();
System.out.println("Enter a famous CEO name: ");
String ceoCompany = keyboardInput.nextLine();
System.out.println("Enter an adjective: ");
String adjective = keyboardInput.nextLine();
System.out.println("Roses are " + color);
System.out.println(pluralNoun + " are blue");
System.out.println("a person named " + ceoCompany);
System.out.println("is more " + adjective+ " than you");
}
}