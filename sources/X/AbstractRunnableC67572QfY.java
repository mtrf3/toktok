package X;

/* renamed from: X.QfY, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractRunnableC67572QfY implements Runnable {
    public final C67649Qgn LJLIL;

    public AbstractRunnableC67572QfY() {
    }

    public AbstractRunnableC67572QfY(C67649Qgn c67649Qgn) {
        this.LJLIL = c67649Qgn;
    }

    public abstract void LIZIZ();

    public final void LIZJ() {
        try {
            LIZIZ();
        } catch (Exception e) {
            LIZ(e);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public void LIZ(Exception exc) {
        C67649Qgn c67649Qgn = this.LJLIL;
        if (c67649Qgn != null) {
            c67649Qgn.LIZJ(exc);
        }
    }
}
