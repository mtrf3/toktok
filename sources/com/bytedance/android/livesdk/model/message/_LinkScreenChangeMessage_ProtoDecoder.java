package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _LinkScreenChangeMessage_ProtoDecoder implements InterfaceC31105CIr<LinkScreenChangeMessage> {
    @Override // X.InterfaceC31105CIr
    public final LinkScreenChangeMessage LIZ(Q9H q9h) {
        LinkScreenChangeMessage linkScreenChangeMessage = new LinkScreenChangeMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                Q9J.LIZJ(q9h);
                            } else {
                                linkScreenChangeMessage.enlargeStatusSyn = _LinkerEnlargeStatusSynContent_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            linkScreenChangeMessage.guestCancelEnlarge = _LinkerGuestCancelEnlargeContent_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        linkScreenChangeMessage.messageType = q9h.LJIIJ();
                    }
                } else {
                    linkScreenChangeMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return linkScreenChangeMessage;
            }
        }
    }
}
