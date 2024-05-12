package X;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;

/* renamed from: X.1ef, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C38171ef extends AbstractC267613g {
    public final SparseArray<C019405u> LJFF;
    public float[] LJI;

    @Override // X.AbstractC267613g
    public final void LIZLLL(int i) {
        int size = this.LJFF.size();
        int LIZLLL = this.LJFF.valueAt(0).LIZLLL();
        double[] dArr = new double[size];
        this.LJI = new float[LIZLLL];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, LIZLLL);
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = this.LJFF.keyAt(i2);
            C019405u valueAt = this.LJFF.valueAt(i2);
            dArr[i2] = keyAt * 0.01d;
            valueAt.LIZJ(this.LJI);
            int i3 = 0;
            while (true) {
                if (i3 < this.LJI.length) {
                    dArr2[i2][i3] = r1[i3];
                    i3++;
                }
            }
        }
        this.LIZ = C11X.LIZ(i, dArr, dArr2);
    }

    public C38171ef(String str, SparseArray<C019405u> sparseArray) {
        str.split(",");
        this.LJFF = sparseArray;
    }

    @Override // X.AbstractC267613g
    public final void LIZIZ(float f, int i) {
        throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
    }

    @Override // X.AbstractC267613g
    public final void LIZJ(View view, float f) {
        this.LIZ.LIZLLL(this.LJI, f);
        this.LJFF.valueAt(0).LJI(view, this.LJI);
    }
}
