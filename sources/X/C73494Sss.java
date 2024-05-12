package X;

import Y.IDhS105S0100000_12;

/* renamed from: X.Sss, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73494Sss<T, R> extends AbstractC73672Svk<R> {
    public final InterfaceC73471SsV<T> LJLIL;
    public final InterfaceC48038ItG<? super T, ? extends InterfaceC115714gR<? extends R>> LJLILLLLZI;

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super R> interfaceC116954iR) {
        C73493Ssr c73493Ssr = new C73493Ssr(interfaceC116954iR, this.LJLILLLLZI);
        interfaceC116954iR.onSubscribe(c73493Ssr);
        this.LJLIL.LIZ(c73493Ssr);
    }

    public C73494Sss(C73634Sv8 c73634Sv8, IDhS105S0100000_12 iDhS105S0100000_12) {
        this.LJLIL = c73634Sv8;
        this.LJLILLLLZI = iDhS105S0100000_12;
    }
}
