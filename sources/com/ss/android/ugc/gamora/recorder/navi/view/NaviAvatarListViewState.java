package com.ss.android.ugc.gamora.recorder.navi.view;

import X.C48339Iy7;
import X.InterfaceC61312at;
import X.RTP;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class NaviAvatarListViewState implements InterfaceC61312at {
    public final int avatarCountCandidate;
    public final int avatarCountSelf;
    public final List<RTP> avatarList;
    public final boolean isEditDone;
    public final Integer loadingIndex;
    public final Integer selectedIndex;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NaviAvatarListViewState() {
        /*
            r9 = this;
            r1 = 0
            r2 = 0
            r7 = 63
            r0 = r9
            r3 = r2
            r4 = r1
            r5 = r1
            r6 = r2
            r8 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.navi.view.NaviAvatarListViewState.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NaviAvatarListViewState copy$default(NaviAvatarListViewState naviAvatarListViewState, List list, int i, int i2, Integer num, Integer num2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = naviAvatarListViewState.avatarList;
        }
        if ((i3 & 2) != 0) {
            i = naviAvatarListViewState.avatarCountSelf;
        }
        if ((i3 & 4) != 0) {
            i2 = naviAvatarListViewState.avatarCountCandidate;
        }
        if ((i3 & 8) != 0) {
            num = naviAvatarListViewState.loadingIndex;
        }
        if ((i3 & 16) != 0) {
            num2 = naviAvatarListViewState.selectedIndex;
        }
        if ((i3 & 32) != 0) {
            z = naviAvatarListViewState.isEditDone;
        }
        return naviAvatarListViewState.copy(list, i, i2, num, num2, z);
    }

    public final NaviAvatarListViewState copy(List<RTP> list, int i, int i2, Integer num, Integer num2, boolean z) {
        return new NaviAvatarListViewState(list, i, i2, num, num2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NaviAvatarListViewState)) {
            return false;
        }
        NaviAvatarListViewState naviAvatarListViewState = (NaviAvatarListViewState) obj;
        return o.LJ(this.avatarList, naviAvatarListViewState.avatarList) && this.avatarCountSelf == naviAvatarListViewState.avatarCountSelf && this.avatarCountCandidate == naviAvatarListViewState.avatarCountCandidate && o.LJ(this.loadingIndex, naviAvatarListViewState.loadingIndex) && o.LJ(this.selectedIndex, naviAvatarListViewState.selectedIndex) && this.isEditDone == naviAvatarListViewState.isEditDone;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        List<RTP> list = this.avatarList;
        int hashCode = (((((list == null ? 0 : list.hashCode()) * 31) + this.avatarCountSelf) * 31) + this.avatarCountCandidate) * 31;
        Integer num = this.loadingIndex;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.selectedIndex;
        int hashCode3 = (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z = this.isEditDone;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NaviAvatarListViewState(avatarList=");
        LIZ.append(this.avatarList);
        LIZ.append(", avatarCountSelf=");
        LIZ.append(this.avatarCountSelf);
        LIZ.append(", avatarCountCandidate=");
        LIZ.append(this.avatarCountCandidate);
        LIZ.append(", loadingIndex=");
        LIZ.append(this.loadingIndex);
        LIZ.append(", selectedIndex=");
        LIZ.append(this.selectedIndex);
        LIZ.append(", isEditDone=");
        return C48339Iy7.LIZJ(LIZ, this.isEditDone, ')', LIZ);
    }

    public final int getAvatarCountCandidate() {
        return this.avatarCountCandidate;
    }

    public final int getAvatarCountSelf() {
        return this.avatarCountSelf;
    }

    public final List<RTP> getAvatarList() {
        return this.avatarList;
    }

    public final Integer getLoadingIndex() {
        return this.loadingIndex;
    }

    public final Integer getSelectedIndex() {
        return this.selectedIndex;
    }

    public final boolean isEditDone() {
        return this.isEditDone;
    }

    public NaviAvatarListViewState(List<RTP> list, int i, int i2, Integer num, Integer num2, boolean z) {
        this.avatarList = list;
        this.avatarCountSelf = i;
        this.avatarCountCandidate = i2;
        this.loadingIndex = num;
        this.selectedIndex = num2;
        this.isEditDone = z;
    }

    public /* synthetic */ NaviAvatarListViewState(List list, int i, int i2, Integer num, Integer num2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : list, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? null : num, (i3 & 16) == 0 ? num2 : null, (i3 & 32) != 0 ? false : z);
    }
}
