package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.interact.model.TopicPairResponse;

/* loaded from: classes14.dex */
public final class _TopicPairResponse_ResponseData_Setting_ProtoDecoder implements InterfaceC31105CIr<TopicPairResponse.ResponseData.Setting> {
    public static TopicPairResponse.ResponseData.Setting LIZIZ(Q9H q9h) {
        TopicPairResponse.ResponseData.Setting setting = new TopicPairResponse.ResponseData.Setting();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        setting.timeoutSec = q9h.LJIIJJI();
                    }
                } else {
                    setting.expectSuccSec = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return setting;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TopicPairResponse.ResponseData.Setting LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
