package X;

/* renamed from: X.IRi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class RunnableC46618IRi implements Runnable {
    public final Runnable LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            try {
                this.LJLIL.run();
            } catch (Exception unused) {
                C46617IRh.LIZ("Executor");
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC46618IRi(Runnable runnable) {
        this.LJLIL = runnable;
    }
}
