package com.ss.android.ugc.aweme.hybrid.container;

import X.C58542Rm;
import X.C59051NFn;
import X.C59055NFr;
import X.ND7;
import X.NGS;
import com.ss.android.ugc.aweme.commercialize.model.AdLynxEntryData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class FeedSuperLikeAdHybridGecko implements NGS<Aweme> {
    @Override // X.NGS
    public ND7 obtainGeckoConfig(Aweme aweme) {
        List<String> arrayList;
        AwemeRawAd awemeRawAd;
        AdLynxEntryData lynxEntryData;
        if (!C58542Rm.LIZ()) {
            return new C59051NFn("", new ArrayList(), "");
        }
        String LIZ = C59055NFr.LIZ("feed_fyp_super_like");
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (lynxEntryData = awemeRawAd.getLynxEntryData()) == null || (arrayList = lynxEntryData.getGeckoChannel()) == null) {
            arrayList = new ArrayList<>();
        }
        return new C59051NFn(LIZ, arrayList, "feed_fyp_super_like");
    }
}
