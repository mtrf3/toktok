package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _DrawGuessExitMessage_ProtoDecoder implements InterfaceC31105CIr<DrawGuessExitMessage> {
    @Override // X.InterfaceC31105CIr
    public final DrawGuessExitMessage LIZ(Q9H q9h) {
        DrawGuessExitMessage drawGuessExitMessage = new DrawGuessExitMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                drawGuessExitMessage.pictionaryType = q9h.LJIIJ();
                            }
                        } else {
                            drawGuessExitMessage.showStats = Q9J.LIZ(q9h);
                        }
                    } else {
                        drawGuessExitMessage.sessionId = q9h.LJIIJJI();
                    }
                } else {
                    drawGuessExitMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return drawGuessExitMessage;
            }
        }
    }
}
