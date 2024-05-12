package com.ss.android.ugc.aweme.hybrid.container;

import X.C59051NFn;
import X.C59055NFr;
import X.ND7;
import X.NGS;
import com.ss.android.ugc.aweme.commercialize.model.AdDescriptiveCTAStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class FeedDescriptiveAdHybridGecko implements NGS<Aweme> {
    @Override // X.NGS
    public ND7 obtainGeckoConfig(Aweme aweme) {
        List<String> arrayList;
        AwemeRawAd awemeRawAd;
        AdDescriptiveCTAStruct adDescriptiveCTA;
        String LIZ = C59055NFr.LIZ("feed_fyp_descriptive_left_container");
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (adDescriptiveCTA = awemeRawAd.getAdDescriptiveCTA()) == null || (arrayList = adDescriptiveCTA.getGeckoChannelList()) == null) {
            arrayList = new ArrayList<>();
        }
        return new C59051NFn(LIZ, arrayList, "feed_fyp_descriptive_left_container");
    }
}
