package X;

import android.webkit.WebResourceResponse;
import com.ss.android.ugc.aweme.ad.experiment.AdLandPageResourceOptimizeExperiment;
import java.io.InputStream;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NJ1 extends O43 {
    public final String LIZIZ;
    public final String LIZJ;
    public final NJ0 LIZLLL;
    public final InterfaceC59138NIw LJ;
    public final AdLandPageResourceOptimizeExperiment.ResourceOptimizeModel LJFF;
    public final C62822Ol8 LJI;
    public JSONObject LJII;

    @Override // X.O43, X.NJM
    public final WebResourceResponse LIZ(String str) {
        return null;
    }

    @Override // X.O43
    public final /* bridge */ /* synthetic */ InputStream LIZIZ(String str) {
        return null;
    }

    @Override // X.O43
    public final String LIZLLL() {
        return "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NJ1(String str, NJ0 resourceDetail, InterfaceC59138NIw interfaceC59138NIw) {
        super(true);
        o.LJIIIZ(resourceDetail, "resourceDetail");
        this.LIZIZ = str;
        this.LIZJ = "feed";
        this.LIZLLL = resourceDetail;
        this.LJ = interfaceC59138NIw;
        this.LJFF = AdLandPageResourceOptimizeExperiment.LIZIZ;
        this.LJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 10));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.webkit.WebResourceResponse LJFF(android.webkit.WebView r12, android.webkit.WebResourceRequest r13, java.lang.String r14, java.lang.String r15) {
        /*
            r11 = this;
            org.json.JSONObject r0 = r11.LJII
            if (r0 != 0) goto L16
            com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService r1 = com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl.LJJI()
            X.Ol8 r0 = r11.LJI
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            org.json.JSONObject r0 = r1.LJIILL(r0)
            r11.LJII = r0
        L16:
            com.ss.android.ugc.aweme.ad.experiment.AdLandPageResourceOptimizeExperiment$ResourceOptimizeModel r0 = r11.LJFF
            boolean r0 = r0.enablePreConnect
            r3 = 1
            if (r0 != 0) goto Lad
        L1d:
            X.NIy r1 = X.EnumC59140NIy.NONE
        L1f:
            X.NJ0 r0 = r11.LIZLLL
            r0.LIZ(r14, r15, r1)
            r5 = r12
            if (r5 != 0) goto L29
        L27:
            r0 = 0
        L28:
            return r0
        L29:
            com.ss.android.ugc.aweme.ad.experiment.AdLandPageResourceOptimizeExperiment$ResourceOptimizeModel r0 = r11.LJFF
            boolean r0 = r0.enableTTNetAgency
            if (r0 != 0) goto L30
            goto L27
        L30:
            com.ss.android.ugc.aweme.realtime.IAdLandPageRealtimeResourceModule r0 = com.ss.android.ugc.aweme.web.realtimeres.AdLandPageRealtimeResourceModule.LJFF()
            java.util.Set r2 = r0.LJ()
            java.lang.String r1 = X.C35998EAw.LIZIZ(r14)
            if (r1 == 0) goto L27
            boolean r0 = ujb.o.LJJJJJL(r1)
            if (r0 == 0) goto L45
            goto L27
        L45:
            boolean r0 = r2.contains(r1)
            if (r0 != 0) goto L4c
            goto L27
        L4c:
            java.util.Map r2 = r13.getRequestHeaders()
            java.lang.String r3 = "request.requestHeaders"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r3)
            java.lang.String r1 = "Sec-Fetch-Site"
            java.lang.Object r0 = r2.get(r1)
            if (r0 != 0) goto L62
            java.lang.String r0 = "none"
            r2.put(r1, r0)
        L62:
            java.util.Map r2 = r13.getRequestHeaders()
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r3)
            java.lang.String r1 = "Sec-Fetch-Mode"
            java.lang.Object r0 = r2.get(r1)
            if (r0 != 0) goto L76
            java.lang.String r0 = "navigate"
            r2.put(r1, r0)
        L76:
            com.ss.android.ugc.aweme.compliance.sandbox.api.webview.IWebViewTTNetHandler r4 = com.ss.android.ugc.aweme.compliance.sandbox.webview.WebViewTTNetHandlerImp.LIZIZ()
            boolean r6 = r13.isForMainFrame()
            java.lang.String r7 = r13.getMethod()
            java.lang.String r0 = "request.method"
            kotlin.jvm.internal.o.LJIIIIZZ(r7, r0)
            android.net.Uri r8 = r13.getUrl()
            java.lang.String r0 = "request.url"
            kotlin.jvm.internal.o.LJIIIIZZ(r8, r0)
            java.util.Map r9 = r13.getRequestHeaders()
            kotlin.jvm.internal.o.LJIIIIZZ(r9, r3)
            X.EiT r10 = X.EnumC37177EiT.RESOURCE_INTERCEPT
            X.Dz7 r1 = r4.LIZ(r5, r6, r7, r8, r9, r10)
            if (r1 == 0) goto L27
            android.net.Uri r0 = r13.getUrl()
            java.lang.String r0 = r0.toString()
            android.webkit.WebResourceResponse r0 = r1.LIZ(r0)
            goto L28
        Lad:
            android.net.Uri r2 = com.bytedance.mt.protector.impl.UriProtector.parse(r14)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = r2.getScheme()
            r1.append(r0)
            java.lang.String r0 = "://"
            r1.append(r0)
            java.lang.String r0 = r2.getHost()
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            org.json.JSONObject r0 = r11.LJII
            if (r0 == 0) goto L1d
            boolean r0 = r0.has(r1)
            if (r0 != r3) goto L1d
            X.NIy r1 = X.EnumC59140NIy.DOMAIN
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJ1.LJFF(android.webkit.WebView, android.webkit.WebResourceRequest, java.lang.String, java.lang.String):android.webkit.WebResourceResponse");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.webkit.WebResourceResponse LJI(java.lang.String r10, java.lang.String r11, java.lang.String r12, X.InterfaceC65784Pro<? extends X.OSZ<? extends android.webkit.WebResourceResponse, java.lang.Boolean>> r13) {
        /*
            r9 = this;
            com.ss.android.ugc.aweme.ad.experiment.AdLandPageResourceOptimizeExperiment$ResourceOptimizeModel r0 = r9.LJFF
            boolean r0 = r0.enablePrefetch
            r2 = 1
            if (r0 != 0) goto L20
        L7:
            r1 = 0
        L8:
            r8 = 0
            if (r1 != 0) goto L3c
            X.NIw r0 = r9.LJ
            int r0 = r0.LJIIIZ()
            if (r0 != r2) goto L1f
            X.NIw r0 = r9.LJ
            java.lang.String r0 = r0.LJII()
            boolean r0 = kotlin.jvm.internal.o.LJ(r10, r0)
            if (r0 != 0) goto L3c
        L1f:
            return r8
        L20:
            java.lang.String r1 = X.C35998EAw.LIZ(r10)
            X.NJ0 r0 = r9.LIZLLL
            X.OSZ r0 = r0.LIZJ(r10, r1, r11)
            if (r0 != 0) goto L2d
            goto L7
        L2d:
            java.lang.Object r0 = r0.getSecond()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 2
            if (r1 != r0) goto L7
            r1 = 1
            goto L8
        L3c:
            java.lang.Object r2 = r13.invoke()
            X.OSZ r2 = (X.OSZ) r2
            if (r2 != 0) goto L45
            return r8
        L45:
            if (r1 == 0) goto L64
            java.lang.Object r0 = r2.getSecond()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L61
            X.NIy r1 = X.EnumC59140NIy.HITPREFETCH
        L55:
            X.NJ0 r0 = r9.LIZLLL
            r0.LIZ(r10, r12, r1)
        L5a:
            java.lang.Object r0 = r2.getFirst()
            android.webkit.WebResourceResponse r0 = (android.webkit.WebResourceResponse) r0
            return r0
        L61:
            X.NIy r1 = X.EnumC59140NIy.PREFETCH
            goto L55
        L64:
            com.ss.android.ugc.aweme.log.AdWebEventLoger r3 = new com.ss.android.ugc.aweme.log.AdWebEventLoger
            r3.<init>()
            X.N1l r0 = X.C58685N1l.LIZ
            r0.getClass()
            X.N0f r4 = X.C58685N1l.LJJJJLL
            X.NIw r0 = r9.LJ
            long r0 = r0.LJFF()
            java.lang.String r5 = java.lang.String.valueOf(r0)
            X.NIw r0 = r9.LJ
            java.lang.String r6 = r0.LJIIL()
            java.lang.String r7 = "0"
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r0 = "creativeId"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            r3.LJJIIJZLJL(r4, r5, r6, r7, r8)
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJ1.LJI(java.lang.String, java.lang.String, java.lang.String, X.Pro):android.webkit.WebResourceResponse");
    }
}
