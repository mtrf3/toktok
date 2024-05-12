package com.ss.android.ugc.aweme.commercialize.feed.slide.guide;

import X.C54211LPj;
import X.C58096Mr6;
import X.C59252NNg;
import X.C63081OpJ;
import X.NOX;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.slide.IMainPageSlide;
import ujb.o;

/* loaded from: classes10.dex */
public final class MainPageSlideImpl implements IMainPageSlide {
    public static IMainPageSlide LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IMainPageSlide.class, false);
        if (LIZ != null) {
            return (IMainPageSlide) LIZ;
        }
        if (C58096Mr6.LLLLL == null) {
            synchronized (IMainPageSlide.class) {
                if (C58096Mr6.LLLLL == null) {
                    C58096Mr6.LLLLL = new MainPageSlideImpl();
                }
            }
        }
        return C58096Mr6.LLLLL;
    }

    @Override // com.ss.android.ugc.aweme.feed.slide.IMainPageSlide
    public final C54211LPj LIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        String webUrl;
        AwemeRawAd awemeRawAd2;
        if (aweme == null) {
            return new C54211LPj(false, false);
        }
        if (aweme.isAd() && C63081OpJ.LJLJJL(aweme)) {
            if (C63081OpJ.LJJ(aweme)) {
                return new C54211LPj(true, false);
            }
            if (C63081OpJ.LJJLIIJ(aweme)) {
                return new C54211LPj(true, false);
            }
            if (!C63081OpJ.LLIIL(aweme) && C63081OpJ.LLJJI(aweme)) {
                return new C54211LPj(false, true);
            }
            if (C63081OpJ.LJI(aweme)) {
                return new C54211LPj(false, true);
            }
            if (C59252NNg.LJI(aweme) || C59252NNg.LJ(aweme)) {
                return new C54211LPj(false, true);
            }
            if (aweme.getAwemeRawAd() != null && ((((awemeRawAd = aweme.getAwemeRawAd()) != null && (webUrl = awemeRawAd.getWebUrl()) != null && (!o.LJJJJJL(webUrl)) && ((awemeRawAd2 = aweme.getAwemeRawAd()) == null || !awemeRawAd2.isDisableLeftSlideFollow())) || (NOX.LIZ.LIZIZ(aweme) && C63081OpJ.LJJLJ(aweme))) && !C63081OpJ.LLIIL(aweme) && !C63081OpJ.LJJLIIIJLLLLLLLZ(aweme))) {
                return new C54211LPj(true, false);
            }
            return new C54211LPj(false, true);
        }
        if (!C63081OpJ.LJLJJL(aweme)) {
            return new C54211LPj(true, false);
        }
        return new C54211LPj(false, false);
    }
}
