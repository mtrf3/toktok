package X;

import com.bytedance.ies.android.base.runtime.depend.IMonitorDepend;
import com.ss.android.ugc.aweme.commercialize.topview.TopViewAwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NPW {
    public static final void LIZIZ(boolean z, NPX npx, String str) {
        String str2;
        if (npx.LJZ()) {
            JSONObject LIZJ = C65232Piu.LIZJ("failCode", str);
            TopViewAwemeRawAd LIZ = npx.LIZ();
            if (LIZ != null) {
                str2 = LIZ.getCreativeIdStr();
            } else {
                str2 = null;
            }
            LIZJ.put("creativeId", str2);
            LIZJ.put("groupId", npx.getAid());
            IMonitorDepend LIZJ2 = C59835Ne3.LIZJ();
            if (LIZJ2 != null) {
                LIZJ2.monitorStatusRate("aweme_ad_awesome_splash_show", !z ? 1 : 0, LIZJ);
            }
        }
    }

    public static final void LIZJ(Long l, String str, String str2, boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("failReason", str2);
        jSONObject.put("creativeId", l);
        jSONObject.put("logExtra", str);
        IMonitorDepend LIZJ = C59835Ne3.LIZJ();
        if (LIZJ != null) {
            LIZJ.monitorStatusRate("aweme_ad_normal_splash_download", !z ? 1 : 0, jSONObject);
        }
    }

    public static final void LIZ(Aweme aweme, Integer num, String str, String str2, boolean z) {
        String str3;
        if (aweme != null && aweme.isAd()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorMsg", str);
            jSONObject.put("errorCode", num);
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                str3 = awemeRawAd.getCreativeIdStr();
            } else {
                str3 = null;
            }
            jSONObject.put("creativeId", str3);
            jSONObject.put("groupId", aweme.getAid());
            jSONObject.put("url", str2);
            IMonitorDepend LIZJ = C59835Ne3.LIZJ();
            if (LIZJ != null) {
                LIZJ.monitorStatusRate("aweme_ad_awesome_splash_download", !z ? 1 : 0, jSONObject);
            }
        }
    }
}
