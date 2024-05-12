package X;

/* renamed from: X.ZTw, reason: case insensitive filesystem */
/* loaded from: classes19.dex */
public final class RunnableC90000ZTw implements Runnable {
    public final /* synthetic */ InterfaceC89997ZTt LJLIL;
    public final /* synthetic */ C89999ZTv LJLILLLLZI;
    public final /* synthetic */ C89999ZTv LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            try {
                this.LJLIL.LIZ(this.LJLILLLLZI);
                C89999ZTv c89999ZTv = this.LJLJI;
                synchronized (c89999ZTv.LIZJ) {
                    if (!c89999ZTv.LIZIZ) {
                        c89999ZTv.LIZIZ = true;
                        c89999ZTv.LIZ = null;
                        c89999ZTv.LIZJ.notifyAll();
                        c89999ZTv.LIZLLL();
                    }
                }
            } catch (Exception unused) {
                this.LJLJI.LJ();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC90000ZTw(InterfaceC89997ZTt interfaceC89997ZTt, C89999ZTv c89999ZTv, C89999ZTv c89999ZTv2) {
        this.LJLIL = interfaceC89997ZTt;
        this.LJLILLLLZI = c89999ZTv;
        this.LJLJI = c89999ZTv2;
    }
}
