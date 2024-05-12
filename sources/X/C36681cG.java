package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1cG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36681cG extends C10R {
    public String LJFF;
    public String LJI;
    public final C0E3 LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mStatus", this.LJII.getStatus());
            jSONObject.put("mErrorCode", this.LJFF);
            jSONObject.put("mErrorMessage", this.LJI);
            jSONObject.put("mAmount", this.LJIIIIZZ);
            jSONObject.put("mCurrency", this.LJIIIZ);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject.toString();
    }

    public C36681cG() {
    }

    public C36681cG(String str) {
        super(str);
        try {
            this.LJII = C0E3.getOrderStatus(this.LIZ.optString("status"));
            this.LJFF = this.LIZ.optString("error_code");
            this.LJI = this.LIZ.optString("error_message");
            this.LJIIIIZZ = this.LIZ.optString("amount");
            this.LJIIIZ = this.LIZ.optString("currency");
        } catch (Throwable unused) {
        }
    }

    public C36681cG(int i) {
        this.LJII = C0E3.getOrderStatus(null);
        this.LJFF = "time_out";
        this.LJI = "query failed because query order state retry count is to maxRetryCount.";
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
    }
}
