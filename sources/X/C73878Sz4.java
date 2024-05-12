package X;

/* renamed from: X.Sz4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73878Sz4<T, U, R> extends AbstractC73430Srq<T, R> {
    public final RTU<? super T, ? super U, ? extends R> LJLILLLLZI;
    public final InterfaceC115714gR<? extends U> LJLJI;

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super R> interfaceC116954iR) {
        C73844SyW c73844SyW = new C73844SyW(interfaceC116954iR);
        C73879Sz5 c73879Sz5 = new C73879Sz5(c73844SyW, this.LJLILLLLZI);
        c73844SyW.onSubscribe(c73879Sz5);
        this.LJLJI.LIZ(new C73883Sz9(c73879Sz5));
        this.LJLIL.LIZ(c73879Sz5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C73878Sz4(AbstractC73672Svk abstractC73672Svk, C73426Srm c73426Srm) {
        super(abstractC73672Svk);
        C73974T1m c73974T1m = C73974T1m.LJLIL;
        this.LJLILLLLZI = c73974T1m;
        this.LJLJI = c73426Srm;
    }
}
