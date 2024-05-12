package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _LinkMicBattleItemCard_ProtoDecoder implements InterfaceC31105CIr<LinkMicBattleItemCard> {
    @Override // X.InterfaceC31105CIr
    public final LinkMicBattleItemCard LIZ(Q9H q9h) {
        LinkMicBattleItemCard linkMicBattleItemCard = new LinkMicBattleItemCard();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        linkMicBattleItemCard.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        linkMicBattleItemCard.battleId = q9h.LJIIJJI();
                        break;
                    case 3:
                        linkMicBattleItemCard.msgType = q9h.LJIIJ();
                        break;
                    case 4:
                        CardObtainGuide cardObtainGuide = new CardObtainGuide();
                        long LIZJ2 = q9h.LIZJ();
                        while (q9h.LJI() != -1) {
                            Q9J.LIZJ(q9h);
                        }
                        q9h.LJ(LIZJ2);
                        linkMicBattleItemCard.cardObtainGuide = cardObtainGuide;
                        break;
                    case 5:
                        linkMicBattleItemCard.useCriticalStrikeCard = _UseCriticalStrikeCard_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        linkMicBattleItemCard.useSmokeCard = _UseSmokeCard_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        linkMicBattleItemCard.awardCardNotice = _AwardCardNotice_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return linkMicBattleItemCard;
            }
        }
    }
}
