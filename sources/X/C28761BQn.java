package X;

import fjb.a;
import webcast.api.goody_bag.GetGoodyBagLotteryResponse;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.impl.revenue.goodybag.presenter.GoodyBagPresenter$audienceOpenWinnerPage$2$1", f = "GoodyBagPresenter.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.BQn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28761BQn extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ BR1 LJLIL;
    public final /* synthetic */ GetGoodyBagLotteryResponse.ResponseData LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28761BQn(BR1 br1, GetGoodyBagLotteryResponse.ResponseData responseData, InterfaceC67352kd<? super C28761BQn> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = br1;
        this.LJLILLLLZI = responseData;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C28761BQn(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC28772BQy interfaceC28772BQy = this.LJLIL.LIZIZ;
        if (interfaceC28772BQy != null) {
            interfaceC28772BQy.LJLI(this.LJLILLLLZI);
        }
        this.LJLIL.LJIIL();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
