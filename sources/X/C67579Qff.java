package X;

/* renamed from: X.Qff, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67579Qff extends AbstractRunnableC67572QfY {
    public final /* synthetic */ ServiceConnectionC67578Qfe LJLILLLLZI;

    @Override // X.AbstractRunnableC67572QfY
    public final void LIZIZ() {
        C67574Qfa c67574Qfa = this.LJLILLLLZI.LJLIL;
        c67574Qfa.LIZIZ.LIZ("unlinkToDeath", new Object[0]);
        c67574Qfa.LJIIL.asBinder().unlinkToDeath(c67574Qfa.LJIIIZ, 0);
        C67574Qfa c67574Qfa2 = this.LJLILLLLZI.LJLIL;
        c67574Qfa2.LJIIL = null;
        c67574Qfa2.LJI = false;
    }

    public C67579Qff(ServiceConnectionC67578Qfe serviceConnectionC67578Qfe) {
        this.LJLILLLLZI = serviceConnectionC67578Qfe;
    }
}
