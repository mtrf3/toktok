package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.match._SmokeCardInfo_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _UseSmokeCard_ProtoDecoder implements InterfaceC31105CIr<UseSmokeCard> {
    public static UseSmokeCard LIZIZ(Q9H q9h) {
        UseSmokeCard useSmokeCard = new UseSmokeCard();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            useSmokeCard.displayContent = _Text_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        useSmokeCard.anchorId = q9h.LJIIJJI();
                    }
                } else {
                    useSmokeCard.cardInfo = _SmokeCardInfo_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return useSmokeCard;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final UseSmokeCard LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}