package X;

/* renamed from: X.Sy4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73816Sy4 implements InterfaceC73684Svw<Object> {
    public final /* synthetic */ InterfaceC73445Ss5 LJLIL;
    public final /* synthetic */ InterfaceC73692Sw4 LJLILLLLZI;

    @Override // X.InterfaceC73686Svy
    public final C73817Sy5 LIZ(AbstractC73672Svk abstractC73672Svk) {
        InterfaceC73692Sw4 interfaceC73692Sw4 = this.LJLILLLLZI;
        if (interfaceC73692Sw4 != null) {
            abstractC73672Svk = abstractC73672Svk.LJII(interfaceC73692Sw4);
        }
        return new C73817Sy5(this, abstractC73672Svk);
    }

    public final C31254COk LIZIZ(AbstractC73745Swv abstractC73745Swv) {
        InterfaceC73692Sw4 interfaceC73692Sw4 = this.LJLILLLLZI;
        if (interfaceC73692Sw4 != null) {
            abstractC73745Swv.getClass();
            InterfaceC73650SvO<T> LIZIZ = interfaceC73692Sw4.LIZIZ(abstractC73745Swv);
            if (LIZIZ instanceof AbstractC73745Swv) {
                abstractC73745Swv = (AbstractC73745Swv) LIZIZ;
            } else {
                C73320Sq4.LIZ(LIZIZ, "publisher is null");
                abstractC73745Swv = new C73795Sxj(LIZIZ);
            }
        }
        return new C31254COk(this, abstractC73745Swv);
    }

    @Override // X.BZB
    public final Object LIZJ(AbstractC73638SvC abstractC73638SvC) {
        InterfaceC73692Sw4 interfaceC73692Sw4 = this.LJLILLLLZI;
        if (interfaceC73692Sw4 != null) {
            abstractC73638SvC = abstractC73638SvC.LJFF(interfaceC73692Sw4);
        }
        return new C73819Sy7(this, abstractC73638SvC);
    }

    public C73816Sy4(C73541Std c73541Std, C62705OjF c62705OjF) {
        this.LJLIL = c73541Std;
        this.LJLILLLLZI = c62705OjF;
    }
}
