package Passanger;
import java.lang.*;
import Vehicle.*;
import Functions.*;
import Admin.*;

public class Passanger
{
	private String Name;
	private String MobileNo;
	private String NID;
	
	public Passanger()
	{
		
	}
	public Passanger(String Name, String MobileNo, String NID)
	{
		this.Name=Name;
		this.MobileNo=MobileNo;
		this.NID=NID;
	}
	
	
	public void setname(String Name)
	{
		this.Name=Name;
	}
	public void setMobino(String MobileNo)
	{
		this.MobileNo=MobileNo;
	}
	public void setnid(String NID)
	{
		this.NID=NID;
	}
	public String getMobino()
	{
		return MobileNo;
	}
	public String getname()
	{
		return Name;
	}
	public String getnid()
	{
		return NID;
	}
}