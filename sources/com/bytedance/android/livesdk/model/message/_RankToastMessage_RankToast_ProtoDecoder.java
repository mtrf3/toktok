package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.RankToastMessage;

/* loaded from: classes6.dex */
public final class _RankToastMessage_RankToast_ProtoDecoder implements InterfaceC31105CIr<RankToastMessage.RankToast> {
    public static RankToastMessage.RankToast LIZIZ(Q9H q9h) {
        RankToastMessage.RankToast rankToast = new RankToastMessage.RankToast();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        rankToast.shouldToast = Q9J.LIZ(q9h);
                    }
                } else {
                    rankToast.userId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return rankToast;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final RankToastMessage.RankToast LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
