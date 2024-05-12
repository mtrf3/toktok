package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PC4 implements InterfaceC64036PBg {
    public final JSONArray LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;

    @Override // X.InterfaceC64036PBg
    public final String LIZIZ() {
        return "tracing";
    }

    @Override // X.InterfaceC64036PBg
    public final boolean isValid() {
        return true;
    }

    @Override // X.InterfaceC64036PBg
    public final JSONObject LIZ() {
        try {
            JSONObject put = new JSONObject().put("wrapper_array_data", this.LIZ);
            put.put("log_type", "tracing");
            put.put("wrapper_type_description", 1);
            return put;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // X.InterfaceC64036PBg
    public final boolean LIZJ() {
        return this.LIZIZ;
    }

    public PC4(JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject);
        this.LIZ = jSONArray;
    }

    public PC4(JSONArray jSONArray) {
        this.LIZ = jSONArray;
    }
}
