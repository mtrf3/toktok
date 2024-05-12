package com.ss.android.ugc.aweme.profile.model;

import X.C2U8;
import X.F9E;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FollowStatusEvent extends F9E implements IEvent {
    public final FollowStatus status;

    public static /* synthetic */ FollowStatusEvent copy$default(FollowStatusEvent followStatusEvent, FollowStatus followStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            followStatus = followStatusEvent.status;
        }
        return followStatusEvent.copy(followStatus);
    }

    public final FollowStatusEvent copy(FollowStatus status) {
        o.LJIIIZ(status, "status");
        return new FollowStatusEvent(status);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.status};
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C2U8.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C2U8.LIZIZ(this);
        return this;
    }

    public FollowStatusEvent(FollowStatus status) {
        o.LJIIIZ(status, "status");
        this.status = status;
    }
}
