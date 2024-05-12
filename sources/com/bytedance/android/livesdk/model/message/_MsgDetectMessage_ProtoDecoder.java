package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _MsgDetectMessage_ProtoDecoder implements InterfaceC31105CIr<MsgDetectMessage> {
    @Override // X.InterfaceC31105CIr
    public final MsgDetectMessage LIZ(Q9H q9h) {
        MsgDetectMessage msgDetectMessage = new MsgDetectMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        msgDetectMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        msgDetectMessage.detectType = q9h.LJIIJ();
                        break;
                    case 3:
                        msgDetectMessage.triggerCondition = _MsgDetectMessage_TriggerCondition_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        msgDetectMessage.timeInfo = _MsgDetectMessage_TimeInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        msgDetectMessage.triggerBy = q9h.LJIIJ();
                        break;
                    case 6:
                        msgDetectMessage.fromRegion = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return msgDetectMessage;
            }
        }
    }
}
