package com.bytedance.hybrid.spark.security.web_js.core;

import X.C03880Dg;
import X.C141335gf;
import X.C37198Eio;
import X.C3C5;
import X.C65300Pk0;
import X.C76800UCe;
import X.F3V;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class WJSIReport {
    public WJSIReport(WebView webView) {
    }

    @JavascriptInterface
    public final void postMessage(String jsonStr) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {jsonStr};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;)V", "6556085871592014926");
        if (c03880Dg.LIZJ(300001, "com/bytedance/hybrid/spark/security/web_js/core/WJSIReport", "postMessage", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300001, "com/bytedance/hybrid/spark/security/web_js/core/WJSIReport", "postMessage", null, objArr, this, c65300Pk0, false);
            return;
        }
        o.LJIIJ(jsonStr, "jsonStr");
        try {
            JSONObject jSONObject = new JSONObject(jsonStr);
            String eventName = jSONObject.optString("eventName");
            JSONObject optJSONObject = jSONObject.optJSONObject("metrics");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("category");
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
            }
            String string = JSONObjectProtectorUtils.getString(jSONObject, "url");
            o.LJFF(eventName, "eventName");
            F3V.LIZ(eventName, string, optJSONObject2, optJSONObject);
            C37198Eio.LIZIZ("fe report. eventName: ".concat(eventName));
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        c03880Dg.LIZIZ(300001, "com/bytedance/hybrid/spark/security/web_js/core/WJSIReport", "postMessage", null, objArr, this, c65300Pk0, true);
    }
}
