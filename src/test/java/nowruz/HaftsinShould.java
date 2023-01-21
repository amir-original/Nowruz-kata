package nowruz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HaftsinShould {

    @Test
    void say_which_thing_is_part_of_haftsin() {
        final Haftsin haftsin = new HaftsinImpl();

        assertThat(haftsin.azCheNoeiAst("sib")).isEqualTo("Ejbari");
        assertThat(haftsin.azCheNoeiAst("serke")).isEqualTo("Ejbari");
        assertThat(haftsin.azCheNoeiAst("sabze")).isEqualTo("Ejbari");
        assertThat(haftsin.azCheNoeiAst("senjed")).isEqualTo("Ejbari");
        assertThat(haftsin.azCheNoeiAst("samanu")).isEqualTo("Ejbari");
        assertThat(haftsin.azCheNoeiAst("sir")).isEqualTo("Ejbari");

        assertThat(haftsin.azCheNoeiAst("mahi")).isEqualTo("Ekhtiari");
        assertThat(haftsin.azCheNoeiAst("ghoran")).isEqualTo("Ekhtiari");
        assertThat(haftsin.azCheNoeiAst("sham")).isEqualTo("Ekhtiari");
        assertThat(haftsin.azCheNoeiAst("saat")).isEqualTo("Ekhtiari");
        assertThat(haftsin.azCheNoeiAst("sekke")).isEqualTo("Ekhtiari");
        assertThat(haftsin.azCheNoeiAst("hafez")).isEqualTo("Ekhtiari");
        assertThat(haftsin.azCheNoeiAst("tokhm morgh")).isEqualTo("Ekhtiari");

        assertThat(haftsin.azCheNoeiAst("lubia")).isEqualTo("jozie az haft sin nist.");
    }
}
