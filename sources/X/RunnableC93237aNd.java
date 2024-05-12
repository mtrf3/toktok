package X;

/* renamed from: X.aNd, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class RunnableC93237aNd implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ Runnable LJLILLLLZI;

    public RunnableC93237aNd(String str, Runnable runnable) {
        this.LJLIL = str;
        this.LJLILLLLZI = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C93238aNe.LIZIZ.remove(this.LJLIL);
            this.LJLILLLLZI.run();
        } finally {
            if (LIZ) {
            }
        }
    }
}
