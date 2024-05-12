package X;

import com.bytedance.android.livesdk.model.message.GoodyBagMessage;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.impl.revenue.goodybag.presenter.GoodyBagPresenter$preOpenWinnerPage$2", f = "GoodyBagPresenter.kt", l = {777}, m = "invokeSuspend")
/* renamed from: X.BQh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28755BQh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ BR1 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28755BQh(BR1 br1, InterfaceC67352kd<? super C28755BQh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = br1;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C28755BQh(this.LJLILLLLZI, interfaceC67352kd);
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
            this.LJLIL = 1;
            if (C1JD.LIZJ(2500L, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        BR1 br1 = this.LJLILLLLZI;
        GoodyBagMessage goodyBagMessage = br1.LJIIIZ;
        if (goodyBagMessage != null && goodyBagMessage.winners != null) {
            C0NB.LIZIZ("GoodyBagPresenter", "wait 2s, openMsgIsNotNull Audience Open");
            this.LJLILLLLZI.LJII(null);
            return C76800UCe.LIZ;
        }
        br1.LJIIIZ();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
