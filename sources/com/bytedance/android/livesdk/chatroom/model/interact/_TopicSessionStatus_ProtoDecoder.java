package com.bytedance.android.livesdk.chatroom.model.interact;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _TopicSessionStatus_ProtoDecoder implements InterfaceC31105CIr<TopicSessionStatus> {
    public static TopicSessionStatus LIZIZ(Q9H q9h) {
        TopicSessionStatus topicSessionStatus = new TopicSessionStatus();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        topicSessionStatus.sessionHeat = q9h.LJIIJJI();
                    }
                } else {
                    topicSessionStatus.sessionId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return topicSessionStatus;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TopicSessionStatus LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
