package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.interact.model.TopicLikeResponse;

/* loaded from: classes14.dex */
public final class _TopicLikeResponse_ProtoDecoder implements InterfaceC31105CIr<TopicLikeResponse> {
    @Override // X.InterfaceC31105CIr
    public final TopicLikeResponse LIZ(Q9H q9h) {
        TopicLikeResponse topicLikeResponse = new TopicLikeResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    TopicLikeResponse.ResponseData responseData = new TopicLikeResponse.ResponseData();
                    long LIZJ2 = q9h.LIZJ();
                    while (q9h.LJI() != -1) {
                        Q9J.LIZJ(q9h);
                    }
                    q9h.LJ(LIZJ2);
                    topicLikeResponse.data = responseData;
                }
            } else {
                q9h.LJ(LIZJ);
                return topicLikeResponse;
            }
        }
    }
}
