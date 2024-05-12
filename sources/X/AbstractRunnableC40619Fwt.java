package X;

/* renamed from: X.Fwt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractRunnableC40619Fwt implements Runnable {
    public final C40579FwF LJLIL;

    public AbstractRunnableC40619Fwt() {
    }

    public AbstractRunnableC40619Fwt(C40579FwF c40579FwF) {
        this.LJLIL = c40579FwF;
    }

    public abstract void LIZ();

    public final void LIZIZ() {
        try {
            LIZ();
        } catch (Exception e) {
            C40579FwF c40579FwF = this.LJLIL;
            if (c40579FwF != null) {
                c40579FwF.LIZIZ(e);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
