package code2flow;

import java.util.Scanner;

public class Assessement {

	public static void main(String[] args) {
		
		System.out.println("Welcome to code2Flow");
		
		System.out.println("Do you Agree");
		System.out.println("1.yes");
		System.out.println("2.No");
		
		Assessement.doubt(0);
		Assessement.help(0);
	    
		
			}
	
	public static void doubt( int doubt){
		
		Scanner input = new Scanner(System.in);
		int choice;
		 choice = input.nextInt();
			if (choice == 1){
				System.out.println("Press Help");
				System.out.println("Please type 1 for help");
					}
				if (choice == 2){
					System.out.println("Improve your workflow!");
				}
			
				
			
				
			}	
	public static void help( int help){
		int Help;
		Scanner access = new Scanner(System.in);
		Help = access.nextInt();
		
		System.out.println("Are you ready?");
		System.out.println("1.yes");
		System.out.println("2.No");
	 
		Help = access.nextInt();
		if (Help == 1){ System.out.println("Are you sure ready?");
		}
	if (Help == 2){ System.out.println("Read help");
	      		}
	
    System.out.print("1.yes");
    System.out.print("1.No");
    
    int agree;
    Scanner verify = new Scanner(System.in);
    agree = verify.nextInt();
    
    if ( agree == 1){
    	System.out.println("Improve your workFlow!");
    }
    if ( agree == 2){
    	System.out.println("My name is chris");
    	System.out.println("Improve your workflow");
    	
    }
    
	
	
		}
		
	 
		
		
		
		
	}
			
		
		
		
	

