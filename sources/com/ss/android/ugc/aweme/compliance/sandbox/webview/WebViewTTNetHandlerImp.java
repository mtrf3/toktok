package com.ss.android.ugc.aweme.compliance.sandbox.webview;

import X.C58096Mr6;
import com.ss.android.ugc.aweme.compliance.sandbox.api.webview.IWebViewTTNetHandler;

/* loaded from: classes7.dex */
public final class WebViewTTNetHandlerImp implements IWebViewTTNetHandler {
    public static IWebViewTTNetHandler LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IWebViewTTNetHandler.class, false);
        if (LIZ != null) {
            return (IWebViewTTNetHandler) LIZ;
        }
        if (C58096Mr6.h == null) {
            synchronized (IWebViewTTNetHandler.class) {
                if (C58096Mr6.h == null) {
                    C58096Mr6.h = new WebViewTTNetHandlerImp();
                }
            }
        }
        return C58096Mr6.h;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (r1.equals("HEAD") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r1.equals("GET") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r1.equals("OPTIONS") != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
    
        if (r1.equals("DELETE") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        return X.C37794EsQ.LJ(r11, r12, r13, r14, r15, null, false, r16);
     */
    @Override // com.ss.android.ugc.aweme.compliance.sandbox.api.webview.IWebViewTTNetHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C35661Dz7 LIZ(android.webkit.WebView r11, boolean r12, java.lang.String r13, android.net.Uri r14, java.util.Map<java.lang.String, java.lang.String> r15, X.EnumC37177EiT r16) {
        /*
            r10 = this;
            java.lang.String r0 = "webView"
            r2 = r11
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            java.lang.String r0 = "from"
            r9 = r16
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.util.Locale r0 = java.util.Locale.ROOT
            r4 = r13
            java.lang.String r1 = r4.toUpperCase(r0)
            java.lang.String r0 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -531492226: goto L3d;
                case 70454: goto L34;
                case 2213344: goto L2b;
                case 2012838315: goto L22;
                default: goto L20;
            }
        L20:
            r0 = 0
        L21:
            return r0
        L22:
            java.lang.String r0 = "DELETE"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L45
            goto L20
        L2b:
            java.lang.String r0 = "HEAD"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L45
            goto L20
        L34:
            java.lang.String r0 = "GET"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L45
            goto L20
        L3d:
            java.lang.String r0 = "OPTIONS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L20
        L45:
            r7 = 0
            r8 = 0
            r3 = r12
            r5 = r14
            r6 = r15
            X.Dz7 r0 = X.C37794EsQ.LJ(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.sandbox.webview.WebViewTTNetHandlerImp.LIZ(android.webkit.WebView, boolean, java.lang.String, android.net.Uri, java.util.Map, X.EiT):X.Dz7");
    }
}
