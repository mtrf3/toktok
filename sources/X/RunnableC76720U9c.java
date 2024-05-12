package X;

/* renamed from: X.U9c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC76720U9c implements Runnable {
    public final /* synthetic */ U7U LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public RunnableC76720U9c(U7U u7u, long j, int i) {
        this.LJLIL = u7u;
        this.LJLILLLLZI = j;
        this.LJLJI = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            U9F u9f = this.LJLIL.LJFF;
            if (u9f != null) {
                u9f.LJ(this.LJLILLLLZI, this.LJLJI);
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
