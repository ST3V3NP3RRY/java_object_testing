public class Printer {
    private int numSheetsOfPaper;

    private int numberOfCopies;

    private int numberOfPages;

    private int tonerLevel;

    public Printer(int numSheetsOfPaper, int numberOfCopies, int numberOfPages, int tonerLevel) {
        this.numSheetsOfPaper = numSheetsOfPaper;
        this.numberOfCopies = numberOfCopies;
        this.numberOfPages = numberOfPages;
        this.tonerLevel = tonerLevel;
    };

    public int checkPaperLevel() {
        return this.numSheetsOfPaper;
    }
    public boolean ableToPrint() {
        if (numSheetsOfPaper >= numberOfCopies * numberOfPages) {
            return true;
        }
        return false;
    }

    public int reducePaper(int copies, int pages) {
        return this.numSheetsOfPaper - copies * pages;
    }

    public int reduceToner() {
        int numberOfPagesPrinted = this.numberOfPages * this.numberOfCopies;
        return this.tonerLevel - numberOfPagesPrinted;
    }
}
