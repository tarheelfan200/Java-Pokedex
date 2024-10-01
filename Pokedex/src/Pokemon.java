public class Pokemon{
    int id;
    String species;
    String type1;
    String type2;

    public Pokemon(int id, String species, String type1, String type2){
        this.id = id;
        this.species = species;
        this.type1 = type1;
        this.type2 = type2;
    }

    public int getId() {
        return id;
    }

    public String getSpecies(){
        return species;
    }

    public String getType1(){
        return type1;
    }

    public String getType2(){
        return type2;
    }
}