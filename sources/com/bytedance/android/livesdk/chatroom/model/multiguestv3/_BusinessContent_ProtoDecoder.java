package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import webcast.im._CohostContent_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _BusinessContent_ProtoDecoder implements InterfaceC31105CIr<BusinessContent> {
    public static BusinessContent LIZIZ(Q9H q9h) {
        BusinessContent businessContent = new BusinessContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 100) {
                        if (LJI != 200) {
                            Q9J.LIZJ(q9h);
                        } else {
                            businessContent.cohostContent = _CohostContent_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        businessContent.multiLiveContent = _MultiLiveContent_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    businessContent.overLength = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return businessContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BusinessContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
