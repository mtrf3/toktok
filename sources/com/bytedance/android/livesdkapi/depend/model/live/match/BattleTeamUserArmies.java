package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmies;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class BattleTeamUserArmies {

    @InterfaceC65349Pkn("team_id")
    public Long teamId;

    @InterfaceC65349Pkn("team_total_score")
    public long teamTotalScore;

    @InterfaceC65349Pkn("team_user")
    public List<BattleTeamUser> teamUsers;

    @InterfaceC65349Pkn("user_armies")
    public BattleUserArmies userArmies;

    /* JADX WARN: Multi-variable type inference failed */
    public BattleTeamUserArmies() {
        this(null, 0L, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public BattleTeamUserArmies(Long l, long j, List<BattleTeamUser> list, BattleUserArmies battleUserArmies) {
        this.teamId = l;
        this.teamTotalScore = j;
        this.teamUsers = list;
        this.userArmies = battleUserArmies;
    }

    public /* synthetic */ BattleTeamUserArmies(Long l, long j, List list, BattleUserArmies battleUserArmies, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? null : list, (i & 8) == 0 ? battleUserArmies : null);
    }
}
