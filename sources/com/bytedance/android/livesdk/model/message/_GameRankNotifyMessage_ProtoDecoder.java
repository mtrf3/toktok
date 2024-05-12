package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _GameRankNotifyMessage_ProtoDecoder implements InterfaceC31105CIr<GameRankNotifyMessage> {
    @Override // X.InterfaceC31105CIr
    public final GameRankNotifyMessage LIZ(Q9H q9h) {
        GameRankNotifyMessage gameRankNotifyMessage = new GameRankNotifyMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            gameRankNotifyMessage.notifyText = _Text_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        gameRankNotifyMessage.msgType = q9h.LJIIJ();
                    }
                } else {
                    gameRankNotifyMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return gameRankNotifyMessage;
            }
        }
    }
}
