import javax.xml.bind.JAXB;
import java.io.*;
import java.util.ArrayList;

public class Main {

    private final static String FILE_NAME = "socis.dat";
    public static void main(String[] args) {
        var partners = readFile();

        writeXML(partners);

    }

    private static void writeXML(Partner[] partners) {
        var root = new PartnerList(partners);

        try (var writer = new FileWriter("socis.xml")) {
            JAXB.marshal(root, writer);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static Partner[] readFile() {
        ArrayList<Partner> partners = new ArrayList<>();

        try (var reader = new DataInputStream(new FileInputStream(FILE_NAME))) {
            while (reader.available() > 0) {
                partners.add(readPartner(reader));
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return partners.toArray(new Partner[0]);
    }

    static Partner readPartner(DataInputStream data) throws IOException {
        return new Partner(
                data.readUTF(), // dni
                data.readUTF(), // name
                data.readUTF(), // surname
                data.readUTF(), // address
                data.readInt(), // postalCode
                data.readUTF(), // city
                data.readUTF()  // phone
        );
    }
}