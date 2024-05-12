package com.bytedance.android.livesdk.chatroom.model.multilive;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _MultiLiveLayoutInfo_ProtoDecoder implements InterfaceC31105CIr<MultiLiveLayoutInfo> {
    public static MultiLiveLayoutInfo LIZIZ(Q9H q9h) {
        MultiLiveLayoutInfo multiLiveLayoutInfo = new MultiLiveLayoutInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            multiLiveLayoutInfo.fixSwitchOn = q9h.LJIIJ();
                        }
                    } else {
                        multiLiveLayoutInfo.anchorNewLayout = q9h.LJIIJ();
                    }
                } else {
                    multiLiveLayoutInfo.userMultiLiveLayout = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return multiLiveLayoutInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MultiLiveLayoutInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
