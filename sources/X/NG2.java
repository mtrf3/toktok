package X;

import android.content.Context;
import android.os.Bundle;
import com.google.gson.g;
import com.google.gson.m;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NG2 {
    public static final /* synthetic */ int LIZ = 0;

    public static m LIZ(Context context, Aweme aweme) {
        String str;
        List<String> urlList;
        o.LJIIIZ(context, "context");
        m mVar = new m();
        String str2 = null;
        if (aweme != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                Long adId = awemeRawAd.getAdId();
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
                    str2 = String.valueOf(groupId);
                }
                mVar.LJJIIZ("groupId", str2);
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
            }
            str2 = aweme.getAid();
        }
        mVar.LJJIIZ("itemId", String.valueOf(str2));
        mVar.LJJIIJ("isRTL", Integer.valueOf(C90193gN.LIZIZ(context) ? 1 : 0));
        mVar.LJJIIJ("topSafeAreaHeight", Integer.valueOf(C63081OpJ.LJJJJLI(context)));
        return mVar;
    }

    public static Bundle LIZIZ(Context context, Aweme aweme) {
        Bundle bundle = new Bundle();
        NLW LIZ2 = NGL.LIZ();
        if (LIZ2 != null) {
            LIZ2.LJIIIIZZ(context, bundle, aweme);
        }
        return bundle;
    }
}
