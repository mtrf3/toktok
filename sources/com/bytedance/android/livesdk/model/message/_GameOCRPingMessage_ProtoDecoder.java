package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _GameOCRPingMessage_ProtoDecoder implements InterfaceC31105CIr<GameOCRPingMessage> {
    @Override // X.InterfaceC31105CIr
    public final GameOCRPingMessage LIZ(Q9H q9h) {
        GameOCRPingMessage gameOCRPingMessage = new GameOCRPingMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        gameOCRPingMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        gameOCRPingMessage.pingValue = q9h.LJIIJJI();
                        break;
                    case 3:
                        gameOCRPingMessage.isGame = Q9J.LIZ(q9h);
                        break;
                    case 4:
                        gameOCRPingMessage.gameFusionLabel = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        gameOCRPingMessage.pingTimestamp = q9h.LJIIJJI();
                        break;
                    case 6:
                        gameOCRPingMessage.confidence = Double.longBitsToDouble(q9h.LJIIIZ());
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return gameOCRPingMessage;
            }
        }
    }
}
