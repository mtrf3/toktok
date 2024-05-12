package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _RoomMessage_ProtoDecoder implements InterfaceC31105CIr<RoomMessage> {
    public static RoomMessage LIZIZ(Q9H q9h) {
        RoomMessage roomMessage = new RoomMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        roomMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        roomMessage.content = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        roomMessage.supprotLandscape = Boolean.valueOf(Q9J.LIZ(q9h));
                        break;
                    case 4:
                        roomMessage.source = (int) q9h.LJIIJJI();
                        break;
                    case 5:
                        roomMessage.icon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        roomMessage.scene = Q9J.LIZIZ(q9h);
                        break;
                    case 7:
                        roomMessage.isWelcome = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return roomMessage;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RoomMessage LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
