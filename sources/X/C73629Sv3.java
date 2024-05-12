package X;

/* renamed from: X.Sv3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73629Sv3<T, U> extends AbstractC73528StQ<T, T> {
    public final InterfaceC73650SvO<U> LJLILLLLZI;

    @Override // X.AbstractC73635Sv9
    public final void LJIJI(InterfaceC73509St7<? super T> interfaceC73509St7) {
        C73630Sv4 c73630Sv4 = new C73630Sv4(interfaceC73509St7);
        interfaceC73509St7.onSubscribe(c73630Sv4);
        this.LJLILLLLZI.subscribe(c73630Sv4.LJLILLLLZI);
        this.LJLIL.LIZ(c73630Sv4);
    }

    public C73629Sv3(C73608Sui c73608Sui, AbstractC73745Swv abstractC73745Swv) {
        super(c73608Sui);
        this.LJLILLLLZI = abstractC73745Swv;
    }
}
