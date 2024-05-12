package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _TopicListParams_ProtoDecoder implements InterfaceC31105CIr<TopicListParams> {
    @Override // X.InterfaceC31105CIr
    public final TopicListParams LIZ(Q9H q9h) {
        TopicListParams topicListParams = new TopicListParams();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return topicListParams;
    }
}
