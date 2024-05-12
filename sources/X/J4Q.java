package X;

/* loaded from: classes9.dex */
public final class J4Q {
    public long LIZ = -1;
    public long LIZIZ = -1;

    public final float LIZ() {
        long j = this.LIZ;
        if (j >= 0) {
            long j2 = this.LIZIZ;
            if (j2 >= 0 && j2 >= j && j2 - j <= 1000000000) {
                return ((float) (this.LIZIZ - j)) * 1.0f;
            }
        }
        return -1.0f;
    }
}
