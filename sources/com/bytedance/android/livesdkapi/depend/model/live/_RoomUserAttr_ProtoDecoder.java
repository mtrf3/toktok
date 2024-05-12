package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _RoomUserAttr_ProtoDecoder implements InterfaceC31105CIr<RoomUserAttr> {
    @Override // X.InterfaceC31105CIr
    public final RoomUserAttr LIZ(Q9H q9h) {
        RoomUserAttr roomUserAttr = new RoomUserAttr();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    roomUserAttr.rank = q9h.LJIIJJI();
                                }
                            } else {
                                roomUserAttr.adminFlag = q9h.LJIIJJI();
                            }
                        } else {
                            roomUserAttr.silenceFlag = q9h.LJIIJJI();
                        }
                    } else {
                        roomUserAttr.roomIdStr = Q9J.LIZIZ(q9h);
                    }
                } else {
                    roomUserAttr.roomId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return roomUserAttr;
            }
        }
    }
}
