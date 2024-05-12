package com.bytedance.android.livesdk.game.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message._PunishEventInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _AccessRecallMessage_ProtoDecoder implements InterfaceC31105CIr<AccessRecallMessage> {
    @Override // X.InterfaceC31105CIr
    public final AccessRecallMessage LIZ(Q9H q9h) {
        AccessRecallMessage accessRecallMessage = new AccessRecallMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        accessRecallMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        accessRecallMessage.status = q9h.LJIIJ();
                        break;
                    case 3:
                        accessRecallMessage.duration = q9h.LJIIJJI();
                        break;
                    case 4:
                        accessRecallMessage.endTime = q9h.LJIIJJI();
                        break;
                    case 5:
                        accessRecallMessage.scene = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        accessRecallMessage.notice = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        accessRecallMessage.content = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        accessRecallMessage.punishInfo = _PunishEventInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return accessRecallMessage;
            }
        }
    }
}
