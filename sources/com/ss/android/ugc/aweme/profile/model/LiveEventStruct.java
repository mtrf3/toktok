package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class LiveEventStruct implements Serializable {

    @InterfaceC65349Pkn("is_paid_event")
    public boolean isPaidEvent;

    @InterfaceC65349Pkn("start_time")
    public long startTime;

    @InterfaceC65349Pkn("id")
    public String id = "";

    @InterfaceC65349Pkn("title")
    public String title = "";

    public final String getId() {
        return this.id;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean isPaidEvent() {
        return this.isPaidEvent;
    }

    public final void setId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.id = str;
    }

    public final void setPaidEvent(boolean z) {
        this.isPaidEvent = z;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setTitle(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.title = str;
    }
}
