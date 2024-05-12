package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.interact.model.TopicSetResponse;

/* loaded from: classes14.dex */
public final class _TopicSetResponse_ProtoDecoder implements InterfaceC31105CIr<TopicSetResponse> {
    @Override // X.InterfaceC31105CIr
    public final TopicSetResponse LIZ(Q9H q9h) {
        TopicSetResponse topicSetResponse = new TopicSetResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    TopicSetResponse.ResponseData responseData = new TopicSetResponse.ResponseData();
                    long LIZJ2 = q9h.LIZJ();
                    while (q9h.LJI() != -1) {
                        Q9J.LIZJ(q9h);
                    }
                    q9h.LJ(LIZJ2);
                    topicSetResponse.data = responseData;
                }
            } else {
                q9h.LJ(LIZJ);
                return topicSetResponse;
            }
        }
    }
}
