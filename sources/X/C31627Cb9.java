package X;

import com.bytedance.android.live.iap.model.response.iap.AbsIapPricing;
import com.bytedance.android.live.iap.model.response.iap.IapProductDetail;
import com.bytedance.android.live.iap.model.response.iap.IapSubscriptionProduct;
import com.bytedance.android.livesdk.livesetting.wallet.LiveIapAdsFreeExperiment;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionPage;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.Cb9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31627Cb9 implements InterfaceC18450nx {
    public final /* synthetic */ SubscriptionPage LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // X.InterfaceC18450nx
    public final void LIZ(C1Z5 c1z5) {
        IapSubscriptionProduct iapSubscriptionProduct;
        long j;
        java.util.Map<String, IapProductDetail> map = c1z5.LIZLLL;
        if (map != null) {
            SubscriptionPage subscriptionPage = this.LIZ;
            String str = this.LIZIZ;
            IapProductDetail iapProductDetail = map.get(str);
            subscriptionPage.getClass();
            if (iapProductDetail == null) {
                return;
            }
            if (LiveIapAdsFreeExperiment.INSTANCE.getIapBillingVersion() && SubscriptionPage.LLIIIJ.contains(iapProductDetail.productId)) {
                List<IapSubscriptionProduct> list = iapProductDetail.subscriptionOffer;
                if (list == null || (iapSubscriptionProduct = (IapSubscriptionProduct) ORZ.LJLLLLLL(0, list)) == null) {
                    return;
                }
                if (!iapSubscriptionProduct.pricingPhases.isEmpty()) {
                    j = ((AbsIapPricing) ListProtector.get(iapSubscriptionProduct.pricingPhases, 0)).priceAmountMicros;
                } else {
                    j = 0;
                }
                if (((int) j) != 0) {
                    return;
                }
            }
            subscriptionPage.LLII.setValue(map.get(str));
        }
    }

    @Override // X.InterfaceC18450nx
    public final void LIZIZ(C21240sS c21240sS) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("error_message", c21240sS.LIZJ);
        FMX.LJIIL("show_payment_error_prompt", c188727au.LIZ);
    }

    public C31627Cb9(SubscriptionPage subscriptionPage, String str) {
        this.LIZ = subscriptionPage;
        this.LIZIZ = str;
    }
}
