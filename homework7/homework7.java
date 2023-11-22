package homework;

abstract class Printer {
    String model;
    int printedCount;
    int availableCount;

    public Printer(String model, int availableCount) {
        this.model = model;
        this.availableCount = availableCount;
    }

    abstract boolean print();
}

class InkjetPrinter extends Printer {
    public InkjetPrinter(String model, int availableCount) {
        super(model, availableCount);
    }

    @Override
    boolean print() {
        if (availableCount == 0) {
            System.out.println(model + ": " + (printedCount + 1) + "��° �μ� ���� - ��ũ ����.");
            return false;
        } else {
            printedCount++;
            availableCount--;
            return true;
        }
    }
}

class LaserPrinter extends Printer {
    public LaserPrinter(String model, int availableCount) {
        super(model, availableCount);
    }

    @Override
    boolean print() {
        if (availableCount == 0) {
            System.out.println(model + ": " + (printedCount + 1) + "��° �μ� ���� - ��� ����.");
            return false;
        } else {
            printedCount++;
            availableCount--;
            return true;
        }
    }
}

public class homework7 {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T720DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);

        while (inkjet.print()) ;
        while (laser.print()) ;
    }
}
