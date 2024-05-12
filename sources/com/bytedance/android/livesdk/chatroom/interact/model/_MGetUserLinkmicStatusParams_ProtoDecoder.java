package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _MGetUserLinkmicStatusParams_ProtoDecoder implements InterfaceC31105CIr<MGetUserLinkmicStatusParams> {
    @Override // X.InterfaceC31105CIr
    public final MGetUserLinkmicStatusParams LIZ(Q9H q9h) {
        MGetUserLinkmicStatusParams mGetUserLinkmicStatusParams = new MGetUserLinkmicStatusParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        mGetUserLinkmicStatusParams.roomId = q9h.LJIIJJI();
                        break;
                    case 2:
                        mGetUserLinkmicStatusParams.toUserIds = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        mGetUserLinkmicStatusParams.toRoomIds = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        mGetUserLinkmicStatusParams.friendListRoomIds = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        mGetUserLinkmicStatusParams.recommendListRoomIds = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        mGetUserLinkmicStatusParams.reservationListRoomIds = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return mGetUserLinkmicStatusParams;
            }
        }
    }
}
