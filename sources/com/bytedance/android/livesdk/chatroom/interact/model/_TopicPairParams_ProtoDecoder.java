package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _TopicPairParams_ProtoDecoder implements InterfaceC31105CIr<TopicPairParams> {
    @Override // X.InterfaceC31105CIr
    public final TopicPairParams LIZ(Q9H q9h) {
        TopicPairParams topicPairParams = new TopicPairParams();
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
                                    topicPairParams.innerChannelId = q9h.LJIIJJI();
                                }
                            } else {
                                topicPairParams.pairId = q9h.LJIIJJI();
                            }
                        } else {
                            topicPairParams.roomId = q9h.LJIIJJI();
                        }
                    } else {
                        topicPairParams.topicId = q9h.LJIIJJI();
                    }
                } else {
                    topicPairParams.action = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return topicPairParams;
            }
        }
    }
}
