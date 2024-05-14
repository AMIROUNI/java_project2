public class PointNom extends  paint{

   private  String nomPoint;
    public PointNom(int x, int y,String nomPoint) {
        super(x, y);
        this.nomPoint=nomPoint;
    }

    public String getNomPoint() {
        return nomPoint;
    }

    public void setNomPoint(String nomPoint) {
        this.nomPoint = nomPoint;
    }

    public void affiche(){
        System.out.println("nom de point :"+ this.getNomPoint()+"coordnness :"+ this.getX() +" "+this.getY());

    }

}
