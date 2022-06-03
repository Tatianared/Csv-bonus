import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.natology.bonus.calculator.service.BonusService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest {

    @ParameterizedTest
    @CsvFileSource (files="src/test/resources/data.csv")
    void shouldCalculateBonus(int expected, long amount, boolean registered) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
}