package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _ControlMessage_ProtoDecoder implements InterfaceC31105CIr<ControlMessage> {
    @Override // X.InterfaceC31105CIr
    public final ControlMessage LIZ(Q9H q9h) {
        ControlMessage controlMessage = new ControlMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        controlMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        controlMessage.action = (int) q9h.LJIIJJI();
                        break;
                    case 3:
                        controlMessage.tips = Q9J.LIZIZ(q9h);
                        break;
                    case 4:
                        controlMessage.extraInfo = _ControlMessage_Extra_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        controlMessage.perceptionDialogInfo = _PerceptionDialogInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        controlMessage.perceptionAudienceText = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        controlMessage.punishInfo = _PunishEventInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        controlMessage.floatText = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                        controlMessage.floatStyle = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return controlMessage;
            }
        }
    }
}
