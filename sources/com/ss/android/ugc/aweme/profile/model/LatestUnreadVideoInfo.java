package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;

/* loaded from: classes10.dex */
public final class LatestUnreadVideoInfo implements Serializable {

    @InterfaceC65349Pkn("aweme_info")
    public final Aweme firstAweme;

    @InterfaceC65349Pkn("total_unread")
    public final int totalUnread;

    public final Aweme getFirstAweme() {
        return this.firstAweme;
    }

    public final int getTotalUnread() {
        return this.totalUnread;
    }
}
