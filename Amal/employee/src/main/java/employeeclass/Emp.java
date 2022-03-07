package employeeclass;

import java.util.Objects;

public class Emp {
 
 private int  address_id;
 private int  door_number;
 private String  street_name;
 private String  area_name;
 private String   city;
 private String   state;
 private int   pin;
public Emp() {
	super();
}
public Emp(int address_id, int door_number, String street_name, String area_name, String city, String state, int pin) {
	super();
	this.address_id = address_id;
	this.door_number = door_number;
	this.street_name = street_name;
	this.area_name = area_name;
	this.city = city;
	this.state = state;
	this.pin = pin;
}
@Override
public String toString() {
	return "Emp [address_id=" + address_id + ", door_number=" + door_number + ", street_name=" + street_name
			+ ", area_name=" + area_name + ", city=" + city + ", state=" + state + ", pin=" + pin + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
@Override
public int hashCode() {
	return Objects.hash(address_id, area_name, city, door_number, pin, state, street_name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Emp other = (Emp) obj;
	return address_id == other.address_id && Objects.equals(area_name, other.area_name)
			&& Objects.equals(city, other.city) && door_number == other.door_number && pin == other.pin
			&& Objects.equals(state, other.state) && Objects.equals(street_name, other.street_name);
}
public int getAddress_id() {
	return address_id;
}
public void setAddress_id(int address_id) {
	this.address_id = address_id;
}
public int getDoor_number() {
	return door_number;
}
public void setDoor_number(int door_number) {
	this.door_number = door_number;
}
public String getStreet_name() {
	return street_name;
}
public void setStreet_name(String street_name) {
	this.street_name = street_name;
}
public String getArea_name() {
	return area_name;
}
public void setArea_name(String area_name) {
	this.area_name = area_name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}

 
}
