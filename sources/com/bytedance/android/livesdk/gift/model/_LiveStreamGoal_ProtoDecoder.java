package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.goal.model._GoalStats_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _LiveStreamGoal_ProtoDecoder implements InterfaceC31105CIr<LiveStreamGoal> {
    public static LiveStreamGoal LIZIZ(Q9H q9h) {
        LiveStreamGoal liveStreamGoal = new LiveStreamGoal();
        liveStreamGoal.subGoals = new ArrayList();
        liveStreamGoal.contributors = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        liveStreamGoal.id = q9h.LJIIJJI();
                        break;
                    case 2:
                        liveStreamGoal.type = q9h.LJIIJ();
                        break;
                    case 3:
                        liveStreamGoal.status = q9h.LJIIJ();
                        break;
                    case 4:
                        liveStreamGoal.subGoals.add(_LiveStreamSubGoal_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 5:
                        liveStreamGoal.description = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        liveStreamGoal.auditStatus = q9h.LJIIJ();
                        break;
                    case 7:
                        liveStreamGoal.cycleType = q9h.LJIIJ();
                        break;
                    case 8:
                        liveStreamGoal.startTime = q9h.LJIIJJI();
                        break;
                    case 9:
                        liveStreamGoal.expireTime = q9h.LJIIJJI();
                        break;
                    case 10:
                        liveStreamGoal.realFinishTime = q9h.LJIIJJI();
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        liveStreamGoal.contributors.add(_LiveStreamGoalContributor_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 12:
                        liveStreamGoal.contributorsLength = q9h.LJIIJ();
                        break;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        liveStreamGoal.idStr = Q9J.LIZIZ(q9h);
                        break;
                    case 14:
                        liveStreamGoal.auditDescription = Q9J.LIZIZ(q9h);
                        break;
                    case 15:
                        liveStreamGoal.stats = _GoalStats_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return liveStreamGoal;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LiveStreamGoal LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
