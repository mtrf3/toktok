package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _EffectingCard_ProtoDecoder implements InterfaceC31105CIr<EffectingCard> {
    public static EffectingCard LIZIZ(Q9H q9h) {
        EffectingCard effectingCard = new EffectingCard();
        effectingCard.criticalStrikeCards = new ArrayList();
        effectingCard.smokeCards = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        effectingCard.smokeCards.add(_SmokeCardInfo_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    effectingCard.criticalStrikeCards.add(_CriticalStrikeCardInfo_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return effectingCard;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final EffectingCard LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
