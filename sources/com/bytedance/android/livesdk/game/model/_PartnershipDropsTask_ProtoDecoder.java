package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes17.dex */
public final class _PartnershipDropsTask_ProtoDecoder implements InterfaceC31105CIr<PartnershipDropsTask> {
    public static PartnershipDropsTask LIZIZ(Q9H q9h) {
        PartnershipDropsTask partnershipDropsTask = new PartnershipDropsTask();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        partnershipDropsTask.id = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        partnershipDropsTask.gift = _PartnershipGiftInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        partnershipDropsTask.type = q9h.LJIIJ();
                        break;
                    case 4:
                        partnershipDropsTask.viewDuration = q9h.LJIIJ();
                        break;
                    case 5:
                        partnershipDropsTask.commentContent = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        partnershipDropsTask.commentTimes = q9h.LJIIJ();
                        break;
                    case 7:
                        partnershipDropsTask.commentInterval = q9h.LJIIJ();
                        break;
                    case 8:
                        partnershipDropsTask.totalNum = q9h.LJIIJJI();
                        break;
                    case 9:
                        partnershipDropsTask.rewardedNum = q9h.LJIIJJI();
                        break;
                    case 10:
                        partnershipDropsTask.activeRewardedNum = q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        partnershipDropsTask.status = q9h.LJIIJ();
                        break;
                    case 12:
                        partnershipDropsTask.userStatus = q9h.LJIIJ();
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        partnershipDropsTask.userViewStart = q9h.LJIIJJI();
                        break;
                    case 14:
                        partnershipDropsTask.userCommentTimes = q9h.LJIIJ();
                        break;
                    case 15:
                        partnershipDropsTask.userLastCommentTime = q9h.LJIIJJI();
                        break;
                    case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                        partnershipDropsTask.userViewDuration = q9h.LJIIJJI();
                        break;
                    case 17:
                        partnershipDropsTask.userFinishTime = q9h.LJIIJJI();
                        break;
                    case 18:
                        partnershipDropsTask.commentType = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return partnershipDropsTask;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PartnershipDropsTask LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
