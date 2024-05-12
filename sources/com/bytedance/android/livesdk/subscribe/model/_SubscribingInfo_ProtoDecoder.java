package com.bytedance.android.livesdk.subscribe.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SubInfo_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.api._SubLevel_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _SubscribingInfo_ProtoDecoder implements InterfaceC31105CIr<SubscribingInfo> {
    public static SubscribingInfo LIZIZ(Q9H q9h) {
        SubscribingInfo subscribingInfo = new SubscribingInfo();
        subscribingInfo.allLevels = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 2) {
                    if (LJI != 3) {
                        if (LJI != 5) {
                            Q9J.LIZJ(q9h);
                        } else {
                            subscribingInfo.allLevels.add(_SubLevel_ProtoDecoder.LIZIZ(q9h));
                        }
                    } else {
                        subscribingInfo.subInfo = _SubInfo_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    subscribingInfo.anchorInfo = _User_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return subscribingInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubscribingInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
