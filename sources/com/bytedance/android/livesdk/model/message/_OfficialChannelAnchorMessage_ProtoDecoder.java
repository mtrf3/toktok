package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _OfficialChannelAnchorMessage_ProtoDecoder implements InterfaceC31105CIr<OfficialChannelAnchorMessage> {
    @Override // X.InterfaceC31105CIr
    public final OfficialChannelAnchorMessage LIZ(Q9H q9h) {
        OfficialChannelAnchorMessage officialChannelAnchorMessage = new OfficialChannelAnchorMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        officialChannelAnchorMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        officialChannelAnchorMessage.startTimeStamp = q9h.LJIIJJI();
                        break;
                    case 3:
                        officialChannelAnchorMessage.endTimeStamp = q9h.LJIIJJI();
                        break;
                    case 4:
                        officialChannelAnchorMessage.roleType = q9h.LJIIJ();
                        break;
                    case 5:
                        officialChannelAnchorMessage.existLinkmic = Q9J.LIZ(q9h);
                        break;
                    case 6:
                        officialChannelAnchorMessage.linkmicType = q9h.LJIIJ();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return officialChannelAnchorMessage;
            }
        }
    }
}
