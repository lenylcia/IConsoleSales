public class ConsoleSaes {
}
public abstract class ConsoleSales implements IConsoleSales {
    private String consoleType;
    private String store;
    private int totalSales;

    public ConsoleSales(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    public String getConsoleType() {
        return consoleType;
    }

    public String getStore() {
        return store;
    }

    public int getTotalSales() {
        return totalSales;
    }
}