package nowruz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HaftsinShould {

    private static final String EJBARI = "Ejbari";
    private static final String EKHTIARI = "Ekhtiari";

    @Test
    void say_which_thing_is_part_of_haftsin() {
        final Haftsin haftsin = new HaftsinImpl();

        assertThat(haftsin.azCheNoeiAst("sib")).isEqualTo(EJBARI);
        assertThat(haftsin.azCheNoeiAst("serke")).isEqualTo(EJBARI);
        assertThat(haftsin.azCheNoeiAst("sabze")).isEqualTo(EJBARI);
        assertThat(haftsin.azCheNoeiAst("senjed")).isEqualTo(EJBARI);
        assertThat(haftsin.azCheNoeiAst("samanu")).isEqualTo(EJBARI);
        assertThat(haftsin.azCheNoeiAst("sir")).isEqualTo(EJBARI);

        assertThat(haftsin.azCheNoeiAst("mahi")).isEqualTo(EKHTIARI);
        assertThat(haftsin.azCheNoeiAst("ghoran")).isEqualTo(EKHTIARI);
        assertThat(haftsin.azCheNoeiAst("sham")).isEqualTo(EKHTIARI);
        assertThat(haftsin.azCheNoeiAst("saat")).isEqualTo(EKHTIARI);
        assertThat(haftsin.azCheNoeiAst("sekke")).isEqualTo(EKHTIARI);
        assertThat(haftsin.azCheNoeiAst("hafez")).isEqualTo(EKHTIARI);
        assertThat(haftsin.azCheNoeiAst("tokhm morgh")).isEqualTo(EKHTIARI);

        assertThat(haftsin.azCheNoeiAst("lubia")).isEqualTo("jozie az haft sin nist.");
    }
}
