package X;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.lang.reflect.Array;

/* renamed from: X.1eu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C38321eu extends AbstractC267713h {
    public final String LJIIJ;
    public final SparseArray<C019405u> LJIIJJI;
    public final SparseArray<float[]> LJIIL = new SparseArray<>();
    public float[] LJIILIIL;
    public float[] LJIILJJIL;

    @Override // X.AbstractC267713h
    public final void LJ(int i) {
        int size = this.LJIIJJI.size();
        int LIZLLL = this.LJIIJJI.valueAt(0).LIZLLL();
        double[] dArr = new double[size];
        int i2 = LIZLLL + 2;
        this.LJIILIIL = new float[i2];
        this.LJIILJJIL = new float[LIZLLL];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, i2);
        for (int i3 = 0; i3 < size; i3++) {
            int keyAt = this.LJIIJJI.keyAt(i3);
            C019405u valueAt = this.LJIIJJI.valueAt(i3);
            float[] valueAt2 = this.LJIIL.valueAt(i3);
            dArr[i3] = keyAt * 0.01d;
            valueAt.LIZJ(this.LJIILIIL);
            int i4 = 0;
            while (true) {
                if (i4 < this.LJIILIIL.length) {
                    dArr2[i3][i4] = r1[i4];
                    i4++;
                }
            }
            double[] dArr3 = dArr2[i3];
            dArr3[LIZLLL] = valueAt2[0];
            dArr3[LIZLLL + 1] = valueAt2[1];
        }
        this.LIZ = C11X.LIZ(i, dArr, dArr2);
    }

    public C38321eu(String str, SparseArray<C019405u> sparseArray) {
        this.LJIIJ = str.split(",")[1];
        this.LJIIJJI = sparseArray;
    }

    @Override // X.AbstractC267713h
    public final boolean LIZLLL(float f, long j, View view, C13T c13t) {
        boolean z;
        this.LIZ.LIZLLL(this.LJIILIIL, f);
        float[] fArr = this.LJIILIIL;
        float f2 = fArr[fArr.length - 2];
        float f3 = fArr[fArr.length - 1];
        long j2 = j - this.LJIIIIZZ;
        if (Float.isNaN(this.LJIIIZ)) {
            float LIZLLL = c13t.LIZLLL(this.LJIIJ, view);
            this.LJIIIZ = LIZLLL;
            if (Float.isNaN(LIZLLL)) {
                this.LJIIIZ = 0.0f;
            }
        }
        float f4 = (float) ((((j2 * 1.0E-9d) * f2) + this.LJIIIZ) % 1.0d);
        this.LJIIIZ = f4;
        this.LJIIIIZZ = j;
        float LIZ = LIZ(f4);
        this.LJII = false;
        int i = 0;
        while (true) {
            float[] fArr2 = this.LJIILJJIL;
            if (i >= fArr2.length) {
                break;
            }
            boolean z2 = this.LJII;
            float f5 = this.LJIILIIL[i];
            if (f5 != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                z = true;
            } else {
                z = false;
            }
            this.LJII = z2 | z;
            fArr2[i] = (f5 * LIZ) + f3;
            i++;
        }
        this.LJIIJJI.valueAt(0).LJI(view, this.LJIILJJIL);
        if (f2 != 0.0f) {
            this.LJII = true;
        }
        return this.LJII;
    }

    @Override // X.AbstractC267713h
    public final void LIZJ(float f, float f2, float f3, int i, int i2) {
        throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
    }
}
