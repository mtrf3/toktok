package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class LinkMicBattleItemCard extends CR6 {

    @InterfaceC65349Pkn("award_card_notice")
    public AwardCardNotice awardCardNotice;

    @InterfaceC65349Pkn("battle_id")
    public long battleId;

    @InterfaceC65349Pkn("card_obtain_guide")
    public CardObtainGuide cardObtainGuide;

    @InterfaceC65349Pkn("msg_type")
    public int msgType;

    @InterfaceC65349Pkn("use_critical_strike_card")
    public UseCriticalStrikeCard useCriticalStrikeCard;

    @InterfaceC65349Pkn("use_smoke_card")
    public UseSmokeCard useSmokeCard;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        if (this.msgType > 1) {
            return true;
        }
        return false;
    }

    public LinkMicBattleItemCard() {
        this.type = EnumC31509CYf.LINK_MIC_BATTLE_ITEM_CARD;
    }
}
