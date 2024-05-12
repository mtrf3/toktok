package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _BizCreateChannelParams_ProtoDecoder implements InterfaceC31105CIr<BizCreateChannelParams> {
    public static BizCreateChannelParams LIZIZ(Q9H q9h) {
        BizCreateChannelParams bizCreateChannelParams = new BizCreateChannelParams();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            bizCreateChannelParams.sceneVersion = q9h.LJIIJJI();
                        }
                    } else {
                        bizCreateChannelParams.userSetting = _BizCreateChannelParams_UserSetting_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    bizCreateChannelParams.displayId = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return bizCreateChannelParams;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BizCreateChannelParams LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
