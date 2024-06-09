public class Equation {
    public int CalculateQuadratic(int a, int b, int c){
        if(a == 0 && b ==0){
            if(c == 0){
                System.out.println("Ptrinh co vo so nghiem");
            }
            else{
                System.out.println("Ptrinh vo nghiem vi a va b bang 0!");               
            }
            return -1;
            
        }
        else if (a == 0){
            if (b != 0){
                double x;
                x = -((double) c / b);
                System.out.println("Phuong trinh co 1 nghiem duy nhat: x = " + x);
            }
            else
            {
                System.out.println("Ptrinh vo nghiem!");
            }
            return 0;
      
            
        }
        else if ( a != 0)
        {
            if (b == 0){
                if (c == 0) {
                    System.out.println("Ptrinh co nghiem duy nhat: x = 0");
                } else if (c > 0) {
                    System.out.println("Ptrinh vo nghiem!");
                } else {
                    double x1 = Math.sqrt(-((double) c / a));
                    double x2 = -Math.sqrt(-((double) c / a));
                    System.out.printf("Ptrinh co 2 nghiem phuc: x1 = " + x1 + " va x2 = "+ x2);
                }
            }
            else{
                double delta = b * b - 4 * a * c;
                if(delta < 0){
                    System.out.println("Ptrinh vo nghiem!");
    
                }
                else if ( delta > 0 ){
                    double sqrtdelta = Math.sqrt(delta);
                    double x1 = (-b + sqrtdelta) / (2 * a);
                    double x2 = (-b - sqrtdelta) / (2 * a); 
                    System.out.println("Ptrinh co 2 nghiem phan biet: x1 = " + x1 + " va x2 = " + x2);
    
                }
                else
                {
                    double x = -((double) b / (2 * a));
                    System.out.println("Ptrinh co nghiem duy nhat: x = " + x);
    
                }
            }
            
        }
        return 0;     
        
    }
}
