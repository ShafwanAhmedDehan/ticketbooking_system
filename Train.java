package Vehicle;
import java.lang.*;
import Admin.*;
import Functions.*;
import Passanger.*;

public class Train
{
    private String vehicleName;
    private int vehicleNo;
    private int seatNumber;
    private String route;
    private int s_Fare;
    private String time;
    public Train() {
    }
    public Train(String vehicleName, int vehicleNo, int seatNumber, String route, int s_Fare, String time) 
	{
        this.vehicleName = vehicleName;
        this.vehicleNo = vehicleNo;
        this.seatNumber = seatNumber;
        this.route = route;
        this.s_Fare = s_Fare;
        this.time = time;
    }
    public String getVehicleName() 
	{
        return vehicleName;
    }
    public void setVehicleName(String vehicleName) 
	{
        this.vehicleName = vehicleName;
    }
    public int getVehicleNo() 
	{
        return vehicleNo;
    }
    public void setVehicleNo(int vehicleNo) 
	{
        this.vehicleNo = vehicleNo;
    }
    public int getSeatNumber() 
	{
        return seatNumber;
    }
    public void setSeatNumber(int seatNumber) 
	{
        this.seatNumber = seatNumber;
    }
    public String getRoute() 
	{
        return route;
    }
    public void setRoute(String route) 
	{
        this.route = route;
    }
    public int getS_Fare() 
	{
        return s_Fare;
    }
    public void setS_Fare(int s_Fare) 
	{
        this.s_Fare = s_Fare;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time)
	{
        this.time = time;
    }
}