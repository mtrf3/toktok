package X;

/* renamed from: X.Qfn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67587Qfn extends AbstractRunnableC40619Fwt {
    public final /* synthetic */ C67585Qfl LJLILLLLZI;

    public C67587Qfn(C67585Qfl c67585Qfl) {
        this.LJLILLLLZI = c67585Qfl;
    }

    @Override // X.AbstractRunnableC40619Fwt
    public final void LIZ() {
        C67585Qfl c67585Qfl = this.LJLILLLLZI;
        if (c67585Qfl.LJIIJ != 0) {
            c67585Qfl.LIZIZ.LIZJ("Unbind from service.", 4, new Object[0]);
            C67585Qfl c67585Qfl2 = this.LJLILLLLZI;
            c67585Qfl2.LIZ.unbindService(c67585Qfl2.LJIIIZ);
            C67585Qfl c67585Qfl3 = this.LJLILLLLZI;
            c67585Qfl3.LJ = false;
            c67585Qfl3.LJIIJ = null;
            c67585Qfl3.LJIIIZ = null;
        }
    }
}
