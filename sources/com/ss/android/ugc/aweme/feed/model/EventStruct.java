package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class EventStruct implements Serializable {

    @InterfaceC65349Pkn("desc")
    public String desc;

    @InterfaceC65349Pkn("duration")
    public long duration;

    @InterfaceC65349Pkn("enable_update")
    public boolean enableUpdate;

    @InterfaceC65349Pkn("has_subscribed")
    public boolean hasSubscribed;

    @InterfaceC65349Pkn("host")
    public User host;

    @InterfaceC65349Pkn("id")
    public String id;

    @InterfaceC65349Pkn("start_time")
    public long startTime;

    @InterfaceC65349Pkn("status")
    public int status;

    @InterfaceC65349Pkn("subscriber_count")
    public long subscriberCount;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("type")
    public int type;

    public final String getDesc() {
        return this.desc;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final boolean getEnableUpdate() {
        return this.enableUpdate;
    }

    public final boolean getHasSubscribed() {
        return this.hasSubscribed;
    }

    public final User getHost() {
        return this.host;
    }

    public final String getId() {
        return this.id;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final int getStatus() {
        return this.status;
    }

    public final long getSubscriberCount() {
        return this.subscriberCount;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setEnableUpdate(boolean z) {
        this.enableUpdate = z;
    }

    public final void setHasSubscribed(boolean z) {
        this.hasSubscribed = z;
    }

    public final void setHost(User user) {
        this.host = user;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setSubscriberCount(long j) {
        this.subscriberCount = j;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
