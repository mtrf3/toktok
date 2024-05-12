package X;

import android.view.View;
import defpackage.b1;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.13h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC267713h {
    public C11X LIZ;
    public int LIZIZ;
    public int LJ;
    public String LJFF;
    public boolean LJII;
    public long LJIIIIZZ;
    public final int[] LIZJ = new int[10];
    public final float[][] LIZLLL = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);
    public final float[] LJI = new float[3];
    public float LJIIIZ = Float.NaN;

    public abstract boolean LIZLLL(float f, long j, View view, C13T c13t);

    public final String toString() {
        String str = this.LJFF;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.LJ; i++) {
            StringBuilder LIZJ = b1.LIZJ(str, "[");
            LIZJ.append(this.LIZJ[i]);
            LIZJ.append(" , ");
            LIZJ.append(decimalFormat.format(this.LIZLLL[i]));
            LIZJ.append("] ");
            str = X1D.LIZIZ(LIZJ);
        }
        return str;
    }

    public final float LIZ(float f) {
        float abs;
        switch (this.LIZIZ) {
            case 1:
                return Math.signum(f * 6.2831855f);
            case 2:
                abs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f * 6.2831855f);
            case 6:
                float abs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin(f * 6.2831855f);
        }
        return 1.0f - abs;
    }

    public void LJ(int i) {
        int i2 = this.LJ;
        if (i2 == 0) {
            return;
        }
        int[] iArr = this.LIZJ;
        float[][] fArr = this.LIZLLL;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i2 - 1;
        iArr2[1] = 0;
        int i3 = 2;
        do {
            int i4 = i3 - 1;
            int i5 = iArr2[i4];
            i3 = i4 - 1;
            int i6 = iArr2[i3];
            if (i5 < i6) {
                int i7 = iArr[i6];
                int i8 = i5;
                for (int i9 = i5; i9 < i6; i9++) {
                    int i10 = iArr[i9];
                    if (i10 <= i7) {
                        int i11 = iArr[i8];
                        iArr[i8] = i10;
                        iArr[i9] = i11;
                        float[] fArr2 = fArr[i8];
                        fArr[i8] = fArr[i9];
                        fArr[i9] = fArr2;
                        i8++;
                    }
                }
                int i12 = iArr[i8];
                iArr[i8] = iArr[i6];
                iArr[i6] = i12;
                float[] fArr3 = fArr[i8];
                fArr[i8] = fArr[i6];
                fArr[i6] = fArr3;
                int i13 = i3 + 1;
                iArr2[i3] = i8 - 1;
                int i14 = i13 + 1;
                iArr2[i13] = i5;
                int i15 = i14 + 1;
                iArr2[i14] = i6;
                i3 = i15 + 1;
                iArr2[i15] = i8 + 1;
            }
        } while (i3 > 0);
        int i16 = 1;
        int i17 = 0;
        while (true) {
            int[] iArr3 = this.LIZJ;
            if (i16 >= iArr3.length) {
                break;
            }
            if (iArr3[i16] != iArr3[i16 - 1]) {
                i17++;
            }
            i16++;
        }
        if (i17 == 0) {
            i17 = 1;
        }
        double[] dArr = new double[i17];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i17, 3);
        int i18 = 0;
        for (int i19 = 0; i19 < this.LJ; i19++) {
            if (i19 > 0) {
                int[] iArr4 = this.LIZJ;
                if (iArr4[i19] == iArr4[i19 - 1]) {
                }
            }
            dArr[i18] = this.LIZJ[i19] * 0.01d;
            double[] dArr3 = dArr2[i18];
            float[] fArr4 = this.LIZLLL[i19];
            dArr3[0] = fArr4[0];
            dArr3[1] = fArr4[1];
            dArr3[2] = fArr4[2];
            i18++;
        }
        this.LIZ = C11X.LIZ(i, dArr, dArr2);
    }

    public final float LIZIZ(float f, long j, View view, C13T c13t) {
        this.LIZ.LIZLLL(this.LJI, f);
        float[] fArr = this.LJI;
        float f2 = fArr[1];
        if (f2 == 0.0f) {
            this.LJII = false;
            return fArr[2];
        }
        if (Float.isNaN(this.LJIIIZ)) {
            float LIZLLL = c13t.LIZLLL(this.LJFF, view);
            this.LJIIIZ = LIZLLL;
            if (Float.isNaN(LIZLLL)) {
                this.LJIIIZ = 0.0f;
            }
        }
        float f3 = (float) (((((j - this.LJIIIIZZ) * 1.0E-9d) * f2) + this.LJIIIZ) % 1.0d);
        this.LJIIIZ = f3;
        String str = this.LJFF;
        if (!((HashMap) c13t.LIZ).containsKey(view)) {
            HashMap hashMap = new HashMap();
            hashMap.put(str, new float[]{f3});
            ((HashMap) c13t.LIZ).put(view, hashMap);
        } else {
            HashMap hashMap2 = (HashMap) ((HashMap) c13t.LIZ).get(view);
            if (!hashMap2.containsKey(str)) {
                hashMap2.put(str, new float[]{f3});
                ((HashMap) c13t.LIZ).put(view, hashMap2);
            } else {
                float[] fArr2 = (float[]) hashMap2.get(str);
                if (fArr2.length <= 0) {
                    fArr2 = Arrays.copyOf(fArr2, 1);
                }
                fArr2[0] = f3;
                hashMap2.put(str, fArr2);
            }
        }
        this.LJIIIIZZ = j;
        float f4 = this.LJI[0];
        float LIZ = (LIZ(this.LJIIIZ) * f4) + this.LJI[2];
        int i = (f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1));
        this.LJII = true;
        return LIZ;
    }

    public void LIZJ(float f, float f2, float f3, int i, int i2) {
        int[] iArr = this.LIZJ;
        int i3 = this.LJ;
        iArr[i3] = i;
        float[] fArr = this.LIZLLL[i3];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        this.LIZIZ = Math.max(this.LIZIZ, i2);
        this.LJ++;
    }
}
