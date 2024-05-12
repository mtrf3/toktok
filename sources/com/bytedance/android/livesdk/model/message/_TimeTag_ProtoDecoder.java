package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _TimeTag_ProtoDecoder implements InterfaceC31105CIr<TimeTag> {
    public static TimeTag LIZIZ(Q9H q9h) {
        TimeTag timeTag = new TimeTag();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    timeTag.operationTime = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return timeTag;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TimeTag LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
