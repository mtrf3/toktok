package com.ss.android.ugc.aweme.hybrid.container;

import X.C59051NFn;
import X.C59055NFr;
import X.C61878OQg;
import X.ND7;
import X.NGS;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class FeedCarouselTag implements NGS<Aweme> {
    @Override // X.NGS
    public ND7 obtainGeckoConfig(Aweme aweme) {
        List<String> list;
        List<String> list2;
        List<String> list3;
        AwemeRawAd awemeRawAd;
        PhotoCarouselInfoStruct photoCarouselInfo;
        AwemeRawAd awemeRawAd2;
        PhotoCarouselInfoStruct photoCarouselInfo2;
        NativeSiteConfig nativeSiteConfig;
        AwemeRawAd awemeRawAd3;
        PhotoCarouselInfoStruct photoCarouselInfo3;
        ArrayList arrayList = new ArrayList();
        if (aweme == null || (awemeRawAd3 = aweme.getAwemeRawAd()) == null || (photoCarouselInfo3 = awemeRawAd3.getPhotoCarouselInfo()) == null || (list = photoCarouselInfo3.getGeckoChannelList()) == null) {
            list = C61878OQg.INSTANCE;
        }
        arrayList.addAll(list);
        if (aweme == null || (awemeRawAd2 = aweme.getAwemeRawAd()) == null || (photoCarouselInfo2 = awemeRawAd2.getPhotoCarouselInfo()) == null || (nativeSiteConfig = photoCarouselInfo2.getNativeSiteConfig()) == null || (list2 = nativeSiteConfig.getGeckoChannel()) == null) {
            list2 = C61878OQg.INSTANCE;
        }
        arrayList.addAll(list2);
        String LIZ = C59055NFr.LIZ("feed_fyp_carousel_tag");
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) == null || (list3 = photoCarouselInfo.getGeckoChannelList()) == null) {
            list3 = C61878OQg.INSTANCE;
        }
        return new C59051NFn(LIZ, list3, "feed_fyp_carousel_tag");
    }
}
