package X;

import com.bytedance.ies.actionai.jni.IActionAIMonitorDelegate;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Wny, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83382Wny extends IActionAIMonitorDelegate {
    @Override // com.bytedance.ies.actionai.jni.IActionAIMonitorDelegate
    public final void onEvent(String str, int i, String str2) {
        if (str2 != null) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                jSONObject.put("status", i);
                FMX.LJIILJJIL(str, jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    @Override // com.bytedance.ies.actionai.jni.IActionAIMonitorDelegate
    public final void onSuccessRateMonitor(String str, int i, String str2) {
        if (str2 == null || str == null) {
            return;
        }
        try {
            C43882HKc.LIZLLL(i, str, new JSONObject(str2), true);
        } catch (JSONException unused) {
        }
    }
}
