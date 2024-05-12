package webcast.im;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import webcast.data.multi_guest_play._ShowContent_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _LiveShowMessage_ProtoDecoder implements InterfaceC31105CIr<LiveShowMessage> {
    @Override // X.InterfaceC31105CIr
    public final LiveShowMessage LIZ(Q9H q9h) {
        LiveShowMessage liveShowMessage = new LiveShowMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            liveShowMessage.showContent = _ShowContent_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        liveShowMessage.messageType = q9h.LJIIJ();
                    }
                } else {
                    liveShowMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return liveShowMessage;
            }
        }
    }
}
