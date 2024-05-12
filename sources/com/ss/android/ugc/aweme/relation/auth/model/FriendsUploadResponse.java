package com.ss.android.ugc.aweme.relation.auth.model;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FriendsUploadResponse extends BaseResponse {

    @InterfaceC65349Pkn("social_users")
    public final List<User> _userList;

    @InterfaceC65349Pkn("log_pb")
    public final LogPbBean logPbBean;

    public FriendsUploadResponse() {
        this(null, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsUploadResponse)) {
            return false;
        }
        FriendsUploadResponse friendsUploadResponse = (FriendsUploadResponse) obj;
        return o.LJ(this._userList, friendsUploadResponse._userList) && o.LJ(this.logPbBean, friendsUploadResponse.logPbBean);
    }

    public final int hashCode() {
        int hashCode = this._userList.hashCode() * 31;
        LogPbBean logPbBean = this.logPbBean;
        return hashCode + (logPbBean == null ? 0 : logPbBean.hashCode());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FriendsUploadResponse(_userList=");
        LIZ.append(this._userList);
        LIZ.append(", logPbBean=");
        LIZ.append(this.logPbBean);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FriendsUploadResponse(List<? extends User> _userList, LogPbBean logPbBean) {
        o.LJIIIZ(_userList, "_userList");
        this._userList = _userList;
        this.logPbBean = logPbBean;
    }

    public FriendsUploadResponse(List list, LogPbBean logPbBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? null : logPbBean);
    }
}
