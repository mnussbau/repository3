package fall2020.FinalProject1;

public class Address {

private String street;
private String city;
private String addressState;
private String zipCode;

public Address(String street, String city, String state, String zip) throws MissingDataException {
if (street == null || street.equals("") || city == null || city.equals("") || state == null || state.equals("")
|| zip == null || zip.equals("")) {
throw new MissingDataException("One or more fields are missing values");
}
this.street = street;
this.city = city;
this.addressState=state;
this.zipCode = zip;

}

public Address(Address a) throws MissingDataException {
this(a.getStreet(), a.getCity(), a.getAddressState(), a.getZipCode());
}

public String getStreet() {
return street;
}

public String getCity() {
return city;
}

public String getAddressState() {
return addressState.toString();
}

public String getZipCode() {
return zipCode;
}

@Override
public boolean equals(Object obj) {
if (this == obj)
return true;
if (obj == null)
return false;
if (getClass() != obj.getClass())
return false;
Address other = (Address) obj;
if (addressState != other.addressState)
return false;
if (city == null) {
if (other.city != null)
return false;
} else if (!city.equals(other.city))
return false;
if (street == null) {
if (other.street != null)
return false;
} else if (!street.equals(other.street))
return false;
if (zipCode == null) {
if (other.zipCode != null)
return false;
} else if (!zipCode.equals(other.zipCode))
return false;
return true;
}

public int compareTo(Address a) {
int i = this.street.compareTo(a.street);

if (i == 0) {
return this.zipCode.compareTo(a.zipCode);
}
return i;
}

public String toString() {
StringBuilder sb = new StringBuilder();
sb.append(
"Address: " + " Street: " + street + " City: " + city + " State: " + addressState.toString()  + " ZipCode: " + zipCode);
return sb.toString();

}
}