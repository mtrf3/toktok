package X;

import android.content.Context;
import com.google.gson.g;
import com.google.gson.m;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NG1 {
    public static final /* synthetic */ int LIZ = 0;

    public static m LIZ(Context context, Aweme aweme) {
        String str;
        String str2;
        List<String> urlList;
        o.LJIIIZ(context, "context");
        m mVar = new m();
        String str3 = null;
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                mVar.LJJIIZ("adId", String.valueOf(awemeRawAd.getAdId()));
                mVar.LJJIIZ("creativeId", awemeRawAd.getCreativeIdStr());
                mVar.LJJIIZ("logExtra", awemeRawAd.getLogExtra());
                Long groupId = awemeRawAd.getGroupId();
                if (groupId != null) {
                    str = String.valueOf(groupId);
                } else {
                    str = null;
                }
                mVar.LJJIIZ("groupId", str);
                UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
                if (clickTrackUrlList != null && (urlList = clickTrackUrlList.getUrlList()) != null && !urlList.isEmpty()) {
                    g gVar = new g();
                    Iterator<String> it = urlList.iterator();
                    while (it.hasNext()) {
                        gVar.LJJIIJ(it.next());
                    }
                    mVar.LJJII("clickTrackUrlList", gVar);
                }
                JSONObject frontendData = awemeRawAd.getFrontendData();
                if (frontendData != null) {
                    str2 = frontendData.toString();
                } else {
                    str2 = null;
                }
                mVar.LJJIIZ("frontendData", str2);
                NativeSiteConfig nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
                if (nativeSiteConfig != null) {
                    str3 = nativeSiteConfig.getLynxScheme();
                }
                mVar.LJJIIZ("lynxSchema", str3);
            }
            str3 = aweme.getAid();
        }
        mVar.LJJIIZ("itemId", String.valueOf(str3));
        mVar.LJJIIJ("isRTL", Integer.valueOf(C90193gN.LIZIZ(context) ? 1 : 0));
        mVar.LJJIIJ("topSafeAreaHeight", Integer.valueOf(C63081OpJ.LJJJJLI(context)));
        return mVar;
    }
}
