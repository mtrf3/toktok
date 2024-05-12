package X;

/* renamed from: X.SsE, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73454SsE<T> extends AbstractC73430Srq<T, T> {
    public final AbstractC73946T0k LJLILLLLZI;
    public final boolean LJLJI;
    public final int LJLJJI;

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super T> interfaceC116954iR) {
        AbstractC73946T0k abstractC73946T0k = this.LJLILLLLZI;
        if (abstractC73946T0k instanceof T1G) {
            this.LJLIL.LIZ(interfaceC116954iR);
        } else {
            this.LJLIL.LIZ(new RunnableC73569Su5(interfaceC116954iR, abstractC73946T0k.LIZ(), this.LJLJI, this.LJLJJI));
        }
    }

    public C73454SsE(InterfaceC115714gR interfaceC115714gR, AbstractC73946T0k abstractC73946T0k, int i) {
        super(interfaceC115714gR);
        this.LJLILLLLZI = abstractC73946T0k;
        this.LJLJI = false;
        this.LJLJJI = i;
    }
}
