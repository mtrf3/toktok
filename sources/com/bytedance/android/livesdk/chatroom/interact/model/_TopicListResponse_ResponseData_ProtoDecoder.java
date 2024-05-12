package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.interact.model.TopicListResponse;
import com.bytedance.android.livesdk.chatroom.model.interact._CohostTopic_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _TopicListResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<TopicListResponse.ResponseData> {
    public static TopicListResponse.ResponseData LIZIZ(Q9H q9h) {
        TopicListResponse.ResponseData responseData = new TopicListResponse.ResponseData();
        responseData.topics = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    responseData.topics.add(_CohostTopic_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TopicListResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
