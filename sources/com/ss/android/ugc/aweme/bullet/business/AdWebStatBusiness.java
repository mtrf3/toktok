package com.ss.android.ugc.aweme.bullet.business;

import X.C34174Db8;
import X.C58655N0h;
import X.C58704N2e;
import X.C58909NAb;
import X.C59299NPb;
import X.C59300NPc;
import X.C59304NPg;
import X.C59472NVs;
import X.C59478NVy;
import X.C60601NqP;
import X.C78983UzD;
import X.FMX;
import X.InterfaceC59085NGv;
import X.N5S;
import X.NH3;
import X.NOV;
import X.NP0;
import X.NP1;
import X.NU7;
import X.VMI;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class AdWebStatBusiness extends BulletBusinessService.Business {
    public final C59299NPb LIZIZ;
    public long LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final ArrayList<Integer> LJI;
    public long LJII;
    public boolean LJIIIIZZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v2, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    public final JSONObject LJI() {
        NP1 np1;
        String str;
        String str2;
        ?? r3;
        NP1 np12;
        String str3;
        try {
            C59472NVs c59472NVs = this.LIZ.LIZIZ;
            if (c59472NVs instanceof NP1) {
                np1 = (NP1) c59472NVs;
            } else {
                np1 = null;
            }
            str = "";
            if (np1 == null || (str2 = (String) np1.LJLLI.getValue()) == null) {
                str2 = "";
            }
            if (!TextUtils.isEmpty(str2)) {
                C59472NVs c59472NVs2 = this.LIZ.LIZIZ;
                if (c59472NVs2 instanceof NP1) {
                    np12 = (NP1) c59472NVs2;
                } else {
                    np12 = null;
                }
                if (np12 == null || (str3 = (String) np12.LJLLI.getValue()) == null) {
                    str3 = "";
                }
                r3 = new JSONObject(str3);
            } else {
                r3 = new JSONObject();
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            C59472NVs c59472NVs3 = this.LIZ.LIZIZ;
            r4 = c59472NVs3 instanceof NP1 ? (NP1) c59472NVs3 : null;
            if (r4 != null) {
                str = r4.LJII();
            }
            r3.put("log_extra", str);
            return r3;
        } catch (Exception e2) {
            e = e2;
            r4 = r3;
            C78983UzD.LJIIZILJ(e);
            return r4;
        }
    }

    static {
        new ConcurrentHashMap();
    }

    public final long LJ() {
        NP1 np1;
        NP0 np0;
        Long value;
        C59472NVs c59472NVs = this.LIZ.LIZIZ;
        if ((c59472NVs instanceof NP1) && (np1 = (NP1) c59472NVs) != null && (np0 = np1.LJJZ) != null && (value = np0.getValue()) != null) {
            return value.longValue();
        }
        return 0L;
    }

    public final String LJFF() {
        C59472NVs c59472NVs = this.LIZ.LIZIZ;
        String str = null;
        if (c59472NVs == null || !(c59472NVs instanceof NP1)) {
            return null;
        }
        NP1 np1 = (NP1) c59472NVs;
        String str2 = (String) np1.LJLLJ.getValue();
        if (TextUtils.isEmpty(str2)) {
            Long value = np1.LJJZ.getValue();
            if (value != null) {
                str = value.toString();
            }
            return str;
        }
        return str2;
    }

    public final int LJII() {
        C59472NVs c59472NVs = this.LIZ.LIZIZ;
        if (c59472NVs != null && (c59472NVs instanceof NP1)) {
            return ((NP1) c59472NVs).LLIFFJFJJ;
        }
        return 0;
    }

    public final String LJIIIIZZ() {
        C59304NPg c59304NPg;
        C59472NVs c59472NVs = this.LIZ.LIZIZ;
        if ((c59472NVs instanceof C59304NPg) && (c59304NPg = (C59304NPg) c59472NVs) != null) {
            return c59304NPg.LJFF();
        }
        return "";
    }

    public final int LJIIIZ() {
        C59304NPg c59304NPg;
        Integer value;
        C59472NVs c59472NVs = this.LIZ.LIZIZ;
        if (c59472NVs instanceof C59304NPg) {
            c59304NPg = (C59304NPg) c59472NVs;
        } else {
            c59304NPg = null;
        }
        if (c59304NPg == null || (value = c59304NPg.LJJLIIIJLLLLLLLZ.getValue()) == null) {
            return 0;
        }
        return value.intValue();
    }

    public final void LIZJ() {
        this.LIZJ = System.currentTimeMillis();
        this.LIZLLL = false;
        this.LJ = false;
        this.LJFF = false;
        C59299NPb c59299NPb = this.LIZIZ;
        c59299NPb.LJIIIIZZ = false;
        c59299NPb.LIZLLL = false;
        c59299NPb.LJ = false;
        c59299NPb.LJI = null;
        c59299NPb.LIZIZ = 0L;
        c59299NPb.LIZ = 0L;
        c59299NPb.LJIIIZ = false;
        c59299NPb.LJIIJ = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdWebStatBusiness(N5S bulletBusiness) {
        super(bulletBusiness);
        o.LJIIIZ(bulletBusiness, "bulletBusiness");
        this.LIZIZ = new C59299NPb();
        this.LJI = new ArrayList<>();
    }

    public final void LIZIZ(String str) {
        C59472NVs c59472NVs;
        if (!TextUtils.isEmpty(str)) {
            if ((str != null && !ujb.o.LJJJLIIL(str, "bytedance://log_event_v3", false)) || (c59472NVs = this.LIZ.LIZIZ) == null || !(c59472NVs instanceof NP1)) {
                return;
            }
            try {
                Uri parse = UriProtector.parse(str);
                if (o.LJ("log_event_v3", parse.getHost()) && !this.LJ) {
                    FMX.LJIILLIIL(UriProtector.getQueryParameter(parse, "event"), new JSONObject(UriProtector.getQueryParameter(parse, "params")));
                    this.LJ = true;
                }
            } catch (Exception e) {
                C78983UzD.LJIIZILJ(e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ec A[LOOP:0: B:26:0x00e6->B:28:0x00ec, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(boolean r18) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness.LJIILJJIL(boolean):void");
    }

    public final void LIZ(WebView webView, String str) {
        boolean z;
        C59299NPb c59299NPb = this.LIZIZ;
        long LJ = LJ();
        JSONObject LJI = LJI();
        JSONObject LIZLLL = LIZLLL(null, null);
        int LJII = LJII();
        c59299NPb.getClass();
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (c59299NPb.LJI == null) {
            c59299NPb.LJI = c59299NPb.LJFF;
        }
        if (!TextUtils.isEmpty(webView.getOriginalUrl()) && !TextUtils.equals(webView.getOriginalUrl(), str) && !c59299NPb.LIZLLL) {
            z = true;
        } else {
            z = false;
        }
        c59299NPb.LIZJ = z;
        if (LJ > 0) {
            if (LJI == null) {
                LJI = new JSONObject();
            }
            try {
                LJI.put("is_ad_event", "1");
                LJI.put("tag", "draw_ad");
                if (LIZLLL == null) {
                    LIZLLL = new JSONObject();
                }
                LIZLLL.put("present_url", c59299NPb.LJI);
                LIZLLL.put("next_url", str);
                LIZLLL.put("container_type", "bullet");
                LIZLLL.put("landing_page_style", LJII);
                LJI.put("ad_extra_data", LIZLLL.toString());
            } catch (JSONException e) {
                C78983UzD.LJIIZILJ(e);
            }
            C58655N0h LJ2 = C58704N2e.LJ("ad_wap_stat", "jump_page", String.valueOf(LJ), "", CardStruct.IStatusCode.DEFAULT);
            Iterator<String> keys = LJI.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                LJ2.LIZJ(LJI.opt(next), next);
            }
            LJ2.LJI();
        }
        c59299NPb.LJI = str;
    }

    public final JSONObject LIZLLL(Integer num, String str) {
        Integer num2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_web_url", LJIIIZ());
            IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
            if (LJJI != null) {
                LJIIIIZZ();
                LJJI.LJIJ();
                num2 = 2;
            } else {
                num2 = null;
            }
            jSONObject.put("landing_type", num2);
            if (!TextUtils.isEmpty(LJIIIIZZ()) && LJIIIZ() == 1) {
                jSONObject.put("channel_name", LJIIIIZZ());
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("fail_reason", str);
            }
            if (num != null && num.intValue() != 999999999) {
                jSONObject.put("error_code", num.intValue());
            }
            return jSONObject;
        } catch (JSONException e) {
            C78983UzD.LJIIZILJ(e);
            return null;
        }
    }

    public final void LJIIJ(WebView webView, String str) {
        Long value;
        C59299NPb c59299NPb = this.LIZIZ;
        long LJ = LJ();
        JSONObject LJI = LJI();
        JSONObject LIZLLL = LIZLLL(null, null);
        int LJII = LJII();
        boolean LIZ = C34174Db8.LIZ();
        c59299NPb.getClass();
        int i = 1;
        if (!TextUtils.isEmpty(str) && !c59299NPb.LIZJ && !c59299NPb.LIZLLL) {
            c59299NPb.LIZIZ = System.currentTimeMillis();
            c59299NPb.LIZLLL = true;
            c59299NPb.LIZIZ(str, LJ, LJI, LIZLLL, LJII, LIZ ? 1 : 0);
        }
        C59472NVs c59472NVs = this.LIZ.LIZIZ;
        if (c59472NVs != null && (c59472NVs instanceof NP1)) {
            NP1 np1 = (NP1) c59472NVs;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("cid", np1.LJJZ.getValue());
                jSONObject.put("ad_type", np1.LJJZZIII.getValue());
                jSONObject.put("log_extra", np1.LJLJLLL.getValue());
                jSONObject.put("download_url", np1.LJLJJL.getValue());
                jSONObject.put("package_name", np1.LJLJL.getValue());
                jSONObject.put("app_name", np1.LJLJJLL.getValue());
                Long value2 = np1.LJJZ.getValue();
                if (value2 == null || value2.longValue() == 0) {
                    i = 0;
                }
                jSONObject.put("code", i);
            } catch (Throwable th) {
                C78983UzD.LJIIZILJ(th);
            }
            o.LJIIIIZZ(jSONObject.toString(), "it.getAdInfoMethodObj().toString()");
            if (webView != null && (value = np1.LJJZ.getValue()) != null) {
                value.longValue();
            }
        }
    }

    public final void LJIIJJI(WebView webView, String str) {
        String str2;
        String str3;
        boolean z;
        C59478NVy c59478NVy;
        if (!this.LJIIIIZZ) {
            this.LJIIIIZZ = true;
            VMI vmi = VMI.LJ;
            vmi.getClass();
            C60601NqP c60601NqP = new C60601NqP();
            c60601NqP.LJ = true;
            c60601NqP.LIZ = new String[]{WebView.class.getName()};
            c60601NqP.LJII = new C59300NPc(this);
            vmi.LJIILJJIL(c60601NqP);
            vmi.LIZLLL.getClass();
        }
        this.LJI.clear();
        C59299NPb c59299NPb = this.LIZIZ;
        NOV nov = this.LIZ.LIZJ;
        if (nov == null || (c59478NVy = nov.LJLJI) == null || (str2 = (String) c59478NVy.getValue()) == null) {
            str2 = "";
        }
        c59299NPb.getClass();
        if (webView != null && !TextUtils.isEmpty(str)) {
            if (c59299NPb.LJIIIZ && !c59299NPb.LIZLLL) {
                z = true;
            } else {
                z = false;
            }
            if (c59299NPb.LJFF == null) {
                c59299NPb.LJFF = str;
            }
            if (c59299NPb.LIZ == 0) {
                c59299NPb.LIZ = System.currentTimeMillis();
            }
            c59299NPb.LJII = str2;
            c59299NPb.LJIIIZ = true;
            c59299NPb.LJIIIIZZ = false;
            if (!z) {
                c59299NPb.LJIIJ++;
            }
            if (c59299NPb.LJIIJ == 2) {
                c59299NPb.LIZLLL = false;
            }
        }
        C59472NVs c59472NVs = this.LIZ.LIZIZ;
        if (c59472NVs != null && (c59472NVs instanceof NP1)) {
            if (!o.LJ(str, "about:blank") && !this.LJFF) {
                C58909NAb.LIZ.getClass();
                if (NH3.LIZ() != null) {
                    NP1 np1 = (NP1) c59472NVs;
                    np1.LJFF();
                    np1.LJJL.getValue();
                    np1.LJI();
                    LJIIIZ();
                    np1.LJII();
                    LJFF();
                    Boolean value = np1.LJJLJ.getValue();
                    if (value != null) {
                        value.booleanValue();
                    }
                }
                this.LJFF = true;
            }
            try {
                C58909NAb.LIZ.getClass();
                InterfaceC59085NGv LIZJ = NH3.LIZJ();
                if (LIZJ != null) {
                    str3 = NU7.LJIIJ();
                } else {
                    str3 = null;
                }
                IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
                if (LJJI != null) {
                    LJJI.LJJ(str3);
                }
            } catch (Exception e) {
                C78983UzD.LJIIZILJ(e);
            }
        }
    }

    public final void LJIILIIL(WebView webView, int i) {
        o.LJIIIZ(webView, "webView");
        if (i > 10) {
            if (!this.LJI.contains(10)) {
                this.LJI.add(10);
                this.LIZIZ.LIZ(webView.getContext(), webView.getUrl(), LJ(), LJFF(), LJI(), LIZLLL(null, null), 10, LJII());
            }
            if (i > 30) {
                if (!this.LJI.contains(30)) {
                    this.LJI.add(30);
                    this.LIZIZ.LIZ(webView.getContext(), webView.getUrl(), LJ(), LJFF(), LJI(), LIZLLL(null, null), 30, LJII());
                }
                if (i > 50) {
                    if (!this.LJI.contains(50)) {
                        this.LJI.add(50);
                        this.LIZIZ.LIZ(webView.getContext(), webView.getUrl(), LJ(), LJFF(), LJI(), LIZLLL(null, null), 50, LJII());
                    }
                    if (i > 75) {
                        if (!this.LJI.contains(75)) {
                            this.LJI.add(75);
                            this.LIZIZ.LIZ(webView.getContext(), webView.getUrl(), LJ(), LJFF(), LJI(), LIZLLL(null, null), 75, LJII());
                        }
                        if (i == 100 && !this.LJI.contains(100)) {
                            this.LJI.add(100);
                            this.LIZIZ.LIZ(webView.getContext(), webView.getUrl(), LJ(), LJFF(), LJI(), LIZLLL(null, null), 100, LJII());
                        }
                    }
                }
            }
        }
    }

    public final void LJIIL(Integer num, String str, String str2) {
        int i;
        C59299NPb c59299NPb = this.LIZIZ;
        long LJ = LJ();
        JSONObject LJI = LJI();
        JSONObject LIZLLL = LIZLLL(num, str2);
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        int LJII = LJII();
        c59299NPb.LJ = true;
        c59299NPb.LJIIJJI = str2;
        c59299NPb.LJIIL = i;
        c59299NPb.LIZIZ(str, LJ, LJI, LIZLLL, LJII, 0);
    }
}
