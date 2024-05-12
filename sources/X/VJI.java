package X;

import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class VJI {
    public final ArrayList<Integer[]> LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public VJI(int i, int i2) {
        int max = Math.max(1, (int) (Math.max(i, i2) / 100.0f));
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = max;
        this.LIZ = new ArrayList<>();
    }

    public final void LIZ(int i, int i2, int i3, int i4, int i5) {
        if (i5 != 0) {
            this.LIZ.add(new Integer[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
        }
    }
}
