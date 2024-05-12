package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.rank.model._RankTabInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _RankUpdateMessage_ProtoDecoder implements InterfaceC31105CIr<RankUpdateMessage> {
    @Override // X.InterfaceC31105CIr
    public final RankUpdateMessage LIZ(Q9H q9h) {
        RankUpdateMessage rankUpdateMessage = new RankUpdateMessage();
        rankUpdateMessage.tabInfo = new ArrayList();
        rankUpdateMessage.updates = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        rankUpdateMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        rankUpdateMessage.updates.add(_RankUpdate_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 3:
                        rankUpdateMessage.groupType = q9h.LJIIJ();
                        break;
                    case 4:
                        rankUpdateMessage.opType = q9h.LJIIJ();
                        break;
                    case 5:
                        rankUpdateMessage.rankPriority = q9h.LJIIJJI();
                        break;
                    case 6:
                        rankUpdateMessage.tabInfo.add(_RankTabInfo_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 7:
                        rankUpdateMessage.loop = Q9J.LIZ(q9h);
                        break;
                    case 8:
                        rankUpdateMessage.animationLoopForOff = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return rankUpdateMessage;
            }
        }
    }
}
