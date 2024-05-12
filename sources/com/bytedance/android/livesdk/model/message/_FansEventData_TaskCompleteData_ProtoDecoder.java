package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.FansEventData;

/* loaded from: classes6.dex */
public final class _FansEventData_TaskCompleteData_ProtoDecoder implements InterfaceC31105CIr<FansEventData.TaskCompleteData> {
    public static FansEventData.TaskCompleteData LIZIZ(Q9H q9h) {
        FansEventData.TaskCompleteData taskCompleteData = new FansEventData.TaskCompleteData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        taskCompleteData.isClearToday = Q9J.LIZ(q9h);
                    }
                } else {
                    taskCompleteData.taskType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return taskCompleteData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FansEventData.TaskCompleteData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
