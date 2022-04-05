package OOP_1;

import java.util.List;

class Shop {
    private final List<Computer> computers;

    public Shop(List<Computer> computers) {
        this.computers = computers;
    }

    void choice() {
        computers.forEach(Computer::computer);
    }

}
