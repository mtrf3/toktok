package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.interact.model.TopicPairResponse;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _TopicPairResponse_ResponseData_ProtoDecoder implements InterfaceC31105CIr<TopicPairResponse.ResponseData> {
    public static TopicPairResponse.ResponseData LIZIZ(Q9H q9h) {
        TopicPairResponse.ResponseData responseData = new TopicPairResponse.ResponseData();
        responseData.rivalAvatars = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            responseData.setting = _TopicPairResponse_ResponseData_Setting_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        responseData.rivalAvatars.add(_ImageModel_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    responseData.pairId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return responseData;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TopicPairResponse.ResponseData LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
