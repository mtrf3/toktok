package X;

/* renamed from: X.PwA, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC66054PwA implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ Throwable LJLILLLLZI;
    public final /* synthetic */ int LJLJI = 3;
    public final /* synthetic */ boolean LJLJJI;

    public RunnableC66054PwA(String str, Throwable th, boolean z) {
        this.LJLIL = str;
        this.LJLILLLLZI = th;
        this.LJLJJI = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C66076PwW.LIZIZ(this.LJLJI, !this.LJLJJI ? 1 : 0, this.LJLIL, this.LJLILLLLZI);
        } finally {
            if (LIZ) {
            }
        }
    }
}
