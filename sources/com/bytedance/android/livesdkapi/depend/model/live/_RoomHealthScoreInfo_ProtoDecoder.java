package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes16.dex */
public final class _RoomHealthScoreInfo_ProtoDecoder implements InterfaceC31105CIr<RoomHealthScoreInfo> {
    @Override // X.InterfaceC31105CIr
    public final RoomHealthScoreInfo LIZ(Q9H q9h) {
        RoomHealthScoreInfo roomHealthScoreInfo = new RoomHealthScoreInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            roomHealthScoreInfo.jumpUrl = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        roomHealthScoreInfo.bubbleMessage = Q9J.LIZIZ(q9h);
                    }
                } else {
                    roomHealthScoreInfo.score = Double.valueOf(Double.longBitsToDouble(q9h.LJIIIZ()));
                }
            } else {
                q9h.LJ(LIZJ);
                return roomHealthScoreInfo;
            }
        }
    }
}
