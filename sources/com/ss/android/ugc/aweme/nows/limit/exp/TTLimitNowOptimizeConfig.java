package com.ss.android.ugc.aweme.nows.limit.exp;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class TTLimitNowOptimizeConfig extends F9E {

    @InterfaceC65349Pkn("install_optimize_app")
    public final int installOptimizeApp;

    @InterfaceC65349Pkn("uninstall_friends_boundary_value")
    public final int uninstallFriendBoundaryValue;

    @InterfaceC65349Pkn("uninstall_friends_group")
    public final int uninstallFriendGroup;

    @InterfaceC65349Pkn("uninstall_optimize_explore")
    public final boolean uninstallOptimizeExplore;

    @InterfaceC65349Pkn("visible_newest_posts_count")
    public final int visibleNewestPostsCount;

    /* JADX WARN: Multi-variable type inference failed */
    public TTLimitNowOptimizeConfig() {
        this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, null);
    }

    public static /* synthetic */ TTLimitNowOptimizeConfig copy$default(TTLimitNowOptimizeConfig tTLimitNowOptimizeConfig, int i, int i2, boolean z, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = tTLimitNowOptimizeConfig.uninstallFriendGroup;
        }
        if ((i5 & 2) != 0) {
            i2 = tTLimitNowOptimizeConfig.uninstallFriendBoundaryValue;
        }
        if ((i5 & 4) != 0) {
            z = tTLimitNowOptimizeConfig.uninstallOptimizeExplore;
        }
        if ((i5 & 8) != 0) {
            i3 = tTLimitNowOptimizeConfig.installOptimizeApp;
        }
        if ((i5 & 16) != 0) {
            i4 = tTLimitNowOptimizeConfig.visibleNewestPostsCount;
        }
        return tTLimitNowOptimizeConfig.copy(i, i2, z, i3, i4);
    }

    public final TTLimitNowOptimizeConfig copy(int i, int i2, boolean z, int i3, int i4) {
        return new TTLimitNowOptimizeConfig(i, i2, z, i3, i4);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.uninstallFriendGroup), Integer.valueOf(this.uninstallFriendBoundaryValue), Boolean.valueOf(this.uninstallOptimizeExplore), Integer.valueOf(this.installOptimizeApp), Integer.valueOf(this.visibleNewestPostsCount)};
    }

    public final int getInstallOptimizeApp() {
        return this.installOptimizeApp;
    }

    public final int getUninstallFriendBoundaryValue() {
        return this.uninstallFriendBoundaryValue;
    }

    public final int getUninstallFriendGroup() {
        return this.uninstallFriendGroup;
    }

    public final boolean getUninstallOptimizeExplore() {
        return this.uninstallOptimizeExplore;
    }

    public final int getVisibleNewestPostsCount() {
        return this.visibleNewestPostsCount;
    }

    public TTLimitNowOptimizeConfig(int i, int i2, boolean z, int i3, int i4) {
        this.uninstallFriendGroup = i;
        this.uninstallFriendBoundaryValue = i2;
        this.uninstallOptimizeExplore = z;
        this.installOptimizeApp = i3;
        this.visibleNewestPostsCount = i4;
    }

    public /* synthetic */ TTLimitNowOptimizeConfig(int i, int i2, boolean z, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? false : z, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) != 0 ? 0 : i4);
    }
}
