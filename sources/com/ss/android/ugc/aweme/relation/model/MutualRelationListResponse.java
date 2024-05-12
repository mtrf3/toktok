package com.ss.android.ugc.aweme.relation.model;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MutualRelationListResponse extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("log_pb")
    public final LogPbBean logPb;

    @InterfaceC65349Pkn("users")
    public final List<User> userInfos;

    public MutualRelationListResponse() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MutualRelationListResponse copy$default(MutualRelationListResponse mutualRelationListResponse, List list, LogPbBean logPbBean, int i, Object obj) {
        if ((i & 1) != 0) {
            list = mutualRelationListResponse.userInfos;
        }
        if ((i & 2) != 0) {
            logPbBean = mutualRelationListResponse.logPb;
        }
        return mutualRelationListResponse.copy(list, logPbBean);
    }

    public final MutualRelationListResponse copy(List<? extends User> userInfos, LogPbBean logPbBean) {
        o.LJIIIZ(userInfos, "userInfos");
        return new MutualRelationListResponse(userInfos, logPbBean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MutualRelationListResponse)) {
            return false;
        }
        MutualRelationListResponse mutualRelationListResponse = (MutualRelationListResponse) obj;
        return o.LJ(this.userInfos, mutualRelationListResponse.userInfos) && o.LJ(this.logPb, mutualRelationListResponse.logPb);
    }

    public int hashCode() {
        int hashCode = this.userInfos.hashCode() * 31;
        LogPbBean logPbBean = this.logPb;
        return hashCode + (logPbBean == null ? 0 : logPbBean.hashCode());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MutualRelationListResponse(userInfos=");
        LIZ.append(this.userInfos);
        LIZ.append(", logPb=");
        LIZ.append(this.logPb);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final List<User> getUserList() {
        String str;
        List<User> list = this.userInfos;
        for (User user : list) {
            LogPbBean logPbBean = this.logPb;
            if (logPbBean != null) {
                str = logPbBean.getImprId();
            } else {
                str = null;
            }
            user.setRequestId(str);
        }
        return list;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final List<User> getUserInfos() {
        return this.userInfos;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MutualRelationListResponse(List<? extends User> userInfos, LogPbBean logPbBean) {
        o.LJIIIZ(userInfos, "userInfos");
        this.userInfos = userInfos;
        this.logPb = logPbBean;
    }

    public MutualRelationListResponse(List list, LogPbBean logPbBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? null : logPbBean);
    }
}
