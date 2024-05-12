package X;

import com.bytedance.android.live.iap.model.response.iap.AbsIapPricing;
import com.bytedance.android.live.iap.model.response.iap.IapProductDetail;
import com.bytedance.android.live.iap.model.response.iap.IapSubscriptionProduct;
import com.bytedance.globalpayment.iap.model.AbsIapOneTimePurchaseOffer;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.AbsIapSubscriptionOffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0zA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25400zA {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [X.1a9] */
    public static IapProductDetail LIZ(AbsIapProduct iapProduct) {
        ArrayList arrayList;
        C35371a9 c35371a9;
        o.LJIIIZ(iapProduct, "iapProduct");
        IapProductDetail iapProductDetail = new IapProductDetail();
        String productId = iapProduct.getProductId();
        o.LJIIIIZZ(productId, "iapProduct.productId");
        iapProductDetail.productId = productId;
        String productType = iapProduct.getProductType();
        o.LJIIIIZZ(productType, "iapProduct.productType");
        iapProductDetail.productType = productType;
        String title = iapProduct.getTitle();
        o.LJIIIIZZ(title, "iapProduct.title");
        iapProductDetail.title = title;
        String description = iapProduct.getDescription();
        o.LJIIIIZZ(description, "iapProduct.description");
        iapProductDetail.description = description;
        List<AbsIapSubscriptionOffer> subscriptionOffers = iapProduct.getSubscriptionOffers();
        if (subscriptionOffers == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(C32I.LJJL(subscriptionOffers, 10));
            for (AbsIapSubscriptionOffer absIapSubscriptionOffer : subscriptionOffers) {
                String offerToken = absIapSubscriptionOffer.getOfferToken();
                String basePlanId = absIapSubscriptionOffer.getBasePlanId();
                String offerId = absIapSubscriptionOffer.getOfferId();
                List<AbsIapSubscriptionOffer.AbsIapSubscriptionPricing> pricingPhases = absIapSubscriptionOffer.getPricingPhases();
                o.LJIIIIZZ(pricingPhases, "subscriptionOffer.pricingPhases");
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(pricingPhases, 10));
                for (AbsIapSubscriptionOffer.AbsIapSubscriptionPricing it : pricingPhases) {
                    o.LJIIIIZZ(it, "it");
                    String price = it.getPrice();
                    long priceAmountMicros = it.getPriceAmountMicros();
                    String priceCurrencyCode = it.getPriceCurrencyCode();
                    String billingPeriod = it.getBillingPeriod();
                    o.LJIIIIZZ(billingPeriod, "offerPrice.billingPeriod");
                    arrayList2.add(new IapSubscriptionProduct.IapSubscriptionOfferPricing(price, priceAmountMicros, priceCurrencyCode, billingPeriod, it.getBillingCycleCount(), it.getRecurrenceMode()));
                }
                arrayList.add(new IapSubscriptionProduct(offerToken, basePlanId, offerId, arrayList2, absIapSubscriptionOffer.getOfferTags()));
            }
        }
        iapProductDetail.subscriptionOffer = arrayList;
        AbsIapOneTimePurchaseOffer oneTimeProduct = iapProduct.getOneTimeProduct();
        if (oneTimeProduct != null) {
            final String price2 = oneTimeProduct.getPrice();
            o.LJIIIIZZ(price2, "oneTimeProduct.price");
            final long priceAmountMicros2 = oneTimeProduct.getPriceAmountMicros();
            final String priceCurrencyCode2 = oneTimeProduct.getPriceCurrencyCode();
            o.LJIIIIZZ(priceCurrencyCode2, "oneTimeProduct.priceCurrencyCode");
            c35371a9 = new AbsIapPricing(price2, priceAmountMicros2, priceCurrencyCode2) { // from class: X.1a9
            };
        } else {
            c35371a9 = null;
        }
        iapProductDetail.oneTimePurchaseProduct = c35371a9;
        return iapProductDetail;
    }
}
