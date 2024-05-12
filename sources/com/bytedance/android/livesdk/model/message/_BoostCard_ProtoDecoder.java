package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes6.dex */
public final class _BoostCard_ProtoDecoder implements InterfaceC31105CIr<BoostCard> {
    public static BoostCard LIZIZ(Q9H q9h) {
        BoostCard boostCard = new BoostCard();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            boostCard.mTaskId = q9h.LJIIJJI();
                        }
                    } else {
                        boostCard.mTaskSource = q9h.LJIIJ();
                    }
                } else {
                    boostCard.mCardId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return boostCard;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final BoostCard LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
