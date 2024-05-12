package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model._KaraokeSong_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _KaraokeQueueMessage_ProtoDecoder implements InterfaceC31105CIr<KaraokeQueueMessage> {
    @Override // X.InterfaceC31105CIr
    public final KaraokeQueueMessage LIZ(Q9H q9h) {
        KaraokeQueueMessage karaokeQueueMessage = new KaraokeQueueMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            karaokeQueueMessage.song = _KaraokeSong_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        karaokeQueueMessage.type = q9h.LJIIJ();
                    }
                } else {
                    karaokeQueueMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return karaokeQueueMessage;
            }
        }
    }
}
