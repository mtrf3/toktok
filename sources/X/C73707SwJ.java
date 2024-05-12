package X;

/* renamed from: X.SwJ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73707SwJ<T, U> extends AbstractC73430Srq<T, U> {
    public final InterfaceC48038ItG<? super T, ? extends InterfaceC115714gR<? extends U>> LJLILLLLZI;
    public final boolean LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super U> interfaceC116954iR) {
        if (C73567Su3.LIZ(this.LJLIL, interfaceC116954iR, this.LJLILLLLZI)) {
            return;
        }
        this.LJLIL.LIZ(new C73770SxK(this.LJLJJI, this.LJLJJL, interfaceC116954iR, this.LJLILLLLZI, this.LJLJI));
    }

    public C73707SwJ(InterfaceC115714gR<T> interfaceC115714gR, InterfaceC48038ItG<? super T, ? extends InterfaceC115714gR<? extends U>> interfaceC48038ItG, boolean z, int i, int i2) {
        super(interfaceC115714gR);
        this.LJLILLLLZI = interfaceC48038ItG;
        this.LJLJI = z;
        this.LJLJJI = i;
        this.LJLJJL = i2;
    }
}
