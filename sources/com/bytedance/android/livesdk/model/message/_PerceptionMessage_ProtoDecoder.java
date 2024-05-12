package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _PerceptionMessage_ProtoDecoder implements InterfaceC31105CIr<PerceptionMessage> {
    public static PerceptionMessage LIZIZ(Q9H q9h) {
        PerceptionMessage perceptionMessage = new PerceptionMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        perceptionMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        perceptionMessage.dialog = _PerceptionDialogInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        perceptionMessage.publicEventInfo = _PunishEventInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        perceptionMessage.endTime = (int) q9h.LJIIJJI();
                        break;
                    case 5:
                        perceptionMessage.showViolation = Boolean.valueOf(Q9J.LIZ(q9h));
                        break;
                    case 6:
                        perceptionMessage.toast = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        perceptionMessage.floatStyle = q9h.LJIIJ();
                        break;
                    case 8:
                        perceptionMessage.floatText = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return perceptionMessage;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final PerceptionMessage LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
