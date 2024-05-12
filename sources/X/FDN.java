package X;

import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class FDN {
    public final String LIZ;
    public final FDM LIZIZ;

    public FDN(String str, JSONObject jSONObject) {
        this.LIZ = str;
        JSONObject optJSONObject = jSONObject.optJSONObject("filter");
        if (optJSONObject != null) {
            this.LIZIZ = new FDM(optJSONObject);
        }
    }
}
