package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes13.dex */
public final class _BALeadGenMessage_ProtoDecoder implements InterfaceC31105CIr<BALeadGenMessage> {
    @Override // X.InterfaceC31105CIr
    public final BALeadGenMessage LIZ(Q9H q9h) {
        BALeadGenMessage bALeadGenMessage = new BALeadGenMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        bALeadGenMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        bALeadGenMessage.op = q9h.LJIIJ();
                        break;
                    case 3:
                        bALeadGenMessage.pageId = q9h.LJIIJJI();
                        break;
                    case 4:
                        bALeadGenMessage.opTime = q9h.LJIIJJI();
                        break;
                    case 5:
                        bALeadGenMessage.ctaText = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        bALeadGenMessage.schema = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return bALeadGenMessage;
            }
        }
    }
}
