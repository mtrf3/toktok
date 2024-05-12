package X;

/* renamed from: X.GPl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC41473GPl extends AbstractC43051Gv1 {
    public final boolean LIZIZ = true;

    public abstract void LJIILIIL();

    public abstract long LJIILJJIL();

    @Override // X.AbstractC43051Gv1
    public final boolean LJFF() {
        if (!this.LIZIZ) {
            return true;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AVBaseStorage : ");
        LIZ.append(LJIIIIZZ());
        LIZ.append(" , doClean...");
        C5Z2.LIZ(X1D.LIZIZ(LIZ));
        LJIILIIL();
        return true;
    }

    @Override // X.AbstractC43051Gv1
    public final long LJIIJJI() {
        if (!this.LIZIZ) {
            return 0L;
        }
        return LJIILJJIL();
    }
}
