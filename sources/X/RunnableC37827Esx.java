package X;

/* renamed from: X.Esx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC37827Esx implements Runnable {
    public final Runnable LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            try {
                this.LJLIL.run();
            } catch (Exception e) {
                C77117UOj.LJIIZILJ(e);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC37827Esx(Runnable runnable) {
        this.LJLIL = runnable;
    }
}
