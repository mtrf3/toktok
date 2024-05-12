package com.ss.android.ugc.aweme.story.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class StoryAnalytics extends F9E implements Serializable {

    @InterfaceC65349Pkn("num_accounts_reached")
    public final long accountReached;

    @InterfaceC65349Pkn("num_followers_reached")
    public final long followersReached;

    public static /* synthetic */ StoryAnalytics copy$default(StoryAnalytics storyAnalytics, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = storyAnalytics.accountReached;
        }
        if ((i & 2) != 0) {
            j2 = storyAnalytics.followersReached;
        }
        return storyAnalytics.copy(j, j2);
    }

    public final StoryAnalytics copy(long j, long j2) {
        return new StoryAnalytics(j, j2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.accountReached), Long.valueOf(this.followersReached)};
    }

    public final long getAccountReached() {
        return this.accountReached;
    }

    public final long getFollowersReached() {
        return this.followersReached;
    }

    public StoryAnalytics(long j, long j2) {
        this.accountReached = j;
        this.followersReached = j2;
    }
}
