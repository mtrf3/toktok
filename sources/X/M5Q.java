package X;

import android.app.Activity;
import com.bytedance.router.SmartRouter;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class M5Q extends M5R {
    @Override // X.M5R
    public final OSZ<Boolean, String> LIZ(M5X m5x, HashMap<String, Object> appendedMap) {
        o.LJIIIZ(appendedMap, "appendedMap");
        Activity context = m5x.LJLIL;
        android.net.Uri uri = m5x.LJLILLLLZI;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(uri, "uri");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("open_url", uri.toString());
            C8HX.LIZIZ("service_monitor", "no_matched_deep_link", jSONObject);
        } catch (Exception unused) {
        }
        C78847Ux1.LJJJJLL(uri.toString(), "abs intent == null", false);
        if (!C38586FCk.LIZIZ()) {
            SmartRouter.buildRoute(context, "//main").open();
        }
        context.finish();
        return new OSZ<>(Boolean.valueOf(this.LIZIZ), this.LIZ);
    }
}
