package X;

/* renamed from: X.St3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73505St3<T> extends AbstractC73635Sv9<T> implements L7V<T> {
    public final InterfaceC115714gR<T> LJLIL;
    public final long LJLILLLLZI = 0;

    @Override // X.L7V
    public final AbstractC73672Svk<T> LIZIZ() {
        return new C73486Ssk(this.LJLIL, this.LJLILLLLZI, null, false);
    }

    public C73505St3(C73603Sud c73603Sud) {
        this.LJLIL = c73603Sud;
    }

    @Override // X.AbstractC73635Sv9
    public final void LJIJI(InterfaceC73509St7<? super T> interfaceC73509St7) {
        this.LJLIL.LIZ(new C73507St5(interfaceC73509St7, this.LJLILLLLZI));
    }
}
