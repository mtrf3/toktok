package com.bytedance.android.livesdk.goal.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.gift.model._LiveStreamGoal_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model.GetSubGoalHistoryResponse;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public final class _GetSubGoalHistoryResponse_Data_ProtoDecoder implements InterfaceC31105CIr<GetSubGoalHistoryResponse.Data> {
    public static GetSubGoalHistoryResponse.Data LIZIZ(Q9H q9h) {
        GetSubGoalHistoryResponse.Data data = new GetSubGoalHistoryResponse.Data();
        data.history = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            data.hasMore = Q9J.LIZ(q9h);
                        }
                    } else {
                        data.nextOffset = q9h.LJIIJJI();
                    }
                } else {
                    data.history.add(_LiveStreamGoal_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GetSubGoalHistoryResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
