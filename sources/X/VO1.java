package X;

/* loaded from: classes15.dex */
public abstract class VO1 implements Runnable {
    public final VO0 LJLIL;

    public abstract void LIZ();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            try {
                LIZ();
            } catch (RuntimeException e) {
                this.LJLIL.handleException(e);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public VO1(VNU vnu) {
        this.LJLIL = vnu;
    }
}
