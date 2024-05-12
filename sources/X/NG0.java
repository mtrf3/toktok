package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.g;
import com.google.gson.m;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NG0 {
    public static String LIZ(int i, String str) {
        return YE1.LIZIZ(str, "_carousel_", i);
    }

    public static C59066NGc LIZJ(Context context, Aweme aweme) {
        String str;
        String str2;
        Integer num;
        Long creativeId;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        EnumC59241NMv enumC59241NMv = EnumC59241NMv.SPARK;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        Integer num2 = null;
        if (awemeRawAd != null && (creativeId = awemeRawAd.getCreativeId()) != null) {
            str = String.valueOf(creativeId);
        } else {
            str = null;
        }
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 != null) {
            str2 = awemeRawAd2.getLogExtra();
        } else {
            str2 = null;
        }
        String groupId = aweme.getGroupId();
        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
        if (awemeRawAd3 != null) {
            num = Integer.valueOf(awemeRawAd3.getChargeType());
        } else {
            num = null;
        }
        AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
        if (awemeRawAd4 != null) {
            num2 = Integer.valueOf(awemeRawAd4.getSystemOrigin());
        }
        return new C59066NGc("feed_fyp_carousel_tag", enumC59241NMv, context, new NGY(str, str2, groupId, num, num2, 32));
    }

    public static C59421NTt LIZIZ(Context context, Aweme aweme, int i) {
        PhotoCarouselInfoStruct photoCarouselInfo;
        String lynxScheme;
        String str;
        String str2;
        List<String> urlList;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        String str3 = null;
        if (awemeRawAd != null && (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) != null && (lynxScheme = photoCarouselInfo.getLynxScheme()) != null) {
            Uri.Builder buildUpon = UriProtector.parse(lynxScheme).buildUpon();
            m mVar = new m();
            mVar.LJJIIJ("isRTL", Integer.valueOf(C90193gN.LIZIZ(context) ? 1 : 0));
            mVar.LJJIIJ("containerKey", Integer.valueOf(i));
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null) {
                JSONObject frontendData = awemeRawAd2.getFrontendData();
                String str4 = "";
                if (frontendData == null || (str = frontendData.toString()) == null) {
                    str = "";
                }
                mVar.LJJIIZ("frontendData", str);
                Long adId = awemeRawAd2.getAdId();
                if (adId != null) {
                    str2 = String.valueOf(adId);
                } else {
                    str2 = null;
                }
                mVar.LJJIIZ("adId", str2);
                mVar.LJJIIZ("creativeId", awemeRawAd2.getCreativeIdStr());
                mVar.LJJIIZ("logExtra", awemeRawAd2.getLogExtra());
                Long groupId = awemeRawAd2.getGroupId();
                if (groupId != null) {
                    str3 = String.valueOf(groupId);
                }
                mVar.LJJIIZ("groupId", str3);
                UrlModel clickTrackUrlList = awemeRawAd2.getClickTrackUrlList();
                if (clickTrackUrlList != null && (urlList = clickTrackUrlList.getUrlList()) != null && !urlList.isEmpty()) {
                    g gVar = new g();
                    Iterator<String> it = urlList.iterator();
                    while (it.hasNext()) {
                        gVar.LJJIIJ(it.next());
                    }
                    mVar.LJJII("clickTrackUrlList", gVar);
                }
                String nativeSiteAdInfo = awemeRawAd2.getNativeSiteAdInfo();
                if (nativeSiteAdInfo != null) {
                    str4 = nativeSiteAdInfo;
                }
                mVar.LJJIIZ("pageData", str4);
                mVar.LJJIIJ("landingStyle", Integer.valueOf(awemeRawAd2.getWebviewType()));
            }
            str3 = buildUpon.appendQueryParameter("initialData", mVar.toString()).toString();
        }
        Bundle bundle = new Bundle();
        NLW LIZ = NGL.LIZ();
        if (LIZ != null) {
            LIZ.LJIIIIZZ(context, bundle, aweme);
        }
        NIA nia = new NIA("feed_fyp_carousel_tag", str3, bundle, C59055NFr.LIZ("feed_fyp_carousel_tag"), new C1PH(), false, null, false, 992);
        EnumC59053NFp enumC59053NFp = EnumC59053NFp.CACHE_WITH_RETRY;
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        return new C59421NTt(enumC59053NFp, LIZ(i, aid), 6, true, nia, null, false, 200);
    }
}
