package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.analytics.AppLogDualReportSettings;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.Fuz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40501Fuz {
    public static final C64962gm LIZ = C48841JEv.LIZ(C78613UtF.LIZJ);

    public static void LIZIZ(String str, JSONObject jSONObject) {
        AppLogDualReportSettings.LIZ.getClass();
        AppLogDualReportSettings.EventConfig eventConfig = (AppLogDualReportSettings.EventConfig) ((java.util.Map) AppLogDualReportSettings.LIZIZ.getValue()).get(str);
        if (eventConfig == null) {
            return;
        }
        float f = eventConfig.sampleRate;
        try {
            String serverDeviceId = AppLog.getServerDeviceId();
            if (serverDeviceId != null) {
                if (((float) (CastLongProtector.parseLong(serverDeviceId) % 10000)) < f * 10000) {
                    JSONObject LIZJ = C65232Piu.LIZJ("event", str);
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    if (jSONObject != null) {
                        LIZ(LIZJ, jSONObject, eventConfig.categories);
                        LIZ(jSONObject2, jSONObject, eventConfig.metrics);
                        LIZ(jSONObject3, jSONObject, eventConfig.extra);
                    }
                    C09900aA.LJI(eventConfig.slardarEvent, LIZJ, jSONObject2, jSONObject3);
                }
            }
        } catch (NumberFormatException unused) {
        }
    }

    public static void LIZ(JSONObject jSONObject, JSONObject jSONObject2, java.util.Map map) {
        for (Map.Entry entry : map.entrySet()) {
            Object opt = jSONObject2.opt((String) entry.getKey());
            if (opt != null) {
                jSONObject.put((String) entry.getValue(), opt);
            }
        }
    }
}
