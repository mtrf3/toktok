package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _SubPinCard_ProtoDecoder implements InterfaceC31105CIr<SubPinCard> {
    public static SubPinCard LIZIZ(Q9H q9h) {
        SubPinCard subPinCard = new SubPinCard();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        subPinCard.timeToLive = q9h.LJIIJJI();
                        break;
                    case 2:
                        subPinCard.title = _SubPinCard_Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 3:
                        subPinCard.desc = _SubPinCard_Text_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        subPinCard.image = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        subPinCard.type = q9h.LJIIJ();
                        break;
                    case 6:
                        subPinCard.id = q9h.LJIIJJI();
                        break;
                    case 7:
                        subPinCard.templateId = q9h.LJIIJJI();
                        break;
                    case 8:
                        subPinCard.goalPinCard = _SubGoalPinCard_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return subPinCard;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubPinCard LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
