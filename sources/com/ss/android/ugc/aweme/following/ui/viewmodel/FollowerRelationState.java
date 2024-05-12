package com.ss.android.ugc.aweme.following.ui.viewmodel;

import X.C72909SjR;
import X.C79062V1e;
import X.InterfaceC61312at;
import X.X1D;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class FollowerRelationState implements InterfaceC61312at {
    public final User followerListOwner;
    public final boolean isSelf;
    public final ListState listState;
    public final String pageToken;
    public final String secUserId;
    public final String userId;

    /* JADX WARN: Multi-variable type inference failed */
    public FollowerRelationState() {
        this(null, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ FollowerRelationState copy$default(FollowerRelationState followerRelationState, String str, String str2, boolean z, ListState listState, String str3, User user, int i, Object obj) {
        if ((i & 1) != 0) {
            str = followerRelationState.userId;
        }
        if ((i & 2) != 0) {
            str2 = followerRelationState.secUserId;
        }
        if ((i & 4) != 0) {
            z = followerRelationState.isSelf;
        }
        if ((i & 8) != 0) {
            listState = followerRelationState.listState;
        }
        if ((i & 16) != 0) {
            str3 = followerRelationState.pageToken;
        }
        if ((i & 32) != 0) {
            user = followerRelationState.followerListOwner;
        }
        return followerRelationState.copy(str, str2, z, listState, str3, user);
    }

    public final FollowerRelationState copy(String userId, String secUserId, boolean z, ListState listState, String pageToken, User user) {
        o.LJIIIZ(userId, "userId");
        o.LJIIIZ(secUserId, "secUserId");
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(pageToken, "pageToken");
        return new FollowerRelationState(userId, secUserId, z, listState, pageToken, user);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FollowerRelationState)) {
            return false;
        }
        FollowerRelationState followerRelationState = (FollowerRelationState) obj;
        return o.LJ(this.userId, followerRelationState.userId) && o.LJ(this.secUserId, followerRelationState.secUserId) && this.isSelf == followerRelationState.isSelf && o.LJ(this.listState, followerRelationState.listState) && o.LJ(this.pageToken, followerRelationState.pageToken) && o.LJ(this.followerListOwner, followerRelationState.followerListOwner);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FollowerRelationState(userId=");
        LIZ.append(this.userId);
        LIZ.append(", secUserId=");
        LIZ.append(this.secUserId);
        LIZ.append(", isSelf=");
        LIZ.append(this.isSelf);
        LIZ.append(", listState=");
        LIZ.append(this.listState);
        LIZ.append(", pageToken=");
        LIZ.append(this.pageToken);
        LIZ.append(", followerListOwner=");
        LIZ.append(this.followerListOwner);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.secUserId, this.userId.hashCode() * 31, 31);
        boolean z = this.isSelf;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int LJ2 = C79062V1e.LJ(this.pageToken, (this.listState.hashCode() + ((LJ + i) * 31)) * 31, 31);
        User user = this.followerListOwner;
        if (user == null) {
            hashCode = 0;
        } else {
            hashCode = user.hashCode();
        }
        return LJ2 + hashCode;
    }

    public final User getFollowerListOwner() {
        return this.followerListOwner;
    }

    public final ListState getListState() {
        return this.listState;
    }

    public final String getPageToken() {
        return this.pageToken;
    }

    public final String getSecUserId() {
        return this.secUserId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final boolean isSelf() {
        return this.isSelf;
    }

    public FollowerRelationState(String userId, String secUserId, boolean z, ListState listState, String pageToken, User user) {
        o.LJIIIZ(userId, "userId");
        o.LJIIIZ(secUserId, "secUserId");
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(pageToken, "pageToken");
        this.userId = userId;
        this.secUserId = secUserId;
        this.isSelf = z;
        this.listState = listState;
        this.pageToken = pageToken;
        this.followerListOwner = user;
    }

    public /* synthetic */ FollowerRelationState(String str, String str2, boolean z, ListState listState, String str3, User user, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? new ListState(new C72909SjR(false, 0, 0L, false, 0, 0, false, 255), null, null, null, null, 30, null) : listState, (i & 16) == 0 ? str3 : "", (i & 32) != 0 ? null : user);
    }
}
