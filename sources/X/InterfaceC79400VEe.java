package X;

import org.json.JSONObject;

/* renamed from: X.VEe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC79400VEe extends InterfaceC39538FfS {
    String getDeviceID();

    void onReportEvent(String str, JSONObject jSONObject, JSONObject jSONObject2);

    void onTimingSetup(java.util.Map<String, Object> map, JSONObject jSONObject);

    void onTimingUpdate(java.util.Map<String, Object> map, java.util.Map<String, Long> map2, JSONObject jSONObject);
}
