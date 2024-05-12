package X;

import android.webkit.WebView;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class COR {
    public static void LIZ(WebView webView, String url, boolean z) {
        int i;
        o.LJIIIZ(webView, "webView");
        o.LJIIIZ(url, "url");
        JSONObject jSONObject = new JSONObject();
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        try {
            jSONObject.put("offline", i);
            jSONObject.put("live_container_type", "webview");
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("platform", 0);
        } catch (JSONException e2) {
            C16880lQ.LLLLIIL(e2);
        }
        VMI.LJ.LJIILLIIL(webView, url, "template_offline", jSONObject, null, null, jSONObject2);
    }
}
