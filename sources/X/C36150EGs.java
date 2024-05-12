package X;

import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.PaymentData;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api.PayAuthHelper$initMerchantUserId$1", f = "PayAuthHelper.kt", l = {SubscriptionExpireRemindHourSetting.DEFAULT, 73}, m = "invokeSuspend")
/* renamed from: X.EGs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36150EGs extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36150EGs(String str, InterfaceC67352kd<? super C36150EGs> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36150EGs(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            String str = this.LJLILLLLZI;
            this.LJLIL = 1;
            obj = EO3.LIZ(str, true, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        PaymentData paymentData = (PaymentData) obj;
        if (paymentData != null) {
            AbstractC78621UtN abstractC78621UtN = C36636EZk.LIZ;
            EO2 eo2 = new EO2(paymentData, null);
            this.LJLIL = 2;
            if (XKX.LJI(abstractC78621UtN, eo2, this) == enumC58928NAu) {
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
