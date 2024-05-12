package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _EcBarrageMessage_ProtoDecoder implements InterfaceC31105CIr<EcBarrageMessage> {
    @Override // X.InterfaceC31105CIr
    public final EcBarrageMessage LIZ(Q9H q9h) {
        EcBarrageMessage ecBarrageMessage = new EcBarrageMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        ecBarrageMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        ecBarrageMessage.icon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        ecBarrageMessage.content = _Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        ecBarrageMessage.duration = q9h.LJIIJJI();
                        break;
                    case 5:
                        ecBarrageMessage.backgroundColor = Q9J.LIZIZ(q9h);
                        break;
                    case 6:
                        ecBarrageMessage.backgroundOpacity = Double.longBitsToDouble(q9h.LJIIIZ());
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return ecBarrageMessage;
            }
        }
    }
}
