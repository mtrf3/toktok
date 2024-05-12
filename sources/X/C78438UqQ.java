package X;

import com.android.billingclient.api.SkuDetails;
import com.bytedance.globalpayment.iap.model.AbsIapOneTimePurchaseOffer;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.AbsIapSubscriptionOffer;
import com.bytedance.globalpayment.iap.model.IapChannelUserData;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.UqQ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78438UqQ extends AbsIapProduct {
    public final String LIZ;
    public final JSONObject LIZIZ;

    public C78438UqQ(SkuDetails skuDetails) {
        String str = skuDetails.LIZ;
        this.LIZ = "";
        this.LIZ = str;
        try {
            this.LIZIZ = new JSONObject(str);
        } catch (JSONException unused) {
            C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("mOriginalJson parse json error:");
            LIZ.append(this.LIZ);
            X1D.LIZIZ(LIZ);
            LJ.getClass();
        }
        this.mProductId = this.LIZIZ.optString("productId");
        this.mProductType = this.LIZIZ.optString("type");
        this.mTitle = this.LIZIZ.optString("title");
        String optString = this.LIZIZ.optString("price");
        Long valueOf = Long.valueOf(this.LIZIZ.optLong("price_amount_micros"));
        String optString2 = this.LIZIZ.optString("price_currency_code");
        String optString3 = this.LIZIZ.optString("subscriptionPeriod");
        if (Objects.equals(this.mProductType, "inapp")) {
            this.mOneTimePurchaseOffer = new AbsIapOneTimePurchaseOffer(optString, valueOf.longValue(), optString2);
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new AbsIapSubscriptionOffer.AbsIapSubscriptionPricing(optString, valueOf.longValue(), optString2, optString3, 0, 1));
            arrayList.add(new AbsIapSubscriptionOffer("", "", "", arrayList2, null));
            this.mSubscriptionOffer = arrayList;
        }
        this.mDescription = this.LIZIZ.optString("description");
        this.mChannelUserData = new IapChannelUserData(IapPaymentMethod.GOOGLE, "", "");
    }
}
