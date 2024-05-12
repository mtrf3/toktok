package X;

/* renamed from: X.QkU, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC67878QkU implements Runnable {
    public final /* synthetic */ C67972Qm0 LJLIL;

    public RunnableC67878QkU(C67972Qm0 c67972Qm0) {
        this.LJLIL = c67972Qm0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            InterfaceC67836Qjo interfaceC67836Qjo = this.LJLIL.LIZ.LJLILLLLZI;
            interfaceC67836Qjo.LJIIJ(interfaceC67836Qjo.getClass().getName().concat(" disconnecting because it was signed out."));
        } finally {
            if (LIZ) {
            }
        }
    }
}
