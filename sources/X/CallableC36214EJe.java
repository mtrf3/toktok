package X;

import com.ss.android.common.lib.AppLogNewUtils;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: X.EJe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class CallableC36214EJe<V> implements Callable {
    public static final CallableC36214EJe<V> LJLIL = new CallableC36214EJe<>();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_success", 1);
            if (C48236IwS.LJIIL) {
                jSONObject.put("is_background", 1);
            } else {
                jSONObject.put("is_background", 0);
            }
            AppLogNewUtils.onEventV3("cache_feed_request", jSONObject);
        } catch (Exception unused) {
        }
        return C76800UCe.LIZ;
    }
}
