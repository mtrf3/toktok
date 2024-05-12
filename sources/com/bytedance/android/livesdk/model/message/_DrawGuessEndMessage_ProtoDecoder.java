package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _DrawGuessEndMessage_ProtoDecoder implements InterfaceC31105CIr<DrawGuessEndMessage> {
    @Override // X.InterfaceC31105CIr
    public final DrawGuessEndMessage LIZ(Q9H q9h) {
        DrawGuessEndMessage drawGuessEndMessage = new DrawGuessEndMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    drawGuessEndMessage.pictionaryType = q9h.LJIIJ();
                                }
                            } else {
                                drawGuessEndMessage.endType = q9h.LJIIJ();
                            }
                        } else {
                            drawGuessEndMessage.word = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        drawGuessEndMessage.roundId = q9h.LJIIJJI();
                    }
                } else {
                    drawGuessEndMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return drawGuessEndMessage;
            }
        }
    }
}
