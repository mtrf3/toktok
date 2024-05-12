package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.download.component_api.depend.IMonitorLogSendDepend;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class WFD implements IMonitorLogSendDepend {
    public static final WFD LIZ = new WFD();

    @Override // com.ss.android.ugc.aweme.download.component_api.depend.IMonitorLogSendDepend
    public final void sendMonitorLog(String str, JSONObject jSONObject) {
        int i = JSONObjectProtectorUtils.getInt(jSONObject, "error_code");
        if (i == 0) {
            return;
        }
        String string = JSONObjectProtectorUtils.getString(jSONObject, "error_msg");
        Object obj = jSONObject.get("request_log");
        StringBuilder LIZ2 = C06830Op.LIZ("errorCode=", i, ", errorMsg=", string, ", requestLog=");
        LIZ2.append(obj);
        X1D.LIZIZ(LIZ2);
    }
}
