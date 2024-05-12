package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _CheckActivityRoomParams_ProtoDecoder implements InterfaceC31105CIr<CheckActivityRoomParams> {
    @Override // X.InterfaceC31105CIr
    public final CheckActivityRoomParams LIZ(Q9H q9h) {
        CheckActivityRoomParams checkActivityRoomParams = new CheckActivityRoomParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        checkActivityRoomParams.roomIdStr = Q9J.LIZIZ(q9h);
                    }
                } else {
                    checkActivityRoomParams.activityName = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return checkActivityRoomParams;
            }
        }
    }
}
