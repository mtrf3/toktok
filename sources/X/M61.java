package X;

/* loaded from: classes10.dex */
public abstract class M61 implements M69 {
    public boolean LIZ;

    public abstract void LIZIZ(M5X m5x);

    public boolean LIZJ(M5X m5x) {
        return true;
    }

    public M61(boolean z) {
        this.LIZ = z;
    }

    @Override // X.M69
    public final void LIZ(M5X m5x, C56249M5t c56249M5t) {
        if (LIZJ(m5x)) {
            LIZIZ(m5x);
            if (!this.LIZ) {
                c56249M5t.LIZIZ(m5x, c56249M5t);
                return;
            }
            return;
        }
        c56249M5t.LIZIZ(m5x, c56249M5t);
    }
}
