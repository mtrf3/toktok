package X;

/* renamed from: X.FiS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39724FiS {
    public static final C39724FiS LIZJ = new C39724FiS(0, null);
    public final int LIZ;
    public final Throwable LIZIZ;

    public final boolean LIZ() {
        if (this.LIZ == 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ZoinResult{code=");
        LIZ.append(this.LIZ);
        LIZ.append(", throwable=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", duration=");
        LIZ.append(0L);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public C39724FiS(int i, Throwable th) {
        this.LIZ = i;
        this.LIZIZ = th;
    }
}
