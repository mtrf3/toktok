package X;

/* renamed from: X.Qfo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67588Qfo extends AbstractRunnableC40619Fwt {
    public final /* synthetic */ ServiceConnectionC67589Qfp LJLILLLLZI;

    public C67588Qfo(ServiceConnectionC67589Qfp serviceConnectionC67589Qfp) {
        this.LJLILLLLZI = serviceConnectionC67589Qfp;
    }

    @Override // X.AbstractRunnableC40619Fwt
    public final void LIZ() {
        C67585Qfl c67585Qfl = this.LJLILLLLZI.LJLIL;
        c67585Qfl.LIZIZ.LIZJ("unlinkToDeath", 4, new Object[0]);
        c67585Qfl.LJIIJ.asBinder().unlinkToDeath(c67585Qfl.LJIIIIZZ, 0);
        C67585Qfl c67585Qfl2 = this.LJLILLLLZI.LJLIL;
        c67585Qfl2.LJIIJ = null;
        c67585Qfl2.LJ = false;
    }
}
