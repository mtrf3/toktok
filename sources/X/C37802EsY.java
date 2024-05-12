package X;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* renamed from: X.EsY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37802EsY extends C59862NeU {
    public C37802EsY() {
        super(7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0113, code lost:
    
        if (r2.equals("OPTIONS") != false) goto L79;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:59:0x00ee. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0125 A[Catch: Exception -> 0x013d, all -> 0x0151, TryCatch #0 {all -> 0x0151, blocks: (B:13:0x0035, B:17:0x004d, B:23:0x0060, B:26:0x0068, B:28:0x006f, B:31:0x007b, B:33:0x008a, B:35:0x0091, B:38:0x009f, B:41:0x00ad, B:43:0x00b3, B:45:0x00ba, B:49:0x00c2, B:54:0x00d2, B:56:0x00d8, B:58:0x00ea, B:59:0x00ee, B:61:0x00f2, B:64:0x0115, B:66:0x011f, B:68:0x0125, B:69:0x0129, B:72:0x00fb, B:75:0x0104, B:78:0x010d), top: B:12:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013b  */
    @Override // X.C59862NeU, android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r19, android.webkit.WebResourceRequest r20) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37802EsY.shouldInterceptRequest(android.webkit.WebView, android.webkit.WebResourceRequest):android.webkit.WebResourceResponse");
    }

    @Override // X.C59862NeU, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        android.net.Uri url;
        boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(webView, webResourceRequest);
        if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
            str = url.toString();
        } else {
            str = null;
        }
        if (webView != null && str != null && C37794EsQ.LIZJ(str)) {
            C37804Esa.LJFF(webView, str, "over_load");
            if (C37804Esa.LJ(webView)) {
                FC2.LIZ.getClass();
                if (((Boolean) FC2.LJIIIZ.getValue()).booleanValue() && !shouldOverrideUrlLoading) {
                    C16880lQ.LLZZ(webView, str);
                    return true;
                }
            }
        }
        return shouldOverrideUrlLoading;
    }

    @Override // X.C59862NeU, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        C37801EsX.LJIIIIZZ.getClass();
        C37801EsX LIZ = C37800EsW.LIZ(webView, str, true);
        if (LIZ != null) {
            LIZ.LJ = System.currentTimeMillis();
        }
        if (LIZ != null) {
            LIZ.LJI = false;
            LIZ.LJII = false;
        }
        try {
            WebResourceResponse shouldInterceptRequest = super.shouldInterceptRequest(webView, str);
            if (shouldInterceptRequest != null || webView == null || str == null) {
                return shouldInterceptRequest;
            }
            android.net.Uri uri = null;
            if (C37804Esa.LIZIZ(webView) == EnumC37807Esd.PLANB) {
                C198517qh c198517qh = new C198517qh();
                c198517qh.LIZ.put("request_url", str);
                String LIZ2 = C37804Esa.LIZ(webView);
                if (LIZ2 == null) {
                    LIZ2 = "";
                }
                c198517qh.LIZ.put("web_url", LIZ2);
                C8HX.LIZIZ("web_ttnet_planB", "", c198517qh.LJ());
                if (LIZ != null) {
                    LIZ.LJFF = System.currentTimeMillis();
                }
                return null;
            }
            boolean LIZIZ = C37805Esb.LIZIZ(str);
            boolean LJ = C37804Esa.LJ(webView);
            if (!LJ && LIZIZ) {
                C198517qh c198517qh2 = new C198517qh();
                c198517qh2.LIZ.put("type", str);
                String LIZ3 = C37804Esa.LIZ(webView);
                if (LIZ3 == null) {
                    LIZ3 = "";
                }
                c198517qh2.LIZ.put("error_message", LIZ3);
                C8HX.LIZIZ("ttnet_transfer_not_injected", "", c198517qh2.LJ());
            }
            if (LJ && C37794EsQ.LIZJ(str)) {
                try {
                    uri = android.net.Uri.parse(str);
                } catch (Exception unused) {
                }
                if (uri == null) {
                    if (LIZ != null) {
                        LIZ.LJFF = System.currentTimeMillis();
                    }
                    return shouldInterceptRequest;
                }
                WebResourceResponse LIZ4 = C37794EsQ.LJ(webView, false, "GET", uri, C113554cx.LJJJLIIL(), null, false, EnumC37177EiT.RESOURCE_INTERCEPT).LIZ(C37804Esa.LIZ(webView));
                if (LIZ != null) {
                    LIZ.LJFF = System.currentTimeMillis();
                }
                return LIZ4;
            }
            LIZ.LJFF = System.currentTimeMillis();
            return shouldInterceptRequest;
        } finally {
            if (LIZ != null) {
                LIZ.LJFF = System.currentTimeMillis();
            }
        }
    }

    @Override // X.C59862NeU, android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        boolean shouldOverrideUrlLoading = super.shouldOverrideUrlLoading(webView, str);
        if (str != null && C37794EsQ.LIZJ(str)) {
            C37804Esa.LJFF(webView, str, "over_load");
            if (C37804Esa.LJ(webView)) {
                FC2.LIZ.getClass();
                if (((Boolean) FC2.LJIIIZ.getValue()).booleanValue() && !shouldOverrideUrlLoading) {
                    C16880lQ.LLZZ(webView, str);
                    return true;
                }
            }
        }
        return shouldOverrideUrlLoading;
    }
}
