package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.model.message.battle.BattleTruthOrDareOptOutNotice;
import com.bytedance.android.livesdk.model.message.battle.BattleTruthOrDareTips;
import com.bytedance.android.livesdk.model.message.battle.BattleTruthOrDareTriggerGuide;
import com.bytedance.android.livesdk.model.message.battle.BattleTruthOrDareTriggerGuideV2;
import defpackage.q;

/* loaded from: classes14.dex */
public final class LinkMicBattleVictoryLapMessage extends CR6 {

    @InterfaceC65349Pkn("anchor_region")
    public String anchorRegion;

    @InterfaceC65349Pkn("battle_id")
    public long battleId;

    @InterfaceC65349Pkn("trigger_guide")
    public BattleTruthOrDareTriggerGuide battleTruthOrDareTriggerGuide;

    @InterfaceC65349Pkn("play_tips")
    public BattleTruthOrDareTips playTips;

    @InterfaceC65349Pkn("play_type")
    public int playType;

    @InterfaceC65349Pkn("trigger_guide_v2")
    public BattleTruthOrDareTriggerGuideV2 triggerGuideV2;

    @InterfaceC65349Pkn("truth_or_dare_close_notice")
    public BattleTruthOrDareOptOutNotice truthOrDareCloseNotice;

    public LinkMicBattleVictoryLapMessage() {
        this.type = EnumC31509CYf.LINK_MIC_BATTLE_VICTORY_LAP_MESSAGE;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LinkMicBattleVictoryLapMessage(battleTruthOrDareTriggerGuide=");
        LIZ.append(this.battleTruthOrDareTriggerGuide);
        LIZ.append(", ");
        LIZ.append("playTips=");
        LIZ.append(this.playTips);
        LIZ.append(", ");
        LIZ.append("truthOrDareCloseNotice=");
        LIZ.append(this.truthOrDareCloseNotice);
        LIZ.append(", ");
        LIZ.append("playType=");
        LIZ.append(this.playType);
        LIZ.append(',');
        LIZ.append("anchorRegion=");
        return q.LIZIZ(LIZ, this.anchorRegion, ')', LIZ);
    }
}
