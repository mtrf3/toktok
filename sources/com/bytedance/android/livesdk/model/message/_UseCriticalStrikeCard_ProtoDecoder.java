package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._CriticalStrikeCardInfo_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _UseCriticalStrikeCard_ProtoDecoder implements InterfaceC31105CIr<UseCriticalStrikeCard> {
    public static UseCriticalStrikeCard LIZIZ(Q9H q9h) {
        UseCriticalStrikeCard useCriticalStrikeCard = new UseCriticalStrikeCard();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            useCriticalStrikeCard.displayContent = _Text_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        useCriticalStrikeCard.anchorId = q9h.LJIIJJI();
                    }
                } else {
                    useCriticalStrikeCard.cardInfo = _CriticalStrikeCardInfo_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return useCriticalStrikeCard;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final UseCriticalStrikeCard LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
