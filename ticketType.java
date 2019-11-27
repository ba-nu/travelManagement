
package travel;


public class ticketType {
     String flyingFrom;
     String flyingTo;
     String departing;
    String typeTravelers;
    int Numpassenger;
    
      
    
}
class Oneway extends ticketType{
    
    public Oneway(String from, String to, String depart, String type, int num) {
         this.flyingFrom = from;
        this.flyingTo = to;
        this.departing = depart;
        this.typeTravelers = type;
        this.Numpassenger = num;
    }
    
}
class Multipledestinations{
    String returnFrom;
    String returnTo;
    Oneway one;
            public Multipledestinations( String reFrom , String reTo ,  Oneway o){
                this.returnFrom=reFrom;
                this.returnTo= reTo;
                this.one=o;
                
                
    }
    public String getflyingFrom(){
        return one.flyingFrom;
        
        
    }
}
