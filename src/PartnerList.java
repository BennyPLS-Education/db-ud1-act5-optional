import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "socis")
@XmlType(propOrder = {"length", "partners"})
public class PartnerList {
    @XmlElement(name = "soci")
    private final Partner[] partners;

    @XmlElement(name = "recompte")
    public int getLength() {
        return partners.length;
    }

    public PartnerList(Partner[] partners) {
        this.partners = partners;
    }

    public PartnerList() {
        this.partners = new Partner[0];
    }
}
