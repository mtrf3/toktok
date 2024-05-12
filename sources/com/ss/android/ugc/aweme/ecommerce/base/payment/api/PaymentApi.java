package com.ss.android.ugc.aweme.ecommerce.base.payment.api;

import X.AbstractC73672Svk;
import X.E4Q;
import X.E4T;
import X.EO4;
import X.InterfaceC27211Am7;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.PaymentData;
import java.util.Map;

/* loaded from: classes7.dex */
public interface PaymentApi {
    public static final EO4 LIZ = EO4.LIZ;

    @E4Q("/api/v1/pay/auth/get")
    AbstractC73672Svk<Response<PaymentData>> getPaymentAuth(@InterfaceC64989Pez("need_token") Boolean bool, @InterfaceC64989Pez("source_page_name") String str);

    @E4T("/api/v1/trade/order/pay")
    AbstractC73672Svk<Response<PaymentData>> getPaymentInfo(@InterfaceC27211Am7 Map<String, Object> map);
}
