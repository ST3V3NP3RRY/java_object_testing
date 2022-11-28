import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void before() {
        printer = new Printer(60, 10, 6, 100);
    }

    @Test
    public void checkPrinterHasPaper() {
        assertEquals(60, printer.checkPaperLevel());
    }

    @Test
    public void checkIfEnoughPaperToPrint_true() {
        assertEquals(true, printer.ableToPrint());
    }

    @Test
    public void checkIfEnoughPaperToPrint_false() {
        Printer printer2 = new Printer(40, 10, 5, 100);
        assertEquals(false, printer2.ableToPrint());
    }

    @Test
    public void reducePaperIfPrinterPrints() {
        assertEquals(0, printer.reducePaper(10, 6));
    }

    @Test
    public void reduceTonerForEachPagePrinted() {
        assertEquals(40, printer.reduceToner());
    }
}
