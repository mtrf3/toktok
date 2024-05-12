package X;

import android.text.TextUtils;
import com.bytedance.ies.android.base.runtime.depend.IMonitorDepend;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.N0i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58656N0i {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("service", str2);
            }
        } catch (JSONException e) {
            C78983UzD.LJIIZILJ(e);
        }
        IMonitorDepend LIZJ = C59835Ne3.LIZJ();
        if (LIZJ != null) {
            LIZJ.monitorCommonLog(str, jSONObject);
        }
    }
}
