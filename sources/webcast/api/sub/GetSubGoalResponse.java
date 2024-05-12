package webcast.api.sub;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.chatroom.api.BenefitView;
import com.bytedance.android.livesdk.chatroom.api.SubWaveInfo;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoal;
import com.bytedance.android.livesdk.goal.model.SubGoalRecommendInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class GetSubGoalResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    /* loaded from: classes6.dex */
    public static final class Data {

        @InterfaceC65349Pkn("has_goal_history")
        public boolean hasGoalHistory;

        @InterfaceC65349Pkn("is_contributor")
        public boolean isContributor;

        @InterfaceC65349Pkn("ongoing_goal")
        public LiveStreamGoal ongoingGoal;

        @InterfaceC65349Pkn("specified_goal")
        public LiveStreamGoal specifiedGoal;

        @InterfaceC65349Pkn("sub_goal_history_info")
        public SubGoalHistoryInfo subGoalHistoryInfo;

        @InterfaceC65349Pkn("sub_pin")
        public SubPin subPin;

        @InterfaceC65349Pkn("sub_wave_info")
        public SubWaveInfo subWaveInfo;

        @InterfaceC65349Pkn("not_start_goals")
        public List<LiveStreamGoal> notStartGoals = new ArrayList();

        @InterfaceC65349Pkn("recommend_info")
        public Map<Integer, SubGoalRecommendInfo> recommendInfo = new LinkedHashMap();

        @InterfaceC65349Pkn("benefits")
        public List<BenefitView> benefits = new ArrayList();
    }

    /* loaded from: classes6.dex */
    public static final class SubGoalHistoryInfo {

        @InterfaceC65349Pkn("has_completed_goal")
        public boolean hasCompletedGoal;
    }

    /* loaded from: classes6.dex */
    public static final class SubPin {

        @InterfaceC65349Pkn("cooling_down_time")
        public long coolingDownTime;

        @InterfaceC65349Pkn("pin_status")
        public int pinStatus;
    }
}
