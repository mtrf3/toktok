package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.interact.model.TopicSetResponse;

/* loaded from: classes14.dex */
public final class _TopicSetResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<TopicSetResponse.ResponseData> {
    @Override // X.InterfaceC31105CIr
    public final TopicSetResponse.ResponseData LIZ(Q9H q9h) {
        TopicSetResponse.ResponseData responseData = new TopicSetResponse.ResponseData();
        long LIZJ = q9h.LIZJ();
        while (q9h.LJI() != -1) {
            Q9J.LIZJ(q9h);
        }
        q9h.LJ(LIZJ);
        return responseData;
    }
}
