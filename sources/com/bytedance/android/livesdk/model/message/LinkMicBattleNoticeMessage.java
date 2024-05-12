package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeAnchorGiftGuide;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeAnchorGuide;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeBubbleGuide;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeRuleGuide;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeToast;

/* loaded from: classes6.dex */
public class LinkMicBattleNoticeMessage extends CR6 {
    public boolean LJLIL;

    @InterfaceC65349Pkn("anchor_gift_guide")
    public BattleNoticeAnchorGiftGuide anchorGiftGuide;

    @InterfaceC65349Pkn("anchor_guide")
    public BattleNoticeAnchorGuide anchorGuide;

    @InterfaceC65349Pkn("rule_guide")
    public BattleNoticeRuleGuide battleRuleGuide;

    @InterfaceC65349Pkn("bubble_guide")
    public BattleNoticeBubbleGuide bubbleGuide;

    @InterfaceC65349Pkn("common_guide")
    public BattleNoticeCommonGuide commonGuide;

    @InterfaceC65349Pkn("notice_type")
    public int noticeType;

    @InterfaceC65349Pkn("toast")
    public BattleNoticeToast toast;

    @Override // com.bytedance.android.livesdkapi.message.BaseMessage
    public final boolean canText() {
        return true;
    }

    public LinkMicBattleNoticeMessage() {
        this.type = EnumC31509CYf.LINK_MIC_BATTLE_NOTICE;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LinkMicBattleNoticeMessage{noticeType=");
        LIZ.append(this.noticeType);
        LIZ.append(", anchorGuide=");
        LIZ.append(this.anchorGuide);
        LIZ.append(", toast=");
        LIZ.append(this.toast);
        LIZ.append(", bubbleGuide=");
        LIZ.append(this.bubbleGuide);
        LIZ.append(", anchorGiftGuide=");
        LIZ.append(this.anchorGiftGuide);
        LIZ.append(", battleRuleGuide=");
        LIZ.append(this.battleRuleGuide);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }
}
