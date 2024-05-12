package X;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.security.web_js.core.WJSIReport;
import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectConfig;
import com.bytedance.hybrid.spark.security.web_js.setting.JSInjectGlobalConfig;
import com.bytedance.mt.protector.impl.UriProtector;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class F49 implements F4U {
    public static final java.util.Map<Integer, String> LIZ = new LinkedHashMap();

    public static boolean LJI(WebResourceResponse webResourceResponse) {
        if (!o.LJ(webResourceResponse.getMimeType(), "text/html")) {
            return true;
        }
        int statusCode = webResourceResponse.getStatusCode();
        if (300 <= statusCode && 399 >= statusCode) {
            return true;
        }
        return false;
    }

    @Override // X.F4U
    public final void LIZ(WebView webView, String str) {
        Object LIZ2;
        if (str != null && webView != null) {
            long currentTimeMillis = System.currentTimeMillis();
            JSInjectGlobalConfig LIZIZ = F46.LIZIZ();
            if (LIZIZ != null) {
                try {
                    LIZ2 = UriProtector.parse(str);
                    C3C5.m7constructorimpl(LIZ2);
                } catch (Throwable th) {
                    LIZ2 = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ2);
                }
                if (C3C5.m12isFailureimpl(LIZ2)) {
                    LIZ2 = null;
                }
                android.net.Uri uri = (android.net.Uri) LIZ2;
                if (uri != null) {
                    if (F46.LJ(uri, LIZIZ)) {
                        C37198Eio.LIZIZ("[onPageStart] Url is block by global inline JS inject. url: ".concat(str));
                        return;
                    }
                    for (String str2 : LIZIZ.finishInjectors) {
                        LJFF(str2, str, webView, F4G.LIZ(str2), F4F.LOAD_FINISH);
                    }
                    long currentTimeMillis2 = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", currentTimeMillis2 - currentTimeMillis);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("current_url", str);
                    jSONObject2.put("inject_time", F4F.LOAD_FINISH.getValue());
                    F3V.LIZ("js_inject_manage_client_auto", str, jSONObject, jSONObject2);
                }
            }
        }
    }

    @Override // X.F4U
    public final void LIZIZ(WebView webView, String str) {
        Object LIZ2;
        if (str != null && webView != null) {
            long currentTimeMillis = System.currentTimeMillis();
            JSInjectGlobalConfig LIZIZ = F46.LIZIZ();
            if (LIZIZ != null) {
                try {
                    LIZ2 = UriProtector.parse(str);
                    C3C5.m7constructorimpl(LIZ2);
                } catch (Throwable th) {
                    LIZ2 = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ2);
                }
                if (C3C5.m12isFailureimpl(LIZ2)) {
                    LIZ2 = null;
                }
                android.net.Uri uri = (android.net.Uri) LIZ2;
                if (uri != null) {
                    if (F46.LJ(uri, LIZIZ)) {
                        C37198Eio.LIZIZ("[onPageStart] Url is block by global inline JS inject. url: ".concat(str));
                        return;
                    }
                    for (String str2 : LIZIZ.startInjectors) {
                        LJFF(str2, str, webView, F4G.LIZ(str2), F4F.LOAD_START);
                    }
                    long currentTimeMillis2 = System.currentTimeMillis();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", currentTimeMillis2 - currentTimeMillis);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("current_url", str);
                    jSONObject2.put("inject_time", F4F.LOAD_START.getValue());
                    F3V.LIZ("js_inject_manage_client_auto", str, jSONObject, jSONObject2);
                }
            }
        }
    }

    @Override // X.F4U
    public final WebResourceResponse LIZJ(WebView webView, WebResourceRequest webResourceRequest) {
        if (webView != null && webResourceRequest != null && !webResourceRequest.isForMainFrame()) {
            String uri = webResourceRequest.getUrl().toString();
            o.LJFF(uri, "request.url.toString()");
            JSInjectConfig jSInjectConfig = F46.LJ.get(uri);
            if (jSInjectConfig != null && o.LJ(jSInjectConfig.geckoUrl, uri) && o.LJ(jSInjectConfig.injectTime, F4F.VERY_BEGINNING.getValue())) {
                long currentTimeMillis = System.currentTimeMillis();
                F4B f4b = new F4B();
                f4b.LIZ = Long.valueOf(currentTimeMillis);
                F4K f4k = f4b.LIZJ;
                f4k.LIZ = jSInjectConfig.name;
                java.util.Map<Integer, String> map = LIZ;
                f4k.LIZLLL = (String) ((LinkedHashMap) map).get(Integer.valueOf(webView.hashCode()));
                f4b.LIZJ.LIZJ = jSInjectConfig.businessLine;
                f4b.LIZLLL.LIZJ = jSInjectConfig.geckoUrl;
                F2U LIZ2 = F4G.LIZ(jSInjectConfig.name);
                F4I LIZ3 = F4A.LIZ(webView, jSInjectConfig);
                f4b.LIZLLL.LIZLLL = C44847Hit.LIZ(currentTimeMillis);
                if (LIZ3 != null) {
                    try {
                        InputStream data = LIZ3.getData();
                        if (data != null) {
                            C37271Ejz c37271Ejz = C37271Ejz.LIZ;
                            String LJI = LIZ3.LJI();
                            c37271Ejz.getClass();
                            String LIZ4 = C37271Ejz.LIZ(data, LJI);
                            android.net.Uri parse = UriProtector.parse((String) ((LinkedHashMap) map).get(Integer.valueOf(webView.hashCode())));
                            o.LJFF(parse, "Uri.parse(loadUrlMap[view.hashCode()])");
                            String LIZJ = F4A.LIZJ(webView, parse, LIZ4, jSInjectConfig, LIZ2, f4b);
                            WebResourceResponse LJJIJ = C78946Uyc.LJJIJ(LIZ3);
                            Charset charset = PVC.LIZ;
                            if (LIZJ != null) {
                                byte[] bytes = LIZJ.getBytes(charset);
                                o.LJFF(bytes, "(this as java.lang.String).getBytes(charset)");
                                LJJIJ.setData(new ByteArrayInputStream(bytes));
                                f4b.LIZLLL.LIZ = 1;
                                f4b.LIZLLL.LIZIZ = 1;
                                f4b.LIZIZ = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
                                f4b.LIZ("js_inject_manage_client_inline_sub", null, true);
                                StringBuilder LIZ5 = X1D.LIZ();
                                LIZ5.append("[InlineJSIntercept] success, script url: ");
                                LIZ5.append(webResourceRequest.getUrl());
                                LIZ5.append(", duration = ");
                                LIZ5.append(System.currentTimeMillis() - currentTimeMillis);
                                C37198Eio.LIZIZ(X1D.LIZIZ(LIZ5));
                                return LJJIJ;
                            }
                            throw new C37692Eqm("null cannot be cast to non-null type java.lang.String");
                        }
                    } catch (Throwable th) {
                        th = th;
                        StringBuilder LIZ6 = X1D.LIZ();
                        LIZ6.append("[InlineJSIntercept] exception happened, url: ");
                        LIZ6.append(webResourceRequest.getUrl());
                        LIZ6.append(", exception: ");
                        LIZ6.append(th.getMessage());
                        C37198Eio.LIZIZ(X1D.LIZIZ(LIZ6));
                    }
                }
                th = null;
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("[InlineJSIntercept] failed, script url: ");
                LIZ7.append(webResourceRequest.getUrl());
                C37198Eio.LIZIZ(X1D.LIZIZ(LIZ7));
                if (LIZ2 != null) {
                    LIZ2.LJI(webView, F4E.INLINE_SCRIPT_RESOURCE_FAIL);
                }
                f4b.LIZLLL.LIZ = 0;
                f4b.LIZIZ = C44847Hit.LIZ(currentTimeMillis);
                f4b.LIZ("js_inject_manage_client_inline_sub", th, false);
            }
        }
        return null;
    }

    @Override // X.F4U
    public final void LIZLLL(WebView webView, String str) {
        if (str != null) {
            if (ujb.o.LJJJLIIL(str, "http://", false) || ujb.o.LJJJLIIL(str, "https://", false)) {
                LIZ.put(Integer.valueOf(webView.hashCode()), str);
                F4Q f4q = F4G.LIZLLL;
                if (f4q == null || !f4q.LIZIZ(str)) {
                    WebSettings settings = webView.getSettings();
                    o.LJFF(settings, "webView.settings");
                    settings.setJavaScriptEnabled(true);
                    webView.addJavascriptInterface(new WJSIReport(webView), "WJSIReport");
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("success inject WJSIReport. url: ");
                    LIZ2.append(str);
                    C37198Eio.LIZIZ(X1D.LIZIZ(LIZ2));
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:111|(4:115|(1:208)|(1:207)(1:120)|(14:122|(14:124|(1:126)|127|128|130|131|132|133|(4:135|(2:138|136)|139|140)(1:(6:174|175|176|(2:179|177)|180|181)(5:184|142|143|(1:145)(2:170|(1:172))|(7:147|(2:150|148)|151|152|153|(4:156|(3:158|159|160)(1:162)|161|154)|163)))|141|142|143|(0)(0)|(0))|190|191|192|193|194|195|(2:198|196)|199|200|153|(1:154)|163))|209|(0)|190|191|192|193|194|195|(1:196)|199|200|153|(1:154)|163) */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0458, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0459, code lost:
    
        r2 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x045c, code lost:
    
        X.C3C5.m7constructorimpl(X.C141335gf.LIZ(r0));
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x045b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03f1 A[Catch: Exception -> 0x0416, TRY_ENTER, TryCatch #1 {Exception -> 0x0416, blocks: (B:142:0x03e5, B:145:0x03f1, B:170:0x03fc, B:172:0x0406, B:176:0x0395, B:177:0x03a7, B:179:0x03ad, B:181:0x03c7), top: B:175:0x0395 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04e2 A[LOOP:6: B:165:0x04dc->B:167:0x04e2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03fc A[Catch: Exception -> 0x0416, TryCatch #1 {Exception -> 0x0416, blocks: (B:142:0x03e5, B:145:0x03f1, B:170:0x03fc, B:172:0x0406, B:176:0x0395, B:177:0x03a7, B:179:0x03ad, B:181:0x03c7), top: B:175:0x0395 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0484 A[LOOP:8: B:196:0x047e->B:198:0x0484, LOOP_END] */
    @Override // X.F4U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.webkit.WebResourceResponse LJ(android.webkit.WebView r23, android.webkit.WebResourceRequest r24, android.webkit.WebResourceResponse r25) {
        /*
            Method dump skipped, instructions count: 1268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F49.LJ(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceResponse):android.webkit.WebResourceResponse");
    }

    public static void LJFF(String str, String str2, WebView webView, F2U f2u, F4F f4f) {
        String LIZJ;
        long currentTimeMillis = System.currentTimeMillis();
        F4B f4b = new F4B();
        android.net.Uri parse = UriProtector.parse(str2);
        if (parse == null || !C37302EkU.LIZIZ(parse)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[Auto] Fail for error uri. JSName: ");
            LIZ2.append(str);
            LIZ2.append(", Uri: ");
            LIZ2.append(str2);
            C37198Eio.LIZ(X1D.LIZIZ(LIZ2), null);
            return;
        }
        F4K f4k = f4b.LIZJ;
        f4k.LIZLLL = str2;
        f4k.LIZ = str;
        f4k.LIZIZ = f4f;
        f4b.LIZ = Long.valueOf(currentTimeMillis);
        JSInjectConfig LIZJ2 = F46.LIZJ(str, f2u, f4b);
        if (LIZJ2 == null) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("[Auto] Fail for empty JSConfig. JSName: ");
            LIZ3.append(str);
            LIZ3.append(", url: ");
            LIZ3.append(str2);
            C37198Eio.LIZJ(X1D.LIZIZ(LIZ3));
            f4b.LIZIZ = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
            f4b.LIZ("js_inject_manage_client", null, false);
            return;
        }
        if (f2u != null && f2u.LIZ(webView, str2, LIZJ2)) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("reject by business interceptor. URL: ", str2, ", JSName: ");
            LIZIZ.append(LIZJ2.name);
            C37198Eio.LIZIZ(X1D.LIZIZ(LIZIZ));
            return;
        }
        f4b.LIZJ.LIZJ = LIZJ2.businessLine;
        if (!F46.LIZLLL(parse, LIZJ2, f4b)) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("[Auto] Fail for block url. JSName: ");
            LIZ4.append(str);
            LIZ4.append(", Url: ");
            LIZ4.append(str2);
            C37198Eio.LIZJ(X1D.LIZIZ(LIZ4));
            return;
        }
        F4Q f4q = F4G.LIZLLL;
        if (f4q != null && f4q.LIZ(webView, str2, LIZJ2)) {
            StringBuilder LIZIZ2 = C25620zW.LIZIZ("reject by global interceptor. URL: ", str2, ", JSName: ");
            LIZIZ2.append(LIZJ2.name);
            C37198Eio.LIZIZ(X1D.LIZIZ(LIZIZ2));
            return;
        }
        String LIZIZ3 = F4A.LIZIZ(webView, LIZJ2, f2u, f4b);
        if (LIZIZ3 == null || (LIZJ = F4A.LIZJ(webView, parse, LIZIZ3, LIZJ2, f2u, f4b)) == null || LIZJ.length() == 0) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("[Auto] Fail for empty script. JSName: ");
            LIZ5.append(str);
            LIZ5.append(", Url: ");
            LIZ5.append(str2);
            C37198Eio.LIZJ(X1D.LIZIZ(LIZ5));
            f4b.LIZIZ = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
            f4b.LIZ("js_inject_manage_client", null, false);
            return;
        }
        webView.evaluateJavascript(LIZJ, new C37210Ej0(f2u, str, str2));
        f4b.LIZIZ = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
        f4b.LIZ("js_inject_manage_client", null, true);
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("[Auto] Success inject js. JSName: ");
        LIZ6.append(str);
        LIZ6.append(", Url: ");
        LIZ6.append(str2);
        C37198Eio.LIZJ(X1D.LIZIZ(LIZ6));
    }
}
