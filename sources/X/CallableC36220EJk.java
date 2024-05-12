package X;

import com.ss.android.common.lib.AppLogNewUtils;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: X.EJk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class CallableC36220EJk<V> implements Callable {
    public static final CallableC36220EJk<V> LJLIL = new CallableC36220EJk<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_success", 1);
            jSONObject.put("is_background", 0);
            AppLogNewUtils.onEventV3("cache_video_request_response", jSONObject);
        } catch (Exception unused) {
        }
        return C76800UCe.LIZ;
    }
}
