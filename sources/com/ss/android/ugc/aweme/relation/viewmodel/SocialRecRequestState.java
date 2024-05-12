package com.ss.android.ugc.aweme.relation.viewmodel;

import X.C48339Iy7;
import X.InterfaceC61312at;
import X.X1D;
import com.ss.android.ugc.aweme.friends.model.FriendList;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class SocialRecRequestState implements InterfaceC61312at {
    public final FriendList<? extends User> friends;
    public final boolean isNeedActualPopUp;
    public final int isNewVersionSynced;
    public final boolean isOverStayTime;
    public final boolean isSkipByCancel;
    public final boolean isSkipByEmptyData;
    public final boolean isSkipByException;
    public final boolean isSync;
    public final boolean needNewVersionRecShow;
    public final int newVersionSyncClick;

    /* JADX WARN: Multi-variable type inference failed */
    public SocialRecRequestState() {
        this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1023, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SocialRecRequestState copy$default(SocialRecRequestState socialRecRequestState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, FriendList friendList, int i, int i2, boolean z7, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = socialRecRequestState.isSkipByException;
        }
        if ((i3 & 2) != 0) {
            z2 = socialRecRequestState.isSkipByEmptyData;
        }
        if ((i3 & 4) != 0) {
            z3 = socialRecRequestState.isSkipByCancel;
        }
        if ((i3 & 8) != 0) {
            z4 = socialRecRequestState.isSync;
        }
        if ((i3 & 16) != 0) {
            z5 = socialRecRequestState.isOverStayTime;
        }
        if ((i3 & 32) != 0) {
            z6 = socialRecRequestState.isNeedActualPopUp;
        }
        if ((i3 & 64) != 0) {
            friendList = socialRecRequestState.friends;
        }
        if ((i3 & 128) != 0) {
            i = socialRecRequestState.newVersionSyncClick;
        }
        if ((i3 & 256) != 0) {
            i2 = socialRecRequestState.isNewVersionSynced;
        }
        if ((i3 & 512) != 0) {
            z7 = socialRecRequestState.needNewVersionRecShow;
        }
        return socialRecRequestState.copy(z, z2, z3, z4, z5, z6, friendList, i, i2, z7);
    }

    public final SocialRecRequestState copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, FriendList<? extends User> friendList, int i, int i2, boolean z7) {
        return new SocialRecRequestState(z, z2, z3, z4, z5, z6, friendList, i, i2, z7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialRecRequestState)) {
            return false;
        }
        SocialRecRequestState socialRecRequestState = (SocialRecRequestState) obj;
        return this.isSkipByException == socialRecRequestState.isSkipByException && this.isSkipByEmptyData == socialRecRequestState.isSkipByEmptyData && this.isSkipByCancel == socialRecRequestState.isSkipByCancel && this.isSync == socialRecRequestState.isSync && this.isOverStayTime == socialRecRequestState.isOverStayTime && this.isNeedActualPopUp == socialRecRequestState.isNeedActualPopUp && o.LJ(this.friends, socialRecRequestState.friends) && this.newVersionSyncClick == socialRecRequestState.newVersionSyncClick && this.isNewVersionSynced == socialRecRequestState.isNewVersionSynced && this.needNewVersionRecShow == socialRecRequestState.needNewVersionRecShow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public int hashCode() {
        boolean z = this.isSkipByException;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r02 = this.isSkipByEmptyData;
        int i2 = r02;
        if (r02 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r03 = this.isSkipByCancel;
        int i4 = r03;
        if (r03 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        ?? r04 = this.isSync;
        int i6 = r04;
        if (r04 != 0) {
            i6 = 1;
        }
        int i7 = (i5 + i6) * 31;
        ?? r05 = this.isOverStayTime;
        int i8 = r05;
        if (r05 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        ?? r06 = this.isNeedActualPopUp;
        int i10 = r06;
        if (r06 != 0) {
            i10 = 1;
        }
        int i11 = (i9 + i10) * 31;
        FriendList<? extends User> friendList = this.friends;
        return ((((((i11 + (friendList == null ? 0 : friendList.hashCode())) * 31) + this.newVersionSyncClick) * 31) + this.isNewVersionSynced) * 31) + (this.needNewVersionRecShow ? 1 : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SocialRecRequestState(isSkipByException=");
        LIZ.append(this.isSkipByException);
        LIZ.append(", isSkipByEmptyData=");
        LIZ.append(this.isSkipByEmptyData);
        LIZ.append(", isSkipByCancel=");
        LIZ.append(this.isSkipByCancel);
        LIZ.append(", isSync=");
        LIZ.append(this.isSync);
        LIZ.append(", isOverStayTime=");
        LIZ.append(this.isOverStayTime);
        LIZ.append(", isNeedActualPopUp=");
        LIZ.append(this.isNeedActualPopUp);
        LIZ.append(", friends=");
        LIZ.append(this.friends);
        LIZ.append(", newVersionSyncClick=");
        LIZ.append(this.newVersionSyncClick);
        LIZ.append(", isNewVersionSynced=");
        LIZ.append(this.isNewVersionSynced);
        LIZ.append(", needNewVersionRecShow=");
        return C48339Iy7.LIZJ(LIZ, this.needNewVersionRecShow, ')', LIZ);
    }

    public final FriendList<? extends User> getFriends() {
        return this.friends;
    }

    public final boolean getNeedNewVersionRecShow() {
        return this.needNewVersionRecShow;
    }

    public final int getNewVersionSyncClick() {
        return this.newVersionSyncClick;
    }

    public final boolean isNeedActualPopUp() {
        return this.isNeedActualPopUp;
    }

    public final int isNewVersionSynced() {
        return this.isNewVersionSynced;
    }

    public final boolean isOverStayTime() {
        return this.isOverStayTime;
    }

    public final boolean isSkipByCancel() {
        return this.isSkipByCancel;
    }

    public final boolean isSkipByEmptyData() {
        return this.isSkipByEmptyData;
    }

    public final boolean isSkipByException() {
        return this.isSkipByException;
    }

    public final boolean isSync() {
        return this.isSync;
    }

    public SocialRecRequestState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, FriendList<? extends User> friendList, int i, int i2, boolean z7) {
        this.isSkipByException = z;
        this.isSkipByEmptyData = z2;
        this.isSkipByCancel = z3;
        this.isSync = z4;
        this.isOverStayTime = z5;
        this.isNeedActualPopUp = z6;
        this.friends = friendList;
        this.newVersionSyncClick = i;
        this.isNewVersionSynced = i2;
        this.needNewVersionRecShow = z7;
    }

    public /* synthetic */ SocialRecRequestState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, FriendList friendList, int i, int i2, boolean z7, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? false : z2, (i3 & 4) != 0 ? false : z3, (i3 & 8) != 0 ? false : z4, (i3 & 16) != 0 ? false : z5, (i3 & 32) != 0 ? false : z6, (i3 & 64) != 0 ? null : friendList, (i3 & 128) != 0 ? -1 : i, (i3 & 256) == 0 ? i2 : -1, (i3 & 512) == 0 ? z7 : false);
    }
}
