package arraylist02;

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayList02 {

  private ArrayList<Integer> array = new ArrayList<Integer>();
  private Scanner input = new Scanner(System.in);
  
  public void askForInput(){
      System.out.println("Please enter an array of numbers, type 0 when finished");
      
      int userInput = input.nextInt();
      
      //add user's input into ArrayList
      while (userInput !=0){
          array.add(userInput);
          userInput = input.nextInt();
      }
      System.out.println("************************************************");
  }
  
  public void printArrayList(){
      
      //Print out ArrayList
      for (int i:array){
          System.out.println(i);
      }
  }
  
  public void deleteElement(){
      System.out.println("Which number you want to delete?");
      
      int del = input.nextInt();
      for (int i = 0; i < array.size(); i++){
          if (array.get(i)==del){
              array.remove(i);
          }
      }
  
  }
  
  
  public void perform(){
      askForInput();
      printArrayList();
      deleteElement();
      printArrayList();
  }
  

    public static void main(String[] args) {
        ArrayList02 al = new ArrayList02();
        al.perform();   
    }
    
}
