package FractionSolver.java;

public class mainFraction {
	public static void main(String[] args) {
        Fraction phanSo1=new Fraction(17,13);    // tạo phân số có tử = 17 và mẫu = 13
        Fraction phanSo2=new Fraction(5,30); // tạo phân số có tử = 5 và mẫu = 30
         
        //goi phuong thuc cong tru nhan chia hai phan so
        phanSo1.fractionSumary(phanSo2);
        phanSo1.fractionSubtract(phanSo2);
        phanSo1.fractionMultiply(phanSo2);
        phanSo1.fractionDivide(phanSo2);
	}
}
