import java.lang.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.*;
import Vehicle.*;
import Functions.*;
import Admin.*;
import Passanger.*;

public class Run
{
	public static void main (String arg[])
	{
		Scanner sc=new Scanner(System.in);
		Passanger p1=new Passanger();
		Admin a2=new Admin();
		Admin a1[]=new Admin[3];
		a1[0]=new Admin("01715040513","dh221999");
		a1[1]=new Admin("01953811074","ar0808");
		a1[2]=new Admin("01535131063","asqu1999");
		Flight f1[]=new Flight[100];
		Bus b1[]=new Bus[100];
		Train t1[]=new Train[100];
		Launch L1[]=new Launch[100];
		
		f1[0]=new Flight("US Bangla",777,200,"Cox's Bazar",3450,"10:30am");
		f1[3]=new Flight("Novo Air",747,190,"Jassore",3550,"12:30pm");
		a2.setFlight(f1);
		
		b1[0]=new Bus("Hanif",383,32,"Cox's Bazar",1600,"11:00pm");
		b1[1]=new Bus("Sakura",652,44,"Barisal",700,"10:00am");
		a2.setBus(b1);
		
		t1[1]=new Train("Jomuna Express",411,275,"Sylhet",375,"6:15am");
		t1[6]=new Train("Moitri",602,280,"Chittagong",380,"11:30pm");
		a2.setTrain(t1);
		
		L1[4]=new Launch("Prabat-12",361,150,"Khulna",900,"10:30pm");
		L1[5]=new Launch("Shundorban-10",160,480,"Barisal",1050,"10:50pm");
		a2.setLaunch(L1);
		
		try 
		{
			FileWriter welcome = new FileWriter("Welcome.txt");
			welcome.write("!!!---WELCOME TO OUR PROJECT---!!!");
			welcome.close();
		} 
		catch (IOException f) 
		{
			System.out.println("An error occurred.");
			f.printStackTrace();
		}
		
		try
		{
			File Obj=new File("Welcome.txt");
			Scanner Read=new Scanner(Obj);
			while (Read.hasNextLine())
			{
				String output_line=Read.nextLine();
				System.out.println("\n"+output_line);
			}
			Read.close();
		}
		catch(FileNotFoundException f)
		{
			System.out.println("Error Occurred!!");
			f.printStackTrace();
		}
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("\nChoose One Option-----1.Admin(Press '1')  2.Book Ticket(Press '2')  3.Exit(Press any)");
			int Choice=sc.nextInt();
			if(Choice==1)
			{
				Scanner sc1=new Scanner(System.in);
				System.out.print("Enter Mobile no. : ");
				String mobino=sc1.nextLine();
				System.out.print("Enter Password : ");
				String pass=sc1.nextLine();
				int flag=0;
				for(int j=0;j<3;j++)
				{
					if(mobino.equals(a1[j].getMobino()) && pass.equals(a1[j].getPass()))
					{
						flag=1;
						System.out.println("\nWelcome To Insert Vehicle");
						Scanner sc4=new Scanner(System.in);
						System.out.println("Which Vehicle You want to insert? 1.Bus(Press '1') 2.Launch(Press '2') 3.Train(Press '3') 4.Flight(Press '4') 5. Exit (Press 'Any')");
						int ch=sc4.nextInt();
						if(ch==1 || ch==2 || ch==3 || ch==4)
						{
							System.out.print("How Much Vehicle You want to insert?  ");
							int num=sc4.nextInt();
							for(int m=1;m<=num;m++)
							{
								Scanner sc5=new Scanner(System.in);
								System.out.print("\nEnter Vehicle Name : ");
								String v_name=sc5.nextLine();
								System.out.print("Enter Vehicle No. : ");
								int v_no=sc5.nextInt();
								System.out.print("Enter number of Seat : ");
								int v_seat=sc5.nextInt();
								Scanner sc6=new Scanner(System.in);
								System.out.print("Enter Vehicle's Route (EXMP:Barisal,Khulna,Chittagong,Cox's bazar,Jassore,Saidpur,Sylhet,Rajshahi etc) PLEASE!! Follow This EXMP : ");
								String v_route=sc6.nextLine();
								System.out.print("Enter Fare : ");
								int v_fare=sc6.nextInt();
								Scanner sc7=new Scanner(System.in);
								System.out.print("Enter Depart Time : ");
								String v_time=sc7.nextLine();
								if(ch==1)
								{
									a2.InsertBus(v_name,v_no,v_seat,v_route,v_fare,v_time); 
								}
								else if(ch==2)
								{
									a2.InsertLaunch(v_name,v_no,v_seat,v_route,v_fare,v_time);
								}
								else if(ch==3)
								{
									a2.InsertTrain(v_name,v_no,v_seat,v_route,v_fare,v_time);
								}
								else
								{
									a2.InsertFlight(v_name,v_no,v_seat,v_route,v_fare,v_time);
								}
							}
						}
						else
						{
							break;
						}
					}
				}
				if(flag==0)
				{
					System.out.println("\nNot Matched");
				}
			}
			else if(Choice==2)
			{
				Scanner sc2=new Scanner(System.in);
				System.out.print("Enter Name : ");
				String name=sc2.nextLine();
				System.out.print("Enter Mobile no. : ");
				String mobile=sc2.nextLine();
				System.out.print("Enter NID or Passport or Birth-Certificate no. : ");
				String nid=sc2.nextLine();
				p1=new Passanger(name,mobile,nid);
				System.out.println("\nEnter Your Destination from Dhaka : (EXMP:Barisal,Khulna,Chittagong,Cox's bazar,Jassore,Saidpur,Sylhet,Rajshahi etc) PLEASE!! Follow This EXMP : ");
				Scanner sc3=new Scanner(System.in);
				String destination=sc3.nextLine();  
				int f2=a2.showBusDetails(destination);
				int f3=a2.showLaunchDetails(destination);
				int f4=a2.showTrainDetails(destination);
				int f5=a2.showFlightDetails(destination);
				if(f2!=0 || f3!=0 || f4!=0 || f5!=0)
				{
					System.out.print("\nEnter Your Prefer Vehicle Number : ");
				}
				else
				{
					System.out.println("\nWrong Input OR No Vehicle Available for this Route!! ");
					continue;
				}
				int n=sc3.nextInt();
				int price=a2.Booking(n);
				int payment=0;
				if(price>0)
				{
					Function01 fun=new Function01();
					payment=fun.Payment(price);
					System.out.println("\nPassanger Name : "+name+"\nMobile No : "+mobile+"\nNID : "+nid+"\nDestination Dhaka to "+destination+"\nVehicle No. : "+n+"\nPayment : BDT "+payment+"\n\n");
				}
			}
			else
			{
				break;
			}
		}
	}
}