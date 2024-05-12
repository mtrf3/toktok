package X;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ad.preload.gecko.GeckoPreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.prerender.IPreRenderLandPageModule;
import com.ss.android.ugc.aweme.ad.prerender.PreRenderWebViewManager;
import com.ss.android.ugc.aweme.feed.model.AutofillModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.landpage.survey.AdLandPageSurveyServiceImpl;
import com.ss.android.ugc.aweme.landpage.survey.IAdLandPageSurveyService;
import com.ss.android.ugc.aweme.web.experiment.WebViewXRequestedWithExperiment;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NJX {
    public static boolean LIZ;

    public static void LIZ(String url, java.util.Map map) {
        List<String> list;
        o.LJIIIZ(url, "url");
        String host = UriProtector.parse(url).getHost();
        WebViewXRequestedWithExperiment.WebViewXRequestedWithConfig LIZ2 = WebViewXRequestedWithExperiment.LIZ();
        List<String> list2 = LIZ2.hostList;
        if (list2 != null && !list2.isEmpty() && (list = LIZ2.hostList) != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(host, it.next())) {
                    map.put("x-requested-with", LIZ2.xRequestedWith);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        if (r1 == null) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.NMZ r17, android.webkit.WebView r18, int r19) {
        /*
            java.lang.String r0 = "adWebViewExtension"
            r3 = r17
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            X.NMc r2 = r3.LIZ
            r16 = 0
            if (r2 != 0) goto L16
        Ld:
            java.lang.String r1 = ""
        Lf:
            int r0 = r1.length()
            if (r0 != 0) goto L8c
            return
        L16:
            com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService r4 = com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl.LJJI()
            if (r4 != 0) goto L1d
            goto Ld
        L1d:
            X.2YJ r0 = X.C2YJ.LIZIZ     // Catch: java.lang.Exception -> L32
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r0 = r0.LIZ     // Catch: java.lang.Exception -> L32
            com.ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig r0 = r0.getAdLandingPageConfig()     // Catch: java.lang.Exception -> L32
            java.lang.String r1 = r0.getAnalytics()     // Catch: java.lang.Exception -> L32
            java.lang.String r0 = "get().getAdLandingPageConfig().getAnalytics()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Exception -> L32
            r4.LJJ(r1)     // Catch: java.lang.Exception -> L32
            goto L39
        L32:
            r0 = move-exception
            X.C78983UzD.LJIIZILJ(r0)
            X.C16880lQ.LLLLIIL(r0)
        L39:
            org.json.JSONObject r0 = r2.LJIILL()
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "adWebModel.getAdInfoMethodObj().toString()"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)
            X.N1V r0 = r3.LIZIZ
            if (r0 == 0) goto L8a
            int r6 = r0.LIZIZ
        L4c:
            boolean r7 = r2.LJIIL
            java.lang.String r8 = r2.LJIIJ
            java.lang.String r9 = r2.LJ
            long r0 = r2.LJIILIIL
            java.lang.String r10 = java.lang.String.valueOf(r0)
            java.lang.String r11 = java.lang.String.valueOf(r19)
            int r0 = r2.LJIIJJI
            java.lang.String r12 = java.lang.String.valueOf(r0)
            int r0 = r2.LJIIIIZZ
            java.lang.String r13 = java.lang.String.valueOf(r0)
            java.lang.String r14 = r2.LIZJ
            int r0 = r2.LJIIZILJ
            java.lang.String r15 = java.lang.String.valueOf(r0)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r2.LIZ
            if (r0 == 0) goto L78
            java.lang.String r16 = r0.getChannelName()
        L78:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r2.LIZ
            if (r0 == 0) goto L87
            int r17 = r0.getPreloadH5Type()
        L80:
            java.lang.String r1 = r4.LIZJ(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r1 != 0) goto Lf
            goto Ld
        L87:
            r17 = 0
            goto L80
        L8a:
            r6 = 0
            goto L4c
        L8c:
            r2 = r18
            if (r2 == 0) goto L95
            X.NJY<T> r0 = X.NJY.LIZ
            r2.evaluateJavascript(r1, r0)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJX.LIZJ(X.NMZ, android.webkit.WebView, int):void");
    }

    public static final void LIZIZ(NMZ adWebViewExtension, WebView webView, String str, boolean z, int i, String str2) {
        boolean z2;
        String str3;
        C59222NMc c59222NMc;
        int i2;
        boolean z3;
        AutofillModel autofillModel;
        String str4 = str2;
        o.LJIIIZ(adWebViewExtension, "adWebViewExtension");
        if (webView == null || str == null) {
            return;
        }
        NJZ njz = adWebViewExtension.LJIIJ;
        int i3 = 1;
        if (njz != null) {
            njz.LIZ(true);
        }
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("url", str);
        }
        long currentTimeMillis = System.currentTimeMillis();
        new F15();
        C72818Shy.LIZ(new C76052yf(currentTimeMillis, F15.LIZLLL(hashMap), "ad_webview_load_finish"));
        if (z && (c59222NMc = adWebViewExtension.LIZ) != null) {
            c59222NMc.LJIILL = str;
            N1V n1v = adWebViewExtension.LIZIZ;
            if (n1v != null) {
                i2 = n1v.LIZIZ;
            } else {
                i2 = 1;
            }
            c59222NMc.LJIILLIIL = i2;
            if (C00F.LIZ(31744, 0, "ad_autofill_resource_fetch_scene", true) == 1 && c59222NMc.LIZ()) {
                C38995FSd.LIZIZ().submit(RunnableC59084NGu.LJLIL);
                GeckoPreloadServiceImpl.LIZIZ().LIZ();
            }
            NAW.LJIIIZ(webView, c59222NMc.LJIILL(), c59222NMc.LJIIIZ, str, c59222NMc);
            AwemeRawAd awemeRawAd = c59222NMc.LIZ;
            if (awemeRawAd != null && (autofillModel = awemeRawAd.getAutofillModel()) != null) {
                z3 = autofillModel.getEnable();
            } else {
                z3 = false;
            }
            NAW.LJII(z3);
        }
        IAdLandPageSurveyService LJI = AdLandPageSurveyServiceImpl.LJI();
        C59222NMc c59222NMc2 = adWebViewExtension.LIZ;
        if (c59222NMc2 != null) {
            z2 = c59222NMc2.LIZIZ();
        } else {
            z2 = false;
        }
        LJI.LIZJ(z2);
        C59222NMc c59222NMc3 = adWebViewExtension.LIZ;
        if (c59222NMc3 != null && (str3 = c59222NMc3.LIZJ) != null && (!C78685UuP.LJJJZ(str3) || !o.LJ(str3, "about:blank"))) {
            IPreRenderLandPageModule LIZ2 = PreRenderWebViewManager.LIZ();
            String valueOf = String.valueOf(c59222NMc3.LJFF());
            if (str4 == null) {
                str4 = "";
            }
            LIZ2.LLLLII(i, valueOf, str3, str4, c59222NMc3.LJIIJ, z);
        }
        if (!z) {
            i3 = 2;
        }
        LIZJ(adWebViewExtension, webView, i3);
    }
}
