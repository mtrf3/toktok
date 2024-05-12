package com.ss.android.ugc.aweme.compliance.sandbox.webview;

import X.C03880Dg;
import X.C16880lQ;
import X.C30581Hy;
import X.C35661Dz7;
import X.C38489F8r;
import X.C38995FSd;
import X.C39519Ff9;
import X.C65300Pk0;
import X.C68322mC;
import X.EnumC37807Esd;
import X.RunnableC37792EsO;
import Y.ARunnableS17S0300000_6;
import Y.ARunnableS1S2100000_6;
import android.net.Uri;
import android.os.Handler;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class TTHYBRIDXHR {
    public static final Map<Integer, String> LJ = new LinkedHashMap();
    public static final Handler LJFF = new Handler(C16880lQ.LLJJJJ());
    public final WebView LIZ;
    public final String LIZIZ;
    public boolean LIZJ;
    public EnumC37807Esd LIZLLL;

    public TTHYBRIDXHR(WebView webView) {
        this.LIZ = webView;
        this.LIZIZ = webView.getSettings().getUserAgentString();
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [T, java.lang.String] */
    @JavascriptInterface
    public final String postMessage(String jsonStr) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {jsonStr};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;)Ljava/lang/String;", "885485632275462523");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(300001, "com/ss/android/ugc/aweme/compliance/sandbox/webview/TTHYBRIDXHR", "postMessage", this, objArr, "java.lang.String", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(300001, "com/ss/android/ugc/aweme/compliance/sandbox/webview/TTHYBRIDXHR", "postMessage", null, objArr, this, c65300Pk0, false);
            return (String) LIZJ.LIZIZ;
        }
        o.LJIIIZ(jsonStr, "jsonStr");
        if (!this.LIZJ) {
            c03880Dg.LIZIZ(300001, "com/ss/android/ugc/aweme/compliance/sandbox/webview/TTHYBRIDXHR", "postMessage", "disabled", objArr, this, c65300Pk0, true);
            return "disabled";
        }
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = "";
        try {
            JSONObject jSONObject = new JSONObject(jsonStr);
            String optString = jSONObject.optString("method");
            String optString2 = jSONObject.optString("id");
            C68322mC c68322mC2 = new C68322mC();
            c68322mC2.element = jSONObject.optString("url");
            String optString3 = jSONObject.optString("data");
            JSONObject optJSONObject = jSONObject.optJSONObject("headers");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            boolean optBoolean = jSONObject.optBoolean("isBinary", false);
            boolean optBoolean2 = jSONObject.optBoolean("isResponseBinary", false);
            T url = c68322mC2.element;
            o.LJIIIIZZ(url, "url");
            c68322mC.element = url;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> keys = optJSONObject.keys();
            o.LJIIIIZZ(keys, "headers.keys()");
            while (keys.hasNext()) {
                String it = keys.next();
                o.LJIIIIZZ(it, "it");
                String optString4 = optJSONObject.optString(it);
                o.LJIIIIZZ(optString4, "headers.optString(it)");
                linkedHashMap.put(it, optString4);
            }
            C38995FSd.LIZLLL().execute(new RunnableC37792EsO(linkedHashMap, this, c68322mC2, optString, optString3, optBoolean, optBoolean2, optString2, c68322mC));
            c03880Dg.LIZIZ(300001, "com/ss/android/ugc/aweme/compliance/sandbox/webview/TTHYBRIDXHR", "postMessage", "success", objArr, this, c65300Pk0, true);
            return "success";
        } catch (Exception e) {
            LJFF.post(new ARunnableS17S0300000_6(this, c68322mC, e, 4));
            StringBuilder sb = new StringBuilder();
            C38489F8r LJJIIJZLJL = C30581Hy.LJJIIJZLJL(e.getStackTrace());
            while (LJJIIJZLJL.hasNext()) {
                sb.append(((StackTraceElement) LJJIIJZLJL.next()).toString() + '\n');
            }
            String sb2 = sb.toString();
            o.LJIIIIZZ(sb2, "StringBuilder().apply {\n…\n            }.toString()");
            c03880Dg.LIZIZ(300001, "com/ss/android/ugc/aweme/compliance/sandbox/webview/TTHYBRIDXHR", "postMessage", sb2, objArr, this, c65300Pk0, true);
            return sb2;
        }
    }

    public final void LIZ(String str, String str2, C35661Dz7 c35661Dz7, String str3, boolean z) {
        JSONObject jSONObject = new JSONObject();
        Map<String, String> map = c35661Dz7.LJ;
        if (map != null) {
            jSONObject = new JSONObject(map);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("status", c35661Dz7.LIZJ);
        jSONObject2.put("statusText", c35661Dz7.LIZLLL);
        jSONObject2.put("responseURL", str2);
        jSONObject2.put("data", str3);
        jSONObject2.put("headers", jSONObject);
        jSONObject2.put("isResponseBinary", z);
        String jSONObject3 = jSONObject2.toString();
        o.LJIIIIZZ(jSONObject3, "JSONObject().apply {\n   …ry)\n\n        }.toString()");
        LJFF.post(new ARunnableS1S2100000_6(this, str, Uri.encode(jSONObject3), 2));
    }
}
