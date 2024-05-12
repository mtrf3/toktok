package X;

/* renamed from: X.Fw4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC40568Fw4 implements Runnable {
    public final /* synthetic */ C40561Fvx LJLIL;
    public final /* synthetic */ C40567Fw3 LJLILLLLZI;

    public RunnableC40568Fw4(C40567Fw3 c40567Fw3, C40561Fvx c40561Fvx) {
        this.LJLILLLLZI = c40567Fw3;
        this.LJLIL = c40561Fvx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            synchronized (this.LJLILLLLZI.LIZIZ) {
                InterfaceC40570Fw6 interfaceC40570Fw6 = this.LJLILLLLZI.LIZJ;
                if (interfaceC40570Fw6 != null) {
                    interfaceC40570Fw6.onFailure(this.LJLIL.LJ());
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
