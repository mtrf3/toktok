package X;

/* renamed from: X.0MY, reason: invalid class name */
/* loaded from: classes.dex */
public class C0MY {
    public final long LIZ;
    public final long LIZIZ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append("/");
        LIZ.append(this.LIZIZ);
        return X1D.LIZIZ(LIZ);
    }

    public C0MY(long j, long j2) {
        if (j2 == 0) {
            this.LIZ = 0L;
            this.LIZIZ = 1L;
        } else {
            this.LIZ = j;
            this.LIZIZ = j2;
        }
    }
}
