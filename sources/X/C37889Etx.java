package X;

import android.webkit.WebView;
import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig;
import com.ss.android.ugc.aweme.hybridkit.experiment.BdxbridgeUrlSecurityTokenSettings;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Etx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37889Etx extends AbstractC37890Ety {
    public C37889Etx() {
        super(1);
    }

    @Override // X.F2U, X.F48
    public final String LJ(android.net.Uri uri, WebView webView) {
        C37888Etw c37888Etw;
        o.LJIIIZ(webView, "webView");
        String uri2 = uri.toString();
        o.LJIIIIZZ(uri2, "uri.toString()");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("generateWebViewToken with Url = ");
        LIZ.append(uri2);
        LIZ.append(", webview = ");
        LIZ.append(webView);
        C37887Etv.LIZ("WebViewTokenManager", X1D.LIZIZ(LIZ));
        String str = null;
        if (!C37886Etu.LIZIZ(webView, uri2)) {
            c37888Etw = null;
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(String.valueOf(System.currentTimeMillis()));
            LIZ2.append("-");
            LIZ2.append(UUID.randomUUID().toString());
            String LIZIZ = X1D.LIZIZ(LIZ2);
            c37888Etw = new C37888Etw(webView, uri2, LIZIZ);
            ConcurrentHashMap<WebView, ConcurrentHashMap<String, C37888Etw>> concurrentHashMap = C37886Etu.LIZ;
            if (concurrentHashMap.containsKey(webView)) {
                ConcurrentHashMap<String, C37888Etw> concurrentHashMap2 = concurrentHashMap.get(webView);
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.put(LIZIZ, c37888Etw);
                }
            } else {
                ConcurrentHashMap<String, C37888Etw> concurrentHashMap3 = new ConcurrentHashMap<>();
                concurrentHashMap3.put(LIZIZ, c37888Etw);
                concurrentHashMap.put(webView, concurrentHashMap3);
            }
            C37887Etv.LIZ("WebViewTokenManager", "generateWebViewToken webviewToken.token = " + c37888Etw.LIZIZ + ", webviewToken.url = " + c37888Etw.LIZ);
        }
        JSONObject jSONObject = new JSONObject();
        if (c37888Etw != null) {
            str = c37888Etw.LIZIZ;
        }
        jSONObject.put("token", str);
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "JSONObject().apply{ put(…oken?.token) }.toString()");
        return jSONObject2;
    }

    @Override // X.F2U
    public final void LJI(WebView webView, F4E code) {
        o.LJIIIZ(webView, "webView");
        o.LJIIIZ(code, "code");
        C37886Etu.LIZIZ.put(webView, Boolean.TRUE);
    }

    @Override // X.F2U, X.F4P
    public final boolean LIZ(WebView webView, String url, JSInjectConfig jSInjectConfig) {
        o.LJIIIZ(webView, "webView");
        o.LJIIIZ(url, "url");
        if (!BdxbridgeUrlSecurityTokenSettings.LIZ().enable) {
            return true;
        }
        return !C37886Etu.LIZIZ(webView, url);
    }
}
