package webcast.api.room;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.goal.model.GetResponse;
import webcast.api.sub.GetSubGoalResponse;

/* loaded from: classes6.dex */
public final class RoomGoalsResponse {

    @InterfaceC65349Pkn("live_goal")
    public GetResponse.Data liveGoal;

    @InterfaceC65349Pkn("live_goal_status")
    public long liveGoalStatus;

    @InterfaceC65349Pkn("sub_goal")
    public GetSubGoalResponse.Data subGoal;

    @InterfaceC65349Pkn("sub_goal_status")
    public long subGoalStatus;
}
