package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.0HO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0HO {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final C0HN LIZLLL;
    public final List LJ;

    public C0HO(JSONObject jSONObject) {
        this.LIZ = jSONObject.optString("basePlanId");
        String optString = jSONObject.optString("offerId");
        this.LIZIZ = true == optString.isEmpty() ? null : optString;
        this.LIZJ = JSONObjectProtectorUtils.getString(jSONObject, "offerIdToken");
        this.LIZLLL = new C0HN(JSONObjectProtectorUtils.getJSONArray(jSONObject, "pricingPhases"));
        final JSONObject optJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
        if (optJSONObject != null) {
            new Object(optJSONObject) { // from class: X.0HG
                {
                    JSONObjectProtectorUtils.getInt(optJSONObject, "commitmentPaymentsCount");
                    optJSONObject.optInt("subsequentCommitmentPaymentsCount");
                }
            };
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(JSONArrayProtectorUtils.getString(optJSONArray, i));
            }
        }
        this.LJ = arrayList;
    }
}
