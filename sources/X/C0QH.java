package X;

/* renamed from: X.0QH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0QH {
    public boolean LIZJ;
    public double LIZLLL;
    public double LJ;
    public double LJFF;
    public float LIZ = 1.0f;
    public double LIZIZ = Math.sqrt(50.0d);
    public float LJI = 1.0f;

    public final long LIZ(long j, float f, float f2) {
        double exp;
        double cos;
        if (!this.LIZJ) {
            if (this.LIZ == Float.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            float f3 = this.LJI;
            double d = f3;
            double d2 = d * d;
            if (f3 > 1.0f) {
                double d3 = this.LIZIZ;
                double d4 = d2 - 1;
                this.LIZLLL = (Math.sqrt(d4) * d3) + ((-f3) * d3);
                double d5 = -this.LJI;
                double d6 = this.LIZIZ;
                this.LJ = (d5 * d6) - (Math.sqrt(d4) * d6);
            } else if (f3 >= 0.0f && f3 < 1.0f) {
                this.LJFF = Math.sqrt(1 - d2) * this.LIZIZ;
            }
            this.LIZJ = true;
        }
        float f4 = f - this.LIZ;
        double d7 = j / 1000.0d;
        float f5 = this.LJI;
        if (f5 > 1.0f) {
            double d8 = f4;
            double d9 = this.LJ;
            double d10 = f2;
            double d11 = this.LIZLLL;
            double d12 = d8 - (((d9 * d8) - d10) / (d9 - d11));
            double d13 = ((d8 * d9) - d10) / (d9 - d11);
            exp = (Math.exp(this.LIZLLL * d7) * d13) + (Math.exp(d9 * d7) * d12);
            double d14 = this.LJ;
            double exp2 = Math.exp(d14 * d7) * d12 * d14;
            double d15 = this.LIZLLL;
            cos = (Math.exp(d15 * d7) * d13 * d15) + exp2;
        } else if (f5 == 1.0f) {
            double d16 = this.LIZIZ;
            double d17 = f4;
            double d18 = (d16 * d17) + f2;
            double d19 = (d18 * d7) + d17;
            exp = Math.exp((-d16) * d7) * d19;
            double exp3 = Math.exp((-this.LIZIZ) * d7) * d19;
            double d20 = this.LIZIZ;
            cos = (Math.exp((-d20) * d7) * d18) + (exp3 * (-d20));
        } else {
            double d21 = 1 / this.LJFF;
            double d22 = this.LIZIZ;
            double d23 = f4;
            double d24 = ((f5 * d22 * d23) + f2) * d21;
            exp = Math.exp((-f5) * d22 * d7) * ((Math.sin(this.LJFF * d7) * d24) + (Math.cos(this.LJFF * d7) * d23));
            double d25 = this.LIZIZ;
            double d26 = (-d25) * exp * this.LJI;
            double exp4 = Math.exp((-r15) * d25 * d7);
            double d27 = this.LJFF;
            double sin = Math.sin(d27 * d7) * (-d27) * d23;
            double d28 = this.LJFF;
            cos = (((Math.cos(d28 * d7) * d24 * d28) + sin) * exp4) + d26;
        }
        return (Float.floatToIntBits((float) cos) & 4294967295L) | (Float.floatToIntBits((float) (exp + this.LIZ)) << 32);
    }
}
