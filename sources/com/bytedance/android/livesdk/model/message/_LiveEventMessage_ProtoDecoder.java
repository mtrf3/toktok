package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import webcast.data._EventCard_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _LiveEventMessage_ProtoDecoder implements InterfaceC31105CIr<LiveEventMessage> {
    @Override // X.InterfaceC31105CIr
    public final LiveEventMessage LIZ(Q9H q9h) {
        LiveEventMessage liveEventMessage = new LiveEventMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            liveEventMessage.card = _EventCard_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        liveEventMessage.actionType = q9h.LJIIJ();
                    }
                } else {
                    liveEventMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return liveEventMessage;
            }
        }
    }
}
