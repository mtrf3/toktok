package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes17.dex */
public final class _RoomReplayReason_ProtoDecoder implements InterfaceC31105CIr<RoomReplayReason> {
    public static RoomReplayReason LIZIZ(Q9H q9h) {
        RoomReplayReason roomReplayReason = new RoomReplayReason();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        roomReplayReason.reason = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        roomReplayReason.value = q9h.LJIIJJI();
                        break;
                    case 3:
                        roomReplayReason.type = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        roomReplayReason.promotionId = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        roomReplayReason.typeName = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        roomReplayReason.typeIcon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return roomReplayReason;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RoomReplayReason LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
