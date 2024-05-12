package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _KaraokeSwitchMessage_ProtoDecoder implements InterfaceC31105CIr<KaraokeSwitchMessage> {
    @Override // X.InterfaceC31105CIr
    public final KaraokeSwitchMessage LIZ(Q9H q9h) {
        KaraokeSwitchMessage karaokeSwitchMessage = new KaraokeSwitchMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            karaokeSwitchMessage.status = q9h.LJIIJ();
                        }
                    } else {
                        karaokeSwitchMessage.type = q9h.LJIIJ();
                    }
                } else {
                    karaokeSwitchMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return karaokeSwitchMessage;
            }
        }
    }
}
