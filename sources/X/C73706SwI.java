package X;

/* renamed from: X.SwI, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73706SwI<T, U> extends AbstractC73430Srq<T, U> {
    public final InterfaceC48038ItG<? super T, ? extends InterfaceC115714gR<? extends U>> LJLILLLLZI;
    public final int LJLJI;
    public final EnumC73710SwM LJLJJI;

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super U> interfaceC116954iR) {
        boolean z;
        if (C73567Su3.LIZ(this.LJLIL, interfaceC116954iR, this.LJLILLLLZI)) {
            return;
        }
        if (this.LJLJJI == EnumC73710SwM.IMMEDIATE) {
            this.LJLIL.LIZ(new C73711SwN(new C73844SyW(interfaceC116954iR), this.LJLILLLLZI, this.LJLJI));
            return;
        }
        InterfaceC115714gR<T> interfaceC115714gR = this.LJLIL;
        InterfaceC48038ItG<? super T, ? extends InterfaceC115714gR<? extends U>> interfaceC48038ItG = this.LJLILLLLZI;
        int i = this.LJLJI;
        if (this.LJLJJI == EnumC73710SwM.END) {
            z = true;
        } else {
            z = false;
        }
        interfaceC115714gR.LIZ(new C73576SuC(interfaceC116954iR, interfaceC48038ItG, i, z));
    }

    public C73706SwI(AbstractC73672Svk abstractC73672Svk, InterfaceC48038ItG interfaceC48038ItG, int i, EnumC73710SwM enumC73710SwM) {
        super(abstractC73672Svk);
        this.LJLILLLLZI = interfaceC48038ItG;
        this.LJLJJI = enumC73710SwM;
        this.LJLJI = Math.max(8, i);
    }
}
