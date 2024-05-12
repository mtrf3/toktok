package X;

/* renamed from: X.VQo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79722VQo {
    public static double LIZ(double d) {
        return (d * 3.141592653589793d) / 180.0d;
    }

    public static double LIZIZ(double[] dArr) {
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = dArr[2];
        double d4 = dArr[3];
        double d5 = dArr[4];
        double d6 = dArr[5];
        double d7 = dArr[6];
        double d8 = dArr[7];
        double d9 = dArr[8];
        double d10 = dArr[9];
        double d11 = dArr[10];
        double d12 = dArr[11];
        double d13 = dArr[12];
        double d14 = dArr[13];
        double d15 = dArr[14];
        double d16 = dArr[15];
        double d17 = d4 * d7;
        double d18 = d3 * d8;
        double d19 = d4 * d6;
        double d20 = d2 * d8;
        double d21 = d3 * d6;
        double d22 = d2 * d7;
        double d23 = d4 * d5;
        double d24 = d8 * d;
        double d25 = d3 * d5;
        double d26 = d7 * d;
        double d27 = d2 * d5;
        double d28 = d * d6;
        return C207798Dn.LIZ(d28, d11, d16, (C207798Dn.LIZ(d25, d10, d16, C207798Dn.LIZ(d22, d9, d16, (C207798Dn.LIZ(d27, d12, d15, C207798Dn.LIZ(d24, d10, d15, (C207798Dn.LIZ(d19, d9, d15, C207798Dn.LIZ(d26, d12, d14, (C207798Dn.LIZ(d23, d11, d14, C207798Dn.LIZ(d18, d9, d14, (C207798Dn.LIZ(d21, d12, d13, C207798Dn.LIZ(d20, d11, d13, (((d17 * d10) * d13) - ((d18 * d10) * d13)) - ((d19 * d11) * d13))) - ((d22 * d12) * d13)) - ((d17 * d9) * d14))) - ((d24 * d11) * d14)) - ((d25 * d12) * d14))) - ((d20 * d9) * d15)) - ((d23 * d10) * d15))) - ((d12 * d28) * d15)) - ((d21 * d9) * d16))) - ((d26 * d10) * d16)) - ((d27 * d11) * d16));
    }

    public static boolean LIZJ(double d) {
        if (Double.isNaN(d) || Math.abs(d) >= 1.0E-5d) {
            return false;
        }
        return true;
    }

    public static double LIZLLL(double d) {
        return Math.round(d * 1000.0d) * 0.001d;
    }

    public static double LJI(double[] dArr) {
        double d = dArr[0];
        double d2 = dArr[1];
        double d3 = d2 * d2;
        double d4 = dArr[2];
        return Math.sqrt((d4 * d4) + d3 + (d * d));
    }

    public static double LJFF(double[] dArr, double[] dArr2) {
        return (dArr[2] * dArr2[2]) + (dArr[1] * dArr2[1]) + (dArr[0] * dArr2[0]);
    }

    public static double[] LJII(double[] dArr, double d) {
        if (LIZJ(d)) {
            d = LJI(dArr);
        }
        double d2 = 1.0d / d;
        return new double[]{dArr[0] * d2, dArr[1] * d2, dArr[2] * d2};
    }

    public static double[] LJ(double[] dArr, double[] dArr2, double d) {
        return new double[]{(dArr2[0] * d) + (dArr[0] * 1.0d), (dArr2[1] * d) + (dArr[1] * 1.0d), (d * dArr2[2]) + (1.0d * dArr[2])};
    }
}
