package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _TaskProfitInfo_ProtoDecoder implements InterfaceC31105CIr<TaskProfitInfo> {
    public static TaskProfitInfo LIZIZ(Q9H q9h) {
        TaskProfitInfo taskProfitInfo = new TaskProfitInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        taskProfitInfo.profitInfo = _ProfitInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    taskProfitInfo.briefGame = _BriefGameTask_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return taskProfitInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TaskProfitInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
