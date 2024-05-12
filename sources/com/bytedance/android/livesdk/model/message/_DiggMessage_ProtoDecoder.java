package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _DiggMessage_ProtoDecoder implements InterfaceC31105CIr<DiggMessage> {
    @Override // X.InterfaceC31105CIr
    public final DiggMessage LIZ(Q9H q9h) {
        DiggMessage diggMessage = new DiggMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        diggMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        diggMessage.diggCount = (int) q9h.LJIIJJI();
                        break;
                    case 3:
                        diggMessage.duration = (int) q9h.LJIIJJI();
                        break;
                    case 4:
                        diggMessage.color = (int) q9h.LJIIJJI();
                        break;
                    case 5:
                        diggMessage.user = _User_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        diggMessage.icon = Q9J.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return diggMessage;
            }
        }
    }
}
