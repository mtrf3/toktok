package X;

/* renamed from: X.GJo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC41320GJo implements Runnable {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C41319GJn LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    public RunnableC41320GJo(boolean z, C41319GJn c41319GJn, String str) {
        this.LJLIL = z;
        this.LJLILLLLZI = c41319GJn;
        this.LJLJI = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (this.LJLIL) {
                this.LJLILLLLZI.LJ.clear();
            }
            this.LJLILLLLZI.LJ.push(this.LJLJI);
            this.LJLILLLLZI.LJIIIIZZ().storeString("exit_monitor_key_last_page", this.LJLJI);
        } finally {
            if (LIZ) {
            }
        }
    }
}
