package X;

import com.ss.android.common.lib.AppLogNewUtils;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: X.EJh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class CallableC36217EJh<V> implements Callable {
    public static final CallableC36217EJh<V> LJLIL = new CallableC36217EJh<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_success", 0);
            jSONObject.put("is_background", 1);
            jSONObject.put("errorCode", 200);
            AppLogNewUtils.onEventV3("cache_video_request_response", jSONObject);
        } catch (Exception unused) {
        }
        return C76800UCe.LIZ;
    }
}
