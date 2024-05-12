package X;

import Y.AfS0S4100000_4;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api.PaymentApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.UnbindPaymentMethodRequest;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final /* synthetic */ class B1F extends TBS implements InterfaceC88472Yns<PaymentMethod, C76800UCe> {
    public B1F(PaymentViewModel paymentViewModel) {
        super(1, paymentViewModel, PaymentViewModel.class, "removeBindMethod", "removeBindMethod(Lcom/ss/android/ugc/aweme/ecommerce/base/osp/payment/dto/PaymentMethod;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(PaymentMethod paymentMethod) {
        String str;
        Object obj;
        String str2;
        Object obj2;
        String str3;
        Object obj3;
        String str4;
        PaymentMethod paymentMethod2 = paymentMethod;
        PaymentViewModel paymentViewModel = (PaymentViewModel) this.receiver;
        paymentViewModel.getClass();
        C36746EbW.LIZ(3, "call remove bind method");
        if (paymentMethod2 != null && (str = paymentMethod2.token) != null) {
            paymentViewModel.setState(C28105B1h.LJLIL);
            HashMap<String, Object> hashMap = paymentViewModel.LJLZ;
            if (hashMap != null) {
                obj = hashMap.get("previous_page");
            } else {
                obj = null;
            }
            if (!(obj instanceof String) || (str2 = (String) obj) == null) {
                str2 = "";
            }
            String LJIIL = paymentMethod2.LJIIL();
            HashMap<String, Object> hashMap2 = paymentViewModel.LJLZ;
            if (hashMap2 != null) {
                obj2 = hashMap2.get("entrance_info");
            } else {
                obj2 = null;
            }
            if (obj2 instanceof String) {
                str3 = (String) obj2;
            } else {
                str3 = null;
            }
            HashMap<String, Object> hashMap3 = paymentViewModel.LJLZ;
            if (hashMap3 != null) {
                obj3 = hashMap3.get("source_page_type");
            } else {
                obj3 = null;
            }
            if (obj3 instanceof String) {
                str4 = (String) obj3;
            } else {
                str4 = null;
            }
            C74672wR c74672wR = PaymentApi.LIZ;
            UnbindPaymentMethodRequest unbindPaymentMethodRequest = new UnbindPaymentMethodRequest(str);
            c74672wR.getClass();
            ((PaymentApi) C74672wR.LIZIZ.create(PaymentApi.class)).unbindPaymentMethod(unbindPaymentMethodRequest).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS0S4100000_4(paymentViewModel, str2, LJIIL, str3, str4, 0), new AfS0S4100000_4(paymentViewModel, str2, LJIIL, str3, str4, 1));
        }
        return C76800UCe.LIZ;
    }
}
