package X;

import com.ss.android.common.lib.AppLogNewUtils;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: X.EJi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class CallableC36218EJi<V> implements Callable {
    public static final CallableC36218EJi<V> LJLIL = new CallableC36218EJi<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_success", 0);
            jSONObject.put("errorCode", 1024);
            jSONObject.put("is_background", 0);
            AppLogNewUtils.onEventV3("cache_video_request_response", jSONObject);
        } catch (Exception unused) {
        }
        return C76800UCe.LIZ;
    }
}
