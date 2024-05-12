package com.ss.android.ugc.aweme.feed.model.commercialize;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes7.dex */
public final class PlanConfig implements Serializable {

    @InterfaceC65349Pkn("tasks")
    public List<CommerceSmartUITasks> task;

    public final List<CommerceSmartUITasks> getTask() {
        return this.task;
    }

    public final void setTask(List<CommerceSmartUITasks> list) {
        this.task = list;
    }
}
