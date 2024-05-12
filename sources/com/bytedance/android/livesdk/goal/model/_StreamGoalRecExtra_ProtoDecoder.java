package com.bytedance.android.livesdk.goal.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _StreamGoalRecExtra_ProtoDecoder implements InterfaceC31105CIr<StreamGoalRecExtra> {
    public static StreamGoalRecExtra LIZIZ(Q9H q9h) {
        StreamGoalRecExtra streamGoalRecExtra = new StreamGoalRecExtra();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        streamGoalRecExtra.reasonableRec = _ReasonableGoalRec_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    streamGoalRecExtra.leadText = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return streamGoalRecExtra;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final StreamGoalRecExtra LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
