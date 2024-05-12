package X;

/* loaded from: classes15.dex */
public final class WQS extends TMY<WQO> implements TPN {
    public final TPN LIZJ;
    public final TPN LIZLLL;

    @Override // X.TMY
    public final AbstractC73672Svk<WQO> LJIIIIZZ() {
        AbstractC73672Svk request = this.LIZLLL.request();
        O8W o8w = O8W.LJLIL;
        request.getClass();
        C73615Sup c73615Sup = new C73615Sup(request, o8w, false);
        AbstractC73672Svk request2 = this.LIZJ.request();
        WQN wqn = WQN.LJLIL;
        request2.getClass();
        return c73615Sup.LJJLI(new C73615Sup(request2, wqn, false));
    }

    public WQS(C82256WQa c82256WQa, WQU wqu) {
        this.LIZJ = c82256WQa;
        this.LIZLLL = wqu;
    }
}
