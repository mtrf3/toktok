package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.util.ArrayList;
import tikcast.linkmic.common._LinkMicAdContent_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _LinkMicAdMessage_ProtoDecoder implements InterfaceC31105CIr<LinkMicAdMessage> {
    @Override // X.InterfaceC31105CIr
    public final LinkMicAdMessage LIZ(Q9H q9h) {
        LinkMicAdMessage linkMicAdMessage = new LinkMicAdMessage();
        linkMicAdMessage.linkAdContents = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            linkMicAdMessage.linkAdContents.add(_LinkMicAdContent_ProtoDecoder.LIZIZ(q9h));
                        }
                    } else {
                        linkMicAdMessage.messageType = q9h.LJIIJ();
                    }
                } else {
                    linkMicAdMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return linkMicAdMessage;
            }
        }
    }
}
