package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _InviteTopHostInfo_ProtoDecoder implements InterfaceC31105CIr<InviteTopHostInfo> {
    public static InviteTopHostInfo LIZIZ(Q9H q9h) {
        InviteTopHostInfo inviteTopHostInfo = new InviteTopHostInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        inviteTopHostInfo.topIndex = Long.valueOf(q9h.LJIIJJI());
                    }
                } else {
                    inviteTopHostInfo.rankType = Q9J.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return inviteTopHostInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final InviteTopHostInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
