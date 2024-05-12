package X;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PB9 implements InterfaceC64036PBg {
    @Override // X.InterfaceC64036PBg
    public final String LIZIZ() {
        return "service_monitor";
    }

    @Override // X.InterfaceC64036PBg
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC64036PBg
    public final boolean isValid() {
        return true;
    }

    @Override // X.InterfaceC64036PBg
    public final JSONObject LIZ() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("log_type", "service_monitor");
            jSONObject.put("service", "apm_error");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("type", "large_data");
            jSONObject.put("category", jSONObject2);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
