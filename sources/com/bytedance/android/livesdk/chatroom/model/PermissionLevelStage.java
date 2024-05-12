package com.bytedance.android.livesdk.chatroom.model;

import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes17.dex */
public final class PermissionLevelStage {

    @InterfaceC65349Pkn("abnormal_date")
    public long abnormalDate;

    @InterfaceC65349Pkn("stage_end_time")
    public long stageEndTime;

    @InterfaceC65349Pkn("stage_start_time")
    public long stageStartTime;

    @InterfaceC65349Pkn("status")
    public int status;

    @InterfaceC65349Pkn("task_stage")
    public int taskStage;

    @InterfaceC65349Pkn("tasks")
    public List<PermissionLevelTask> tasks;

    /* loaded from: classes17.dex */
    public static final class PermissionLevelTask {

        @InterfaceC65349Pkn("status")
        public int status;

        @InterfaceC65349Pkn("task_type")
        public int taskType;

        @InterfaceC65349Pkn("text")
        public String text = "";

        @InterfaceC65349Pkn("current_value")
        public String currentValue = "";

        @InterfaceC65349Pkn("complete_value")
        public String completeValue = "";
    }
}
