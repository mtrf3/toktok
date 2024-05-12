package X;

import org.json.JSONObject;

/* renamed from: X.PAh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64011PAh implements InterfaceC64103PDv {
    @Override // X.InterfaceC64103PDv
    public final void LIZ() {
    }

    @Override // X.InterfaceC64103PDv
    public final void LJ(JSONObject jSONObject, boolean z) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject jSONObject2 = null;
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("general")) != null && (optJSONObject2 = optJSONObject.optJSONObject("slardar_api_settings")) != null) {
            jSONObject2 = optJSONObject2.optJSONObject("report_setting");
        }
        PAI.LIZ.LIZ = jSONObject2.optInt("compress_type", 2);
    }
}
