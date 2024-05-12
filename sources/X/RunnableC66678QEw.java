package X;

/* renamed from: X.QEw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC66678QEw implements Runnable {
    public final Runnable LJLIL;
    public Thread LJLILLLLZI;
    public C66677QEv LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (C16880lQ.LLLLIIIILLL() == this.LJLILLLLZI) {
                this.LJLJI = new C66677QEv();
            } else {
                this.LJLIL.run();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC66678QEw(Runnable runnable, Thread thread) {
        this.LJLIL = runnable;
        this.LJLILLLLZI = thread;
    }
}
