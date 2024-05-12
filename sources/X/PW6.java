package X;

/* loaded from: classes12.dex */
public final class PW6 {
    public long LIZ;

    public PW6(long j) {
        this.LIZ = j;
    }

    public final synchronized void LIZ(long j) {
        this.LIZ += j;
    }

    public final synchronized long LIZIZ(long j) {
        long j2 = this.LIZ;
        if (j2 == 0) {
            j = 0;
        } else if (j2 < j) {
            this.LIZ = 0L;
            j = j2;
        } else {
            this.LIZ = j2 - j;
        }
        return j;
    }
}
