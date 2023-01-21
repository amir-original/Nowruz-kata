package nowruz;

public class HaftsinImpl implements Haftsin {

    @Override
    public String azCheNoeiAst(String shay) {
        return switch (shay) {
            case "sib", "sir", "sabze", "samanu", "senjed", "somagh", "serke" -> "Ejbari";
            case "mahi", "ghoran", "sekke", "saat", "sham", "tokhm morgh", "hafez" -> "Ekhtiari";
            default -> {
                System.out.println("new feature in java 14");
                yield "jozie az haft sin nist.";
            }
        };
    }
}
