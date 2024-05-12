package com.bytedance.android.livesdk.gift.model;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.goal.model.GoalPinInfo;

/* loaded from: classes17.dex */
public final class LiveStreamGoalServerMessage extends CR6 {

    @InterfaceC65349Pkn("contribute_count")
    public long contributeCount;

    @InterfaceC65349Pkn("contribute_score")
    public long contributeScore;

    @InterfaceC65349Pkn("contribute_subgoal")
    public LiveStreamSubGoal contributeSubgoal;

    @InterfaceC65349Pkn("contributor_avatar")
    public ImageModel contributorAvatar;

    @InterfaceC65349Pkn("contributor_display_id")
    public String contributorDisplayId;

    @InterfaceC65349Pkn("contributor_id")
    public long contributorId;

    @InterfaceC65349Pkn("contributor_id_str")
    public String contributorIdStr;

    @InterfaceC65349Pkn("gift_repeat_count")
    public long giftRepeatCount;

    @InterfaceC65349Pkn("goal")
    public LiveStreamGoal goal;

    @InterfaceC65349Pkn("indicator")
    public LiveStreamGoalIndicator indicator;

    @InterfaceC65349Pkn("pin")
    public boolean pin;

    @InterfaceC65349Pkn("pin_info")
    public GoalPinInfo pinInfo;

    @InterfaceC65349Pkn("unpin")
    public boolean unpin;

    public LiveStreamGoalServerMessage() {
        this.type = EnumC31509CYf.STREAM_GOAL_SERVER_MESSAGE;
        this.contributorDisplayId = "";
        this.contributorIdStr = "";
    }
}
