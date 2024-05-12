package X;

/* renamed from: X.Stc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73540Stc<T> extends AbstractC73547Stj {
    public final InterfaceC73504St2<T> LJLIL;
    public final InterfaceC48038ItG<? super T, ? extends InterfaceC73445Ss5> LJLILLLLZI;

    @Override // X.AbstractC73547Stj
    public final void LJIIL(InterfaceC73442Ss2 interfaceC73442Ss2) {
        C73539Stb c73539Stb = new C73539Stb(interfaceC73442Ss2, this.LJLILLLLZI);
        interfaceC73442Ss2.onSubscribe(c73539Stb);
        this.LJLIL.LIZ(c73539Stb);
    }

    public C73540Stc(InterfaceC73504St2<T> interfaceC73504St2, InterfaceC48038ItG<? super T, ? extends InterfaceC73445Ss5> interfaceC48038ItG) {
        this.LJLIL = interfaceC73504St2;
        this.LJLILLLLZI = interfaceC48038ItG;
    }
}
