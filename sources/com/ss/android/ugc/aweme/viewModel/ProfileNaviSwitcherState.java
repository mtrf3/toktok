package com.ss.android.ugc.aweme.viewModel;

import X.C48339Iy7;
import X.InterfaceC61312at;
import X.X1D;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProfileNaviSwitcherState implements InterfaceC61312at {
    public boolean hasListBeenUpdated;
    public boolean hasMore;
    public boolean hasNaviChanged;
    public List<ProfileNaviDataModel> naviList;
    public boolean shouldCreateNewNavi;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ProfileNaviSwitcherState() {
        /*
            r8 = this;
            r1 = 0
            r2 = 0
            r6 = 31
            r0 = r8
            r3 = r2
            r4 = r2
            r5 = r2
            r7 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherState.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProfileNaviSwitcherState copy$default(ProfileNaviSwitcherState profileNaviSwitcherState, List list, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = profileNaviSwitcherState.naviList;
        }
        if ((i & 2) != 0) {
            z = profileNaviSwitcherState.hasMore;
        }
        if ((i & 4) != 0) {
            z2 = profileNaviSwitcherState.hasListBeenUpdated;
        }
        if ((i & 8) != 0) {
            z3 = profileNaviSwitcherState.hasNaviChanged;
        }
        if ((i & 16) != 0) {
            z4 = profileNaviSwitcherState.shouldCreateNewNavi;
        }
        return profileNaviSwitcherState.copy(list, z, z2, z3, z4);
    }

    public final ProfileNaviSwitcherState copy(List<ProfileNaviDataModel> list, boolean z, boolean z2, boolean z3, boolean z4) {
        return new ProfileNaviSwitcherState(list, z, z2, z3, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileNaviSwitcherState)) {
            return false;
        }
        ProfileNaviSwitcherState profileNaviSwitcherState = (ProfileNaviSwitcherState) obj;
        return o.LJ(this.naviList, profileNaviSwitcherState.naviList) && this.hasMore == profileNaviSwitcherState.hasMore && this.hasListBeenUpdated == profileNaviSwitcherState.hasListBeenUpdated && this.hasNaviChanged == profileNaviSwitcherState.hasNaviChanged && this.shouldCreateNewNavi == profileNaviSwitcherState.shouldCreateNewNavi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        List<ProfileNaviDataModel> list = this.naviList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        boolean z = this.hasMore;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.hasListBeenUpdated;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.hasNaviChanged;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        return ((i4 + i5) * 31) + (this.shouldCreateNewNavi ? 1 : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileNaviSwitcherState(naviList=");
        LIZ.append(this.naviList);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", hasListBeenUpdated=");
        LIZ.append(this.hasListBeenUpdated);
        LIZ.append(", hasNaviChanged=");
        LIZ.append(this.hasNaviChanged);
        LIZ.append(", shouldCreateNewNavi=");
        return C48339Iy7.LIZJ(LIZ, this.shouldCreateNewNavi, ')', LIZ);
    }

    public final boolean getHasListBeenUpdated() {
        return this.hasListBeenUpdated;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final boolean getHasNaviChanged() {
        return this.hasNaviChanged;
    }

    public final List<ProfileNaviDataModel> getNaviList() {
        return this.naviList;
    }

    public final boolean getShouldCreateNewNavi() {
        return this.shouldCreateNewNavi;
    }

    public final void setHasListBeenUpdated(boolean z) {
        this.hasListBeenUpdated = z;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setHasNaviChanged(boolean z) {
        this.hasNaviChanged = z;
    }

    public final void setNaviList(List<ProfileNaviDataModel> list) {
        this.naviList = list;
    }

    public final void setShouldCreateNewNavi(boolean z) {
        this.shouldCreateNewNavi = z;
    }

    public ProfileNaviSwitcherState(List<ProfileNaviDataModel> list, boolean z, boolean z2, boolean z3, boolean z4) {
        this.naviList = list;
        this.hasMore = z;
        this.hasListBeenUpdated = z2;
        this.hasNaviChanged = z3;
        this.shouldCreateNewNavi = z4;
    }

    public /* synthetic */ ProfileNaviSwitcherState(List list, boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) == 0 ? z4 : false);
    }
}
