package com.bytedance.android.livesdk.subscribe.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SubInfo_ProtoDecoder;

/* loaded from: classes17.dex */
public final class _SubscriberInfo_ProtoDecoder implements InterfaceC31105CIr<SubscriberInfo> {
    public static SubscriberInfo LIZIZ(Q9H q9h) {
        SubscriberInfo subscriberInfo = new SubscriberInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 2) {
                    if (LJI != 3) {
                        if (LJI != 4) {
                            Q9J.LIZJ(q9h);
                        } else {
                            subscriberInfo.sendSubs = q9h.LJIIJJI();
                        }
                    } else {
                        subscriberInfo.subInfo = _SubInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    subscriberInfo.subscriber = _User_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return subscriberInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubscriberInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
