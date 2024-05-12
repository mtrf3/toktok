package com.ss.android.ugc.aweme.compliance.sandbox.webview;

import X.C03880Dg;
import X.C65300Pk0;
import Y.ARunnableS7S1100000_6;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class WebViewInterceptReport {
    public final WebView LIZ;

    public WebViewInterceptReport(WebView webView) {
        this.LIZ = webView;
    }

    @JavascriptInterface
    public final void postMessage(String jsonStr) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {jsonStr};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;)V", "-313174807602089944");
        if (c03880Dg.LIZJ(300001, "com/ss/android/ugc/aweme/compliance/sandbox/webview/WebViewInterceptReport", "postMessage", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300001, "com/ss/android/ugc/aweme/compliance/sandbox/webview/WebViewInterceptReport", "postMessage", null, objArr, this, c65300Pk0, false);
            return;
        }
        o.LJIIIZ(jsonStr, "jsonStr");
        this.LIZ.post(new ARunnableS7S1100000_6(this, jsonStr, 4));
        c03880Dg.LIZIZ(300001, "com/ss/android/ugc/aweme/compliance/sandbox/webview/WebViewInterceptReport", "postMessage", null, objArr, this, c65300Pk0, true);
    }
}
