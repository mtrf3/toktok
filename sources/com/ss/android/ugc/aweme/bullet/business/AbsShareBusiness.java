package com.ss.android.ugc.aweme.bullet.business;

import X.C61862OPq;
import X.C65661Ppp;
import X.FMX;
import X.N5S;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.bullet.business.BulletBusinessService;
import com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class AbsShareBusiness extends BulletBusinessService.Business {
    public List<Object> LIZIZ;
    public WebSharePackage LIZJ;
    public final List<String> LIZLLL;
    public String LJ;
    public boolean LJFF;
    public String LJI;
    public final C61862OPq LJII;

    public abstract void LIZJ();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsShareBusiness(N5S bulletBusiness) {
        super(bulletBusiness);
        o.LJIIIZ(bulletBusiness, "bulletBusiness");
        this.LIZLLL = C65661Ppp.LIZIZ("copylink", "qrcode", "browser", "refresh");
        this.LJII = new C61862OPq(this);
    }

    public final void LIZIZ(String channelKey) {
        String str;
        o.LJIIIZ(channelKey, "channelKey");
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "h5_page");
        hashMap.put("platform", channelKey);
        String str2 = "";
        hashMap.put("previous_page", "");
        hashMap.put("group_id", "");
        String str3 = null;
        if (TextUtils.isEmpty(null)) {
            str = "";
        } else {
            str = "article";
        }
        hashMap.put("webview_type", str);
        WebSharePackage webSharePackage = this.LIZJ;
        if (webSharePackage != null) {
            str3 = webSharePackage.url;
        }
        if (TextUtils.isEmpty(str3)) {
            String str4 = this.LJ;
            if (str4 != null) {
                str2 = str4;
            }
        } else {
            WebSharePackage webSharePackage2 = this.LIZJ;
            o.LJI(webSharePackage2);
            str2 = webSharePackage2.url;
        }
        hashMap.put("url", str2);
        FMX.LJIIL("h5_share", hashMap);
    }

    public static String LIZ(String str, JSONObject jSONObject) {
        String optString;
        if (jSONObject == null || (optString = jSONObject.optString(str)) == null || TextUtils.equals(optString, "null")) {
            return null;
        }
        return optString;
    }
}
