package com.bytedance.android.livesdk.model.message;

import X.C1NE;
import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmies;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUserArmies;
import java.util.List;
import java.util.Map;

/* loaded from: classes14.dex */
public class LinkMicBattleArmiesMessage extends CR6 {

    @InterfaceC65349Pkn("armies")
    public Map<Long, BattleUserArmies> armies;

    @InterfaceC65349Pkn("battle_id")
    public long battleId;

    @InterfaceC65349Pkn("battle_settings")
    public BattleSetting battleSettings;

    @InterfaceC65349Pkn("channel_id")
    public long channelId;

    @InterfaceC65349Pkn("from_user_id")
    public long fromUserId;

    @InterfaceC65349Pkn("gift_icon_image")
    public ImageModel gifIconImage;

    @InterfaceC65349Pkn("gift_count")
    public int giftCount;

    @InterfaceC65349Pkn("gift_id")
    public long giftId;

    @InterfaceC65349Pkn("send_gift_success_time")
    public long giftSentTime;

    @InterfaceC65349Pkn("has_team_match_mvp_SFX")
    public boolean hasTeamMatchMvpSfx;

    @InterfaceC65349Pkn("log_id")
    public String logId = "";

    @InterfaceC65349Pkn("repeat_count")
    public int repeatCount;

    @InterfaceC65349Pkn("update_battle_score_time")
    public long scoreUpdateTime;

    @InterfaceC65349Pkn("team_armies")
    public List<BattleTeamUserArmies> teamArmies;

    @InterfaceC65349Pkn("total_diamond_count")
    public int totalDiamondCount;

    @InterfaceC65349Pkn("trigger_critical_strike")
    public boolean triggerCriticalStrike;

    @InterfaceC65349Pkn("trigger_reason")
    public int triggerReason;

    public LinkMicBattleArmiesMessage() {
        this.type = EnumC31509CYf.LINK_MIC_BATTLE_ARMIES;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LinkMicBattleArmiesMessage{battleId=");
        LIZ.append(this.battleId);
        LIZ.append(", armies=");
        LIZ.append(this.armies);
        LIZ.append(", giftSentTime=");
        LIZ.append(this.giftSentTime);
        LIZ.append(", scoreUpdateTime=");
        LIZ.append(this.scoreUpdateTime);
        LIZ.append(", triggerReason=");
        LIZ.append(this.triggerReason);
        LIZ.append(", gifIconImage=");
        LIZ.append(this.gifIconImage);
        LIZ.append(", giftCount=");
        LIZ.append(this.giftCount);
        LIZ.append(", totalDiamondCount=");
        LIZ.append(this.totalDiamondCount);
        LIZ.append(", repeatCount=");
        LIZ.append(this.repeatCount);
        LIZ.append(", channelId=");
        LIZ.append(this.channelId);
        LIZ.append(", fromUserId=");
        LIZ.append(this.fromUserId);
        LIZ.append(", giftId=");
        LIZ.append(this.giftId);
        LIZ.append(", teamArmies=");
        return C1NE.LIZIZ(LIZ, this.teamArmies, '}', LIZ);
    }
}
