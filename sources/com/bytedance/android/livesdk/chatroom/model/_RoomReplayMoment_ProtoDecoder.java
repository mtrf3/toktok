package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes17.dex */
public final class _RoomReplayMoment_ProtoDecoder implements InterfaceC31105CIr<RoomReplayMoment> {
    public static RoomReplayMoment LIZIZ(Q9H q9h) {
        RoomReplayMoment roomReplayMoment = new RoomReplayMoment();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        roomReplayMoment.id = Q9J.LIZIZ(q9h);
                        break;
                    case 2:
                        roomReplayMoment.momentStartTime = q9h.LJIIJJI();
                        break;
                    case 3:
                        roomReplayMoment.momentEndTime = q9h.LJIIJJI();
                        break;
                    case 4:
                        roomReplayMoment.vid = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        roomReplayMoment.pushStatus = q9h.LJIIJJI();
                        break;
                    case 6:
                        roomReplayMoment.reason = _RoomReplayReason_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        roomReplayMoment.cover = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        roomReplayMoment.playUrl = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return roomReplayMoment;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RoomReplayMoment LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
