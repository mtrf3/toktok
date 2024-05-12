package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes6.dex */
public final class _RemindMessage_ProtoDecoder implements InterfaceC31105CIr<RemindMessage> {
    @Override // X.InterfaceC31105CIr
    public final RemindMessage LIZ(Q9H q9h) {
        RemindMessage remindMessage = new RemindMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        remindMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        remindMessage.content = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        remindMessage.noticeType = (int) q9h.LJIIJJI();
                        break;
                    case 4:
                        remindMessage.style = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        remindMessage.title = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        remindMessage.violationReason = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        remindMessage.illegalText = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        remindMessage.bottomTip = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                        remindMessage.tipUrl = Q9J.LIZIZ(q9h);
                        break;
                    case 10:
                        remindMessage.noticeTitle = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        remindMessage.noticeContent = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 12:
                        remindMessage.scene = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return remindMessage;
            }
        }
    }
}
