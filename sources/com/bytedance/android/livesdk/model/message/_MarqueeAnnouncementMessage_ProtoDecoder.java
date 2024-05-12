package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _MarqueeAnnouncementMessage_ProtoDecoder implements InterfaceC31105CIr<MarqueeAnnouncementMessage> {
    @Override // X.InterfaceC31105CIr
    public final MarqueeAnnouncementMessage LIZ(Q9H q9h) {
        MarqueeAnnouncementMessage marqueeAnnouncementMessage = new MarqueeAnnouncementMessage();
        marqueeAnnouncementMessage.messageEntity = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            marqueeAnnouncementMessage.messageEntity.add(_MarqueeAnnouncementMessage_MessageEntity_ProtoDecoder.LIZIZ(q9h));
                        }
                    } else {
                        marqueeAnnouncementMessage.messageScene = Q9J.LIZIZ(q9h);
                    }
                } else {
                    marqueeAnnouncementMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return marqueeAnnouncementMessage;
            }
        }
    }
}
