package com.bytedance.android.livesdk.model.message.redenvelope;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _RedEnvelopMessage_ProtoDecoder implements InterfaceC31105CIr<RedEnvelopMessage> {
    @Override // X.InterfaceC31105CIr
    public final RedEnvelopMessage LIZ(Q9H q9h) {
        RedEnvelopMessage redEnvelopMessage = new RedEnvelopMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            redEnvelopMessage.display = q9h.LJIIJ();
                        }
                    } else {
                        redEnvelopMessage.envelopeInfo = _MessageRedEnvelopInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    redEnvelopMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return redEnvelopMessage;
            }
        }
    }
}
