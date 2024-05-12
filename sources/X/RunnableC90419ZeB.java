package X;

/* renamed from: X.ZeB, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class RunnableC90419ZeB implements Runnable {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ C90780Zk0 LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLJI.LIZ.onPositionUpdate(this.LJLIL, this.LJLILLLLZI);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC90419ZeB(C90780Zk0 c90780Zk0, long j, long j2) {
        this.LJLJI = c90780Zk0;
        this.LJLIL = j;
        this.LJLILLLLZI = j2;
    }
}
