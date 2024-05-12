package com.ss.android.ugc.aweme.crossplatform.business;

import X.C38281F0r;
import X.C59314NPq;
import X.C59484NWe;
import X.C61861OPp;
import X.C65661Ppp;
import X.FMX;
import X.NZR;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes11.dex */
public abstract class AbsShareBusiness extends BusinessService.Business {
    public WebSharePackage LIZLLL;
    public final List<String> LJ;
    public List<Object> LJFF;
    public String LJI;
    public String LJII;
    public C61861OPp LJIIIIZZ;
    public NZR LJIIIZ;

    public void LIZJ() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsShareBusiness(C59484NWe crossPlatformBusiness) {
        super(crossPlatformBusiness);
        String str;
        o.LJIIIZ(crossPlatformBusiness, "crossPlatformBusiness");
        this.LJ = C65661Ppp.LIZIZ("copylink", "qrcode", "browser", "refresh");
        C59314NPq c59314NPq = this.LIZIZ;
        String str2 = c59314NPq.LIZ.LIZJ;
        if (c59314NPq.LIZIZ.LIZ != 0 && str2 != null && !s.LJJJLZIJ(str2, "is_ad_landing_page=1", false)) {
            C38281F0r c38281F0r = new C38281F0r(str2);
            c38281F0r.LIZ(1, "is_ad_landing_page");
            str = c38281F0r.toString();
        } else {
            str = this.LIZIZ.LIZ.LIZJ;
        }
        this.LJI = str;
    }

    public final void LIZIZ(String str) {
        String str2;
        String str3;
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "h5_page");
        hashMap.put("platform", str);
        hashMap.put("previous_page", this.LIZIZ.LIZ.LJFF);
        String str4 = "";
        if (TextUtils.isEmpty(this.LIZIZ.LIZ.LJ)) {
            str2 = "";
        } else {
            str2 = this.LIZIZ.LIZ.LJ;
        }
        hashMap.put("group_id", str2);
        if (!TextUtils.isEmpty(this.LIZIZ.LIZ.LJ)) {
            str4 = "article";
        }
        hashMap.put("webview_type", str4);
        WebSharePackage webSharePackage = this.LIZLLL;
        if (webSharePackage != null) {
            o.LJI(webSharePackage);
            if (!TextUtils.isEmpty(webSharePackage.url)) {
                WebSharePackage webSharePackage2 = this.LIZLLL;
                o.LJI(webSharePackage2);
                str3 = webSharePackage2.url;
                hashMap.put("url", str3);
                FMX.LJIIL("h5_share", hashMap);
            }
        }
        str3 = this.LJI;
        hashMap.put("url", str3);
        FMX.LJIIL("h5_share", hashMap);
    }

    public static String LIZ(String str, JSONObject jSONObject) {
        String optString = jSONObject.optString(str);
        if (optString == null || TextUtils.equals(optString, "null")) {
            return null;
        }
        return optString;
    }
}
