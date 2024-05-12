package X;

/* renamed from: X.Qfc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67576Qfc extends AbstractRunnableC67572QfY {
    public final /* synthetic */ C67574Qfa LJLILLLLZI;

    @Override // X.AbstractRunnableC67572QfY
    public final void LIZIZ() {
        C67574Qfa c67574Qfa = this.LJLILLLLZI;
        if (c67574Qfa.LJIIL != null) {
            c67574Qfa.LIZIZ.LIZ("Unbind from service.", new Object[0]);
            C67574Qfa c67574Qfa2 = this.LJLILLLLZI;
            c67574Qfa2.LIZ.unbindService(c67574Qfa2.LJIIJJI);
            C67574Qfa c67574Qfa3 = this.LJLILLLLZI;
            c67574Qfa3.LJI = false;
            c67574Qfa3.LJIIL = null;
            c67574Qfa3.LJIIJJI = null;
        }
        this.LJLILLLLZI.LIZIZ();
    }

    public C67576Qfc(C67574Qfa c67574Qfa) {
        this.LJLILLLLZI = c67574Qfa;
    }
}
