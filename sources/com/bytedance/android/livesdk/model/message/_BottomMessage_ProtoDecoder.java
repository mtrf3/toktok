package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes6.dex */
public final class _BottomMessage_ProtoDecoder implements InterfaceC31105CIr<BottomMessage> {
    @Override // X.InterfaceC31105CIr
    public final BottomMessage LIZ(Q9H q9h) {
        BottomMessage bottomMessage = new BottomMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        bottomMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        bottomMessage.content = Q9J.LIZIZ(q9h);
                        break;
                    case 3:
                        bottomMessage.showType = q9h.LJIIJ();
                        break;
                    case 4:
                        bottomMessage.textType = q9h.LJIIJ();
                        break;
                    case 5:
                        bottomMessage.duration = q9h.LJIIJJI();
                        break;
                    case 6:
                        bottomMessage.bizType = q9h.LJIIJ();
                        break;
                    case 7:
                        bottomMessage.violationUserId = q9h.LJIIJJI();
                        break;
                    case 8:
                        bottomMessage.punishInfo = _PunishEventInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 9:
                        bottomMessage.style = q9h.LJIIJ();
                        break;
                    case 10:
                        bottomMessage.detailUrl = Q9J.LIZIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        bottomMessage.floatStyle = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return bottomMessage;
            }
        }
    }
}
