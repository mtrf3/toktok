package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes17.dex */
public final class ChijiHistory extends F9E {

    @InterfaceC65349Pkn("bonus_this_month")
    public Long bonusThisMonth;

    @InterfaceC65349Pkn("can_participate")
    public Boolean canParticipate;

    @InterfaceC65349Pkn("max_battle_score")
    public Long maxBattleScore;

    @InterfaceC65349Pkn("max_bonus")
    public Long maxBonus;

    @InterfaceC65349Pkn("max_winning_streak")
    public Long maxWinningStreak;

    @InterfaceC65349Pkn("original_bonus")
    public Long originalBonus;

    @InterfaceC65349Pkn("participations_this_month")
    public Long participationsThisMonth;

    @InterfaceC65349Pkn("result_list")
    public List<ChijiResult> resultList;

    @InterfaceC65349Pkn("total_bonus")
    public Long totalBonus;

    @InterfaceC65349Pkn("total_participations")
    public Long totalParticipations;

    @InterfaceC65349Pkn("user_id")
    public Long userId;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.userId;
        Boolean bool = this.canParticipate;
        Long l2 = this.originalBonus;
        Long l3 = this.totalParticipations;
        Long l4 = this.participationsThisMonth;
        Long l5 = this.maxWinningStreak;
        Long l6 = this.maxBattleScore;
        Long l7 = this.totalBonus;
        Long l8 = this.bonusThisMonth;
        Long l9 = this.maxBonus;
        List<ChijiResult> list = this.resultList;
        return new Object[]{l, l, bool, bool, l2, l2, l3, l3, l4, l4, l5, l5, l6, l6, l7, l7, l8, l8, l9, l9, list, list, list};
    }
}
