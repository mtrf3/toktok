package X;

/* renamed from: X.U9r, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC76735U9r implements Runnable {
    public final /* synthetic */ U7U LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;

    public RunnableC76735U9r(U7U u7u, String str, int i, int i2) {
        this.LJLIL = u7u;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            U9F u9f = this.LJLIL.LJFF;
            if (u9f != null) {
                u9f.LJJII(this.LJLJI, this.LJLJJI, this.LJLILLLLZI);
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
