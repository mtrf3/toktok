package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.Arrays;

/* renamed from: X.11W, reason: invalid class name */
/* loaded from: classes.dex */
public class C11W {
    public static final double[] LJIJ = new double[91];
    public final double[] LIZ;
    public double LIZIZ;
    public final double LIZJ;
    public final double LIZLLL;
    public final double LJ;
    public final double LJFF;
    public final double LJI;
    public final double LJII;
    public final double LJIIIIZZ;
    public final double LJIIIZ;
    public final double LJIIJ;
    public final double LJIIJJI;
    public final double LJIIL;
    public final double LJIILIIL;
    public double LJIILJJIL;
    public double LJIILL;
    public final boolean LJIILLIIL;
    public final boolean LJIIZILJ;

    public final void LIZ(double d) {
        double d2;
        if (this.LJIILLIIL) {
            d2 = this.LIZLLL - d;
        } else {
            d2 = d - this.LIZJ;
        }
        double d3 = d2 * this.LJIIIIZZ;
        double d4 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        if (d3 > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            d4 = 1.0d;
            if (d3 < 1.0d) {
                double[] dArr = this.LIZ;
                double length = d3 * (dArr.length - 1);
                int i = (int) length;
                double d5 = dArr[i];
                d4 = ((dArr[i + 1] - d5) * (length - i)) + d5;
            }
        }
        double d6 = d4 * 1.5707963267948966d;
        this.LJIILJJIL = Math.sin(d6);
        this.LJIILL = Math.cos(d6);
    }

    public C11W(int i, double d, double d2, double d3, double d4, double d5, double d6) {
        boolean z;
        int i2;
        double d7;
        double[] dArr;
        double d8 = d3;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LJIILLIIL = z;
        this.LIZJ = d;
        this.LIZLLL = d2;
        double d9 = 1.0d / (d2 - d);
        this.LJIIIIZZ = d9;
        if (3 == i) {
            this.LJIIZILJ = true;
        }
        double d10 = d5 - d8;
        double d11 = d6 - d4;
        if (this.LJIIZILJ || Math.abs(d10) < 0.001d || Math.abs(d11) < 0.001d) {
            this.LJIIZILJ = true;
            this.LJ = d8;
            this.LJFF = d5;
            this.LJI = d4;
            this.LJII = d6;
            double hypot = Math.hypot(d11, d10);
            this.LIZIZ = hypot;
            this.LJIILIIL = hypot * d9;
            this.LJIIJJI = d10 / (d2 - d);
            this.LJIIL = d11 / (d2 - d);
            return;
        }
        this.LIZ = new double[101];
        this.LJIIIZ = (z ? -1 : 1) * d10;
        if (z) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        this.LJIIJ = d11 * i2;
        this.LJIIJJI = z ? d5 : d8;
        if (z) {
            d7 = d4;
        } else {
            d7 = d6;
        }
        this.LJIIL = d7;
        double d12 = d4 - d6;
        int i3 = 0;
        double d13 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        double d14 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        double d15 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        while (true) {
            dArr = LJIJ;
            if (i3 >= 91) {
                break;
            }
            double radians = Math.toRadians((i3 * 90.0d) / 90);
            double sin = Math.sin(radians) * d10;
            double cos = Math.cos(radians) * d12;
            if (i3 > 0) {
                d13 += Math.hypot(sin - d14, cos - d15);
                dArr[i3] = d13;
            }
            i3++;
            d15 = cos;
            d14 = sin;
        }
        this.LIZIZ = d13;
        int i4 = 0;
        do {
            dArr[i4] = dArr[i4] / d13;
            i4++;
        } while (i4 < 91);
        int i5 = 0;
        while (true) {
            if (i5 < this.LIZ.length) {
                double length = i5 / (r4.length - 1);
                int binarySearch = Arrays.binarySearch(dArr, length);
                if (binarySearch >= 0) {
                    this.LIZ[i5] = binarySearch / 90;
                } else if (binarySearch == -1) {
                    this.LIZ[i5] = 0.0d;
                } else {
                    int i6 = -binarySearch;
                    int i7 = i6 - 2;
                    double d16 = dArr[i7];
                    this.LIZ[i5] = (((length - d16) / (dArr[i6 - 1] - d16)) + i7) / 90;
                }
                i5++;
            } else {
                this.LJIILIIL = this.LIZIZ * this.LJIIIIZZ;
                return;
            }
        }
    }
}
