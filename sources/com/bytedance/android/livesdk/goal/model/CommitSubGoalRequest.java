package com.bytedance.android.livesdk.goal.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.gift.model.LiveStreamSubGoal;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class CommitSubGoalRequest {

    @InterfaceC65349Pkn("goal_id")
    public long goalId;

    @InterfaceC65349Pkn("room_id")
    public long roomId;

    @InterfaceC65349Pkn("status")
    public int status;

    @InterfaceC65349Pkn("type")
    public int type;

    @InterfaceC65349Pkn("subgoals")
    public List<LiveStreamSubGoal> subgoals = new ArrayList();

    @InterfaceC65349Pkn("description")
    public String description = "";

    @InterfaceC65349Pkn("room_id_str")
    public String roomIdStr = "";

    @InterfaceC65349Pkn("goal_id_str")
    public String goalIdStr = "";
}
