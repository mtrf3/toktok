package com.ss.android.ugc.aweme.hybrid.container;

import X.C59050NFm;
import X.C59051NFn;
import X.C59055NFr;
import X.ND7;
import X.NGS;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes11.dex */
public final class AceSurveyAdHybridGecko implements NGS<Aweme> {
    @Override // X.NGS
    public ND7 obtainGeckoConfig(Aweme aweme) {
        return new C59051NFn(C59055NFr.LIZ("feed_follow_up_ace_survey"), C59050NFm.LIZIZ.LIZLLL(aweme), "feed_follow_up_ace_survey");
    }
}
