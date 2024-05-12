package X;

/* renamed from: X.Iyu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48388Iyu {
    public int LIZJ;
    public double LIZIZ = -1.0d;
    public final int LIZ = (int) Math.ceil(20.0d);

    public final void LIZ(double d) {
        int i = this.LIZJ;
        if (i > this.LIZ) {
            this.LIZIZ = Math.exp((Math.log(d) * 0.05d) + (Math.log(this.LIZIZ) * 0.95d));
        } else if (i > 0) {
            double d2 = i;
            double d3 = (0.95d * d2) / (d2 + 1.0d);
            this.LIZIZ = Math.exp((Math.log(d) * (1.0d - d3)) + (Math.log(this.LIZIZ) * d3));
        } else {
            this.LIZIZ = d;
        }
        this.LIZJ++;
    }
}
