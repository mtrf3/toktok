package com.ss.android.ugc.aweme.feed.model;

import X.V0N;

/* loaded from: classes2.dex */
public enum EventStatusEnum {
    Event_Created(1),
    Event_Reviewing(2),
    Event_Review_Failed(3),
    Event_Upcoming(4),
    Event_Started(5),
    Event_Deleted(6),
    Event_Finished(7);

    public final int status;

    public static EventStatusEnum valueOf(String str) {
        return (EventStatusEnum) V0N.LJJJ(EventStatusEnum.class, str);
    }

    public final int getStatus() {
        return this.status;
    }

    EventStatusEnum(int i) {
        this.status = i;
    }
}
