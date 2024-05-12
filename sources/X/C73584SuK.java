package X;

/* renamed from: X.SuK, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73584SuK<T, U> extends AbstractC73528StQ<T, T> {
    public final InterfaceC73504St2<U> LJLILLLLZI;
    public final InterfaceC73504St2<? extends T> LJLJI;

    @Override // X.AbstractC73635Sv9
    public final void LJIJI(InterfaceC73509St7<? super T> interfaceC73509St7) {
        C73585SuL c73585SuL = new C73585SuL(interfaceC73509St7, this.LJLJI);
        interfaceC73509St7.onSubscribe(c73585SuL);
        this.LJLILLLLZI.LIZ(c73585SuL.LJLILLLLZI);
        this.LJLIL.LIZ(c73585SuL);
    }

    public C73584SuK(InterfaceC73504St2 interfaceC73504St2, C73520StI c73520StI, C236869Ri c236869Ri) {
        super(interfaceC73504St2);
        this.LJLILLLLZI = c73520StI;
        this.LJLJI = c236869Ri;
    }
}
