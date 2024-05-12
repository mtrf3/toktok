package com.bytedance.android.livesdk.model.message;

import X.C15890jp;
import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.model.message.battle.BattleDisplayConfig;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleUserInfoWrapper;
import com.bytedance.android.livesdk.model.message.battle.SupportedActionsWrapper;
import com.bytedance.android.livesdk.model.message.battle.UserArmiesWrapper;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleABTestSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleComboInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamUserArmies;
import com.bytedance.android.livesdkapi.depend.model.live.match.TeamMatchCampaign;
import java.util.List;
import java.util.Map;

/* loaded from: classes14.dex */
public class LinkMicBattleMessage extends CR6 {

    @InterfaceC65349Pkn("ab_test_setting")
    public List<BattleABTestSetting> abtestSettings;

    @InterfaceC65349Pkn("action")
    public int action;

    @InterfaceC65349Pkn("action_by_user_id")
    public long actionByUserId;

    @InterfaceC65349Pkn("anchors_info")
    public List<BattleUserInfoWrapper> anchorInfo;

    @InterfaceC65349Pkn("armies")
    public List<UserArmiesWrapper> armies;

    @InterfaceC65349Pkn("battle_combo_v2")
    public Map<Long, BattleComboInfo> battleCombos;

    @InterfaceC65349Pkn("battle_id")
    public long battleId;

    @InterfaceC65349Pkn("battle_result")
    public Map<Long, BattleResult> battleResult;

    @InterfaceC65349Pkn("battle_settings")
    public BattleSetting battleSetting;

    @InterfaceC65349Pkn("bubble_text")
    public String bubbleText;

    @InterfaceC65349Pkn("invitee_gift_permission_type")
    public int inviteeGiftPermissionType;

    @InterfaceC65349Pkn("invitees_gift_permission_type")
    public List<BattleInviteeGiftPermission> inviteeGiftPermissionTypes;

    @InterfaceC65349Pkn("fuzzy_display_config")
    public BattleDisplayConfig mBattleDisplayConfig;

    @InterfaceC65349Pkn("supported_actions")
    public List<SupportedActionsWrapper> supportedActions;

    @InterfaceC65349Pkn("team_armies")
    public List<BattleTeamUserArmies> teamArmies;

    @InterfaceC65349Pkn("team_battle_result")
    public List<BattleTeamResult> teamBattleResult;

    @InterfaceC65349Pkn("team_match_campaign")
    public TeamMatchCampaign teamMatchCampaign;

    @InterfaceC65349Pkn("team_member")
    public List<TeamUsersInfo> teamUsers;

    public LinkMicBattleMessage() {
        this.type = EnumC31509CYf.LINK_MIC_BATTLE;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LinkMicBattleMessage{battleId=");
        LIZ.append(this.battleId);
        LIZ.append(", action=");
        LIZ.append(this.action);
        LIZ.append(", battleSetting=");
        LIZ.append(this.battleSetting);
        LIZ.append(", battleResult=");
        return C15890jp.LIZ(LIZ, this.battleResult, '}', LIZ);
    }
}
