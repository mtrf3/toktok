package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _FansEventData_ProtoDecoder implements InterfaceC31105CIr<FansEventData> {
    public static FansEventData LIZIZ(Q9H q9h) {
        FansEventData fansEventData = new FansEventData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        fansEventData.taskCompleteData = _FansEventData_TaskCompleteData_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    fansEventData.newFansData = _FansEventData_NewFansData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return fansEventData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FansEventData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
