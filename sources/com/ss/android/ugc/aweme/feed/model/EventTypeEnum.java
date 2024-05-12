package com.ss.android.ugc.aweme.feed.model;

import X.V0N;

/* loaded from: classes2.dex */
public enum EventTypeEnum {
    Live_Event(1);

    public final int type;

    public static EventTypeEnum valueOf(String str) {
        return (EventTypeEnum) V0N.LJJJ(EventTypeEnum.class, str);
    }

    public final int getType() {
        return this.type;
    }

    EventTypeEnum(int i) {
        this.type = i;
    }
}
