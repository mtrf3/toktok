package X;

import Y.AfS53S0100000_1;
import Y.AfS56S0100000_4;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api.PaymentApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentListRequest;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PayHelper$schedulePaymentProcess$job$2$1$1", f = "PayHelper.kt", l = {142}, m = "invokeSuspend")
/* renamed from: X.2n8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68902n8 extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super C27993Ayj>, Object> {
    public int LJLIL;
    public final /* synthetic */ C28064Azs LJLILLLLZI;
    public final /* synthetic */ PaymentListRequest LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68902n8(C28064Azs c28064Azs, PaymentListRequest paymentListRequest, InterfaceC67352kd<? super C68902n8> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = c28064Azs;
        this.LJLJI = paymentListRequest;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C68902n8(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super C27993Ayj> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
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
            C36746EbW.LIZ(3, "call refresh in payHelper");
            C28064Azs c28064Azs = this.LJLILLLLZI;
            PaymentListRequest paymentListRequest = this.LJLJI;
            this.LJLIL = 1;
            c28064Azs.getClass();
            C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            PaymentApi.LIZ.getClass();
            o.LJIIIZ(paymentListRequest, "paymentListRequest");
            ((PaymentApi) C74672wR.LIZIZ.create(PaymentApi.class)).getPaymentList(paymentListRequest).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0100000_4(c84654XKg, 3), new AfS53S0100000_1(c84654XKg, 9));
            obj = c84654XKg.LIZ();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }
}
