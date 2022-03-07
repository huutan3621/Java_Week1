package FractionSolver.java;

import java.util.Scanner;

public class Fraction {
	
	private int tu, mau;
	 
    public Fraction(int tu, int mau) {
        super();
        this.tu = tu;
        this.mau = mau;
    }
     
     public int getTu() {
        return tu;
    }
 
    public void setTu(int tu) {
        this.tu = tu;
    }
 
    public int getMau() {
        return mau;
    }
 
    public void setMau(int mau) {
        this.mau = mau;
    }
 
    public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
     
    public void fractionSimplify() {
        int i = timUSCLN(this.getTu(), this.getMau());
        this.setTu(this.getTu() / i);
        this.setMau(this.getMau() / i);
    }
     
    public void fractionSumary(Fraction ps) {
        int ts = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        Fraction fractionSum = new Fraction(ts, ms);
        fractionSum.fractionSimplify();
        System.out.println("Tong hai phan so = " + fractionSum.tu + "/" + fractionSum.mau);
    }
      
    public void fractionSubtract(Fraction ps) {
        int ts = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        Fraction fractionSub = new Fraction(ts, ms);
        fractionSub.fractionSimplify();
        System.out.println("Hieu hai phan so = " + fractionSub.tu + "/" + fractionSub.mau);
    }
     
    public void fractionMultiply(Fraction ps) {
        int ts = this.getTu() * ps.getTu();
        int ms = this.getMau() * ps.getMau();
        Fraction fractionMulti = new Fraction(ts, ms);
        fractionMulti.fractionSimplify();
        System.out.println("Tich hai phan so = " + fractionMulti.tu + "/" + fractionMulti.mau);
    }
     
    public void fractionDivide(Fraction ps) {
        int ts = this.getTu() * ps.getMau();
        int ms = this.getMau() * ps.getTu();
        Fraction fractionDiv = new Fraction(ts, ms);
        fractionDiv.fractionSimplify();
        System.out.println("Thuong hai phan so = " + fractionDiv.tu + "/" + fractionDiv.mau);
    }

}
