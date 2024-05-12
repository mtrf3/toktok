package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.OptPairInfo;

/* loaded from: classes14.dex */
public final class _OptPairInfo_OptPairUser_ProtoDecoder implements InterfaceC31105CIr<OptPairInfo.OptPairUser> {
    public static OptPairInfo.OptPairUser LIZIZ(Q9H q9h) {
        OptPairInfo.OptPairUser optPairUser = new OptPairInfo.OptPairUser();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        optPairUser.roomId = q9h.LJIIJJI();
                    }
                } else {
                    optPairUser.user = _User_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return optPairUser;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final OptPairInfo.OptPairUser LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
