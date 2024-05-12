package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1cF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36671cF extends C10R {
    public C24070x1 LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;

    public final String toString() {
        String c24070x1;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mResultCode", this.LIZJ);
            jSONObject.put("mErrorCode", this.LIZLLL);
            jSONObject.put("mErrorMessage", this.LJ);
            C24070x1 c24070x12 = this.LJFF;
            if (c24070x12 == null) {
                c24070x1 = "";
            } else {
                c24070x1 = c24070x12.toString();
            }
            jSONObject.put("mRedirectDetails", c24070x1);
            jSONObject.put("mPaymentMethodDetails", this.LJI);
            jSONObject.put("mExpirationTime", this.LJII);
            jSONObject.put("mPaymentMethodToken", this.LJIIIIZZ);
            jSONObject.put("mPresentToShopperDetails", this.LJIIIZ);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject.toString();
    }

    public C36671cF() {
    }

    public C36671cF(String str) {
        super(str);
        C24070x1 c24070x1;
        try {
            this.LIZLLL = this.LIZ.optString("error_code");
            this.LJ = this.LIZ.optString("error_message");
            this.LJII = this.LIZ.optString("expiration_time");
            this.LJI = this.LIZ.optString("payment_method_details");
            this.LJIIIIZZ = this.LIZ.optString("payment_method_token");
            JSONObject optJSONObject = this.LIZ.optJSONObject("redirect_details");
            if (optJSONObject == null) {
                c24070x1 = null;
            } else {
                c24070x1 = new C24070x1(optJSONObject.optString("method"), optJSONObject.optString("url"), optJSONObject.optJSONObject("body"), optJSONObject.optJSONObject("header"));
            }
            this.LJFF = c24070x1;
            this.LIZJ = this.LIZ.optString("result_code");
            this.LJIIIZ = this.LIZ.optString("present_to_shopper_details");
        } catch (Throwable unused) {
        }
    }
}
