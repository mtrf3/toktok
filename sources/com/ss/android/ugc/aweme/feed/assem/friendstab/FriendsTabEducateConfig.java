package com.ss.android.ugc.aweme.feed.assem.friendstab;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes4.dex */
public final class FriendsTabEducateConfig extends F9E {

    @InterfaceC65349Pkn("tt_friends_tab_educate_display_control_days")
    public final int displayControlDays;

    @InterfaceC65349Pkn("tt_friends_tab_educate_max_unclick_count")
    public final int maxUnClickCount;

    @InterfaceC65349Pkn("tt_friends_tab_educate_trigger_friend_count")
    public final int triggerFriendCount;

    @InterfaceC65349Pkn("tt_friends_tab_educate_trigger_last_visit_hours")
    public final int triggerLastVisitHours;

    @InterfaceC65349Pkn("tt_friends_tab_educate_trigger_unread_count")
    public final int triggerUnreadCount;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.triggerFriendCount), Integer.valueOf(this.triggerUnreadCount), Integer.valueOf(this.triggerLastVisitHours), Integer.valueOf(this.displayControlDays), Integer.valueOf(this.maxUnClickCount)};
    }

    public FriendsTabEducateConfig(int i, int i2, int i3, int i4, int i5) {
        this.triggerFriendCount = i;
        this.triggerUnreadCount = i2;
        this.triggerLastVisitHours = i3;
        this.displayControlDays = i4;
        this.maxUnClickCount = i5;
    }
}
