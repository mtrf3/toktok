package com.bytedance.android.livesdk.live.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _RoomStatsModel_ProtoDecoder implements InterfaceC31105CIr<RoomStatsModel> {
    @Override // X.InterfaceC31105CIr
    public final RoomStatsModel LIZ(Q9H q9h) {
        RoomStatsModel roomStatsModel = new RoomStatsModel();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 4) {
                            Q9J.LIZJ(q9h);
                        } else {
                            roomStatsModel.filterInfo = _FilterInfoData_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        roomStatsModel.alive = Q9J.LIZ(q9h);
                    }
                } else {
                    roomStatsModel.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return roomStatsModel;
            }
        }
    }
}
