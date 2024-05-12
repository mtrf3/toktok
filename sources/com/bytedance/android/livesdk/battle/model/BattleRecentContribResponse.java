package com.bytedance.android.livesdk.battle.model;

import X.C113554cx;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.message.battle.BattleResult;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTeamResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes14.dex */
public final class BattleRecentContribResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes14.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("gift_log_ids")
        public List<String> giftLogIds = new ArrayList();

        @InterfaceC65349Pkn("supported_actions")
        public Map<Long, Boolean> supportedActions = C113554cx.LJJJLIIL();

        @InterfaceC65349Pkn("battle_score")
        public Map<Long, BattleResult> battleScore = C113554cx.LJJJLIIL();

        @InterfaceC65349Pkn("team_battle_score")
        public Map<Long, BattleTeamResult> teamBattleScore = C113554cx.LJJJLIIL();
    }
}
