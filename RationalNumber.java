public class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) throws RationalException {
        if (denominator == 0) {
            throw new RationalException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    public RationalNumber add(RationalNumber other) throws RationalException {
        int lcm = lcm(this.denominator, other.denominator);
        int num1 = this.numerator * (lcm / this.denominator);
        int num2 = other.numerator * (lcm / other.denominator);
        return new RationalNumber(num1 + num2, lcm);
    }

    public RationalNumber subtract(RationalNumber other) throws RationalException {
        int lcm = lcm(this.denominator, other.denominator);
        int num1 = this.numerator * (lcm / this.denominator);
        int num2 = other.numerator * (lcm / other.denominator);
        return new RationalNumber(num1 - num2, lcm);
    }

    public RationalNumber multiply(RationalNumber other) throws RationalException {
        return new RationalNumber(this.numerator * other.numerator, this.denominator * other.denominator);
    }

    public RationalNumber divide(RationalNumber other) throws RationalException {
        if (other.numerator == 0) {
            throw new RationalException("Cannot divide by zero.");
        }
        return new RationalNumber(this.numerator * other.denominator, this.denominator * other.numerator);
    }

    public int compare(RationalNumber other) {
        int lcm = lcm(this.denominator, other.denominator);
        int num1 = this.numerator * (lcm / this.denominator);
        int num2 = other.numerator * (lcm / other.denominator);
        if (num1 < num2) {
            return -1;
        } else if (num1 > num2) {
            return 1;
        } else {
            return 0;
        }
    }

    public double toFloat() {
        return (double) this.numerator / this.denominator;
    }

    public RationalNumber abs() throws RationalException {
        return new RationalNumber(Math.abs(this.numerator), Math.abs(this.denominator));
    }

    private void simplify() throws RationalException {
        if (this.numerator == 0) {
            this.denominator = 1;
            return;
        }
        int gcd = gcd(Math.abs(this.numerator), this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
        if (this.denominator < 0) {
            this.numerator *= -1;
            this.denominator *= -1;
        }
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    private int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public String toString() {
        if (this.denominator == 1) {
            return Integer.toString(this.numerator);
        } else {
            return this.numerator + "/" + this.denominator;
        }
    }
}