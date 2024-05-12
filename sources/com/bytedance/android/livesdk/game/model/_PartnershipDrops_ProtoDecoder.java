package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _PartnershipDrops_ProtoDecoder implements InterfaceC31105CIr<PartnershipDrops> {
    public static PartnershipDrops LIZIZ(Q9H q9h) {
        PartnershipDrops partnershipDrops = new PartnershipDrops();
        partnershipDrops.rankList = new ArrayList();
        partnershipDrops.anchorRewards = new ArrayList();
        partnershipDrops.rewards = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        partnershipDrops.idStr = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        partnershipDrops.event = _PartnershipGameEvent_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        partnershipDrops.startTime = q9h.LJIIJJI();
                        break;
                    case 4:
                        partnershipDrops.endTime = q9h.LJIIJJI();
                        break;
                    case 5:
                        partnershipDrops.taskType = q9h.LJIIJ();
                        break;
                    case 6:
                        partnershipDrops.taskRound = q9h.LJIIJ();
                        break;
                    case 7:
                        partnershipDrops.status = q9h.LJIIJ();
                        break;
                    case 8:
                        partnershipDrops.name = Q9J.LIZIZ(q9h);
                        break;
                    case 9:
                        partnershipDrops.icon = Q9J.LIZIZ(q9h);
                        break;
                    case 10:
                        partnershipDrops.headImage = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        partnershipDrops.joinRule = Q9J.LIZIZ(q9h);
                        break;
                    case 12:
                        partnershipDrops.rewardRule = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        partnershipDrops.rankRule = Q9J.LIZIZ(q9h);
                        break;
                    case 14:
                        partnershipDrops.remark = Q9J.LIZIZ(q9h);
                        break;
                    case 15:
                        partnershipDrops.rewards.add(_PartnershipDropsReward_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        partnershipDrops.anchorRewards.add(_PartnershipDropsAnchorReward_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 17:
                        partnershipDrops.rankList.add(_PartnershipDropsRankItem_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 18:
                        partnershipDrops.anchorRank = _PartnershipDropsRankItem_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 19:
                        partnershipDrops.authCheck = Q9J.LIZ(q9h);
                        break;
                    case 20:
                        partnershipDrops.rankShow = Q9J.LIZ(q9h);
                        break;
                    case 21:
                        partnershipDrops.anchorJoined = Q9J.LIZ(q9h);
                        break;
                    case 22:
                        partnershipDrops.anchorCanJoin = Q9J.LIZ(q9h);
                        break;
                    case 23:
                        partnershipDrops.gameName = Q9J.LIZIZ(q9h);
                        break;
                    case 24:
                        partnershipDrops.cpName = Q9J.LIZIZ(q9h);
                        break;
                    case 25:
                        partnershipDrops.gameTagId = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return partnershipDrops;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PartnershipDrops LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
