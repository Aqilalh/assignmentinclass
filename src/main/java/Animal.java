public abstract class Animal {
    private String name;
    public String getName() {
        return name;
    }public abstract void printName();

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public Animal (String name){
        this.name = name;

    }
}
