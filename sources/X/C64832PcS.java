package X;

/* renamed from: X.PcS, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64832PcS {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public boolean LJII = true;

    public final void LIZ(int i, int i2) {
        if (i2 > 0 && i > 0) {
            if (i <= i2) {
                this.LIZ = i2;
                this.LIZJ = i;
                return;
            }
            throw new IllegalArgumentException("Core thread size must set less equal than Max thread size.");
        }
        throw new IllegalArgumentException("Api thread size must set > 0.");
    }

    public final void LIZIZ(int i, int i2) {
        if (i2 > 0 && i > 0) {
            if (i <= i2) {
                this.LIZIZ = i2;
                this.LIZLLL = i;
                return;
            }
            throw new IllegalArgumentException("Core thread size must set less equal than Max thread size.");
        }
        throw new IllegalArgumentException("Download thread size must set > 0.");
    }
}
