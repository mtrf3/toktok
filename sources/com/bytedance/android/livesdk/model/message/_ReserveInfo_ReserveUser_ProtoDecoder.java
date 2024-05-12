package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.ReserveInfo;

/* loaded from: classes14.dex */
public final class _ReserveInfo_ReserveUser_ProtoDecoder implements InterfaceC31105CIr<ReserveInfo.ReserveUser> {
    public static ReserveInfo.ReserveUser LIZIZ(Q9H q9h) {
        ReserveInfo.ReserveUser reserveUser = new ReserveInfo.ReserveUser();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        reserveUser.roomId = q9h.LJIIJJI();
                    }
                } else {
                    reserveUser.user = _User_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return reserveUser;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ReserveInfo.ReserveUser LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
