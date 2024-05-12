package X;

/* renamed from: X.FDa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC38602FDa implements Runnable, InterfaceC38617FDp {
    public Runnable LJLIL;

    @Override // X.InterfaceC38617FDp
    public final void LIZ() {
        this.LJLIL = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            Runnable runnable = this.LJLIL;
            if (runnable != null) {
                runnable.run();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC38602FDa(Runnable runnable) {
        this.LJLIL = runnable;
    }
}
