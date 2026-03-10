class Computer {
    // Required parameters
    private String HDD;
    private String RAM;
    // Optional parameters
    private boolean isBluetoothEnabled;

    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer [RAM=" + RAM + ", HDD=" + HDD + ", Bluetooth=" + isBluetoothEnabled + "]";
    }

    public static class ComputerBuilder {
        private String HDD;
        private String RAM;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String hdd, String ram) {
            this.HDD = hdd;
            this.RAM = ram;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.ComputerBuilder("1TB", "32GB").setBluetoothEnabled(true).build();
        Computer officePC = new Computer.ComputerBuilder("256GB", "8GB").build();

        System.out.println(gamingPC);
        System.out.println(officePC);
    }
}
