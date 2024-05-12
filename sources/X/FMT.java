package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class FMT implements FMV {
    @Override // X.FMV
    public final void LIZ(FMU fmu) {
        String str;
        long j;
        JSONObject jSONObject;
        String str2 = fmu.LIZ;
        java.util.Map<String, Object> map = fmu.LIZJ;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        int i = fmu.LIZIZ;
        if (8 == (i & 8)) {
            if (map == null) {
                AppLog.onEvent(null, str2);
                return;
            }
            String str3 = (String) map.get("category");
            Object obj = map.get("label");
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            Object obj2 = map.get("value");
            long j2 = 0;
            if (obj2 instanceof Long) {
                j = ((Long) obj2).longValue();
            } else {
                j = 0;
            }
            Object obj3 = map.get("ext_value");
            if (obj3 instanceof Long) {
                j2 = ((Long) obj3).longValue();
            }
            Object obj4 = map.get("ext_json");
            if (obj4 instanceof JSONObject) {
                jSONObject = (JSONObject) obj4;
            } else {
                jSONObject = null;
            }
            AppLog.onEvent((Context) null, str3, str2, str, j, j2, jSONObject);
            return;
        }
        if (16 != (i & 16)) {
            return;
        }
        if (((Boolean) C2TX.LIZIZ.getValue()).booleanValue()) {
            AppLogNewUtils.LIZLLL(fmu.LIZ, map);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (map != null) {
            try {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    if (entry != null && (entry.getValue() instanceof String) && (entry.getKey() instanceof String)) {
                        jSONObject2.put(entry.getKey(), entry.getValue());
                    }
                }
            } catch (Throwable unused) {
            }
        }
        AppLogNewUtils.onEventV3(fmu.LIZ, jSONObject2);
    }
}
