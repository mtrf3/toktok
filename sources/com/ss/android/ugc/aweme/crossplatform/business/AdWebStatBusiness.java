package com.ss.android.ugc.aweme.crossplatform.business;

import X.C00F;
import X.C16880lQ;
import X.C27740Aue;
import X.C2YJ;
import X.C58655N0h;
import X.C58704N2e;
import X.C59137NIv;
import X.C59273NOb;
import X.C59314NPq;
import X.C59484NWe;
import X.C72818Shy;
import X.C75792yF;
import X.C76052yf;
import X.C78983UzD;
import X.F15;
import X.FMX;
import X.NAW;
import X.NJH;
import X.NK2;
import X.NZR;
import Y.AObjectS43S1200000_10;
import Y.AObjectS83S0300000_10;
import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.ad.preload.gecko.GeckoPreloadServiceImpl;
import com.ss.android.ugc.aweme.autofill.AdAutofillService;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.ss.android.ugc.aweme.landpage.survey.AdLandPageSurveyServiceImpl;
import com.ss.android.ugc.aweme.landpage.survey.IAdLandPageSurveyService;
import com.ss.android.ugc.aweme.log.AdWebLogService;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class AdWebStatBusiness extends BusinessService.Business {
    public boolean LIZLLL;
    public boolean LJ;
    public final NK2 LJFF;
    public NJH LJI;

    public final boolean LIZJ() {
        C59273NOb c59273NOb;
        C59314NPq c59314NPq = this.LIZIZ;
        if (c59314NPq == null || (c59273NOb = c59314NPq.LIZIZ) == null || c59273NOb.LIZ <= 0) {
            return false;
        }
        return true;
    }

    public final void LJI() {
        NK2 nk2;
        if (C27740Aue.LIZ(this.LIZ.getContext()) == null || !LIZJ() || (nk2 = this.LJFF) == null) {
            return;
        }
        nk2.LJIIIIZZ();
    }

    public AdWebStatBusiness(C59484NWe c59484NWe) {
        super(c59484NWe);
        new C59137NIv();
        this.LJFF = AdWebLogService.LJFF().LIZJ();
    }

    public static boolean LIZLLL(String str) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "about:blank")) {
            return true;
        }
        return false;
    }

    public static void LJIIIIZZ(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("url", str);
        }
        long currentTimeMillis = System.currentTimeMillis();
        new F15();
        C72818Shy.LIZ(new C76052yf(currentTimeMillis, F15.LIZLLL(hashMap), "ad_webview_load_finish"));
    }

    public void LIZ(String str) {
        String str2;
        String str3;
        Map map;
        if (TextUtils.isEmpty(str) || !str.startsWith("bytedance://log_event_v3")) {
            return;
        }
        try {
            Uri parse = UriProtector.parse(str);
            if ("log_event_v3".equals(parse.getHost()) && !this.LIZLLL) {
                String queryParameter = UriProtector.getQueryParameter(parse, "event");
                JSONObject jSONObject = new JSONObject(UriProtector.getQueryParameter(parse, "params"));
                if (jSONObject.optInt("is_ad_event") == 1) {
                    String optString = jSONObject.optString("tag");
                    String optString2 = jSONObject.optString("value");
                    Map map2 = null;
                    if (jSONObject.has("log_extra")) {
                        str2 = jSONObject.optString("log_extra");
                    } else {
                        str2 = null;
                    }
                    if (jSONObject.has("group_id")) {
                        str3 = jSONObject.optString("group_id");
                    } else {
                        str3 = null;
                    }
                    String optString3 = jSONObject.optString("ad_extra_data");
                    try {
                        Map map3 = (Map) C75792yF.LIZIZ().LJI(jSONObject.toString(), Map.class);
                        try {
                            map = (Map) C75792yF.LIZIZ().LJI(optString3, Map.class);
                        } catch (Exception unused) {
                            map = null;
                        }
                        map2 = map3;
                    } catch (Exception unused2) {
                        map = null;
                    }
                    C58655N0h LJ = C58704N2e.LJ(optString, queryParameter, optString2, str2, str3);
                    LJ.LIZLLL(map2);
                    LJ.LIZ(map);
                    LJ.LJI();
                } else {
                    FMX.LJIILJJIL(queryParameter, jSONObject);
                }
                this.LIZLLL = true;
            }
        } catch (Exception unused3) {
        }
    }

    public final String LIZIZ(C59273NOb c59273NOb, int i) {
        IAdLandPagePreloadService LJJI;
        if (!LIZJ() || (LJJI = AdLandPagePreloadServiceImpl.LJJI()) == null) {
            return null;
        }
        try {
            LJJI.LJJ(C2YJ.LIZIZ.LIZ.getAdLandingPageConfig().getAnalytics());
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
            C16880lQ.LLLLIIL(e);
        }
        String jSONObject = c59273NOb.LJIILL().toString();
        if (c59273NOb.LJJIIJ) {
            return null;
        }
        return LJJI.LIZJ(jSONObject, this.LJFF.LJFF(), c59273NOb.LJJIFFI ? 1 : 0, c59273NOb.LJJL, c59273NOb.LJIIIZ, String.valueOf(c59273NOb.LJJLI), String.valueOf(i), String.valueOf(c59273NOb.LJJJLL), String.valueOf(c59273NOb.LJJIII), this.LIZIZ.LIZ.LIZJ, String.valueOf(c59273NOb.LJJLIIIJ), c59273NOb.LJIJJLI, c59273NOb.LJJLIIIJJIZ);
    }

    public final void LJII(WebView webView, String str, boolean z) {
        int i;
        C59273NOb c59273NOb = this.LIZIZ.LIZIZ;
        if (!LIZJ() || webView == null) {
            return;
        }
        boolean z2 = false;
        if (z) {
            LJIIIIZZ(str);
            C59273NOb c59273NOb2 = this.LIZIZ.LIZIZ;
            c59273NOb2.getClass();
            o.LJIIIZ(str, "<set-?>");
            c59273NOb2.LJJJLZIJ = str;
            this.LIZIZ.LIZIZ.LJJJZ = this.LJFF.LJFF();
            if (C00F.LIZ(31744, 0, "ad_autofill_resource_fetch_scene", true) == 1 && c59273NOb.LJJLIIIJLJLI) {
                AdAutofillService.LJIIIIZZ().LJ();
                GeckoPreloadServiceImpl.LIZIZ().LIZ();
            }
            NAW.LJIIIZ(webView, c59273NOb.LJIILL(), c59273NOb.LJJJJZI, str, c59273NOb);
            NAW.LJII(c59273NOb.LJJLIIIJLJLI);
        }
        IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
        if (LJJI == null) {
            return;
        }
        IAdLandPageSurveyService LJI = AdLandPageSurveyServiceImpl.LJI();
        if (c59273NOb.LJJIFFI && TextUtils.equals(c59273NOb.LJIIIZ, "landing_page")) {
            z2 = true;
        }
        LJI.LIZJ(z2);
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        String LIZIZ = LIZIZ(c59273NOb, i);
        if (!TextUtils.isEmpty(LIZIZ)) {
            webView.evaluateJavascript(LIZIZ, new ValueCallback() { // from class: X.NK3
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                }
            });
        }
        boolean z3 = c59273NOb.LJJIIJ;
        if (!z || z3 || c59273NOb.LJJ != 4 || c59273NOb.LJJI == 0 || this.LJFF.LJFF() != 1) {
            return;
        }
        String LJIJJLI = LJJI.LJIJJLI();
        if (TextUtils.isEmpty(LJIJJLI)) {
            return;
        }
        webView.evaluateJavascript(LJIJJLI.replace("_platform", "true"), new ValueCallback() { // from class: X.NJW
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                String str2 = (String) obj;
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                String replace = str2.replace("\"", "");
                if (TextUtils.isEmpty(replace)) {
                    return;
                }
                NJ2.LJIILLIIL = replace;
            }
        });
    }

    public final void LJ(WebView webView, int i, String str, String str2) {
        NK2 nk2;
        if (LIZJ() && LIZLLL(str) && (nk2 = this.LJFF) != null) {
            nk2.LJIILJJIL(str, str2, i, new AObjectS43S1200000_10(this, webView, str, 0));
            LJIIIIZZ(str);
        }
    }

    public final void LJFF(WebView webView, WebResourceRequest webResourceRequest, String str, int i) {
        if (webView == null || webResourceRequest == null || Build.VERSION.SDK_INT < 23 || !webResourceRequest.isForMainFrame()) {
            return;
        }
        LJ(webView, i, webResourceRequest.getUrl().toString(), str);
    }

    public final void LJIIIZ(boolean z, WebBackForwardList webBackForwardList, NZR nzr, String str) {
        Activity LIZ = C27740Aue.LIZ(this.LIZ.getContext());
        C59273NOb c59273NOb = this.LIZIZ.LIZIZ;
        if (LIZ != null && LIZJ()) {
            if (!z) {
                NK2 nk2 = this.LJFF;
                if (nk2 != null) {
                    nk2.LIZIZ();
                }
                if (!LIZ.isFinishing()) {
                    return;
                }
            }
            NK2 nk22 = this.LJFF;
            if (nk22 != null) {
                nk22.LJIIJJI(webBackForwardList, str, new AObjectS83S0300000_10(this, nzr, c59273NOb, 0));
            }
        }
    }
}
