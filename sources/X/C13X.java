package X;

import Y.IDComparatorS28S0000000;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import defpackage.b1;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.13X, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C13X {
    public C13V LIZ;
    public C019405u LIZIZ;
    public String LIZJ;
    public int LIZLLL;
    public int LJ;
    public final ArrayList<C13W> LJFF = new ArrayList<>();

    public abstract void LIZIZ(View view, float f);

    public final void LIZJ() {
        int i;
        int size = this.LJFF.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.LJFF, new IDComparatorS28S0000000(18));
        double[] dArr = new double[size];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, 2);
        this.LIZ = new C13V(this.LIZLLL, size);
        Iterator<C13W> it = this.LJFF.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            C13W next = it.next();
            float f = next.LIZLLL;
            dArr[i2] = f * 0.01d;
            double[] dArr3 = dArr2[i2];
            float f2 = next.LIZIZ;
            dArr3[0] = f2;
            float f3 = next.LIZJ;
            dArr3[1] = f3;
            C13V c13v = this.LIZ;
            c13v.LIZJ[i2] = next.LIZ / 100.0d;
            c13v.LIZLLL[i2] = f;
            c13v.LJ[i2] = f3;
            c13v.LIZIZ[i2] = f2;
            i2++;
        }
        C13V c13v2 = this.LIZ;
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, c13v2.LIZJ.length, 2);
        c13v2.LJI = new double[c13v2.LIZIZ.length + 1];
        if (c13v2.LIZJ[0] > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            c13v2.LIZ.LIZ(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, c13v2.LIZLLL[0]);
        }
        double[] dArr5 = c13v2.LIZJ;
        int length = dArr5.length - 1;
        if (dArr5[length] < 1.0d) {
            c13v2.LIZ.LIZ(1.0d, c13v2.LIZLLL[length]);
        }
        for (int i3 = 0; i3 < dArr4.length; i3++) {
            dArr4[i3][0] = c13v2.LJ[i3];
            int i4 = 0;
            while (true) {
                if (i4 < c13v2.LIZIZ.length) {
                    dArr4[i4][1] = r1[i4];
                    i4++;
                }
            }
            c13v2.LIZ.LIZ(c13v2.LIZJ[i3], c13v2.LIZLLL[i3]);
        }
        C11Z c11z = c13v2.LIZ;
        double d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        int i5 = 0;
        while (true) {
            if (i5 >= c11z.LIZ.length) {
                break;
            }
            d += r1[i5];
            i5++;
        }
        double d2 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        int i6 = 1;
        while (true) {
            float[] fArr = c11z.LIZ;
            if (i6 >= fArr.length) {
                break;
            }
            int i7 = i6 - 1;
            float f4 = (fArr[i7] + fArr[i6]) / 2.0f;
            double[] dArr6 = c11z.LIZIZ;
            d2 += (dArr6[i6] - dArr6[i7]) * f4;
            i6++;
        }
        int i8 = 0;
        while (true) {
            float[] fArr2 = c11z.LIZ;
            if (i8 >= fArr2.length) {
                break;
            }
            fArr2[i8] = (float) (fArr2[i8] * (d / d2));
            i8++;
        }
        c11z.LIZJ[0] = 0.0d;
        int i9 = 1;
        while (true) {
            float[] fArr3 = c11z.LIZ;
            if (i9 >= fArr3.length) {
                break;
            }
            int i10 = i9 - 1;
            float f5 = (fArr3[i10] + fArr3[i9]) / 2.0f;
            double[] dArr7 = c11z.LIZIZ;
            double d3 = dArr7[i9] - dArr7[i10];
            double[] dArr8 = c11z.LIZJ;
            dArr8[i9] = (d3 * f5) + dArr8[i10];
            i9++;
        }
        double[] dArr9 = c13v2.LIZJ;
        if (dArr9.length > 1) {
            i = 0;
            c13v2.LJFF = C11X.LIZ(0, dArr9, dArr4);
        } else {
            i = 0;
            c13v2.LJFF = null;
        }
        C11X.LIZ(i, dArr, dArr2);
    }

    public final String toString() {
        String str = this.LIZJ;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<C13W> it = this.LJFF.iterator();
        while (it.hasNext()) {
            C13W next = it.next();
            StringBuilder LIZJ = b1.LIZJ(str, "[");
            LIZJ.append(next.LIZ);
            LIZJ.append(" , ");
            LIZJ.append(decimalFormat.format(next.LIZIZ));
            LIZJ.append("] ");
            str = X1D.LIZIZ(LIZJ);
        }
        return str;
    }

    public final float LIZ(float f) {
        double signum;
        double abs;
        C13V c13v = this.LIZ;
        C11X c11x = c13v.LJFF;
        if (c11x != null) {
            c11x.LIZJ(c13v.LJI, f);
        } else {
            double[] dArr = c13v.LJI;
            dArr[0] = c13v.LJ[0];
            dArr[1] = c13v.LIZIZ[0];
        }
        double d = c13v.LJI[0];
        C11Z c11z = c13v.LIZ;
        double d2 = f;
        switch (c11z.LIZLLL) {
            case 1:
                signum = Math.signum(0.5d - (c11z.LIZIZ(d2) % 1.0d));
                break;
            case 2:
                abs = Math.abs((((c11z.LIZIZ(d2) * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                signum = 1.0d - abs;
                break;
            case 3:
                signum = (((c11z.LIZIZ(d2) * 2.0d) + 1.0d) % 2.0d) - 1.0d;
                break;
            case 4:
                abs = ((c11z.LIZIZ(d2) * 2.0d) + 1.0d) % 2.0d;
                signum = 1.0d - abs;
                break;
            case 5:
                signum = Math.cos(c11z.LIZIZ(d2) * 6.283185307179586d);
                break;
            case 6:
                double abs2 = 1.0d - Math.abs(((c11z.LIZIZ(d2) * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                signum = 1.0d - abs;
                break;
            default:
                signum = Math.sin(c11z.LIZIZ(d2) * 6.283185307179586d);
                break;
        }
        return (float) ((signum * c13v.LJI[1]) + d);
    }
}
