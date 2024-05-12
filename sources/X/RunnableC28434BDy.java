package X;

/* renamed from: X.BDy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC28434BDy implements Runnable {
    public final /* synthetic */ C28433BDx LJLIL;
    public final /* synthetic */ C41071jL LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI = true;
    public final /* synthetic */ int LJLJJI = 2;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;

    public RunnableC28434BDy(C28433BDx c28433BDx, C41071jL c41071jL, InterfaceC65784Pro interfaceC65784Pro) {
        this.LJLIL = c28433BDx;
        this.LJLILLLLZI = c41071jL;
        this.LJLJJL = interfaceC65784Pro;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLIL.LIZLLL(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL);
        } finally {
            if (LIZ) {
            }
        }
    }
}
