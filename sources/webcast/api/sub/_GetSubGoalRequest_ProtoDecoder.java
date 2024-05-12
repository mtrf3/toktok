package webcast.api.sub;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _GetSubGoalRequest_ProtoDecoder implements InterfaceC31105CIr<GetSubGoalRequest> {
    @Override // X.InterfaceC31105CIr
    public final GetSubGoalRequest LIZ(Q9H q9h) {
        GetSubGoalRequest getSubGoalRequest = new GetSubGoalRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                getSubGoalRequest.goalScene = q9h.LJIIJ();
                            }
                        } else {
                            getSubGoalRequest.goalId = q9h.LJIIJJI();
                        }
                    } else {
                        getSubGoalRequest.roomId = q9h.LJIIJJI();
                    }
                } else {
                    getSubGoalRequest.secOwnerId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getSubGoalRequest;
            }
        }
    }
}
