package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C113554cx;
import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.battle.BattleDisplayConfig;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmies;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class BattleInfoResponse extends F9E {

    @InterfaceC65349Pkn("armies")
    public Map<Long, BattleUserArmies> armies;

    @InterfaceC65349Pkn("battle_combo_v2")
    public Map<Long, BattleComboInfo> battleCombos;

    @InterfaceC65349Pkn("battle_id")
    public Long battleId;

    @InterfaceC65349Pkn("battle_item_cards")
    public Map<Long, EffectingCard> battleItemCards;

    @InterfaceC65349Pkn("battle_task")
    public BattleTask battleTask;

    @InterfaceC65349Pkn("battle_truth_or_dare")
    public BattleTruthOrDare battleTruthOrDare;

    @InterfaceC65349Pkn("bubble_text")
    public String bubbleText;

    @InterfaceC65349Pkn("channel_id")
    public Long channelId;

    @InterfaceC65349Pkn("fuzzy_display_config")
    public BattleDisplayConfig mBattleDisplayConfig;

    @InterfaceC65349Pkn("battle_result")
    public Map<Long, BattleResult> resultMap;

    @InterfaceC65349Pkn("battle_settings")
    public BattleSetting setting;

    @InterfaceC65349Pkn("supported_actions")
    public Map<Long, Boolean> supportedActions;

    @InterfaceC65349Pkn("team_armies")
    public Map<Long, BattleTeamUserArmies> teamArmies;

    @InterfaceC65349Pkn("team_battle_item_cards")
    public Map<Long, EffectingCard> teamBattleItemCards;

    @InterfaceC65349Pkn("team_battle_result")
    public Map<Long, BattleTeamResult> teamBattleResult;

    @InterfaceC65349Pkn("team_match_campaign")
    public TeamMatchCampaign teamMatchCampaign;

    @InterfaceC65349Pkn("anchors_info")
    public Map<Long, BattleUserInfo> userInfoMap;

    /* JADX WARN: Multi-variable type inference failed */
    public BattleInfoResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 131071, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.channelId, this.battleId, this.setting, this.armies, this.resultMap, this.userInfoMap, this.bubbleText, this.supportedActions, this.mBattleDisplayConfig, this.battleCombos, this.battleTask, this.teamArmies, this.teamBattleResult, this.battleTruthOrDare, this.teamMatchCampaign, this.battleItemCards, this.teamBattleItemCards};
    }

    public BattleInfoResponse(Long l, Long l2, BattleSetting battleSetting, Map<Long, BattleUserArmies> map, Map<Long, BattleResult> map2, Map<Long, BattleUserInfo> map3, String str, Map<Long, Boolean> map4, BattleDisplayConfig battleDisplayConfig, Map<Long, BattleComboInfo> map5, BattleTask battleTask, Map<Long, BattleTeamUserArmies> map6, Map<Long, BattleTeamResult> map7, BattleTruthOrDare battleTruthOrDare, TeamMatchCampaign teamMatchCampaign, Map<Long, EffectingCard> map8, Map<Long, EffectingCard> teamBattleItemCards) {
        o.LJIIIZ(teamBattleItemCards, "teamBattleItemCards");
        this.channelId = l;
        this.battleId = l2;
        this.setting = battleSetting;
        this.armies = map;
        this.resultMap = map2;
        this.userInfoMap = map3;
        this.bubbleText = str;
        this.supportedActions = map4;
        this.mBattleDisplayConfig = battleDisplayConfig;
        this.battleCombos = map5;
        this.battleTask = battleTask;
        this.teamArmies = map6;
        this.teamBattleResult = map7;
        this.battleTruthOrDare = battleTruthOrDare;
        this.teamMatchCampaign = teamMatchCampaign;
        this.battleItemCards = map8;
        this.teamBattleItemCards = teamBattleItemCards;
    }

    public /* synthetic */ BattleInfoResponse(Long l, Long l2, BattleSetting battleSetting, Map map, Map map2, Map map3, String str, Map map4, BattleDisplayConfig battleDisplayConfig, Map map5, BattleTask battleTask, Map map6, Map map7, BattleTruthOrDare battleTruthOrDare, TeamMatchCampaign teamMatchCampaign, Map map8, Map map9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : battleSetting, (i & 8) != 0 ? null : map, (i & 16) != 0 ? null : map2, (i & 32) != 0 ? null : map3, (i & 64) != 0 ? null : str, (i & 128) != 0 ? null : map4, (i & 256) != 0 ? null : battleDisplayConfig, (i & 512) != 0 ? null : map5, (i & 1024) != 0 ? null : battleTask, (i & 2048) != 0 ? null : map6, (i & 4096) != 0 ? null : map7, (i & FileUtils.BUFFER_SIZE) != 0 ? null : battleTruthOrDare, (i & 16384) != 0 ? null : teamMatchCampaign, (32768 & i) != 0 ? C113554cx.LJJJLIIL() : map8, (i & 65536) != 0 ? new LinkedHashMap() : map9);
    }
}
