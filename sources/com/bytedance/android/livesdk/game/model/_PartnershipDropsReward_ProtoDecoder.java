package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes17.dex */
public final class _PartnershipDropsReward_ProtoDecoder implements InterfaceC31105CIr<PartnershipDropsReward> {
    public static PartnershipDropsReward LIZIZ(Q9H q9h) {
        PartnershipDropsReward partnershipDropsReward = new PartnershipDropsReward();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        partnershipDropsReward.dropsIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        partnershipDropsReward.round = q9h.LJIIJ();
                        break;
                    case 3:
                        partnershipDropsReward.name = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        partnershipDropsReward.icon = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        partnershipDropsReward.viewDuration = q9h.LJIIJ();
                        break;
                    case 6:
                        partnershipDropsReward.commentContent = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        partnershipDropsReward.commentTimes = q9h.LJIIJ();
                        break;
                    case 8:
                        partnershipDropsReward.commentInterval = q9h.LJIIJ();
                        break;
                    case 9:
                        partnershipDropsReward.remainNum = q9h.LJIIJ();
                        break;
                    case 10:
                        partnershipDropsReward.anchorScore = q9h.LJIIJ();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        partnershipDropsReward.startTime = q9h.LJIIJJI();
                        break;
                    case 12:
                        partnershipDropsReward.endTime = q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        partnershipDropsReward.platform = Q9J.LIZIZ(q9h);
                        break;
                    case 14:
                        partnershipDropsReward.status = q9h.LJIIJ();
                        break;
                    case 15:
                        partnershipDropsReward.cdkey = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return partnershipDropsReward;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PartnershipDropsReward LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
