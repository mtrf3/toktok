package X;

/* renamed from: X.Sup, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73615Sup<T> extends AbstractC73430Srq<T, T> {
    public final InterfaceC48038ItG<? super Throwable, ? extends InterfaceC115714gR<? extends T>> LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        C73614Suo c73614Suo = new C73614Suo(interfaceC116954iR, this.LJLILLLLZI, this.LJLJI);
        interfaceC116954iR.onSubscribe(c73614Suo.LJLJJI);
        this.LJLIL.LIZ(c73614Suo);
    }

    public C73615Sup(InterfaceC115714gR<T> interfaceC115714gR, InterfaceC48038ItG<? super Throwable, ? extends InterfaceC115714gR<? extends T>> interfaceC48038ItG, boolean z) {
        super(interfaceC115714gR);
        this.LJLILLLLZI = interfaceC48038ItG;
        this.LJLJI = z;
    }
}
