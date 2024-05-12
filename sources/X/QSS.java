package X;

import com.bytedance.common.utility.collection.WeakHandler;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QSS {
    public static final WeakHandler LIZ = new WeakHandler(C16880lQ.LLJJJJ(), new QSR());
    public static final java.util.Map<Integer, Boolean> LIZIZ = new ConcurrentHashMap(2);

    public static void LIZ(int i, String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("status", i);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (i == 0) {
            i = 0;
        }
        QSU.LIZ("1005", str, i, jSONObject);
        C79004UzY.LJJJJ("outer_switch_upload_result", jSONObject2, null, jSONObject);
    }

    public static void LIZIZ(int i, String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("status", i);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (i == 0) {
            i = 0;
        }
        QSU.LIZ("1003", str, i, jSONObject);
        C79004UzY.LJJJJ("push_monitor_update_sender", jSONObject2, null, jSONObject);
    }
}
