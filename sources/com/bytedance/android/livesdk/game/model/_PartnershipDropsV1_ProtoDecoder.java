package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _PartnershipDropsV1_ProtoDecoder implements InterfaceC31105CIr<PartnershipDropsV1> {
    public static PartnershipDropsV1 LIZIZ(Q9H q9h) {
        PartnershipDropsV1 partnershipDropsV1 = new PartnershipDropsV1();
        partnershipDropsV1.country = new ArrayList();
        partnershipDropsV1.tasks = new ArrayList();
        partnershipDropsV1.gifts = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        partnershipDropsV1.id = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        partnershipDropsV1.gameName = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        partnershipDropsV1.gameIcon = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        partnershipDropsV1.startTime = q9h.LJIIJJI();
                        break;
                    case 5:
                        partnershipDropsV1.endTime = q9h.LJIIJJI();
                        break;
                    case 6:
                        partnershipDropsV1.reasonType = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        partnershipDropsV1.gifts.add(_PartnershipDropsGift_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 8:
                        partnershipDropsV1.tasks.add(_PartnershipDropsTask_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 9:
                        partnershipDropsV1.started = Q9J.LIZ(q9h);
                        break;
                    case 10:
                        partnershipDropsV1.startedTime = q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        partnershipDropsV1.reasonTypeValue = q9h.LJIIJ();
                        break;
                    case 12:
                        partnershipDropsV1.reasonParams = _PartnershipDropsV1_ReasonParams_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        partnershipDropsV1.gameId = q9h.LJIIJJI();
                        break;
                    case 14:
                        partnershipDropsV1.gameIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 15:
                        partnershipDropsV1.gameTagId = Q9J.LIZIZ(q9h);
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        partnershipDropsV1.status = q9h.LJIIJ();
                        break;
                    case 17:
                        partnershipDropsV1.joinStatus = Q9J.LIZ(q9h);
                        break;
                    case 18:
                        partnershipDropsV1.cpName = Q9J.LIZIZ(q9h);
                        break;
                    case 19:
                        partnershipDropsV1.country.add(Q9J.LIZIZ(q9h));
                        break;
                    case 20:
                        partnershipDropsV1.name = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return partnershipDropsV1;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PartnershipDropsV1 LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
