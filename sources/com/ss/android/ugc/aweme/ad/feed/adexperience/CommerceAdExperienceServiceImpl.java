package com.ss.android.ugc.aweme.ad.feed.adexperience;

import X.AK1;
import X.C0M6;
import X.C26043AJz;
import X.C58542Rm;
import X.C59027NEp;
import X.C59028NEq;
import X.C59122NIg;
import X.C59964Ng8;
import X.C59965Ng9;
import X.C63081OpJ;
import X.C76800UCe;
import X.C79057V0z;
import X.InterfaceC65784Pro;
import X.N12;
import X.NFR;
import X.NFS;
import X.NFT;
import X.NFU;
import X.NFV;
import X.NFX;
import X.NQU;
import X.ORZ;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.model.AdLiveEnterRoomConfig;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdAceSurveyBottomBarAssemTrigger;
import com.ss.android.ugc.aweme.ad.feed.adexperience.event.AdExperienceEventLogger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.commercialize.adexperience.CommerceAceSurveyInfo;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityProtocol;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class CommerceAdExperienceServiceImpl implements ICommerceAdExperienceService {
    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final BottomBarPriorityProtocol LJII() {
        return new AdAceSurveyBottomBarAssemTrigger();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final NQU LIZIZ(C59122NIg c59122NIg) {
        return new NFR(c59122NIg);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final NFU LIZJ(Aweme aweme) {
        String str;
        CommerceAceSurveyInfo LJIJI;
        C58542Rm.LIZ();
        if (aweme != null && (LJIJI = C79057V0z.LJIJI(aweme)) != null) {
            str = LJIJI.getSurveyBgCover();
        } else {
            str = null;
        }
        return new NFU(str);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final List<String> LIZLLL(Aweme aweme) {
        ArrayList<String> geckoChannel;
        List<String> LLJI;
        if (aweme != null) {
            CommerceAceSurveyInfo LJIJI = C79057V0z.LJIJI(aweme);
            if (LJIJI == null || (geckoChannel = LJIJI.getGeckoChannel()) == null || (LLJI = ORZ.LLJI(geckoChannel)) == null) {
                return new ArrayList();
            }
            return LLJI;
        }
        return new ArrayList();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final boolean LJ(Aweme aweme) {
        if (aweme != null) {
            return C79057V0z.LJJJJLL(aweme);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final String LJI(AwemeRawAd awemeRawAd) {
        if (awemeRawAd == null) {
            return null;
        }
        return u.LJIILIIL(awemeRawAd);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final boolean LJIIIIZZ(Aweme aweme) {
        CommerceAceSurveyInfo LJIJI;
        Integer styleType;
        C0M6<String, NFT> c0m6;
        NFT LIZIZ;
        Integer styleType2;
        if (aweme == null || !aweme.isAd() || (LJIJI = C79057V0z.LJIJI(aweme)) == null || (styleType = LJIJI.getStyleType()) == null || styleType.intValue() != 1 || C59027NEp.LIZ().LIZIZ(C79057V0z.LJIJJ(aweme))) {
            return false;
        }
        if (C63081OpJ.LL(aweme) || C63081OpJ.LJLLI(aweme) || C63081OpJ.LLJJJJLIIL(aweme)) {
            C59028NEq LIZ = C59027NEp.LIZ();
            String LJIJJ = C79057V0z.LJIJJ(aweme);
            if (LJIJJ == null) {
                LIZ.getClass();
                return false;
            }
            C0M6<String, NFT> c0m62 = LIZ.LIZ;
            if ((c0m62 == null || c0m62.LIZIZ(LJIJJ) == null) && (c0m6 = LIZ.LIZ) != null) {
                c0m6.LIZJ(LJIJJ, new NFT(0));
            }
            C0M6<String, NFT> c0m63 = LIZ.LIZ;
            if (c0m63 == null || (LIZIZ = c0m63.LIZIZ(LJIJJ)) == null || LIZIZ.LIZ) {
                return false;
            }
            AdExperienceEventLogger adExperienceEventLogger = new AdExperienceEventLogger(new Object[]{aweme});
            N12.LIZ.getClass();
            adExperienceEventLogger.LJIILIIL(N12.LJII);
            LIZIZ.LIZ = true;
            return false;
        }
        CommerceAceSurveyInfo LJIJI2 = C79057V0z.LJIJI(aweme);
        if (LJIJI2 == null || (styleType2 = LJIJI2.getStyleType()) == null || styleType2.intValue() != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final void LJFF(Context context, AdLiveEnterRoomConfig adLiveEnterRoomConfig, String uid) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(uid, "uid");
        new C26043AJz(new NFS(context, adLiveEnterRoomConfig, uid)).LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final void LJIIJ(Context context, Aweme aweme, String reportFrom) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(reportFrom, "reportFrom");
        new C26043AJz(new AK1(context, aweme, reportFrom)).LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final void LJIIIZ(Context context, AdLiveEnterRoomConfig adLiveEnterRoomConfig, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        o.LJIIIZ(context, "context");
        NFV nfv = new NFV(context, adLiveEnterRoomConfig, interfaceC65784Pro);
        new C59964Ng8(nfv).LIZ();
        C59965Ng9.LIZ(nfv, interfaceC65784Pro2);
    }

    @Override // com.ss.android.ugc.aweme.ad.feed.adexperience.ICommerceAdExperienceService
    public final void LIZ(Context context, Aweme aweme, String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        o.LJIIIZ(context, "context");
        if (aweme != null && aweme.isAd()) {
            NFX nfx = new NFX(context, aweme, interfaceC65784Pro);
            if (TextUtils.equals(str, "live_ad")) {
                new C59964Ng8(nfx).LIZ();
            }
            C59965Ng9.LIZ(nfx, interfaceC65784Pro2);
        }
    }
}
