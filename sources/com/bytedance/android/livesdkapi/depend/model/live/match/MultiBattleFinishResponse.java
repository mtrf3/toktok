package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class MultiBattleFinishResponse {

    @InterfaceC65349Pkn("battle_settings")
    public BattleSetting battleSettings;

    @InterfaceC65349Pkn("has_team_match_mvp_SFX")
    public boolean hasTeamMatchMvpSfx;

    @InterfaceC65349Pkn("team_armies")
    public Map<Long, BattleTeamUserArmies> teamArmies;

    @InterfaceC65349Pkn("team_battle_result")
    public Map<Long, BattleTeamResult> teamBattleResult;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiBattleFinishResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public MultiBattleFinishResponse(Map<Long, BattleTeamResult> map, Map<Long, BattleTeamUserArmies> map2) {
        this.teamBattleResult = map;
        this.teamArmies = map2;
    }

    public /* synthetic */ MultiBattleFinishResponse(Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : map2);
    }
}
