package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model._GoalPinInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes17.dex */
public final class _LiveStreamGoalServerMessage_ProtoDecoder implements InterfaceC31105CIr<LiveStreamGoalServerMessage> {
    @Override // X.InterfaceC31105CIr
    public final LiveStreamGoalServerMessage LIZ(Q9H q9h) {
        LiveStreamGoalServerMessage liveStreamGoalServerMessage = new LiveStreamGoalServerMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        liveStreamGoalServerMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        liveStreamGoalServerMessage.indicator = _LiveStreamGoalIndicator_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        liveStreamGoalServerMessage.goal = _LiveStreamGoal_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        liveStreamGoalServerMessage.contributorId = q9h.LJIIJJI();
                        break;
                    case 5:
                        liveStreamGoalServerMessage.contributorAvatar = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        liveStreamGoalServerMessage.contributorDisplayId = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        liveStreamGoalServerMessage.contributeSubgoal = _LiveStreamSubGoal_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                    case 9:
                        liveStreamGoalServerMessage.contributeCount = q9h.LJIIJJI();
                        break;
                    case 10:
                        liveStreamGoalServerMessage.contributeScore = q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        liveStreamGoalServerMessage.giftRepeatCount = q9h.LJIIJJI();
                        break;
                    case 12:
                        liveStreamGoalServerMessage.contributorIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        liveStreamGoalServerMessage.pin = Q9J.LIZ(q9h);
                        break;
                    case 14:
                        liveStreamGoalServerMessage.unpin = Q9J.LIZ(q9h);
                        break;
                    case 15:
                        liveStreamGoalServerMessage.pinInfo = _GoalPinInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return liveStreamGoalServerMessage;
            }
        }
    }
}
