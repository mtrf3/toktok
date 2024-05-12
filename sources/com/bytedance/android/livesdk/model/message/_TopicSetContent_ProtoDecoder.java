package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _TopicSetContent_ProtoDecoder implements InterfaceC31105CIr<TopicSetContent> {
    public static TopicSetContent LIZIZ(Q9H q9h) {
        TopicSetContent topicSetContent = new TopicSetContent();
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
                                    topicSetContent.enterScene = q9h.LJIIJ();
                                }
                            } else {
                                topicSetContent.setSuccTime = q9h.LJIIJJI();
                            }
                        } else {
                            topicSetContent.setUserId = q9h.LJIIJJI();
                        }
                    } else {
                        topicSetContent.channelId = q9h.LJIIJJI();
                    }
                } else {
                    topicSetContent.action = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return topicSetContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TopicSetContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
