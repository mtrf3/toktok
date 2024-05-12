package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _RoomTab_ProtoDecoder implements InterfaceC31105CIr<RoomTab> {
    @Override // X.InterfaceC31105CIr
    public final RoomTab LIZ(Q9H q9h) {
        RoomTab roomTab = new RoomTab();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            roomTab.mTabUrl = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        roomTab.mTabName = Q9J.LIZIZ(q9h);
                    }
                } else {
                    roomTab.mRoomTabType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return roomTab;
            }
        }
    }
}
