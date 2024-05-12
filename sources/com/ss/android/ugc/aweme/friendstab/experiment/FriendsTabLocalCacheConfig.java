package com.ss.android.ugc.aweme.friendstab.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes10.dex */
public final class FriendsTabLocalCacheConfig extends F9E {

    @InterfaceC65349Pkn("tt_friends_tab_local_cache_feed_size")
    public final int cachedFeedSize;

    @InterfaceC65349Pkn("tt_friends_tab_local_cache_valid_time_millis")
    public final int validTimeMillis;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.cachedFeedSize), Integer.valueOf(this.validTimeMillis)};
    }

    public FriendsTabLocalCacheConfig(int i, int i2) {
        this.cachedFeedSize = i;
        this.validTimeMillis = i2;
    }
}
