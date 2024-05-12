package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _PollMessage_ProtoDecoder implements InterfaceC31105CIr<PollMessage> {
    @Override // X.InterfaceC31105CIr
    public final PollMessage LIZ(Q9H q9h) {
        PollMessage pollMessage = new PollMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        pollMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        pollMessage.messageType = q9h.LJIIJJI();
                        break;
                    case 3:
                        pollMessage.pollId = q9h.LJIIJJI();
                        break;
                    case 4:
                        pollMessage.startContent = _PollStartContent_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        pollMessage.endContent = _PollEndContent_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        pollMessage.updateContent = _PollUpdateVotesContent_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        pollMessage.pollKind = Integer.valueOf(q9h.LJIIJ());
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return pollMessage;
            }
        }
    }
}
