package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _TaskAttributionInfo_ProtoDecoder implements InterfaceC31105CIr<TaskAttributionInfo> {
    public static TaskAttributionInfo LIZIZ(Q9H q9h) {
        TaskAttributionInfo taskAttributionInfo = new TaskAttributionInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            taskAttributionInfo.cppUrl = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        taskAttributionInfo.viewThroughUrl = Q9J.LIZIZ(q9h);
                    }
                } else {
                    taskAttributionInfo.viewReportScene = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return taskAttributionInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TaskAttributionInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
