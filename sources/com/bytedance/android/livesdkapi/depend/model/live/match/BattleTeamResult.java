package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class BattleTeamResult {

    @InterfaceC65349Pkn("result")
    public int result;

    @InterfaceC65349Pkn("team_id")
    public Long teamId;

    @InterfaceC65349Pkn("team_user")
    public List<BattleTeamUser> teamUsers;

    @InterfaceC65349Pkn("total_score")
    public long totalScore;

    /* JADX WARN: Multi-variable type inference failed */
    public BattleTeamResult() {
        this(null, 0L, 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public BattleTeamResult(Long l, long j, int i, List<BattleTeamUser> list) {
        this.teamId = l;
        this.totalScore = j;
        this.result = i;
        this.teamUsers = list;
    }

    public /* synthetic */ BattleTeamResult(Long l, long j, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : l, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? 0 : i, (i2 & 8) == 0 ? list : null);
    }
}
