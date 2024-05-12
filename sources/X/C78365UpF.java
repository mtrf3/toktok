package X;

import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.UpF, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78365UpF extends AbsIapChannelOrderData {
    public final JSONObject LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final String getChannelUserId() {
        return "";
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final String getChannelToken() {
        JSONObject jSONObject = this.LIZ;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final String getDeveloperPayload() {
        return this.LIZ.optString("developerPayload");
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final int getOrderState() {
        if (this.LIZ.optInt("purchaseState", 1) != 4) {
            return 1;
        }
        return 2;
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final boolean isOrderStateSuccess() {
        if (getOrderState() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final String getHost() {
        return this.LIZJ;
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final String getOriginalJson() {
        return this.mOriginalJson;
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final IapPaymentMethod getPaymentMethod() {
        return IapPaymentMethod.GOOGLE;
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final String getSelfToken() {
        return this.mOriginalJson;
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final String getSignature() {
        return this.mSignature;
    }

    @Override // com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData
    public final boolean isOrderFromOtherSystem() {
        return this.LIZIZ;
    }

    public final String toString() {
        return this.mOriginalJson;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C78365UpF)) {
            return false;
        }
        AbsIapChannelOrderData absIapChannelOrderData = (AbsIapChannelOrderData) obj;
        if (TextUtils.equals(this.mOriginalJson, absIapChannelOrderData.mOriginalJson) && TextUtils.equals(this.mSignature, absIapChannelOrderData.mSignature)) {
            return true;
        }
        return false;
    }

    public C78365UpF(Purchase purchase, boolean z) {
        String str;
        String str2;
        String str3 = purchase.LIZ;
        this.mSignature = purchase.LIZIZ;
        try {
            this.mExtraPayload = "";
            JSONObject jSONObject = new JSONObject(str3);
            this.LIZ = jSONObject;
            String optString = jSONObject.optString("obfuscatedAccountId");
            if (optString.startsWith("newstr")) {
                String[] LJI = C78939UyV.LJI(optString.replace("newstr", ""));
                if (LJI.length == 3) {
                    this.mSelfOrderId = LJI[0];
                    this.LIZJ = LJI[1];
                    this.mIsNewSubscription = TextUtils.equals(LJI[2], "1");
                } else if (LJI.length == 2) {
                    this.mSelfOrderId = LJI[0];
                    this.LIZJ = LJI[1];
                }
            } else {
                this.mSelfOrderId = optString;
            }
            String optString2 = jSONObject.optString("obfuscatedProfileId");
            String[] split = optString2.split("\n");
            if (split.length == 3) {
                str = split[0];
                str2 = split[1];
                this.mExtraPayload = split[2];
            } else if (split.length == 2) {
                str = split[0];
                str2 = split[1];
            } else {
                JSONObject LIZ = LIZ(jSONObject.optString("obfuscatedAccountId"), optString2);
                if (LIZ != null) {
                    str = LIZ.optString("merchant_id");
                    str2 = LIZ.optString("uid");
                    String optString3 = LIZ.optString("trade_no");
                    if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(optString3)) {
                        str = "";
                        str2 = "";
                    } else {
                        this.mSelfOrderId = optString3;
                        this.LIZIZ = true;
                    }
                } else {
                    str = split[0];
                    str2 = "";
                }
            }
            jSONObject.remove("obfuscatedProfileId");
            jSONObject.remove("obfuscatedAccountId");
            if (!TextUtils.isEmpty(this.mSelfOrderId) || !TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("orderId", this.mSelfOrderId);
                jSONObject2.put("merchantId", str);
                jSONObject2.put("userId", str2);
                jSONObject.put("developerPayload", jSONObject2.toString());
            } else {
                jSONObject.put("developerPayload", "");
            }
            this.mOriginalJson = jSONObject.toString();
            this.mChannelOrderId = jSONObject.optString("orderId");
            this.mProductId = jSONObject.optString("productId");
            this.mQuantity = jSONObject.optInt("quantity");
            this.mIsAckEd = jSONObject.optBoolean("acknowledged", true);
            C78273Unl.LJIIIZ().LJ().getClass();
        } catch (JSONException unused) {
            C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("mOriginalJson parse json error:");
            LIZ2.append(this.mOriginalJson);
            X1D.LIZIZ(LIZ2);
            LJ.getClass();
        }
        this.mIsSubscription = z;
    }

    public static JSONObject LIZ(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            String[] split = C28833BTh.LIZ(str).split("-");
            String[] split2 = C28833BTh.LIZ(str2).split("-");
            if (split.length != 0 && split2.length != 0) {
                jSONObject.put("trade_no", split2[0]);
                jSONObject.put("trade_amount", split2[1]);
                jSONObject.put("app_id", split[0]);
                jSONObject.put("merchant_id", split[1]);
                jSONObject.put("uid", split[2]);
                return jSONObject;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
