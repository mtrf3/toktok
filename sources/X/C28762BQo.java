package X;

import fjb.a;
import webcast.api.goody_bag.GetGoodyBagLotteryResponse;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.impl.revenue.goodybag.presenter.GoodyBagPresenter$audienceOpenWinnerPage$2", f = "GoodyBagPresenter.kt", l = {836}, m = "invokeSuspend")
/* renamed from: X.BQo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28762BQo extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ BR1 LJLILLLLZI;
    public final /* synthetic */ GetGoodyBagLotteryResponse.ResponseData LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28762BQo(BR1 br1, GetGoodyBagLotteryResponse.ResponseData responseData, InterfaceC67352kd<? super C28762BQo> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = br1;
        this.LJLJI = responseData;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C28762BQo(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
            C28761BQn c28761BQn = new C28761BQn(this.LJLILLLLZI, this.LJLJI, null);
            this.LJLIL = 1;
            if (XKX.LJI(abstractC78621UtN, c28761BQn, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
