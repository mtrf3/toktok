package com.bytedance.android.livesdk.goal.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoal;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class GetResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes6.dex */
    public static final class Data {

        @InterfaceC65349Pkn("anchor_onboard_permit")
        public AnchorOnBoardPermit anchorOnboardPermit;

        @InterfaceC65349Pkn("auto_create")
        public int autoCreate;

        @InterfaceC65349Pkn("is_contributor")
        public boolean isContributor;

        @InterfaceC65349Pkn("isHost")
        public boolean ishost;

        @InterfaceC65349Pkn("not_start_goals")
        public List<LiveStreamGoal> notStartGoals;

        @InterfaceC65349Pkn("ongoing_goal")
        public LiveStreamGoal ongoingGoal;

        @InterfaceC65349Pkn("owner")
        public GoalOwner owner;

        @InterfaceC65349Pkn("pin")
        public Pin pin;

        @InterfaceC65349Pkn("recommend_info")
        public Map<Integer, SubGoalRecommendInfo> recommendInfo;

        @InterfaceC65349Pkn("show_default_description")
        public boolean showDefaultDescription;

        @InterfaceC65349Pkn("specified_goal")
        public LiveStreamGoal specifiedGoal;
    }

    /* loaded from: classes6.dex */
    public static final class Pin {

        @InterfaceC65349Pkn("cold_down")
        public boolean coldDown;

        @InterfaceC65349Pkn("pin_end_time")
        public long pinEndTime;

        @InterfaceC65349Pkn("ready_time")
        public long readyTime;
    }
}
