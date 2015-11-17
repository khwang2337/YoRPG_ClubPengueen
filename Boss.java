/*
Team Club Pengueen -- Janet Zhang, Kevin Hwang, Dorothy Ng
APCS1 pd5
HW31 -- Ye Olde Role Playing Game, Unchained
2015-11-16
*/

public class Boss extends Character{
    
    public Boss(String n) {
        super( 1000000 , 1000000 , 1000000 , 1.0 , "Boss" );
        name=n;
        sStr=(int)(origStr*0.0000000000001);
        sDef=(int)(origDef*13.37);
    }
    
    public void normalize() {
        def=origDef;
        str=origStr;
    }
    
    public void specialize() {
        def=sDef;
        str=sStr;
    }
    
    public String about() {
        String ret="The Boss is the master of all trades. ";
        ret+=" His stats are all ridiculously high. Some say he's invincible. ";
        ret+=" Recently, there has been a rumor that a single hero might have a chance at defeating him...";
        return ret; }
}
