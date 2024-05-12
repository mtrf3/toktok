package com.bytedance.android.livesdk.model.message.ext;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes13.dex */
public final class _EcDrawMessage_ProtoDecoder implements InterfaceC31105CIr<EcDrawMessage> {
    @Override // X.InterfaceC31105CIr
    public final EcDrawMessage LIZ(Q9H q9h) {
        EcDrawMessage ecDrawMessage = new EcDrawMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        ecDrawMessage.entity = _EcDrawEntity_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    ecDrawMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return ecDrawMessage;
            }
        }
    }
}
