package X;

/* renamed from: X.R1z, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C68891R1z {
    public final long LIZ;
    public final long LIZIZ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append("/");
        LIZ.append(this.LIZIZ);
        return X1D.LIZIZ(LIZ);
    }

    public C68891R1z(long j, long j2) {
        if (j2 == 0) {
            this.LIZ = 0L;
            this.LIZIZ = 1L;
        } else {
            this.LIZ = j;
            this.LIZIZ = j2;
        }
    }
}
