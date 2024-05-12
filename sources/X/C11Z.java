package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.Arrays;

/* renamed from: X.11Z, reason: invalid class name */
/* loaded from: classes.dex */
public final class C11Z {
    public float[] LIZ = new float[0];
    public double[] LIZIZ = new double[0];
    public double[] LIZJ;
    public int LIZLLL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pos =");
        LIZ.append(Arrays.toString(this.LIZIZ));
        LIZ.append(" period=");
        LIZ.append(Arrays.toString(this.LIZ));
        return X1D.LIZIZ(LIZ);
    }

    public final double LIZIZ(double d) {
        if (d < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        } else if (d > 1.0d) {
            d = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(this.LIZIZ, d);
        if (binarySearch > 0) {
            return 1.0d;
        }
        if (binarySearch != 0) {
            int i = (-binarySearch) - 1;
            float[] fArr = this.LIZ;
            float f = fArr[i];
            int i2 = i - 1;
            float f2 = fArr[i2];
            double d2 = f - f2;
            double[] dArr = this.LIZIZ;
            double d3 = dArr[i];
            double d4 = dArr[i2];
            double d5 = d2 / (d3 - d4);
            return ((((d * d) - (d4 * d4)) * d5) / 2.0d) + ((d - d4) * (f2 - (d5 * d4))) + this.LIZJ[i2];
        }
        return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    }

    public final void LIZ(double d, float f) {
        int length = this.LIZ.length + 1;
        int binarySearch = Arrays.binarySearch(this.LIZIZ, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.LIZIZ = Arrays.copyOf(this.LIZIZ, length);
        this.LIZ = Arrays.copyOf(this.LIZ, length);
        this.LIZJ = new double[length];
        double[] dArr = this.LIZIZ;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.LIZIZ[binarySearch] = d;
        this.LIZ[binarySearch] = f;
    }
}
