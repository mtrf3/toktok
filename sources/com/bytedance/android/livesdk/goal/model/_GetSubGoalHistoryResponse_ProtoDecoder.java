package com.bytedance.android.livesdk.goal.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _GetSubGoalHistoryResponse_ProtoDecoder implements InterfaceC31105CIr<GetSubGoalHistoryResponse> {
    @Override // X.InterfaceC31105CIr
    public final GetSubGoalHistoryResponse LIZ(Q9H q9h) {
        GetSubGoalHistoryResponse getSubGoalHistoryResponse = new GetSubGoalHistoryResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    getSubGoalHistoryResponse.data = _GetSubGoalHistoryResponse_Data_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getSubGoalHistoryResponse;
            }
        }
    }
}
