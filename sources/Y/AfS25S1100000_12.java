package Y;

import X.InterfaceC64592gB;
import com.google.gson.m;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.PaymentData;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomPaymentInterceptor;
import java.util.Map;

/* loaded from: classes13.dex */
public class AfS25S1100000_12 implements InterfaceC64592gB {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS25S1100000_12 afS25S1100000_12, Object obj) {
        PaymentData paymentData = (PaymentData) ((Response) obj).data;
        EcomPaymentInterceptor ecomPaymentInterceptor = (EcomPaymentInterceptor) afS25S1100000_12.l1;
        ecomPaymentInterceptor.LJLIL = 2;
        m mVar = null;
        if (ecomPaymentInterceptor.LJLILLLLZI) {
            if (paymentData != null) {
                mVar = paymentData.cashier;
            }
            ecomPaymentInterceptor.LIZJ(mVar);
        } else {
            Map<String, m> LIZ = ecomPaymentInterceptor.LIZ();
            String str = afS25S1100000_12.s0;
            if (paymentData != null) {
                mVar = paymentData.cashier;
            }
            LIZ.put(str, mVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$1(AfS25S1100000_12 afS25S1100000_12, Object obj) {
        PaymentData paymentData = (PaymentData) ((Response) obj).data;
        EcomPaymentInterceptor ecomPaymentInterceptor = (EcomPaymentInterceptor) afS25S1100000_12.l1;
        ecomPaymentInterceptor.LJLIL = 2;
        m mVar = null;
        if (ecomPaymentInterceptor.LJLILLLLZI) {
            if (paymentData != null) {
                mVar = paymentData.cashier;
            }
            ecomPaymentInterceptor.LIZJ(mVar);
        } else {
            Map<String, m> LIZ = ecomPaymentInterceptor.LIZ();
            String str = afS25S1100000_12.s0;
            if (paymentData != null) {
                mVar = paymentData.cashier;
            }
            LIZ.put(str, mVar);
        }
    }

    public AfS25S1100000_12(EcomPaymentInterceptor ecomPaymentInterceptor, String str, int i) {
        this.$t = i;
        this.l1 = ecomPaymentInterceptor;
        this.s0 = str;
    }
}
