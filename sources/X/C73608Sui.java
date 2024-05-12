package X;

/* renamed from: X.Sui, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73608Sui<T> extends AbstractC73528StQ<T, T> {
    public final AbstractC73946T0k LJLILLLLZI;

    @Override // X.AbstractC73635Sv9
    public final void LJIJI(InterfaceC73509St7<? super T> interfaceC73509St7) {
        C73609Suj c73609Suj = new C73609Suj(interfaceC73509St7);
        interfaceC73509St7.onSubscribe(c73609Suj);
        c73609Suj.LJLIL.replace(this.LJLILLLLZI.LIZIZ(new RunnableC73607Suh(c73609Suj, this.LJLIL)));
    }

    public C73608Sui(InterfaceC73504St2<T> interfaceC73504St2, AbstractC73946T0k abstractC73946T0k) {
        super(interfaceC73504St2);
        this.LJLILLLLZI = abstractC73946T0k;
    }
}
