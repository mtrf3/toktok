package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _RankTextMessage_ProtoDecoder implements InterfaceC31105CIr<RankTextMessage> {
    @Override // X.InterfaceC31105CIr
    public final RankTextMessage LIZ(Q9H q9h) {
        RankTextMessage rankTextMessage = new RankTextMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        rankTextMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        rankTextMessage.scene = q9h.LJIIJ();
                        break;
                    case 3:
                        rankTextMessage.ownerIdxBeforeUpdate = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 4:
                        rankTextMessage.ownerIdxAfterUpdate = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 5:
                        rankTextMessage.selfGetBadgeMsg = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        rankTextMessage.otherGetBadgeMsg = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        rankTextMessage.curUserId = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return rankTextMessage;
            }
        }
    }
}
