package X;

/* renamed from: X.02C, reason: invalid class name */
/* loaded from: classes.dex */
public final class C02C {
    public static C02C LIZLLL;
    public long LIZ;
    public long LIZIZ;
    public int LIZJ;

    public final void LIZ(double d, double d2, long j) {
        double d3 = (0.01720197f * (((float) (j - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r7 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r7) * 3.4906598739326E-4d) + (Math.sin(d3) * 0.03341960161924362d) + d3 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d3) * 0.0053d) + ((float) Math.round((r6 - 9.0E-4f) - r0)) + 9.0E-4f + ((-d2) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d4 = 0.01745329238474369d * d;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d4))) / (Math.cos(asin) * Math.cos(d4));
        if (sin3 >= 1.0d) {
            this.LIZJ = 1;
            this.LIZ = -1L;
            this.LIZIZ = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.LIZJ = 0;
                this.LIZ = -1L;
                this.LIZIZ = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.LIZ = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.LIZIZ = round;
            if (round < j && this.LIZ > j) {
                this.LIZJ = 0;
            } else {
                this.LIZJ = 1;
            }
        }
    }
}
