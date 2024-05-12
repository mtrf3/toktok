package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class NoticeFrequencyControlConfig extends F9E {

    @InterfaceC65349Pkn("behavior")
    public final Behavior behavior;

    @InterfaceC65349Pkn("condition")
    public final Condition condition;

    @InterfaceC65349Pkn("user_action")
    public final int userAction;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.userAction), this.condition, this.behavior};
    }

    public NoticeFrequencyControlConfig(int i, Condition condition, Behavior behavior) {
        o.LJIIIZ(condition, "condition");
        o.LJIIIZ(behavior, "behavior");
        this.userAction = i;
        this.condition = condition;
        this.behavior = behavior;
    }
}
