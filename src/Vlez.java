public class Vlez {
      double a, b, c;
   public Vlez(double a, double b, double c) {
          this.a = a;
          this.b = b;
          this.c = c;
            }
     public double strana_a() {
               return a;
              }
     public double strana_b() {
               return b;

                   }
     public double strana_c() {
               return c;
              }
     public boolean rezultat()
               {
          return( a+b>c && a+c>b && b+c>a);
}
}
