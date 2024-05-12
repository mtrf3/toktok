package com.bytedance.android.monitor.webview;

import X.C03880Dg;
import X.C16880lQ;
import X.C38160EyK;
import X.C38222EzK;
import X.C39519Ff9;
import X.C65300Pk0;
import X.C82519Wa3;
import Y.ARunnableS42S0100000_6;
import android.os.Handler;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public class WebViewMonitorJsBridge {
    public WeakReference<WebView> mWebViewRef;
    public Handler mainHandler = new Handler(C16880lQ.LLJJJJ());

    @JavascriptInterface
    public String getVersion() {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()Ljava/lang/String;", "8165251219710820848");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(300001, "com/bytedance/android/monitor/webview/WebViewMonitorJsBridge", "getVersion", this, objArr, "java.lang.String", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(300001, "com/bytedance/android/monitor/webview/WebViewMonitorJsBridge", "getVersion", null, objArr, this, c65300Pk0, false);
            return (String) LIZJ.LIZIZ;
        }
        c03880Dg.LIZIZ(300001, "com/bytedance/android/monitor/webview/WebViewMonitorJsBridge", "getVersion", "1.2.5-rc.3", objArr, this, c65300Pk0, true);
        return "1.2.5-rc.3";
    }

    @JavascriptInterface
    public void injectJS() {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = new Object[0];
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "()V", "8165251219710820848");
        if (c03880Dg.LIZJ(300001, "com/bytedance/android/monitor/webview/WebViewMonitorJsBridge", "injectJS", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300001, "com/bytedance/android/monitor/webview/WebViewMonitorJsBridge", "injectJS", null, objArr, this, c65300Pk0, false);
            return;
        }
        C82519Wa3.LIZLLL("WebViewMonitorJsBridge", "inject js");
        C38160EyK.LIZIZ(new ARunnableS42S0100000_6(this, System.currentTimeMillis(), 11));
        c03880Dg.LIZIZ(300001, "com/bytedance/android/monitor/webview/WebViewMonitorJsBridge", "injectJS", null, objArr, this, c65300Pk0, true);
    }

    public WebViewMonitorJsBridge(WebView webView) {
        this.mWebViewRef = new WeakReference<>(webView);
    }

    @JavascriptInterface
    public void batch(String str) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {str};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;)V", "8165251219710820848");
        if (c03880Dg.LIZJ(300001, "com/bytedance/android/monitor/webview/WebViewMonitorJsBridge", "batch", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300001, "com/bytedance/android/monitor/webview/WebViewMonitorJsBridge", "batch", null, objArr, this, c65300Pk0, false);
            return;
        }
        C82519Wa3.LIZLLL("WebViewMonitorJsBridge", "batch");
        C38222EzK.LJI.LJFF(this.mWebViewRef.get());
        c03880Dg.LIZIZ(300001, "com/bytedance/android/monitor/webview/WebViewMonitorJsBridge", "batch", null, objArr, this, c65300Pk0, true);
    }

    @JavascriptInterface
    public void reportPageLatestData(String str) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {str};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;)V", "8165251219710820848");
        if (c03880Dg.LIZJ(300001, "com/bytedance/android/monitor/webview/WebViewMonitorJsBridge", "reportPageLatestData", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300001, "com/bytedance/android/monitor/webview/WebViewMonitorJsBridge", "reportPageLatestData", null, objArr, this, c65300Pk0, false);
            return;
        }
        C82519Wa3.LIZLLL("WebViewMonitorJsBridge", "report latest page data");
        C38160EyK.LIZIZ(new ARunnableS42S0100000_6(this, str, 10));
        c03880Dg.LIZIZ(300001, "com/bytedance/android/monitor/webview/WebViewMonitorJsBridge", "reportPageLatestData", null, objArr, this, c65300Pk0, true);
    }

    @JavascriptInterface
    public void sendInitTimeInfo(String str) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {str};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;)V", "8165251219710820848");
        if (c03880Dg.LIZJ(300001, "com/bytedance/android/monitor/webview/WebViewMonitorJsBridge", "sendInitTimeInfo", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300001, "com/bytedance/android/monitor/webview/WebViewMonitorJsBridge", "sendInitTimeInfo", null, objArr, this, c65300Pk0, false);
            return;
        }
        C82519Wa3.LIZLLL("WebViewMonitorJsBridge", "sendInitTimeInfo: ");
        C38222EzK.LJI.LJFF(this.mWebViewRef.get());
        c03880Dg.LIZIZ(300001, "com/bytedance/android/monitor/webview/WebViewMonitorJsBridge", "sendInitTimeInfo", null, objArr, this, c65300Pk0, true);
    }

    @JavascriptInterface
    public void cover(String str, String str2) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {str, str2};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;Ljava/lang/String;)V", "8165251219710820848");
        if (c03880Dg.LIZJ(300001, "com/bytedance/android/monitor/webview/WebViewMonitorJsBridge", "cover", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300001, "com/bytedance/android/monitor/webview/WebViewMonitorJsBridge", "cover", null, objArr, this, c65300Pk0, false);
            return;
        }
        C82519Wa3.LIZLLL("WebViewMonitorJsBridge", "cover: eventType: " + str2);
        C38222EzK.LJI.LJFF(this.mWebViewRef.get());
        c03880Dg.LIZIZ(300001, "com/bytedance/android/monitor/webview/WebViewMonitorJsBridge", "cover", null, objArr, this, c65300Pk0, true);
    }

    @JavascriptInterface
    public void reportDirectly(String str, String str2) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {str, str2};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;Ljava/lang/String;)V", "8165251219710820848");
        if (c03880Dg.LIZJ(300001, "com/bytedance/android/monitor/webview/WebViewMonitorJsBridge", "reportDirectly", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300001, "com/bytedance/android/monitor/webview/WebViewMonitorJsBridge", "reportDirectly", null, objArr, this, c65300Pk0, false);
            return;
        }
        C82519Wa3.LIZLLL("WebViewMonitorJsBridge", "reportDirectly: eventType: " + str2);
        C38222EzK.LJI.LJFF(this.mWebViewRef.get());
        c03880Dg.LIZIZ(300001, "com/bytedance/android/monitor/webview/WebViewMonitorJsBridge", "reportDirectly", null, objArr, this, c65300Pk0, true);
    }

    @JavascriptInterface
    public void customReport(String str, String str2, String str3, boolean z, String str4, String str5) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {str, str2, str3, Boolean.valueOf(z), str4, str5};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "8165251219710820848");
        if (c03880Dg.LIZJ(300001, "com/bytedance/android/monitor/webview/WebViewMonitorJsBridge", "customReport", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300001, "com/bytedance/android/monitor/webview/WebViewMonitorJsBridge", "customReport", null, objArr, this, c65300Pk0, false);
            return;
        }
        C82519Wa3.LIZLLL("WebViewMonitorJsBridge", "customReport: event: " + str);
        C38222EzK.LJI.LJFF(this.mWebViewRef.get());
        c03880Dg.LIZIZ(300001, "com/bytedance/android/monitor/webview/WebViewMonitorJsBridge", "customReport", null, objArr, this, c65300Pk0, true);
    }
}
