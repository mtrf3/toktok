package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _TopicLikeParams_ProtoDecoder implements InterfaceC31105CIr<TopicLikeParams> {
    @Override // X.InterfaceC31105CIr
    public final TopicLikeParams LIZ(Q9H q9h) {
        TopicLikeParams topicLikeParams = new TopicLikeParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        topicLikeParams.topicId = q9h.LJIIJJI();
                    }
                } else {
                    topicLikeParams.action = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return topicLikeParams;
            }
        }
    }
}
