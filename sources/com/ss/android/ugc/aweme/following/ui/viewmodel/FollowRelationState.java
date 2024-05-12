package com.ss.android.ugc.aweme.following.ui.viewmodel;

import X.F9E;
import X.InterfaceC61312at;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class FollowRelationState extends F9E implements InterfaceC61312at {
    public final int connectedRelationCount;
    public final int fanCount;
    public final boolean hasVisitedFollowerTab;
    public final boolean isFollowerTab;
    public final boolean isFollowingTab;
    public final int mutualCount;
    public final String tabIndex;

    public FollowRelationState() {
        this(0, 0, 0, false, null, false, false, 127, null);
    }

    public static /* synthetic */ FollowRelationState copy$default(FollowRelationState followRelationState, int i, int i2, int i3, boolean z, String str, boolean z2, boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = followRelationState.connectedRelationCount;
        }
        if ((i4 & 2) != 0) {
            i2 = followRelationState.fanCount;
        }
        if ((i4 & 4) != 0) {
            i3 = followRelationState.mutualCount;
        }
        if ((i4 & 8) != 0) {
            z = followRelationState.isFollowingTab;
        }
        if ((i4 & 16) != 0) {
            str = followRelationState.tabIndex;
        }
        if ((i4 & 32) != 0) {
            z2 = followRelationState.isFollowerTab;
        }
        if ((i4 & 64) != 0) {
            z3 = followRelationState.hasVisitedFollowerTab;
        }
        return followRelationState.copy(i, i2, i3, z, str, z2, z3);
    }

    public final FollowRelationState copy(int i, int i2, int i3, boolean z, String tabIndex, boolean z2, boolean z3) {
        o.LJIIIZ(tabIndex, "tabIndex");
        return new FollowRelationState(i, i2, i3, z, tabIndex, z2, z3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.connectedRelationCount), Integer.valueOf(this.fanCount), Integer.valueOf(this.mutualCount), Boolean.valueOf(this.isFollowingTab), this.tabIndex, Boolean.valueOf(this.isFollowerTab), Boolean.valueOf(this.hasVisitedFollowerTab)};
    }

    public final int getConnectedRelationCount() {
        return this.connectedRelationCount;
    }

    public final int getFanCount() {
        return this.fanCount;
    }

    public final boolean getHasVisitedFollowerTab() {
        return this.hasVisitedFollowerTab;
    }

    public final int getMutualCount() {
        return this.mutualCount;
    }

    public final String getTabIndex() {
        return this.tabIndex;
    }

    public final boolean isFollowerTab() {
        return this.isFollowerTab;
    }

    public final boolean isFollowingTab() {
        return this.isFollowingTab;
    }

    public FollowRelationState(int i, int i2, int i3, boolean z, String tabIndex, boolean z2, boolean z3) {
        o.LJIIIZ(tabIndex, "tabIndex");
        this.connectedRelationCount = i;
        this.fanCount = i2;
        this.mutualCount = i3;
        this.isFollowingTab = z;
        this.tabIndex = tabIndex;
        this.isFollowerTab = z2;
        this.hasVisitedFollowerTab = z3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FollowRelationState(int r3, int r4, int r5, boolean r6, java.lang.String r7, boolean r8, boolean r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r2 = this;
            r0 = r10 & 1
            if (r0 == 0) goto L5
            r3 = 0
        L5:
            r0 = r10 & 2
            if (r0 == 0) goto L16
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            com.ss.android.ugc.aweme.profile.model.User r1 = r0.getCurUser()
            if (r1 != 0) goto L34
            r4 = 0
        L16:
            r0 = r10 & 4
            if (r0 == 0) goto L1b
            r5 = 0
        L1b:
            r0 = r10 & 8
            if (r0 == 0) goto L20
            r6 = 0
        L20:
            r0 = r10 & 16
            if (r0 == 0) goto L26
            java.lang.String r7 = ""
        L26:
            r0 = r10 & 32
            if (r0 == 0) goto L2b
            r8 = 0
        L2b:
            r0 = r10 & 64
            if (r0 == 0) goto L30
            r9 = 0
        L30:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        L34:
            boolean r0 = X.C78841Uwv.LJJJ(r1)
            if (r0 == 0) goto L3f
            int r4 = r1.getFansCount()
            goto L16
        L3f:
            int r4 = r1.getFollowerCount()
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationState.<init>(int, int, int, boolean, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
