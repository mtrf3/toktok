package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.impl.revenue.goodybag.presenter.GoodyBagPresenter$requestWinnerList$1$1$1", f = "GoodyBagPresenter.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.BQf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28753BQf extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ BR1 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28753BQf(BR1 br1, InterfaceC67352kd<? super C28753BQf> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = br1;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C28753BQf(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        BR1 br1 = this.LJLIL;
        br1.LJIIJJI++;
        br1.LJIILIIL();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
