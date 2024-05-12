package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.goal.model.GoalStats;
import java.util.List;

/* loaded from: classes6.dex */
public final class LiveStreamGoal {

    @InterfaceC65349Pkn("audit_status")
    public int auditStatus;

    @InterfaceC65349Pkn("contributors")
    public List<LiveStreamGoalContributor> contributors;

    @InterfaceC65349Pkn("contributors_length")
    public int contributorsLength;

    @InterfaceC65349Pkn("cycle_type")
    public int cycleType;

    @InterfaceC65349Pkn("expire_time")
    public long expireTime;

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("real_finish_time")
    public long realFinishTime;

    @InterfaceC65349Pkn("start_time")
    public long startTime;

    @InterfaceC65349Pkn("stats")
    public GoalStats stats;

    @InterfaceC65349Pkn("status")
    public int status;

    @InterfaceC65349Pkn("sub_goals")
    public List<LiveStreamSubGoal> subGoals;

    @InterfaceC65349Pkn("type")
    public int type;

    @InterfaceC65349Pkn("description")
    public String description = "";

    @InterfaceC65349Pkn("id_str")
    public String idStr = "";

    @InterfaceC65349Pkn("audit_description")
    public String auditDescription = "";
}
