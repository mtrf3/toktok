package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.android.livesdkapi.host.IHostHybrid;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Nzm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C61182Nzm extends WebView implements InterfaceC38148Ey8 {
    public String pageStartUrl;

    public static String com_bytedance_android_livesdk_browser_view_SSWebView_android_webkit_CookieManager_getCookie(CookieManager cookieManager, String str) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(103100, "android/webkit/CookieManager", "getCookie", cookieManager, new Object[]{str}, "java.lang.String", new C65300Pk0(false, "(Ljava/lang/String;)Ljava/lang/String;", "-7573513212614696663"));
        return LIZJ.LIZ ? (String) LIZJ.LIZIZ : cookieManager.getCookie(str);
    }

    @Override // android.webkit.WebView
    public boolean canGoBack() {
        try {
            return super.canGoBack();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.webkit.WebView
    public boolean canGoForward() {
        try {
            return super.canGoForward();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.webkit.WebView
    public int getContentHeight() {
        try {
            return super.getContentHeight();
        } catch (Exception unused) {
            return 1;
        }
    }

    @Override // android.webkit.WebView
    public String getOriginalUrl() {
        try {
            return super.getOriginalUrl();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.webkit.WebView
    public int getProgress() {
        try {
            return super.getProgress();
        } catch (Exception unused) {
            return 100;
        }
    }

    @Override // android.webkit.WebView
    public void clearFormData() {
        try {
            super.clearFormData();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void clearHistory() {
        try {
            super.clearHistory();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
        try {
            super.computeScroll();
        } catch (Exception unused) {
        }
    }

    @Override // X.InterfaceC38148Ey8
    public String getSafeUrl() {
        return this.pageStartUrl;
    }

    @Override // android.webkit.WebView
    public void goBack() {
        try {
            super.goBack();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void goForward() {
        try {
            super.goForward();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void reload() {
        try {
            super.reload();
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception unused) {
        }
    }

    public C61182Nzm(Context context) {
        super(context);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(3:3|(1:17)(1:5)|(6:7|(2:9|10)|19|(1:27)|29|30))|18|19|(4:21|23|25|27)|29|30) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String filterUrl(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r1 = ""
            android.content.Context r2 = r3.getContext()
            if (r2 == 0) goto L40
            boolean r0 = X.C38354F3m.LJ(r4)
            if (r0 == 0) goto L1f
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L40
            X.Pas r0 = X.C64734Pas.LJIIIZ(r2)
            r0.getClass()
            boolean r0 = X.C38354F3m.LJ(r4)
            if (r0 == 0) goto L31
            goto L40
        L1f:
            java.lang.String r0 = "http://"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L2f
            java.lang.String r0 = "https://"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto Le
        L2f:
            r0 = 1
            goto Lf
        L31:
            X.Pam r0 = X.C64728Pam.LJFF()     // Catch: java.lang.Throwable -> L40
            r0.getClass()     // Catch: java.lang.Throwable -> L40
            ee1.l r0 = ee1.l.LJ()     // Catch: java.lang.Throwable -> L40
            java.lang.String r4 = r0.LIZLLL(r4)     // Catch: java.lang.Throwable -> L40
        L40:
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostAppContext> r0 = com.bytedance.android.livesdkapi.host.IHostAppContext.class
            X.0Mx r0 = X.CN1.LIZ(r0)     // Catch: java.lang.Exception -> L83
            com.bytedance.android.livesdkapi.host.IHostAppContext r0 = (com.bytedance.android.livesdkapi.host.IHostAppContext) r0     // Catch: java.lang.Exception -> L83
            boolean r0 = r0.isLocalTest()     // Catch: java.lang.Exception -> L83
            if (r0 == 0) goto L87
            android.content.Context r0 = r3.getContext()     // Catch: java.lang.Exception -> L83
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch: java.lang.Exception -> L83
            if (r0 == 0) goto L87
            android.content.Context r0 = r3.getContext()     // Catch: java.lang.Exception -> L83
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch: java.lang.Exception -> L83
            java.lang.String[] r0 = r0.list(r1)     // Catch: java.lang.Exception -> L83
            if (r0 == 0) goto L87
            android.content.Context r0 = r3.getContext()     // Catch: java.lang.Exception -> L83
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch: java.lang.Exception -> L83
            java.lang.String[] r0 = r0.list(r1)     // Catch: java.lang.Exception -> L83
            java.util.List r1 = java.util.Arrays.asList(r0)     // Catch: java.lang.Exception -> L83
            java.lang.String r0 = "ttnet_config.json"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Exception -> L83
            if (r0 == 0) goto L87
            java.lang.String r4 = r3.tryReplaceUrlToBoe(r4)     // Catch: java.lang.Exception -> L83
            goto L87
        L83:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L87:
            r3.syncCookie(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61182Nzm.filterUrl(java.lang.String):java.lang.String");
    }

    public static boolean isSafeHost(String str) {
        return C31947CgJ.LJ(str);
    }

    private void syncCookie(String str) {
        String str2;
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        List<String> i00 = ((IHostHybrid) CN1.LIZ(IHostHybrid.class)).i00(str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("url:");
        LIZ.append(str);
        C0NB.LIZIZ("Cookie_Share", X1D.LIZIZ(LIZ));
        android.net.Uri parse = UriProtector.parse(str);
        if (parse == null) {
            str2 = "";
        } else {
            str2 = parse.getHost();
        }
        if (i00 != null && str2 != null) {
            for (int i = 0; i < i00.size(); i++) {
                String str3 = (String) ListProtector.get(i00, i);
                for (String str4 : str3.split(";")) {
                    String replace = str4.replace(" ", "");
                    INVOKEVIRTUAL_com_bytedance_android_livesdk_browser_view_SSWebView_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_setCookie(cookieManager, str2, replace);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("set cookie:");
                    LIZ2.append(replace);
                    C0NB.LIZIZ("Cookie_Share", X1D.LIZIZ(LIZ2));
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("cookies:");
                LIZ3.append(str3);
                C0NB.LIZIZ("Cookie_Share", X1D.LIZIZ(LIZ3));
            }
        }
    }

    private String tryReplaceUrlToBoe(String str) {
        if (str == null) {
            return str;
        }
        try {
            java.net.URI create = java.net.URI.create(str);
            create.getHost();
            if (!C38354F3m.LJ("")) {
                return EZY.LIZ(create.getPort(), create.getScheme(), create.getRawPath(), create.getRawQuery(), create.getRawFragment()).toString();
            }
            return str;
        } catch (Throwable unused) {
            return str;
        }
    }

    @Override // android.webkit.WebView
    public boolean canGoBackOrForward(int i) {
        try {
            return super.canGoBackOrForward(i);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.webkit.WebView
    public void clearCache(boolean z) {
        try {
            super.clearCache(z);
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void goBackOrForward(int i) {
        try {
            super.goBackOrForward(i);
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        try {
            String filterUrl = filterUrl(str);
            super.loadUrl(filterUrl, requestHeader(filterUrl, null));
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void setBackgroundColor(int i) {
        try {
            super.setBackgroundColor(i);
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            super.setDownloadListener(downloadListener);
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void setNetworkAvailable(boolean z) {
        try {
            super.setNetworkAvailable(z);
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void setOverScrollMode(int i) {
        try {
            super.setOverScrollMode(i);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public void setPageStartUrl(String str) {
        this.pageStartUrl = str;
    }

    @Override // android.webkit.WebView
    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            super.setWebChromeClient(webChromeClient);
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            super.setWebViewClient(webViewClient);
        } catch (Exception unused) {
        }
    }

    public C61182Nzm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static java.util.Map<String, String> requestHeader(String str, java.util.Map<String, String> map) {
        java.util.Map<String, String> emptyMap;
        if (C31947CgJ.LJ(str)) {
            emptyMap = ((IHostHybrid) CN1.LIZ(IHostHybrid.class)).Vg0(str);
        } else {
            emptyMap = Collections.emptyMap();
        }
        if (emptyMap == null || emptyMap.isEmpty()) {
            return map;
        }
        if (map == null || map.isEmpty()) {
            return emptyMap;
        }
        HashMap hashMap = new HashMap(map);
        for (Map.Entry<String, String> entry : emptyMap.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return hashMap;
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        try {
            super.evaluateJavascript(str, valueCallback);
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, java.util.Map<String, String> map) {
        try {
            String filterUrl = filterUrl(str);
            super.loadUrl(filterUrl, requestHeader(filterUrl, map));
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void postUrl(String str, byte[] bArr) {
        try {
            super.postUrl(filterUrl(str), bArr);
        } catch (Exception unused) {
        }
    }

    public C61182Nzm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static void INVOKEVIRTUAL_com_bytedance_android_livesdk_browser_view_SSWebView_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_setCookie(CookieManager cookieManager, String str, String str2) {
        String com_bytedance_android_livesdk_browser_view_SSWebView_android_webkit_CookieManager_getCookie;
        cookieManager.setCookie(str, str2);
        if (FCD.LJI(FKM.LIZ()) && FXL.LIZIZ() && (com_bytedance_android_livesdk_browser_view_SSWebView_android_webkit_CookieManager_getCookie = com_bytedance_android_livesdk_browser_view_SSWebView_android_webkit_CookieManager_getCookie(CookieManager.getInstance(), C39099FWd.LIZIZ())) != null && !TextUtils.equals(com_bytedance_android_livesdk_browser_view_SSWebView_android_webkit_CookieManager_getCookie, C39099FWd.LIZ())) {
            C39099FWd.LIZJ(C39099FWd.LIZIZ(), com_bytedance_android_livesdk_browser_view_SSWebView_android_webkit_CookieManager_getCookie);
        }
    }

    @Override // android.webkit.WebView
    public void loadData(String str, String str2, String str3) {
        try {
            super.loadData(str, str2, str3);
        } catch (Exception unused) {
        }
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        try {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Exception unused) {
        }
    }
}
