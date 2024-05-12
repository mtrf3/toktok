package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.BorderInfo;

/* loaded from: classes6.dex */
public class WeeklyRankRewardMessage extends CR6 {

    @InterfaceC65349Pkn("avatar_border")
    public BorderInfo borderInfo;

    @InterfaceC65349Pkn("msg")
    public RoomNotifyMessage notifyMessage;

    @InterfaceC65349Pkn("user_id")
    public long userId;

    public WeeklyRankRewardMessage() {
        this.type = EnumC31509CYf.WEEKLY_RANK_REWARD_MESSAGE;
    }
}
