import java.awt.*;

public class Cube {
    private Facet[] facets;
    public Cube(){
        facets = new Facet[6];
        //задняя грань
        facets[0] = new Facet(new R3Vector(0,0,0),
                new R3Vector(1,0,0),
                new R3Vector(1,1,0),
                new R3Vector(0,1,0));
        facets[0].set_color(Color.gray);
        //правая грань
        facets[1] = new Facet(new R3Vector(1,0,1),
                new R3Vector(1,1,1),
                new R3Vector(1,1,0),
                new R3Vector(1,0,0));
        facets[1].set_color(Color.darkGray);
        //левая грань
        facets[2] = new Facet(new R3Vector(0,0,0),
                new R3Vector(0,1,0),
                new R3Vector(0,1,1),
                new R3Vector(0,0,1));
        facets[2].set_color(Color.lightGray);
        //нижняя грань
        facets[3] = new Facet(new R3Vector(0,0,0),
                new R3Vector(0,0,1),
                new R3Vector(1,0,1),
                new R3Vector(1,0,0));
        facets[3].set_color(Color.black);
        //верхняя грань
        facets[4] = new Facet(new R3Vector(0,1,0),
                new R3Vector(1,1,0),
                new R3Vector(1,1,1),
                new R3Vector(0,1,1));
        facets[4].set_color(Color.yellow);
        //передняя грань
        facets[5] = new Facet(new R3Vector(0,0,1),
                new R3Vector(0,1,1),
                new R3Vector(1,1,1),
                new R3Vector(1,0,1));
        facets[5].set_color(Color.cyan);
    }
    public void scale(double k){
        for(int i=0; i<facets.length; i++){
            facets[i].scale(k);
        }
    }
    public void translate(double dx, double dy, double dz){
        for(int i=0; i<facets.length; i++){
            facets[i].translate(dx,dy,dz);
        }
    }
    public void rotate(double ux, double uy, double uz){
        for(int i=0; i<facets.length; i++){
            facets[i].rotate(ux,uy,uz);
        }
    }
    public void draw(Graphics2D g){
        for(int i = 0; i<facets.length; i++){
            facets[i].draw(g);
        }
    }
    public void perspdraw(Graphics2D g, double focus){
        for(int i = 0; i<facets.length; i++){
            facets[i].perspdraw(g, focus);
        }
    }
}