package com.bytedance.android.livesdk.goal.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.gift.model._LiveStreamSubGoal_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _CommitSubGoalRequest_ProtoDecoder implements InterfaceC31105CIr<CommitSubGoalRequest> {
    @Override // X.InterfaceC31105CIr
    public final CommitSubGoalRequest LIZ(Q9H q9h) {
        CommitSubGoalRequest commitSubGoalRequest = new CommitSubGoalRequest();
        commitSubGoalRequest.subgoals = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        commitSubGoalRequest.roomId = q9h.LJIIJJI();
                        break;
                    case 2:
                        commitSubGoalRequest.subgoals.add(_LiveStreamSubGoal_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 3:
                        commitSubGoalRequest.description = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        commitSubGoalRequest.type = q9h.LJIIJ();
                        break;
                    case 5:
                        commitSubGoalRequest.status = q9h.LJIIJ();
                        break;
                    case 6:
                        commitSubGoalRequest.goalId = q9h.LJIIJJI();
                        break;
                    case 7:
                        commitSubGoalRequest.roomIdStr = Q9J.LIZIZ(q9h);
                        break;
                    case 8:
                        commitSubGoalRequest.goalIdStr = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return commitSubGoalRequest;
            }
        }
    }
}
