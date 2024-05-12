package com.bytedance.android.livesdk.model.message;

import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class FansEventData {

    @InterfaceC65349Pkn("new_fans_data")
    public NewFansData newFansData;

    @InterfaceC65349Pkn("task_complete_data")
    public TaskCompleteData taskCompleteData;

    /* loaded from: classes6.dex */
    public static final class NewFansData {

        @InterfaceC65349Pkn("fans_count")
        public long fansCount;
    }

    /* loaded from: classes6.dex */
    public static final class TaskCompleteData {

        @InterfaceC65349Pkn("is_clear_today")
        public boolean isClearToday;

        @InterfaceC65349Pkn("task_type")
        public int taskType;
    }
}
