package X;

/* loaded from: classes7.dex */
public final class EV5 implements Runnable {
    public final Runnable LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            try {
                this.LJLIL.run();
            } catch (Exception unused) {
                C70657RoD.LJIILL();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public EV5(Runnable runnable) {
        this.LJLIL = runnable;
    }
}
