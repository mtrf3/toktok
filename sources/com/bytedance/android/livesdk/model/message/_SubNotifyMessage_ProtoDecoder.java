package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _SubNotifyMessage_ProtoDecoder implements InterfaceC31105CIr<SubNotifyMessage> {
    @Override // X.InterfaceC31105CIr
    public final SubNotifyMessage LIZ(Q9H q9h) {
        SubNotifyMessage subNotifyMessage = new SubNotifyMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        subNotifyMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        subNotifyMessage.user = _User_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        subNotifyMessage.exhibitionType = q9h.LJIIJ();
                        break;
                    case 4:
                        subNotifyMessage.subMonth = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 5:
                        subNotifyMessage.subscribeType = q9h.LJIIJ();
                        break;
                    case 6:
                        subNotifyMessage.oldSubscribeStatus = q9h.LJIIJ();
                        break;
                    case 7:
                        subNotifyMessage.subscribeMessageType = q9h.LJIIJ();
                        break;
                    case 8:
                        subNotifyMessage.subscribingStatus = q9h.LJIIJ();
                        break;
                    case 9:
                        subNotifyMessage.isSend = Q9J.LIZ(q9h);
                        break;
                    case 10:
                        subNotifyMessage.isCustom = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return subNotifyMessage;
            }
        }
    }
}
