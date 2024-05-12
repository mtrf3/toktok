package com.bytedance.android.livesdkapi.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _ImEnterRoom_ProtoDecoder implements InterfaceC31105CIr<ImEnterRoom> {
    @Override // X.InterfaceC31105CIr
    public final ImEnterRoom LIZ(Q9H q9h) {
        ImEnterRoom imEnterRoom = new ImEnterRoom();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        imEnterRoom.roomId = q9h.LJIIJJI();
                        break;
                    case 2:
                        imEnterRoom.roomTag = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        imEnterRoom.liveRegion = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        imEnterRoom.liveId = q9h.LJIIJJI();
                        break;
                    case 5:
                        imEnterRoom.identity = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        imEnterRoom.cursor = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        imEnterRoom.accountType = q9h.LJIIJJI();
                        break;
                    case 8:
                        imEnterRoom.enterUniqueId = q9h.LJIIJJI();
                        break;
                    case 9:
                        imEnterRoom.filterWelcomeMsg = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return imEnterRoom;
            }
        }
    }
}
