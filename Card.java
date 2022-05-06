public class Card{
  static final String[] SUITES    = {"♠","♥","♦","♣"};
  static final String[] SPECIALS  = {"A","J","Q","K"};
  static final int      BASE      = 9; 
  
  String suite;
  String num;
  int id;

  public Card(int seed){
    this.id = seed;
    int n = seed % (BASE + SPECIALS.length);
    int s = seed / (BASE + SUITES.length);

    String val = (n == 0)? SPECIALS[n] : "" + (n + 1);
    if(n > BASE) val = SPECIALS[n-BASE];
    
    this.num = val;
    suite = SUITES[s];
    
  }

  public String toString(){
    return this.suite + this.num;
  }
  
}

