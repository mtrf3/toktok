package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.MarqueeAnnouncementMessage;

/* loaded from: classes6.dex */
public final class _MarqueeAnnouncementMessage_MessageEntity_ProtoDecoder implements InterfaceC31105CIr<MarqueeAnnouncementMessage.MessageEntity> {
    public static MarqueeAnnouncementMessage.MessageEntity LIZIZ(Q9H q9h) {
        MarqueeAnnouncementMessage.MessageEntity messageEntity = new MarqueeAnnouncementMessage.MessageEntity();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    messageEntity.notifyMessage = _RoomNotifyMessage_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return messageEntity;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MarqueeAnnouncementMessage.MessageEntity LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
