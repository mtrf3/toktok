package com.ss.android.ugc.aweme.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public final class SearchInRelationExpValue extends F9E {

    @InterfaceC65349Pkn("follower_count_limit")
    public final int followerCountLimit;

    @InterfaceC65349Pkn("following_count_limit")
    public final int followingCountLimit;

    @InterfaceC65349Pkn("group")
    public final int group;

    @InterfaceC65349Pkn("search_result_count")
    public final int searchResultCount;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.group), Integer.valueOf(this.followingCountLimit), Integer.valueOf(this.followerCountLimit), Integer.valueOf(this.searchResultCount)};
    }

    public SearchInRelationExpValue(int i, int i2, int i3, int i4) {
        this.group = i;
        this.followingCountLimit = i2;
        this.followerCountLimit = i3;
        this.searchResultCount = i4;
    }
}
