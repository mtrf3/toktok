package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _DrawGuessUpdateMessage_ProtoDecoder implements InterfaceC31105CIr<DrawGuessUpdateMessage> {
    @Override // X.InterfaceC31105CIr
    public final DrawGuessUpdateMessage LIZ(Q9H q9h) {
        DrawGuessUpdateMessage drawGuessUpdateMessage = new DrawGuessUpdateMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            drawGuessUpdateMessage.roundId = q9h.LJIIJJI();
                        }
                    } else {
                        drawGuessUpdateMessage.correctCount = q9h.LJIIJJI();
                    }
                } else {
                    drawGuessUpdateMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return drawGuessUpdateMessage;
            }
        }
    }
}