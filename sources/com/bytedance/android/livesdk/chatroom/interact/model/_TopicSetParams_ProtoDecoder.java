package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes17.dex */
public final class _TopicSetParams_ProtoDecoder implements InterfaceC31105CIr<TopicSetParams> {
    @Override // X.InterfaceC31105CIr
    public final TopicSetParams LIZ(Q9H q9h) {
        TopicSetParams topicSetParams = new TopicSetParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    topicSetParams.roomId = q9h.LJIIJJI();
                                }
                            } else {
                                topicSetParams.topicSessionId = q9h.LJIIJJI();
                            }
                        } else {
                            topicSetParams.channelId = q9h.LJIIJJI();
                        }
                    } else {
                        topicSetParams.topicId = q9h.LJIIJJI();
                    }
                } else {
                    topicSetParams.action = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return topicSetParams;
            }
        }
    }
}
