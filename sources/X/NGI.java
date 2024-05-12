package X;

import android.content.Context;
import android.os.Bundle;
import com.google.gson.g;
import com.google.gson.m;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NGI {
    public static final /* synthetic */ int LIZ = 0;

    public static Bundle LIZIZ(Context context, Aweme aweme) {
        String str;
        AwemeRawAd awemeRawAd;
        Bundle bundle = new Bundle();
        NLW LIZ2 = NGL.LIZ();
        if (LIZ2 != null) {
            LIZ2.LJIIIIZZ(context, bundle, aweme);
        }
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            str = awemeRawAd.getNativeSiteCustomData();
        } else {
            str = null;
        }
        bundle.putString("bundle_native_site_custom_data", str);
        return bundle;
    }

    public static m LIZ(Context context, Aweme aweme, JSONObject jSONObject) {
        String jSONObject2;
        AwemeRawAd awemeRawAd;
        String str;
        String str2;
        List<String> urlList;
        m mVar = new m();
        String str3 = "";
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            Long adId = awemeRawAd.getAdId();
            String str4 = null;
            if (adId != null) {
                str = String.valueOf(adId);
            } else {
                str = null;
            }
            mVar.LJJIIZ("adId", str);
            mVar.LJJIIZ("creativeId", awemeRawAd.getCreativeIdStr());
            mVar.LJJIIZ("logExtra", awemeRawAd.getLogExtra());
            Long groupId = awemeRawAd.getGroupId();
            if (groupId != null) {
                str4 = String.valueOf(groupId);
            }
            mVar.LJJIIZ("groupId", str4);
            UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
            if (clickTrackUrlList != null && (urlList = clickTrackUrlList.getUrlList()) != null && !urlList.isEmpty()) {
                g gVar = new g();
                Iterator<String> it = urlList.iterator();
                while (it.hasNext()) {
                    gVar.LJJIIJ(it.next());
                }
                mVar.LJJII("clickTrackUrlList", gVar);
            }
            String nativeSiteAdInfo = awemeRawAd.getNativeSiteAdInfo();
            if (nativeSiteAdInfo == null) {
                nativeSiteAdInfo = "";
            }
            mVar.LJJIIZ("pageData", nativeSiteAdInfo);
            NativeSiteConfig nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
            if (nativeSiteConfig == null || (str2 = nativeSiteConfig.getLynxScheme()) == null) {
                str2 = "";
            }
            mVar.LJJIIZ("lynxSchema", str2);
        }
        if (jSONObject != null && (jSONObject2 = jSONObject.toString()) != null) {
            str3 = jSONObject2;
        }
        mVar.LJJIIZ("cardData", str3);
        mVar.LJJIIJ("isRTL", Integer.valueOf(C90193gN.LIZIZ(context) ? 1 : 0));
        return mVar;
    }
}
