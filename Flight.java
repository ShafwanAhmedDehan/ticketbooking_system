package Vehicle;
import java.lang.*;
import Admin.*;
import Functions.*;
import Passanger.*;

public class Flight 
{
	private String VehicleName;
	private int VehicleNo;
	private int SeatNumber;
	private String Route;
	private int S_Fare;
	private String Time;
	
	public Flight()
	{
		
	}
	
	public Flight(String VehicleName,int VehicleNo,int SeatNumber,String Route,int S_Fare,String Time)
	{
		this.VehicleName=VehicleName;
		this.VehicleNo=VehicleNo;
		this.SeatNumber=SeatNumber;
		this.Route=Route;
		this.S_Fare=S_Fare;
		this.Time=Time;
	}
	
	public void setvehicleName(String VehicleName)
	{
		this.VehicleName=VehicleName;
	}
	public void setvehicleNo(int VehicleNo)
	{
		this.VehicleNo=VehicleNo;
	}
	public void setseatNumber(int SeatNumber)
	{
		this.SeatNumber=SeatNumber;
	}
	public void setRoute(String Route)
	{
		this.Route=Route;
	}
	public void setS_Fare(int S_Fare)
	{
		this.S_Fare=S_Fare;
	}
	public void setTime(String Time)
	{
		this.Time=Time;
	}
	public String getvehicleName()
	{
		return VehicleName;
	}
	public int getvehicleNo()
	{
		return VehicleNo;
	}
	public int getseatNumber()
	{
		return SeatNumber;
	}
	public String getRoute()
	{
		return Route;
	}
	public int getS_Fare()
	{
		return S_Fare;
	}
	public String getTime()
	{
		return Time;
	}
}