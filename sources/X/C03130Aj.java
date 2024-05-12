package X;

/* renamed from: X.0Aj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C03130Aj {
    public final int[] LIZ;
    public final int LIZIZ;

    public C03130Aj(int i) {
        int[] iArr = new int[i];
        this.LIZ = iArr;
        this.LIZIZ = iArr.length / 2;
    }

    public final int LIZ(int i) {
        return this.LIZ[i + this.LIZIZ];
    }
}
