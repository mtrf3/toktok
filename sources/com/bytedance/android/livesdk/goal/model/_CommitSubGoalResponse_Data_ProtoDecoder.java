package com.bytedance.android.livesdk.goal.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.gift.model._LiveStreamGoal_ProtoDecoder;
import com.bytedance.android.livesdk.goal.model.CommitSubGoalResponse;

/* loaded from: classes17.dex */
public final class _CommitSubGoalResponse_Data_ProtoDecoder implements InterfaceC31105CIr<CommitSubGoalResponse.Data> {
    public static CommitSubGoalResponse.Data LIZIZ(Q9H q9h) {
        CommitSubGoalResponse.Data data = new CommitSubGoalResponse.Data();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    data.goal = _LiveStreamGoal_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return data;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CommitSubGoalResponse.Data LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
