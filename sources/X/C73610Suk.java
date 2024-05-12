package X;

/* renamed from: X.Suk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73610Suk extends AbstractC73547Stj {
    public final InterfaceC73445Ss5 LJLIL;
    public final AbstractC73946T0k LJLILLLLZI;

    @Override // X.AbstractC73547Stj
    public final void LJIIL(InterfaceC73442Ss2 interfaceC73442Ss2) {
        RunnableC73611Sul runnableC73611Sul = new RunnableC73611Sul(interfaceC73442Ss2, this.LJLIL);
        interfaceC73442Ss2.onSubscribe(runnableC73611Sul);
        runnableC73611Sul.LJLILLLLZI.replace(this.LJLILLLLZI.LIZIZ(runnableC73611Sul));
    }

    public C73610Suk(InterfaceC73445Ss5 interfaceC73445Ss5, AbstractC73946T0k abstractC73946T0k) {
        this.LJLIL = interfaceC73445Ss5;
        this.LJLILLLLZI = abstractC73946T0k;
    }
}
