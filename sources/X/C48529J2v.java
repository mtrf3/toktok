package X;

/* renamed from: X.J2v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48529J2v {
    public long LIZ = -1;
    public long LIZIZ = -1;

    public final void LIZ() {
        this.LIZIZ = -1L;
        this.LIZ = -1L;
    }

    public final float LIZIZ() {
        long j = this.LIZ;
        if (j >= 0) {
            long j2 = this.LIZIZ;
            if (j2 < 0 || j2 < j || j2 - j > 1000000000) {
                return -1.0f;
            }
            return ((float) (j2 - j)) * 1.0f;
        }
        return -1.0f;
    }
}
