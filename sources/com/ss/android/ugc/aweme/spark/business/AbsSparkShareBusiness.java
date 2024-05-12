package com.ss.android.ugc.aweme.spark.business;

import X.AbstractC37353ElJ;
import X.C61863OPr;
import X.C61868OPw;
import X.C65661Ppp;
import X.FMX;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.share.improve.pkg.WebSharePackage;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class AbsSparkShareBusiness extends C61868OPw {
    public List<Object> LIZIZ;
    public WebSharePackage LIZJ;
    public final List<String> LIZLLL;
    public String LJ;
    public boolean LJFF;
    public String LJI;
    public final C61863OPr LJII;

    public abstract void LIZJ();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsSparkShareBusiness(AbstractC37353ElJ sparkBusiness) {
        super(sparkBusiness);
        o.LJIIIZ(sparkBusiness, "sparkBusiness");
        this.LIZLLL = C65661Ppp.LIZIZ("copylink", "qrcode", "browser", "refresh");
        this.LJII = new C61863OPr(this);
    }

    public final void LIZIZ(String channelKey) {
        String str;
        WebSharePackage webSharePackage;
        String str2;
        o.LJIIIZ(channelKey, "channelKey");
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", "h5_page");
        hashMap.put("platform", channelKey);
        String str3 = "";
        hashMap.put("previous_page", "");
        hashMap.put("group_id", "");
        String str4 = null;
        if (TextUtils.isEmpty(null)) {
            str = "";
        } else {
            str = "article";
        }
        hashMap.put("webview_type", str);
        WebSharePackage webSharePackage2 = this.LIZJ;
        if (webSharePackage2 != null) {
            str4 = webSharePackage2.url;
        }
        if (!TextUtils.isEmpty(str4) ? !((webSharePackage = this.LIZJ) == null || (str2 = webSharePackage.url) == null) : (str2 = this.LJ) != null) {
            str3 = str2;
        }
        hashMap.put("url", str3);
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
