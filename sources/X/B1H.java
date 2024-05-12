package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel", f = "PaymentViewModel.kt", l = {507}, m = "editBillingAddress$ecommerce_transaction_release")
/* loaded from: classes5.dex */
public final class B1H extends C3CS {
    public PaymentViewModel LJLIL;
    public PaymentMethod LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ PaymentViewModel LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B1H(PaymentViewModel paymentViewModel, InterfaceC67352kd<? super B1H> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = paymentViewModel;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.Hv0(null, this);
    }
}
