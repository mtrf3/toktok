package com.ss.android.ugc.aweme.relation.feed;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class RecUserBigCardConfig extends F9E {

    @InterfaceC65349Pkn("cooldown_time")
    public int coolDownTime;

    @InterfaceC65349Pkn("following")
    public FollowFeedConfig followFeedConfig;

    @InterfaceC65349Pkn("friends")
    public FriendsTabConfig friendsTabConfig;

    @InterfaceC65349Pkn("fyp")
    public FYPConfig fypConfig;

    @InterfaceC65349Pkn("group")
    public int group;

    @InterfaceC65349Pkn("is_other_frequency_in_effect")
    public boolean isOtherFreInEffect;

    @InterfaceC65349Pkn("is_work_for_high_muf")
    public boolean isWorkForHighMuf;

    @InterfaceC65349Pkn("load_count")
    public int loadCount;

    @InterfaceC65349Pkn("load_more_threshold")
    public int loadMoreThreshold;

    @InterfaceC65349Pkn("negative_behavior_threshold")
    public int negativeBehaviorThreshold;

    /* JADX WARN: Multi-variable type inference failed */
    public RecUserBigCardConfig() {
        this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1023, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.group), Integer.valueOf(this.coolDownTime), Integer.valueOf(this.negativeBehaviorThreshold), Integer.valueOf(this.loadCount), Integer.valueOf(this.loadMoreThreshold), Boolean.valueOf(this.isOtherFreInEffect), Boolean.valueOf(this.isWorkForHighMuf), this.fypConfig, this.friendsTabConfig, this.followFeedConfig};
    }

    public RecUserBigCardConfig(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, FYPConfig fypConfig, FriendsTabConfig friendsTabConfig, FollowFeedConfig followFeedConfig) {
        o.LJIIIZ(fypConfig, "fypConfig");
        o.LJIIIZ(friendsTabConfig, "friendsTabConfig");
        o.LJIIIZ(followFeedConfig, "followFeedConfig");
        this.group = i;
        this.coolDownTime = i2;
        this.negativeBehaviorThreshold = i3;
        this.loadCount = i4;
        this.loadMoreThreshold = i5;
        this.isOtherFreInEffect = z;
        this.isWorkForHighMuf = z2;
        this.fypConfig = fypConfig;
        this.friendsTabConfig = friendsTabConfig;
        this.followFeedConfig = followFeedConfig;
    }

    public /* synthetic */ RecUserBigCardConfig(int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, FYPConfig fYPConfig, FriendsTabConfig friendsTabConfig, FollowFeedConfig followFeedConfig, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 10 : i, (i6 & 2) != 0 ? 20 : i2, (i6 & 4) != 0 ? 3 : i3, (i6 & 8) == 0 ? i4 : 20, (i6 & 16) == 0 ? i5 : 10, (i6 & 32) != 0 ? true : z, (i6 & 64) == 0 ? z2 : true, (i6 & 128) != 0 ? new FYPConfig(0, 0, 0, 0, 0, 0, 0, 0, 0, 511, null) : fYPConfig, (i6 & 256) != 0 ? new FriendsTabConfig(0, 0, 0, 0, 0, 0, 0, 0, 255, null) : friendsTabConfig, (i6 & 512) != 0 ? new FollowFeedConfig(false, 0, 0, 0, 0, 0, 0, 0, 0, 511, null) : followFeedConfig);
    }
}
