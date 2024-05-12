package com.ss.android.ugc.aweme.feed.model.live;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class LiveEventInfo extends F9E implements Serializable {

    @InterfaceC65349Pkn("description")
    public String description;

    @InterfaceC65349Pkn("duration")
    public long duration;

    @InterfaceC65349Pkn("event_id")
    public long id;

    @InterfaceC65349Pkn("start_time")
    public long startTime;

    @InterfaceC65349Pkn("has_subscribed")
    public boolean subscribed;

    @InterfaceC65349Pkn("title")
    public String title;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LiveEventInfo() {
        /*
            r12 = this;
            r1 = 0
            r7 = 0
            r9 = 0
            r10 = 63
            r0 = r12
            r3 = r1
            r5 = r1
            r8 = r7
            r11 = r7
            r0.<init>(r1, r3, r5, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.live.LiveEventInfo.<init>():void");
    }

    public static /* synthetic */ LiveEventInfo copy$default(LiveEventInfo liveEventInfo, long j, long j2, long j3, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            j = liveEventInfo.id;
        }
        if ((i & 2) != 0) {
            j2 = liveEventInfo.startTime;
        }
        if ((i & 4) != 0) {
            j3 = liveEventInfo.duration;
        }
        if ((i & 8) != 0) {
            str = liveEventInfo.title;
        }
        if ((i & 16) != 0) {
            str2 = liveEventInfo.description;
        }
        if ((i & 32) != 0) {
            z = liveEventInfo.subscribed;
        }
        return liveEventInfo.copy(j, j2, j3, str, str2, z);
    }

    public final LiveEventInfo copy(long j, long j2, long j3, String title, String description, boolean z) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(description, "description");
        return new LiveEventInfo(j, j2, j3, title, description, z);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.id), Long.valueOf(this.startTime), Long.valueOf(this.duration), this.title, this.description, Boolean.valueOf(this.subscribed)};
    }

    public final String getDescription() {
        return this.description;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final long getId() {
        return this.id;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final boolean getSubscribed() {
        return this.subscribed;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setDescription(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.description = str;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setSubscribed(boolean z) {
        this.subscribed = z;
    }

    public final void setTitle(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.title = str;
    }

    public LiveEventInfo(long j, long j2, long j3, String title, String description, boolean z) {
        o.LJIIIZ(title, "title");
        o.LJIIIZ(description, "description");
        this.id = j;
        this.startTime = j2;
        this.duration = j3;
        this.title = title;
        this.description = description;
        this.subscribed = z;
    }

    public /* synthetic */ LiveEventInfo(long j, long j2, long j3, String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) == 0 ? j3 : 0L, (i & 8) != 0 ? "" : str, (i & 16) == 0 ? str2 : "", (i & 32) != 0 ? false : z);
    }
}
