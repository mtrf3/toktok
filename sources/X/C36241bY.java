package X;

import org.json.JSONObject;

/* renamed from: X.1bY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36241bY extends AbstractC25220ys {
    public String LJFF;
    public String LJI;
    public C24080x2 LJII;
    public String LJIIIIZZ;
    public C24060x0 LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public boolean LJIILIIL;
    public String LJIILJJIL;
    public String LJIILL;
    public String LJIILLIIL;

    @Override // X.AbstractC25220ys
    public final JSONObject LIZJ() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.LJFF;
            if (str == null) {
                str = "";
            }
            jSONObject.put("amount", str);
            String str2 = this.LJI;
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("charge_id", str2);
            C24080x2 c24080x2 = this.LJII;
            if (c24080x2 != null) {
                jSONObject.put("configuration", c24080x2.LIZ());
            }
            String str3 = this.LJIIIIZZ;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("currency", str3);
            C24060x0 c24060x0 = this.LJIIIZ;
            if (c24060x0 != null) {
                jSONObject.put("payment_method", c24060x0.LIZ());
            }
            String str4 = this.LJIIJ;
            if (str4 == null) {
                str4 = "";
            }
            jSONObject.put("payment_reference", str4);
            String str5 = this.LJIIJJI;
            if (str5 == null) {
                str5 = "";
            }
            jSONObject.put("return_url", str5);
            String str6 = this.LJIIL;
            if (str6 == null) {
                str6 = "";
            }
            jSONObject.put("risk_info", str6);
            jSONObject.put("store_payment_method", this.LJIILIIL);
            String str7 = this.LJIILJJIL;
            if (str7 == null) {
                str7 = "";
            }
            jSONObject.put("sub_merchant_id", str7);
            String str8 = this.LJIILL;
            if (str8 == null) {
                str8 = "";
            }
            jSONObject.put("nonce", str8);
            String str9 = this.LJIILLIIL;
            if (str9 == null) {
                str9 = "";
            }
            jSONObject.put("merchant_user_id", str9);
            jSONObject.put("deeplink", "");
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @Override // X.AbstractC25220ys
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{mAmount='");
        Q89.LIZIZ(LIZ, this.LJFF, '\'', ", mChargeId='");
        Q89.LIZIZ(LIZ, this.LJI, '\'', ", mRequestConfiguration=");
        LIZ.append(this.LJII);
        LIZ.append(", mCurrency='");
        Q89.LIZIZ(LIZ, this.LJIIIIZZ, '\'', ", mPaymentMethodInfo=");
        LIZ.append(this.LJIIIZ);
        LIZ.append(", mPaymentReference='");
        Q89.LIZIZ(LIZ, this.LJIIJ, '\'', ", mReturnUrl='");
        Q89.LIZIZ(LIZ, this.LJIIJJI, '\'', ", mRiskInfo='");
        Q89.LIZIZ(LIZ, this.LJIIL, '\'', ", mNeedStorePaymentMethod=");
        LIZ.append(this.LJIILIIL);
        LIZ.append(", mSubMerchantId='");
        Q89.LIZIZ(LIZ, this.LJIILJJIL, '\'', ", mNonce='");
        Q89.LIZIZ(LIZ, this.LJIILL, '\'', ", baseRequest='");
        return C77800Ug8.LIZJ(LIZ, super.toString(), '\'', '}', LIZ);
    }
}
