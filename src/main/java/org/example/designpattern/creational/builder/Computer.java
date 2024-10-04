package org.example.creational.builder;

public class Computer {
    private Integer ram;
    private Integer rom;
    private String cpu;
    private Integer graphics;

    private Computer(ComputerBuilder builder) {
        this.ram = builder.ram;
        this.rom = builder.rom;
        this.cpu = builder.cpu;
        this.graphics = builder.graphics;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getRom() {
        return rom;
    }

    public void setRom(Integer rom) {
        this.rom = rom;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public Integer getGraphics() {
        return graphics;
    }

    public void setGraphics(Integer graphics) {
        this.graphics = graphics;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", rom=" + rom +
                ", cpu='" + cpu + '\'' +
                ", graphics=" + graphics +
                '}';
    }

    public static class ComputerBuilder{
        private Integer ram;
        private Integer rom;
        private String cpu;
        private Integer graphics;

        public ComputerBuilder setRam(Integer ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder setRom(Integer rom) {
            this.rom = rom;
            return this;
        }

        public ComputerBuilder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder setGraphics(Integer graphics) {
            this.graphics = graphics;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
