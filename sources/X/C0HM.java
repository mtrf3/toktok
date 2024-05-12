package X;

import org.json.JSONObject;

/* renamed from: X.0HM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0HM {
    public final String LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;
    public final int LJFF;

    public C0HM(JSONObject jSONObject) {
        this.LIZLLL = jSONObject.optString("billingPeriod");
        this.LIZJ = jSONObject.optString("priceCurrencyCode");
        this.LIZ = jSONObject.optString("formattedPrice");
        this.LIZIZ = jSONObject.optLong("priceAmountMicros");
        this.LJFF = jSONObject.optInt("recurrenceMode");
        this.LJ = jSONObject.optInt("billingCycleCount");
    }
}
