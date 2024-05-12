package com.bytedance.android.livesdk.goal.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _GetSubGoalContributorsRequest_ProtoDecoder implements InterfaceC31105CIr<GetSubGoalContributorsRequest> {
    @Override // X.InterfaceC31105CIr
    public final GetSubGoalContributorsRequest LIZ(Q9H q9h) {
        GetSubGoalContributorsRequest getSubGoalContributorsRequest = new GetSubGoalContributorsRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        getSubGoalContributorsRequest.secOwnerId = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        getSubGoalContributorsRequest.roomId = q9h.LJIIJJI();
                        break;
                    case 3:
                        getSubGoalContributorsRequest.type = q9h.LJIIJ();
                        break;
                    case 4:
                        getSubGoalContributorsRequest.offset = q9h.LJIIJJI();
                        break;
                    case 5:
                        getSubGoalContributorsRequest.limit = q9h.LJIIJJI();
                        break;
                    case 6:
                        getSubGoalContributorsRequest.goalId = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return getSubGoalContributorsRequest;
            }
        }
    }
}
