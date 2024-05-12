package X;

import java.util.Arrays;

/* renamed from: X.0zC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C25420zC {
    public final String LIZ;
    public long LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public final int[] LJ;
    public final int LJFF;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("visibleScene=");
        LIZ.append(this.LIZ);
        LIZ.append(", sumFrame=");
        LIZ.append(this.LIZJ);
        LIZ.append(", sumDroppedFrames=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", sumFrameCost=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", dropLevel=");
        LIZ.append(Arrays.toString(this.LJ));
        return X1D.LIZIZ(LIZ);
    }

    public C25420zC(String str) {
        this.LIZ = str;
        int i = PH9.LIZIZ - 1;
        this.LJFF = i;
        this.LJ = new int[i + 1];
    }
}
