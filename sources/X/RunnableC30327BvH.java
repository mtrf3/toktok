package X;

/* renamed from: X.BvH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC30327BvH implements Runnable {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ Object LJLJJI;

    public RunnableC30327BvH(int i, long j, Object obj, InterfaceC65784Pro interfaceC65784Pro) {
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = j;
        this.LJLJI = i;
        this.LJLJJI = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C30326BvG.LJ(this.LJLJI - 1, this.LJLILLLLZI, this.LJLJJI, this.LJLIL);
        } finally {
            if (LIZ) {
            }
        }
    }
}
