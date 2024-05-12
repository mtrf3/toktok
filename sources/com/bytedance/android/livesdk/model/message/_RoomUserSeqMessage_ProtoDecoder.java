package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _RoomUserSeqMessage_ProtoDecoder implements InterfaceC31105CIr<RoomUserSeqMessage> {
    @Override // X.InterfaceC31105CIr
    public final RoomUserSeqMessage LIZ(Q9H q9h) {
        RoomUserSeqMessage roomUserSeqMessage = new RoomUserSeqMessage();
        roomUserSeqMessage.mContributors = new ArrayList();
        roomUserSeqMessage.seats = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        roomUserSeqMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        roomUserSeqMessage.mContributors.add(_Contributor_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 3:
                        roomUserSeqMessage.mTotal = q9h.LJIIJJI();
                        break;
                    case 4:
                        roomUserSeqMessage.popStr = Q9J.LIZIZ(q9h);
                        break;
                    case 5:
                        roomUserSeqMessage.seats.add(_Contributor_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 6:
                        roomUserSeqMessage.mPopularity = q9h.LJIIJJI();
                        break;
                    case 7:
                        roomUserSeqMessage.totalUser = Long.valueOf(q9h.LJIIJJI());
                        break;
                    case 8:
                        roomUserSeqMessage.anonymous = Long.valueOf(q9h.LJIIJJI());
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return roomUserSeqMessage;
            }
        }
    }
}
