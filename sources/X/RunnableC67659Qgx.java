package X;

/* renamed from: X.Qgx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC67659Qgx implements Runnable {
    public final /* synthetic */ C67658Qgw LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            synchronized (this.LJLIL.LJLILLLLZI) {
                InterfaceC67680QhI interfaceC67680QhI = this.LJLIL.LJLJI;
                if (interfaceC67680QhI != null) {
                    interfaceC67680QhI.LIZ();
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC67659Qgx(C67658Qgw c67658Qgw) {
        this.LJLIL = c67658Qgw;
    }
}
