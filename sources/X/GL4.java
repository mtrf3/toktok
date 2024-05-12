package X;

/* loaded from: classes8.dex */
public class GL4 implements Runnable {
    public int LJLIL = 2;
    public final Runnable LJLILLLLZI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            int i = this.LJLIL - 1;
            this.LJLIL = i;
            if (i == 0) {
                this.LJLILLLLZI.run();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public GL4(Runnable runnable) {
        this.LJLILLLLZI = runnable;
    }
}
