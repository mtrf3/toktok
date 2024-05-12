package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;

/* renamed from: X.Az6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28016Az6<T> implements InterfaceC64592gB {
    public static final C28016Az6<T> LJLIL = new C28016Az6<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        PaymentMethodsData paymentMethods;
        BillInfoData billInfoData = (BillInfoData) ((Response) obj).data;
        if (billInfoData != null && (paymentMethods = billInfoData.getPaymentMethods()) != null) {
            C82950Wh0.LIZIZ(paymentMethods);
        }
    }
}
