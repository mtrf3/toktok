package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes13.dex */
public final class _ScheduleItem_ProtoDecoder implements InterfaceC31105CIr<ScheduleItem> {
    @Override // X.InterfaceC31105CIr
    public final ScheduleItem LIZ(Q9H q9h) {
        ScheduleItem scheduleItem = new ScheduleItem();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        scheduleItem.duration = Long.valueOf(q9h.LJIIJJI());
                    }
                } else {
                    scheduleItem.startTime = Long.valueOf(q9h.LJIIJJI());
                }
            } else {
                q9h.LJ(LIZJ);
                return scheduleItem;
            }
        }
    }
}
