package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.FansEventData;

/* loaded from: classes6.dex */
public final class _FansEventData_NewFansData_ProtoDecoder implements InterfaceC31105CIr<FansEventData.NewFansData> {
    public static FansEventData.NewFansData LIZIZ(Q9H q9h) {
        FansEventData.NewFansData newFansData = new FansEventData.NewFansData();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    newFansData.fansCount = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return newFansData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final FansEventData.NewFansData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
