package nowruz;

public class HaftsinImpl implements Haftsin {

    @Override
    public String azCheNoeiAst(String shay) {
        String natije;

        switch (shay) {
            case "sib":
            case "sir":
            case "sabze":
            case "samanu":
            case "senjed":
            case "somagh":
            case "serke":
                natije = "Ejbari";
                break;
            case "mahi":
            case "ghoran":
            case "sekke":
            case "saat":
            case "sham":
            case "tokhm morgh":
            case "hafez":
                natije = "Ekhtiari";
                break;
            default:
                natije ="jozie az haft sin nist.";
        }
        return natije;
    }
}
