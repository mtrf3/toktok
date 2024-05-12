package com.bytedance.android.live.base.model.user;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.chatroom.api.TimerDetail;

/* loaded from: classes.dex */
public class SubscribeInfo {

    @InterfaceC65349Pkn("enable_subscription")
    public boolean anchorEnableSubscription;

    @InterfaceC65349Pkn("anchor_gift_sub_auth")
    public boolean anchorGiftSubAuth;

    @InterfaceC65349Pkn("qualification")
    public boolean isAnchorQualified;

    @InterfaceC65349Pkn("is_in_grace_period")
    public boolean isInGracePeriod;

    @InterfaceC65349Pkn("is_subscribe")
    public boolean isSubscribed;

    @InterfaceC65349Pkn("is_subscribed_to_anchor")
    public boolean isSubscribedToCurrentAnchor;

    @InterfaceC65349Pkn("status")
    public int status;

    @InterfaceC65349Pkn("sub_end_time")
    public long subEndTime;

    @InterfaceC65349Pkn("badge")
    public SubscribeBadge subscribeBadge;

    @InterfaceC65349Pkn("subscriber_count")
    public int subscriberCount;

    @InterfaceC65349Pkn("timer_detail")
    public TimerDetail timerDetail;

    @InterfaceC65349Pkn("user_gift_sub_auth")
    public boolean userGiftSubAuth;

    public SubscribeBadge getSubscribeBadge() {
        return this.subscribeBadge;
    }

    public int getSubscriberCount() {
        return this.subscriberCount;
    }

    public boolean isAnchorQualified() {
        return this.isAnchorQualified;
    }

    public boolean isInGracePeriod() {
        return this.isInGracePeriod;
    }

    public boolean isSubscribed() {
        return this.isSubscribed;
    }

    public boolean isSubscribedToCurrentAnchor() {
        return this.isSubscribedToCurrentAnchor;
    }

    public void setAnchorQualified(boolean z) {
        this.isAnchorQualified = z;
    }

    public void setInGracePeriod(boolean z) {
        this.isInGracePeriod = z;
    }

    public void setSubscribeBadge(SubscribeBadge subscribeBadge) {
        this.subscribeBadge = subscribeBadge;
    }

    public void setSubscribed(boolean z) {
        this.isSubscribed = z;
    }

    public void setSubscribedToCurrentAnchor(boolean z) {
        this.isSubscribedToCurrentAnchor = z;
    }

    public void setSubscriberCount(int i) {
        this.subscriberCount = i;
    }
}
