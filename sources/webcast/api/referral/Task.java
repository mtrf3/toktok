package webcast.api.referral;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class Task {

    @InterfaceC65349Pkn("expire")
    public long expire;

    @InterfaceC65349Pkn("live_duration_process")
    public long liveDurationProcess;

    @InterfaceC65349Pkn("live_duration_threshold")
    public long liveDurationThreshold;

    @InterfaceC65349Pkn("receive_diamonds_process")
    public long receiveDiamondsProcess;

    @InterfaceC65349Pkn("receive_diamonds_threshold")
    public long receiveDiamondsThreshold;

    @InterfaceC65349Pkn("rewards")
    public List<Reward> rewards = new ArrayList();

    @InterfaceC65349Pkn("sub_task")
    public List<Task> subTask = new ArrayList();

    @InterfaceC65349Pkn("task_status")
    public int taskStatus;

    @InterfaceC65349Pkn("task_type")
    public int taskType;

    /* loaded from: classes17.dex */
    public static final class Reward {

        @InterfaceC65349Pkn("reward_type")
        public int rewardType;

        @InterfaceC65349Pkn("role_type")
        public int roleType;

        @InterfaceC65349Pkn("share_percent")
        public String sharePercent = "";
    }
}
