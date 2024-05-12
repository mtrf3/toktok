package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QPH {
    public static boolean LIZ = true;
    public static long LIZIZ;

    public static void LIZ(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            String string = JSONObjectProtectorUtils.getString(jSONObject2, "message");
            int i = JSONObjectProtectorUtils.getInt(jSONObject2, "code");
            boolean z = JSONObjectProtectorUtils.getBoolean(jSONObject2, "is_connecting");
            jSONObject.put("error_msg", string);
            jSONObject.put("error_code", i);
            jSONObject.put("is_connecting", z);
        } catch (Exception unused) {
            jSONObject.put("error_msg", str);
        }
    }

    public static void LIZIZ(int i, SocketState socketState) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("total_duration", SystemClock.uptimeMillis() - LIZIZ);
            jSONObject.put("connection_type", socketState.connectionType);
            jSONObject.put("connection_state", socketState.connectionState);
            jSONObject.put("channel_id", socketState.channelId);
            jSONObject.put("channel_type", socketState.channelType);
            jSONObject.put("error", socketState.error);
            LIZ(socketState.error, jSONObject);
            C09900aA.LJIIJJI("aweme_long_connection_error_rate_v2", i, jSONObject);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("reportConnect status: ");
            LIZ2.append(i);
            C34B.LIZIZ("WsConnectionReportManager", X1D.LIZIZ(LIZ2));
        } catch (Exception unused) {
        }
    }
}
