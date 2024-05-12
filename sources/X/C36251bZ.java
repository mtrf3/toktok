package X;

import org.json.JSONObject;

/* renamed from: X.1bZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36251bZ extends AbstractC25220ys {
    public String LJFF;
    public String LJI;
    public C24080x2 LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;

    @Override // X.AbstractC25220ys
    public final JSONObject LIZJ() {
        Object LIZ;
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.LJFF;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            jSONObject.put("nonce", str);
            C24080x2 c24080x2 = this.LJII;
            if (c24080x2 == null) {
                LIZ = "";
            } else {
                LIZ = c24080x2.LIZ();
            }
            jSONObject.put("configuration", LIZ);
            String str3 = this.LJIIIIZZ;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("payment_reference", str3);
            String str4 = this.LJIIIZ;
            if (str4 == null) {
                str4 = "";
            }
            jSONObject.put("charge_id", str4);
            String str5 = this.LJIIIIZZ;
            if (str5 == null) {
                str5 = "";
            }
            jSONObject.put("payment_reference", str5);
            jSONObject.put("is_agreement", false);
            jSONObject.put("merchant_order_id", "");
            String str6 = this.LJI;
            if (str6 != null) {
                str2 = str6;
            }
            jSONObject.put("merchant_user_id", str2);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @Override // X.AbstractC25220ys
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{mNonce='");
        Q89.LIZIZ(LIZ, this.LJFF, '\'', ", mMerchantUserId='");
        Q89.LIZIZ(LIZ, this.LJI, '\'', ", mRequestConfiguration=");
        LIZ.append(this.LJII);
        LIZ.append(", mPaymentReference='");
        Q89.LIZIZ(LIZ, this.LJIIIIZZ, '\'', ", mChargeId='");
        LIZ.append(this.LJIIIZ);
        LIZ.append('\'');
        LIZ.append(", mIsAgreement=");
        LIZ.append(false);
        LIZ.append(", mMerchantOrderId='");
        LIZ.append((String) null);
        LIZ.append('\'');
        LIZ.append(", baseRequest='");
        return C77800Ug8.LIZJ(LIZ, super.toString(), '\'', '}', LIZ);
    }
}
