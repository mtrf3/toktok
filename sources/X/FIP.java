package X;

import android.util.SparseArray;

/* loaded from: classes7.dex */
public final class FIP {
    public static final FIP LIZIZ = new FIP();
    public final SparseArray<FIR> LIZ = new SparseArray<>(4);

    public final void LIZIZ() {
        for (int i = 0; i < this.LIZ.size(); i++) {
            FIR valueAt = this.LIZ.valueAt(i);
            if (valueAt != null && System.currentTimeMillis() - valueAt.LIZIZ > 10800000) {
                valueAt.LIZLLL.LIZ();
            }
        }
    }

    public final void LIZ(int i, boolean z) {
        if (this.LIZ.get(i) == null) {
            return;
        }
        this.LIZ.get(i).LIZIZ = System.currentTimeMillis();
        this.LIZ.get(i).LIZ = z;
        if (z) {
            this.LIZ.get(i).LIZJ = 0;
        }
    }
}
