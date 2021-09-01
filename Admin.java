package Admin;
import java.lang.*;
import Vehicle.*;
import Functions.*;
import Passanger.*;

public class Admin
{
	private String MobileNo;
	private String Password;
	Bus bus[]=new Bus[100];
	Flight flight[]=new Flight[100];
	Launch launch[]=new Launch[100];
	Train train[]=new Train[100];
	public Admin()
	{
		
	}
	public Admin(String MobileNo,String Password)
	{
		this.MobileNo=MobileNo;
		this.Password=Password;
	}
	public void setMobino(String MobileNo)
	{
		this.MobileNo=MobileNo;
	}
	public void setPass(String Password)
	{
		this.Password=Password;
	}
	public String getMobino()
	{
		return MobileNo;
	}
	public String getPass()
	{
		return Password;
	}
	public void setBus(Bus bus[])
	{
		this.bus=bus;
	}
	public void setFlight(Flight flight[])
	{
		this.flight=flight;
	}
	public void setLaunch(Launch launch[])
	{
		this.launch=launch;
	}
	public void setTrain(Train train[])
	{
		this.train=train;
	}
	public int showBusDetails(String choice)
	{
		int flag=0;
		for(int i=0;i<bus.length;i++)
		{
			if(bus[i]!=null && choice.equals(bus[i].getRoute()))
			{
				System.out.println("\nBus Name : "+bus[i].getVehicleName());
				System.out.println("Vehicle Number : "+bus[i].getVehicleNo());
				System.out.println("Vehicle's Number of Seat : "+bus[i].getSeatNumber());
				System.out.println("Vehicle's Route : "+bus[i].getRoute());
				System.out.println("Per Seat Fare : "+bus[i].getS_Fare());
				System.out.println("Departure Time : "+bus[i].getTime());
				flag=1;
			}
			else
			{
				continue;
			}
		}
		return flag;
	}
	public int showLaunchDetails(String choice)
	{
		int flag=0;
		for(int i=0;i<launch.length;i++)
		{
			if(launch[i]!=null && choice.equals(launch[i].getRoute()))
			{
				System.out.println("\nLaunch Name : "+launch[i].getVehicleName());
				System.out.println("Vehicle Number : "+launch[i].getVehicleNo());
				System.out.println("Vehicle's Number of Seat : "+launch[i].getSeatNumber());
				System.out.println("Vehicle's Route : "+launch[i].getRoute());
				System.out.println("Per Seat Fare : "+launch[i].getS_Fare());
				System.out.println("Departure Time : "+launch[i].getTime());
				flag=1;
			}
			else
			{
				continue;
			}
		}
		return flag;
	}
	public int showTrainDetails(String choice)
    {
		int flag=0;
        for(int i=0;i<train.length;i++)
        {
            if(train[i]!=null && choice.equals(train[i].getRoute()))
            {
                System.out.println("\nTrain Name : "+train[i].getVehicleName());
                System.out.println("Train Number : "+train[i].getVehicleNo());
                System.out.println("Train's Number of Seat : "+train[i].getSeatNumber());
                System.out.println("Train's Route : "+train[i].getRoute());
                System.out.println("Per Seat Fare : "+train[i].getS_Fare());
                System.out.println("Time : "+train[i].getTime());
				flag=1;
            }
			else
			{
				continue;
			}
        }
		return flag;
    }
	public int showFlightDetails(String choice)
	{
		int flag=0;
		for(int i=0;i<flight.length;i++)
		{
			if(flight[i]!=null && choice.equals(flight[i].getRoute()))
			{
				System.out.println("\nFlight Name : "+flight[i].getvehicleName());
				System.out.println("Flight Number : "+flight[i].getvehicleNo());
				System.out.println("Flight's Number of Seat : "+flight[i].getseatNumber());
				System.out.println("Flight's Route : "+flight[i].getRoute());
				System.out.println("Per Seat Fare : "+flight[i].getS_Fare());
				System.out.println("Departure Time : "+flight[i].getTime());
				flag=1;
			}
			else
			{
				continue;
			}
		}
		return flag;
	}
	public int Booking(int v_no)
	{
		int flag=0;
		for(int i=0;i<bus.length;i++)
		{
			if(bus[i]!=null && bus[i].getVehicleNo()==v_no)
			{
				flag=1;
				return bus[i].getS_Fare();
			}
			else if(launch[i]!=null && launch[i].getVehicleNo()==v_no)
			{
				flag=1;
				return launch[i].getS_Fare();
			}
			else if(train[i]!=null && train[i].getVehicleNo()==v_no)
			{
				flag=1;
				return train[i].getS_Fare();
			}
			else if(flight[i]!=null && flight[i].getvehicleNo()==v_no)
			{
				flag=1;
				return flight[i].getS_Fare();
			}
		}
		if(flag==0)
		{
			System.out.println("\nWrong Input!!");
		}
		return 0;
	}
	public void InsertBus(String v_name,int v_no,int v_seat,String v_route,int v_fare,String v_time)
	{
		int flag=0;
		Bus bus2=new Bus();
		bus2.setVehicleName(v_name);
		bus2.setVehicleNo(v_no);
		bus2.setSeatNumber(v_seat);
		bus2.setRoute(v_route);
		bus2.setS_Fare(v_fare);
		bus2.setTime(v_time);
		for(int i=0;i<bus.length;i++)
		{
			if(bus[i]==null)
			{
				bus[i]=bus2;
				flag=1;
				break;
			}
		}
		if(flag!=0)
		{
			System.out.println("\nInsertion Successful!!");
		}
		else
		{
			System.out.println("\nInsertion Unuccessful!!");
		}
	}
	public void InsertTrain(String v_name,int v_no,int v_seat,String v_route,int v_fare,String v_time)
	{
		int flag=0;
		Train train2=new Train();
		train2.setVehicleName(v_name);
		train2.setVehicleNo(v_no);
		train2.setSeatNumber(v_seat);
		train2.setRoute(v_route);
		train2.setS_Fare(v_fare);
		train2.setTime(v_time);
		for(int i=0;i<train.length;i++)
		{
			if(train[i]==null)
			{
				train[i]=train2;
				flag=1;
				break;
			}
		}
		if(flag!=0)
		{
			System.out.println("\nInsertion Successful!!");
		}
		else
		{
			System.out.println("\nInsertion Unuccessful!!");
		}
	}
	public void InsertLaunch(String v_name,int v_no,int v_seat,String v_route,int v_fare,String v_time)
	{
		int flag=0;
		Launch launch2=new Launch();
		launch2.setVehicleName(v_name);
		launch2.setVehicleNo(v_no);
		launch2.setSeatNumber(v_seat);
		launch2.setRoute(v_route);
		launch2.setS_Fare(v_fare);
		launch2.setTime(v_time);
		for(int i=0;i<launch.length;i++)
		{
			if(launch[i]==null)
			{
				launch[i]=launch2;
				flag=1;
				break;
			}
		}
		if(flag!=0)
		{
			System.out.println("\nInsertion Successful!!");
		}
		else
		{
			System.out.println("\nInsertion Unuccessful!!");
		}
	}
	public void InsertFlight(String v_name,int v_no,int v_seat,String v_route,int v_fare,String v_time)
	{
		int flag=0;
		Flight flight2=new Flight();
		flight2.setvehicleName(v_name);
		flight2.setvehicleNo(v_no);
		flight2.setseatNumber(v_seat);
		flight2.setRoute(v_route);
		flight2.setS_Fare(v_fare);
		flight2.setTime(v_time);
		for(int i=0;i<flight.length;i++)
		{
			if(flight[i]==null)
			{
				flight[i]=flight2;
				flag=1;
				break;
			}
		}
		if(flag!=0)
		{
			System.out.println("\nInsertion Successful!!");
		}
		else
		{
			System.out.println("\nInsertion Unuccessful!!");
		}
	}
}