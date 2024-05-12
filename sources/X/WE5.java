package X;

/* loaded from: classes15.dex */
public class WE5 {
    public boolean LIZ;
    public long LIZIZ = -1;
    public long LIZJ = -1;

    public final synchronized long LIZ() {
        return this.LIZJ;
    }

    public final synchronized long LIZIZ() {
        return this.LIZIZ;
    }

    public final synchronized void LIZLLL() {
        this.LIZ = false;
        this.LIZJ = -1L;
        this.LIZIZ = -1L;
    }

    public final synchronized void LIZJ(long j, long j2) {
        if (this.LIZ) {
            this.LIZIZ += j;
            this.LIZJ += j2;
        }
    }
}
