package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.us.osp.payment.viewholder.cashier.USCashierPaymentMethodVH;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.us.osp.payment.viewholder.cashier.USCashierPaymentMethodVH$onBind$1$2$2$2", f = "USCashierPaymentMethodVH.kt", l = {145}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class B1X extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ USCashierPaymentMethodVH LJLILLLLZI;
    public final /* synthetic */ B1J LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B1X(USCashierPaymentMethodVH uSCashierPaymentMethodVH, B1J b1j, InterfaceC67352kd<? super B1X> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = uSCashierPaymentMethodVH;
        this.LJLJI = b1j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new B1X(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            PaymentViewModel viewModel = this.LJLILLLLZI.getViewModel();
            PaymentMethod paymentMethod = this.LJLJI.LIZ;
            this.LJLIL = 1;
            if (viewModel.Hv0(paymentMethod, this) == enumC58928NAu) {
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
