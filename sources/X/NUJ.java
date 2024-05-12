package X;

import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import java.net.URLEncoder;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS65S1200000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NUJ implements InterfaceC60433Nnh {
    public final NMZ LIZ;

    public NUJ(NMZ adWebViewExtension) {
        o.LJIIIZ(adWebViewExtension, "adWebViewExtension");
        this.LIZ = adWebViewExtension;
    }

    @Override // X.InterfaceC60433Nnh
    public final void LJI(WebView webView) {
        String str;
        String str2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onReceivedSslError ");
        C59222NMc c59222NMc = this.LIZ.LIZ;
        String str3 = null;
        if (c59222NMc != null) {
            str = c59222NMc.LJ;
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(" WebView.url ");
        if (webView != null) {
            str2 = webView.getUrl();
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        X1D.LIZIZ(LIZ);
        if (webView != null) {
            str3 = webView.getUrl();
        }
        if (C78685UuP.LJJJZ(str3)) {
            TextUtils.equals(str3, "about:blank");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c8, code lost:
    
        if (r8 != null) goto L20;
     */
    @Override // X.InterfaceC60433Nnh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebResourceRequest r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "shouldInterceptRequest "
            r1.append(r0)
            X.NMZ r0 = r7.LIZ
            X.NMc r0 = r0.LIZ
            r6 = 0
            if (r0 == 0) goto Lce
            java.lang.String r0 = r0.LJ
        L12:
            r1.append(r0)
            java.lang.String r0 = " request.url "
            r1.append(r0)
            if (r8 == 0) goto Lcb
            android.net.Uri r0 = r8.getUrl()
            if (r0 == 0) goto Lcb
            java.lang.String r0 = r0.toString()
        L26:
            r1.append(r0)
            X.X1D.LIZIZ(r1)
            if (r8 == 0) goto Ld1
            android.net.Uri r0 = r8.getUrl()
            if (r0 == 0) goto Lc8
            java.util.Map r0 = r8.getRequestHeaders()
            if (r0 == 0) goto L5c
            X.NMZ r0 = r7.LIZ
            X.NU6 r5 = r0.LIZJ
            if (r5 == 0) goto L5c
            android.net.Uri r0 = r8.getUrl()
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "request.url.toString()"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
            java.util.Map r3 = r8.getRequestHeaders()
            java.lang.String r0 = "request.requestHeaders"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            boolean r0 = r5.LIZ()
            if (r0 != 0) goto L69
        L5c:
            X.NMZ r0 = r7.LIZ
            X.NMc r0 = r0.LIZ
            if (r0 == 0) goto Ld1
            android.webkit.WebResourceResponse r0 = com.ss.android.ugc.aweme.web.business.special.CWebViewInterceptor.LIZJ(r8, r0)
            if (r0 == 0) goto Ld1
            return r0
        L69:
            boolean r0 = r5.LIZJ()
            if (r0 == 0) goto L7c
            int r1 = r5.LJI
        L71:
            java.util.Map r0 = r5.LIZIZ()
            int r0 = r0.size()
            if (r0 < r1) goto L7e
            goto L5c
        L7c:
            r1 = 1
            goto L71
        L7e:
            boolean r0 = ujb.o.LJJJJJL(r4)
            if (r0 != 0) goto L5c
            java.lang.String r0 = "about:blank"
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r4)
            if (r0 == 0) goto L8d
            goto L5c
        L8d:
            java.lang.String r0 = ".js"
            r2 = 0
            boolean r0 = ujb.o.LJJJJ(r4, r0, r2)
            if (r0 != 0) goto L5c
            java.lang.String r0 = ".css"
            boolean r0 = ujb.o.LJJJJ(r4, r0, r2)
            if (r0 == 0) goto L9f
            goto L5c
        L9f:
            java.lang.String r0 = "Accept"
            java.lang.Object r1 = r3.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto Laa
            goto L5c
        Laa:
            java.lang.String r0 = "html"
            boolean r0 = ujb.s.LJJJLZIJ(r1, r0, r2)
            if (r0 != 0) goto Lb3
            goto L5c
        Lb3:
            X.Ol8 r0 = r5.LIZJ
            java.lang.Object r2 = r0.getValue()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r1 = com.google.gson.internal.h.LJIIIIZZ(r4)
            java.lang.String r0 = "hexDigest(url)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.put(r1, r3)
            goto L5c
        Lc8:
            if (r8 == 0) goto Ld1
            goto L5c
        Lcb:
            r0 = r6
            goto L26
        Lce:
            r0 = r6
            goto L12
        Ld1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NUJ.shouldInterceptRequest(android.webkit.WebResourceRequest):android.webkit.WebResourceResponse");
    }

    @Override // X.InterfaceC60433Nnh
    public final void LIZ(WebView webView, String str) {
        String str2;
        String str3;
        String str4;
        N1V n1v;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPageFinished ");
        C59222NMc c59222NMc = this.LIZ.LIZ;
        WebKitView webKitView = null;
        if (c59222NMc != null) {
            str2 = c59222NMc.LJ;
        } else {
            str2 = null;
        }
        YE1.LIZLLL(LIZ, str2, " url ", str, " WebView.url ");
        if (webView != null) {
            str3 = webView.getUrl();
        } else {
            str3 = null;
        }
        LIZ.append(str3);
        LIZ.append(" url is webview.url? ");
        if (webView != null) {
            str4 = webView.getUrl();
        } else {
            str4 = null;
        }
        LIZ.append(o.LJ(str, str4));
        X1D.LIZIZ(LIZ);
        if (!C59303NPf.LIZIZ(this.LIZ.LIZ, str)) {
            return;
        }
        if (str != null && (n1v = this.LIZ.LIZIZ) != null) {
            n1v.LJI(str, new AqS65S1200000_10(this, webView, str, 2), webView);
        }
        NMZ nmz = this.LIZ;
        C59223NMd c59223NMd = nmz.LIZLLL;
        C59222NMc c59222NMc2 = nmz.LIZ;
        c59223NMd.getClass();
        if (webView instanceof WebKitView) {
            webKitView = (WebKitView) webView;
        }
        c59223NMd.LIZIZ = webKitView;
        c59223NMd.LIZ(false, true, c59222NMc2);
        NUM num = this.LIZ.LJI;
        if (num != null) {
            num.LJ();
        }
    }

    @Override // X.InterfaceC60433Nnh
    public final void LIZIZ(WebView webView, String str) {
        String str2;
        String str3;
        boolean z;
        N1V n1v;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPageStarted ");
        C59222NMc c59222NMc = this.LIZ.LIZ;
        String str4 = null;
        if (c59222NMc != null) {
            str2 = c59222NMc.LJ;
        } else {
            str2 = null;
        }
        YE1.LIZLLL(LIZ, str2, " url ", str, " WebView.url ");
        if (webView != null) {
            str3 = webView.getUrl();
        } else {
            str3 = null;
        }
        LIZ.append(str3);
        LIZ.append(" url is webview.url? ");
        if (webView != null) {
            str4 = webView.getUrl();
        }
        LIZ.append(o.LJ(str, str4));
        X1D.LIZIZ(LIZ);
        if (!C59303NPf.LIZIZ(this.LIZ.LIZ, str)) {
            return;
        }
        if (str != null && (n1v = this.LIZ.LIZIZ) != null) {
            n1v.LIZJ(str, new AqS176S0100000_10(this, 101));
        }
        C59222NMc c59222NMc2 = this.LIZ.LIZ;
        int i = 1;
        boolean z2 = false;
        if (c59222NMc2 != null && c59222NMc2.LJIJJ) {
            if (webView != null) {
                webView.clearHistory();
            }
            C59222NMc c59222NMc3 = this.LIZ.LIZ;
            if (c59222NMc3 != null) {
                c59222NMc3.LJIJJ = false;
            }
        }
        NMZ nmz = this.LIZ;
        C59222NMc c59222NMc4 = nmz.LIZ;
        if (c59222NMc4 != null) {
            c59222NMc4.LJIILL = str;
            N1V n1v2 = nmz.LIZIZ;
            if (n1v2 != null) {
                i = n1v2.LIZIZ;
            }
            c59222NMc4.LJIILLIIL = i;
        }
        C58283Mu7.LIZIZ.LIZ(str);
        NU6 nu6 = this.LIZ.LIZJ;
        if (nu6 != null && TextUtils.isEmpty(nu6.LJIIJJI) && !TextUtils.isEmpty(str)) {
            nu6.LJIIJJI = str;
            if (str != null && !TextUtils.equals("about:blank", str)) {
                java.util.Map<String, String> LIZIZ = nu6.LIZIZ();
                String encode = URLEncoder.encode(str, "UTF-8");
                o.LJIIIIZZ(encode, "encode(str, \"UTF-8\")");
                LIZIZ.put(encode, "");
            }
        }
        NUM num = this.LIZ.LJI;
        if (num != null) {
            if (webView != null) {
                z = webView.canGoBack();
            } else {
                z = false;
            }
            num.LJI(z);
        }
        NUM num2 = this.LIZ.LJI;
        if (num2 != null) {
            if (webView != null) {
                z2 = webView.canGoForward();
            }
            num2.LIZIZ(z2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
    
        if (r7 != null) goto L33;
     */
    @Override // X.InterfaceC60433Nnh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(android.webkit.WebView r5, android.webkit.WebResourceRequest r6, android.webkit.WebResourceError r7) {
        /*
            r4 = this;
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            java.lang.String r0 = "onReceivedError "
            r2.append(r0)
            X.NMZ r0 = r4.LIZ
            X.NMc r0 = r0.LIZ
            r3 = 0
            if (r0 == 0) goto L93
            java.lang.String r0 = r0.LJ
        L12:
            r2.append(r0)
            java.lang.String r0 = " request.url "
            r2.append(r0)
            if (r6 == 0) goto L91
            android.net.Uri r0 = r6.getUrl()
            if (r0 == 0) goto L91
            java.lang.String r0 = r0.toString()
        L26:
            r2.append(r0)
            java.lang.String r0 = " WebView.url "
            r2.append(r0)
            if (r5 == 0) goto L8f
            java.lang.String r0 = r5.getUrl()
        L34:
            r2.append(r0)
            java.lang.String r0 = " request.url is webview.url? "
            r2.append(r0)
            if (r6 == 0) goto L8d
            android.net.Uri r0 = r6.getUrl()
            if (r0 == 0) goto L8d
            java.lang.String r1 = r0.toString()
        L48:
            if (r5 == 0) goto L8b
            java.lang.String r0 = r5.getUrl()
        L4e:
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            r2.append(r0)
            X.X1D.LIZIZ(r2)
            if (r6 == 0) goto L60
            boolean r0 = r6.isForMainFrame()
            if (r0 != 0) goto L61
        L60:
            return
        L61:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L60
            if (r5 == 0) goto L89
            java.lang.String r2 = r5.getUrl()
        L6d:
            if (r7 == 0) goto L85
            java.lang.CharSequence r0 = r7.getDescription()
            if (r0 == 0) goto L85
            java.lang.String r1 = r0.toString()
        L79:
            int r0 = r7.getErrorCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L81:
            r4.LIZJ(r5, r2, r1, r3)
            goto L60
        L85:
            r1 = r3
            if (r7 == 0) goto L81
            goto L79
        L89:
            r2 = r3
            goto L6d
        L8b:
            r0 = r3
            goto L4e
        L8d:
            r1 = r3
            goto L48
        L8f:
            r0 = r3
            goto L34
        L91:
            r0 = r3
            goto L26
        L93:
            r0 = r3
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NUJ.LJ(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceError):void");
    }

    @Override // X.InterfaceC60433Nnh
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        android.net.Uri url;
        android.net.Uri url2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onReceivedHttpError ");
        C59222NMc c59222NMc = this.LIZ.LIZ;
        Integer num = null;
        if (c59222NMc != null) {
            str = c59222NMc.LJ;
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(" request.url ");
        if (webResourceRequest != null && (url2 = webResourceRequest.getUrl()) != null) {
            str2 = url2.toString();
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        LIZ.append(" WebView.url ");
        if (webView != null) {
            str3 = webView.getUrl();
        } else {
            str3 = null;
        }
        LIZ.append(str3);
        LIZ.append(" request?.url is webview.url? ");
        if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null) {
            str4 = url.toString();
        } else {
            str4 = null;
        }
        if (webView != null) {
            str5 = webView.getUrl();
        } else {
            str5 = null;
        }
        LIZ.append(o.LJ(str4, str5));
        X1D.LIZIZ(LIZ);
        if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
            return;
        }
        if (webView != null) {
            str6 = webView.getUrl();
        } else {
            str6 = null;
        }
        if (webResourceResponse != null) {
            str7 = webResourceResponse.getReasonPhrase();
            num = Integer.valueOf(webResourceResponse.getStatusCode());
        } else {
            str7 = null;
        }
        LIZJ(webView, str6, str7, num);
    }

    public final void LIZJ(WebView webView, String str, String str2, Integer num) {
        int i;
        if (webView == null || str == null || !C59303NPf.LIZIZ(this.LIZ.LIZ, str)) {
            return;
        }
        if (num != null) {
            i = num.intValue();
        } else {
            i = 999999;
        }
        N1V n1v = this.LIZ.LIZIZ;
        if (n1v == null) {
            return;
        }
        n1v.LJIILJJIL(str, str2, i, new C59226NMg(this, webView, str, i, str2));
    }

    @Override // X.InterfaceC60433Nnh
    public final void LJFF(WebView webView, int i, String str, String str2) {
        String str3;
        String str4;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("low api onReceivedError ");
        C59222NMc c59222NMc = this.LIZ.LIZ;
        String str5 = null;
        if (c59222NMc != null) {
            str3 = c59222NMc.LJ;
        } else {
            str3 = null;
        }
        YE1.LIZLLL(LIZ, str3, " failingUrl ", str2, " WebView.url ");
        if (webView != null) {
            str4 = webView.getUrl();
        } else {
            str4 = null;
        }
        LIZ.append(str4);
        LIZ.append(" failingUrl is webview.url? ");
        if (webView != null) {
            str5 = webView.getUrl();
        }
        LIZ.append(o.LJ(str2, str5));
        X1D.LIZIZ(LIZ);
        LIZJ(webView, str2, str, Integer.valueOf(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:193:0x03fe, code lost:
    
        if (X.C39366Fcg.LIZIZ(com.bytedance.mt.protector.impl.UriProtector.parse(r12), null, false, r37, r6, r7, true, r2, r1) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0594, code lost:
    
        if (r7.LJIILIIL(r5, r2) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0273, code lost:
    
        if (((X.NTF) r9).LJIIJJI(r37.getContext(), r8, r24, r1, r5, r3, r28, r0) == true) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0250 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x02f1  */
    @Override // X.InterfaceC60433Nnh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJII(android.webkit.WebView r37, java.lang.String r38, android.webkit.WebResourceRequest r39, java.lang.Boolean r40) {
        /*
            Method dump skipped, instructions count: 1596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NUJ.LJII(android.webkit.WebView, java.lang.String, android.webkit.WebResourceRequest, java.lang.Boolean):boolean");
    }
}
