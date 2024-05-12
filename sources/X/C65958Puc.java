package X;

import com.bytedance.pumbaa.common.interfaces.IEventMonitor;
import org.json.JSONObject;

/* renamed from: X.Puc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65958Puc implements III {
    public final IEventMonitor LIZ;

    public C65958Puc(IEventMonitor iEventMonitor) {
        this.LIZ = iEventMonitor;
    }

    @Override // X.III
    public final void LIZ(String str, java.util.Map<String, Object> map, java.util.Map<String, Object> map2, java.util.Map<String, Object> map3) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3 = null;
        if (map != null) {
            jSONObject = new JSONObject(map);
        } else {
            jSONObject = null;
        }
        if (map2 != null) {
            jSONObject2 = new JSONObject(map2);
        } else {
            jSONObject2 = null;
        }
        if (map3 != null) {
            jSONObject3 = new JSONObject(map3);
        }
        this.LIZ.monitorEvent(str, jSONObject, jSONObject2, jSONObject3);
    }
}
