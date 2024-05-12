package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _PartnershipGame_ProtoDecoder implements InterfaceC31105CIr<PartnershipGame> {
    public static PartnershipGame LIZIZ(Q9H q9h) {
        PartnershipGame partnershipGame = new PartnershipGame();
        partnershipGame.introductionVideo = new ArrayList();
        partnershipGame.introductionImage = new ArrayList();
        partnershipGame.labels = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        partnershipGame.id = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 2:
                        partnershipGame.idStr = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        partnershipGame.name = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        partnershipGame.androidVersion = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        partnershipGame.iosVersion = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        partnershipGame.ageLimit = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 7:
                        partnershipGame.androidPackage = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        partnershipGame.androidPackageSize = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 9:
                        partnershipGame.iosBundleId = Q9J.LIZIZ(q9h);
                        break;
                    case 10:
                        partnershipGame.iosPackageSize = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        partnershipGame.icon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 12:
                        partnershipGame.introductionImage.add(_ImageModel_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        partnershipGame.introduction = Q9J.LIZIZ(q9h);
                        break;
                    case 14:
                        partnershipGame.briefIntroduction = Q9J.LIZIZ(q9h);
                        break;
                    case 15:
                        partnershipGame.labels.add(Q9J.LIZIZ(q9h));
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        partnershipGame.lastUpdateTime = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 17:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case 18:
                        partnershipGame.contactPhoneNum = Q9J.LIZIZ(q9h);
                        break;
                    case 19:
                        partnershipGame.contactEmail = Q9J.LIZIZ(q9h);
                        break;
                    case 20:
                        partnershipGame.gamePublisher = Q9J.LIZIZ(q9h);
                        break;
                    case 21:
                        partnershipGame.openGll = q9h.LJIIJ();
                        break;
                    case 22:
                        partnershipGame.introductionVideo.add(_PartnershipGame_Video_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 23:
                        partnershipGame.topBackgroundImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 24:
                        partnershipGame.deepLink = Q9J.LIZIZ(q9h);
                        break;
                    case 25:
                        partnershipGame.gameTagId = q9h.LJIIJJI();
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return partnershipGame;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PartnershipGame LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
