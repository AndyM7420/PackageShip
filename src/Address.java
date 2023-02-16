public class Address {
        private String numStreet;
        private String name;
        private int apartNum;
        private String city;
        private String state;
        private int zip;
    public Address(String numStreet, String name, int apartNum, String city, String state,int zip){
        this.numStreet = numStreet;
        this.name = name;
        this.apartNum = apartNum;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    public Address(Address and) {
        numStreet = and.getNumStreet();
        name = and.getName();
        apartNum = and.getApartNum();
        city = and.getCity();
        state = and.getState();
        zip = and.getZip();

    }
    public Address(String full) {
        numStreet = full.substring(0, full.indexOf(" "));
        full=full.substring(full.indexOf(" "));
        name = full.substring(0, full.indexOf(" "));
    }

        public String getNumStreet () {
        return numStreet;
    }

        public void setNumStreet (String numStreet){
        this.numStreet = numStreet;
    }

        public String getName () {
        return name;
    }

        public void setName (String name){
        this.name = name;
    }

        public int getApartNum () {
        return apartNum;
    }

        public void setApartNum ( int apartNum){
        this.apartNum = apartNum;
    }

        public String getCity () {
        return city;
    }

        public void setCity (String city){
        this.city = city;
    }

        public String getState () {
        return state;
    }

        public void setState (String state){
        this.state = state;
    }

        public int getZip () {
        return zip;
    }

        public void setZip ( int zip){
        this.zip = zip;
    }
    public String toString(){
    return numStreet+" "+name;
    }
}