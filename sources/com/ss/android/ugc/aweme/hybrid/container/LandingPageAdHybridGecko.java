package com.ss.android.ugc.aweme.hybrid.container;

import X.C52205KeH;
import X.C59051NFn;
import X.C59055NFr;
import X.ND7;
import X.NGS;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class LandingPageAdHybridGecko implements NGS<Aweme> {
    @Override // X.NGS
    public ND7 obtainGeckoConfig(Aweme aweme) {
        List<String> arrayList;
        AwemeRawAd awemeRawAd;
        NativeSiteConfig nativeSiteConfig;
        if (!C52205KeH.LIZ()) {
            return new C59051NFn("", new ArrayList(), "");
        }
        String LIZ = C59055NFr.LIZ("landing_page_1p");
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (nativeSiteConfig = awemeRawAd.getNativeSiteConfig()) == null || (arrayList = nativeSiteConfig.getGeckoChannel()) == null) {
            arrayList = new ArrayList<>();
        }
        return new C59051NFn(LIZ, arrayList, "landing_page_1p");
    }
}
