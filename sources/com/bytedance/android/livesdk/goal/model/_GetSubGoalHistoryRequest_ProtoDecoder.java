package com.bytedance.android.livesdk.goal.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _GetSubGoalHistoryRequest_ProtoDecoder implements InterfaceC31105CIr<GetSubGoalHistoryRequest> {
    @Override // X.InterfaceC31105CIr
    public final GetSubGoalHistoryRequest LIZ(Q9H q9h) {
        GetSubGoalHistoryRequest getSubGoalHistoryRequest = new GetSubGoalHistoryRequest();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    getSubGoalHistoryRequest.limit = q9h.LJIIJJI();
                                }
                            } else {
                                getSubGoalHistoryRequest.offset = q9h.LJIIJJI();
                            }
                        } else {
                            getSubGoalHistoryRequest.type = q9h.LJIIJ();
                        }
                    } else {
                        getSubGoalHistoryRequest.roomId = q9h.LJIIJJI();
                    }
                } else {
                    getSubGoalHistoryRequest.secOwnerId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getSubGoalHistoryRequest;
            }
        }
    }
}
