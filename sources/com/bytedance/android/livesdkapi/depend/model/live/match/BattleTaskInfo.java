package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public final class BattleTaskInfo extends F9E {

    @InterfaceC65349Pkn("bonus_ratio")
    public Long bonusRatio;

    @InterfaceC65349Pkn("collected_count")
    public Long collectedCount;

    @InterfaceC65349Pkn("duration")
    public Long duration;

    @InterfaceC65349Pkn("end_time")
    public Long endTime;

    @InterfaceC65349Pkn("finished")
    public Long finished;

    @InterfaceC65349Pkn("goal_count")
    public Long goalCount;

    @InterfaceC65349Pkn("has_next_task")
    public Long hasNextTask;

    @InterfaceC65349Pkn("start_time")
    public Long startTime;

    @InterfaceC65349Pkn("success")
    public Long success;

    @InterfaceC65349Pkn("task_round")
    public Long taskRound;

    @InterfaceC65349Pkn("task_type")
    public Long taskType;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.taskType;
        Long l2 = this.startTime;
        Long l3 = this.duration;
        Long l4 = this.endTime;
        Long l5 = this.taskRound;
        Long l6 = this.collectedCount;
        Long l7 = this.goalCount;
        Long l8 = this.finished;
        Long l9 = this.success;
        Long l10 = this.bonusRatio;
        Long l11 = this.hasNextTask;
        return new Object[]{l, l, l2, l2, l3, l3, l4, l4, l5, l5, l6, l6, l7, l7, l8, l8, l9, l9, l10, l10, l11, l11};
    }
}
