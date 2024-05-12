package X;

/* loaded from: classes15.dex */
public final class VG7 {
    public long LIZ;
    public long LIZIZ;
    public int LIZJ = 3;
    public boolean LIZLLL;
    public final int LJ;

    public final synchronized void LIZ() {
        this.LIZJ = 2;
        this.LIZIZ = 0L;
    }

    public final synchronized void LIZIZ() {
        this.LIZJ = 1;
    }

    public final synchronized void LIZJ() {
        this.LIZJ = 3;
        this.LIZIZ = 0L;
        this.LIZLLL = false;
        this.LIZ = 0L;
    }

    public VG7(int i) {
        this.LJ = -1;
        this.LJ = i;
    }
}
