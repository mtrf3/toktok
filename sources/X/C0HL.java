package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.0HL, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0HL {
    public final String LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public C0HL(JSONObject jSONObject) {
        this.LIZ = jSONObject.optString("formattedPrice");
        this.LIZIZ = jSONObject.optLong("priceAmountMicros");
        this.LIZJ = jSONObject.optString("priceCurrencyCode");
        this.LIZLLL = jSONObject.optString("offerIdToken");
        jSONObject.optString("offerId");
        jSONObject.optInt("offerType");
        JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(JSONArrayProtectorUtils.getString(optJSONArray, i));
            }
        }
        AbstractC65794Pry.zzk(arrayList);
    }
}
