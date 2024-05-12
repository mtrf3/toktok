package X;

import android.text.TextUtils;
import com.bytedance.applog.monitor.Monitor;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QIV {
    public static final Monitor LIZ = new Monitor(null, null, "applog_");

    public static void LIZ(QIU qiu, QIL qil) {
        Monitor monitor = LIZ;
        if (monitor == null) {
            return;
        }
        monitor.record(qiu.name(), qil.name());
    }

    public static void LIZIZ(String str, QIL qil) {
        Monitor monitor = LIZ;
        if (monitor == null) {
            return;
        }
        if ("event_v3".equals(str)) {
            monitor.record(QIU.event_v3.name(), qil.name());
        } else {
            monitor.record(QIU.event.name(), qil.name());
        }
    }

    public static void LIZJ(String str, QIL qil) {
        if (LIZ == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            LIZLLL(jSONObject, "event", QIU.event, qil);
            LIZLLL(jSONObject, "event_v3", QIU.event_v3, qil);
            LIZLLL(jSONObject, "launch", QIU.launch, qil);
            LIZLLL(jSONObject, "terminate", QIU.terminate, qil);
            LIZLLL(jSONObject, "log_data", QIU.log_data, qil);
            LIZLLL(jSONObject, "item_impression", QIU.item_impression, qil);
        } catch (Throwable unused) {
        }
    }

    public static void LJ(QIU qiu, QIL qil, long j) {
        Monitor monitor = LIZ;
        if (monitor == null) {
            return;
        }
        monitor.recordTime(qiu.name(), qil.name(), (int) j);
    }

    public static void LIZLLL(JSONObject jSONObject, String str, QIU qiu, QIL qil) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null && optJSONArray.length() > 0) {
            if ("launch".equals(str)) {
                int i = 0;
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    if (optJSONObject != null && optJSONObject.isNull("is_background")) {
                        i++;
                    }
                }
                if (i > 0) {
                    LIZ.recordCount(qiu.name(), qil.name(), i);
                    return;
                }
                return;
            }
            LIZ.recordCount(qiu.name(), qil.name(), optJSONArray.length());
        }
    }
}
