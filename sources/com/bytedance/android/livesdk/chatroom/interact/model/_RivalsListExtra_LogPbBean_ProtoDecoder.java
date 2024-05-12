package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListExtra;

/* loaded from: classes14.dex */
public final class _RivalsListExtra_LogPbBean_ProtoDecoder implements InterfaceC31105CIr<RivalsListExtra.LogPbBean> {
    public static RivalsListExtra.LogPbBean LIZIZ(Q9H q9h) {
        RivalsListExtra.LogPbBean logPbBean = new RivalsListExtra.LogPbBean();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        logPbBean.clientLogId = Q9J.LIZIZ(q9h);
                    }
                } else {
                    logPbBean.imprId = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return logPbBean;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RivalsListExtra.LogPbBean LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
