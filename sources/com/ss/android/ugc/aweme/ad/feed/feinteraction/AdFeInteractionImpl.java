package com.ss.android.ugc.aweme.ad.feed.feinteraction;

import X.C58909NAb;
import X.NH3;
import X.NJP;
import X.NLN;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.commercialize.model.AdFeInteractionModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdFeInteractionImpl implements IAdFeInteraction {
    @Override // com.ss.android.ugc.aweme.ad.feed.feinteraction.IAdFeInteraction
    public final AdFeInteractionModel LIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            return awemeRawAd.getInteractionFormModel();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.feinteraction.IAdFeInteraction
    public final boolean LIZJ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AdFeInteractionModel interactionFormModel;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (interactionFormModel = awemeRawAd.getInteractionFormModel()) != null && !interactionFormModel.isInteractivity()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.feinteraction.IAdFeInteraction
    public final void LIZIZ(AwemeRawAd rawAd, List<String> list) {
        IAdLandPagePreloadService LJJI;
        String LJIIL;
        String str;
        o.LJIIIZ(rawAd, "rawAd");
        if (list != null && (LJJI = AdLandPagePreloadServiceImpl.LJJI()) != null && (LJIIL = LJJI.LJIIL("lynx_feed")) != null) {
            C58909NAb.LIZ.getClass();
            if (NH3.LIZIZ() != null) {
                IAdLandPagePreloadService LJJI2 = AdLandPagePreloadServiceImpl.LJJI();
                if (LJJI2 != null) {
                    str = LJJI2.LJIIL("lynx_feed");
                } else {
                    str = null;
                }
                NJP.LJFF(list, str, "lynx_feed", new NLN(rawAd, list, LJIIL));
            }
        }
    }
}
