package com.ss.android.ugc.aweme.relation.feed;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class FollowFeedConfig extends F9E {

    @InterfaceC65349Pkn("following_enable")
    public final boolean followingEnable;

    @InterfaceC65349Pkn("flow_position_history")
    public int historyInsertPosition;

    @InterfaceC65349Pkn("interval")
    public final int interval;

    @InterfaceC65349Pkn("interval_lite")
    public final int intervalLite;

    @InterfaceC65349Pkn("interval_plus")
    public int intervalPlus;

    @InterfaceC65349Pkn("shows_per_day")
    public final int showsPerDay;

    @InterfaceC65349Pkn("shows_per_day_lite")
    public final int showsPerDayLite;

    @InterfaceC65349Pkn("shows_per_day_plus")
    public int showsPerDayPlus;

    @InterfaceC65349Pkn("flow_position_unread")
    public int unreadInsertPosition;

    /* JADX WARN: Multi-variable type inference failed */
    public FollowFeedConfig() {
        this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.followingEnable), Integer.valueOf(this.intervalLite), Integer.valueOf(this.showsPerDayLite), Integer.valueOf(this.interval), Integer.valueOf(this.showsPerDay), Integer.valueOf(this.intervalPlus), Integer.valueOf(this.showsPerDayPlus), Integer.valueOf(this.unreadInsertPosition), Integer.valueOf(this.historyInsertPosition)};
    }

    public FollowFeedConfig(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.followingEnable = z;
        this.intervalLite = i;
        this.showsPerDayLite = i2;
        this.interval = i3;
        this.showsPerDay = i4;
        this.intervalPlus = i5;
        this.showsPerDayPlus = i6;
        this.unreadInsertPosition = i7;
        this.historyInsertPosition = i8;
    }

    public /* synthetic */ FollowFeedConfig(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? true : z, (i9 & 2) != 0 ? 1 : i, (i9 & 4) != 0 ? 1 : i2, (i9 & 8) != 0 ? 1 : i3, (i9 & 16) != 0 ? 1 : i4, (i9 & 32) != 0 ? 4 : i5, (i9 & 64) == 0 ? i6 : 1, (i9 & 128) != 0 ? 5 : i7, (i9 & 256) != 0 ? 3 : i8);
    }
}
