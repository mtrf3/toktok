package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class BattleBonusStatus {

    @InterfaceC65349Pkn("status")
    public int bonusPeriod;

    @InterfaceC65349Pkn("enter_room_prompt")
    public BattlePrompt enterRoomPrompt;

    @InterfaceC65349Pkn("reward_settle_duration")
    public long rewardSettleDuration = 3;

    @InterfaceC65349Pkn("reward_settle_prompt")
    public BattlePrompt rewardSettlePrompt;

    @InterfaceC65349Pkn("progress")
    public long taskProgress;

    @InterfaceC65349Pkn("user_assisted")
    public boolean userAssisted;
}
