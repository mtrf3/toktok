package X;

import android.view.View;
import defpackage.b1;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* renamed from: X.13g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC267613g {
    public C11X LIZ;
    public int[] LIZIZ = new int[10];
    public float[] LIZJ = new float[10];
    public int LIZLLL;
    public String LJ;

    public abstract void LIZJ(View view, float f);

    public final String toString() {
        String str = this.LJ;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.LIZLLL; i++) {
            StringBuilder LIZJ = b1.LIZJ(str, "[");
            LIZJ.append(this.LIZIZ[i]);
            LIZJ.append(" , ");
            LIZJ.append(decimalFormat.format(this.LIZJ[i]));
            LIZJ.append("] ");
            str = X1D.LIZIZ(LIZJ);
        }
        return str;
    }

    public final float LIZ(float f) {
        return (float) this.LIZ.LIZIZ(f);
    }

    public void LIZLLL(int i) {
        int i2 = this.LIZLLL;
        if (i2 == 0) {
            return;
        }
        int[] iArr = this.LIZIZ;
        float[] fArr = this.LIZJ;
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
                        float f = fArr[i8];
                        fArr[i8] = fArr[i9];
                        fArr[i9] = f;
                        i8++;
                    }
                }
                int i12 = iArr[i8];
                iArr[i8] = iArr[i6];
                iArr[i6] = i12;
                float f2 = fArr[i8];
                fArr[i8] = fArr[i6];
                fArr[i6] = f2;
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
        for (int i17 = 1; i17 < this.LIZLLL; i17++) {
            int[] iArr3 = this.LIZIZ;
            if (iArr3[i17 - 1] != iArr3[i17]) {
                i16++;
            }
        }
        double[] dArr = new double[i16];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i16, 1);
        int i18 = 0;
        for (int i19 = 0; i19 < this.LIZLLL; i19++) {
            if (i19 > 0) {
                int[] iArr4 = this.LIZIZ;
                if (iArr4[i19] == iArr4[i19 - 1]) {
                }
            }
            dArr[i18] = this.LIZIZ[i19] * 0.01d;
            dArr2[i18][0] = this.LIZJ[i19];
            i18++;
        }
        this.LIZ = C11X.LIZ(i, dArr, dArr2);
    }

    public void LIZIZ(float f, int i) {
        int[] iArr = this.LIZIZ;
        if (iArr.length < this.LIZLLL + 1) {
            this.LIZIZ = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.LIZJ;
            this.LIZJ = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.LIZIZ;
        int i2 = this.LIZLLL;
        iArr2[i2] = i;
        this.LIZJ[i2] = f;
        this.LIZLLL = i2 + 1;
    }
}
