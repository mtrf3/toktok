package X;

/* renamed from: X.09f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C028309f {
    public final int LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CompilationStatus{mResultCode=");
        LIZ.append(this.LIZ);
        LIZ.append(", mHasReferenceProfile=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", mHasCurrentProfile=");
        return C48339Iy7.LIZJ(LIZ, this.LIZJ, '}', LIZ);
    }

    public C028309f(int i, boolean z, boolean z2) {
        this.LIZ = i;
        this.LIZJ = z2;
        this.LIZIZ = z;
    }
}
