package webcast.im;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.util.ArrayList;
import tikcast.linkmic.common._BackGroundImageState_ProtoDecoder;
import tikcast.linkmic.common._LayoutState_ProtoDecoder;
import tikcast.linkmic.common._LinkUserState_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _LinkStateMessage_ProtoDecoder implements InterfaceC31105CIr<LinkStateMessage> {
    @Override // X.InterfaceC31105CIr
    public final LinkStateMessage LIZ(Q9H q9h) {
        LinkStateMessage linkStateMessage = new LinkStateMessage();
        linkStateMessage.userStates = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        linkStateMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        linkStateMessage.channelId = q9h.LJIIJJI();
                        break;
                    case 3:
                        linkStateMessage.scene = q9h.LJIIJ();
                        break;
                    case 4:
                        linkStateMessage.version = q9h.LJIIJJI();
                        break;
                    case 5:
                        linkStateMessage.needAck = q9h.LJIIJ();
                        break;
                    case 6:
                        linkStateMessage.layout = _LayoutState_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        linkStateMessage.userStates.add(_LinkUserState_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 8:
                        linkStateMessage.clientSendTime = q9h.LJIIJJI();
                        break;
                    case 9:
                        linkStateMessage.stateType = q9h.LJIIJ();
                        break;
                    case 10:
                        linkStateMessage.background = _BackGroundImageState_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return linkStateMessage;
            }
        }
    }
}
