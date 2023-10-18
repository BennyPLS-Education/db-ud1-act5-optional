import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "soci")
@XmlType(propOrder = {"dni", "name", "surnames", "address", "postalCode", "city", "phone"})
public class Partner {
    @XmlElement(name = "dni")
    private String dni;
    @XmlElement(name = "nom")
    private String name;
    @XmlElement(name = "llinatges")
    private String surnames;
    @XmlElement(name = "adreça")
    private String address;
    @XmlElement(name = "cp")
    private int postalCode;
    @XmlElement(name = "ciutat")
    private String city;
    @XmlElement(name = "telefon")
    private String phone;

    public Partner(String dni, String name, String surnames, String address, int postalCode, String city, String phone) {
        this.dni = dni;
        this.name = name;
        this.surnames = surnames;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.phone = phone;
    }

    public Partner() {
    }

    @Override
    public String toString() {
        return "Partner{" +
                "dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surnames + '\'' +
                ", address='" + address + '\'' +
                ", postalCode=" + postalCode +
                ", city='" + city + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
