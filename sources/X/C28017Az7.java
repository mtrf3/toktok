package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;

/* renamed from: X.Az7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28017Az7<T> implements InterfaceC64592gB {
    public static final C28017Az7<T> LJLIL = new C28017Az7<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        BillInfoData billInfoData;
        PaymentMethodsData paymentMethods;
        BillInfoResponse billInfoResponse = (BillInfoResponse) obj;
        if (billInfoResponse.isValid() && (billInfoData = (BillInfoData) billInfoResponse.data) != null && (paymentMethods = billInfoData.getPaymentMethods()) != null) {
            long currentTimeMillis = System.currentTimeMillis();
            C82950Wh0.LIZIZ(paymentMethods);
            C76542zS.LIZJ("rd_tiktokec_warm_webview", new C28018Az8("order_submit", System.currentTimeMillis() - currentTimeMillis));
        }
    }
}
