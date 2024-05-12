package X;

/* loaded from: classes9.dex */
public abstract class KU9 implements Runnable {
    public boolean LJLIL;

    public abstract void LIZ();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (!this.LJLIL) {
                this.LJLIL = true;
                LIZ();
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
