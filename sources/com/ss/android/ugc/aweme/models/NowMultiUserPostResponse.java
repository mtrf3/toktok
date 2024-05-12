package com.ss.android.ugc.aweme.models;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowMultiUserPostResponse extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("log_pb")
    public final LogPbBean logPbBean;

    @InterfaceC65349Pkn("user_now_posts")
    public final List<Aweme> userNowPosts;

    @InterfaceC65349Pkn("user_publish_info")
    public final UserPublishInfo userPublishInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NowMultiUserPostResponse copy$default(NowMultiUserPostResponse nowMultiUserPostResponse, List list, UserPublishInfo userPublishInfo, LogPbBean logPbBean, int i, Object obj) {
        if ((i & 1) != 0) {
            list = nowMultiUserPostResponse.userNowPosts;
        }
        if ((i & 2) != 0) {
            userPublishInfo = nowMultiUserPostResponse.userPublishInfo;
        }
        if ((i & 4) != 0) {
            logPbBean = nowMultiUserPostResponse.logPbBean;
        }
        return nowMultiUserPostResponse.copy(list, userPublishInfo, logPbBean);
    }

    public final NowMultiUserPostResponse copy(List<? extends Aweme> list, UserPublishInfo userPublishInfo, LogPbBean logPbBean) {
        return new NowMultiUserPostResponse(list, userPublishInfo, logPbBean);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NowMultiUserPostResponse)) {
            return false;
        }
        NowMultiUserPostResponse nowMultiUserPostResponse = (NowMultiUserPostResponse) obj;
        return o.LJ(this.userNowPosts, nowMultiUserPostResponse.userNowPosts) && o.LJ(this.userPublishInfo, nowMultiUserPostResponse.userPublishInfo) && o.LJ(this.logPbBean, nowMultiUserPostResponse.logPbBean);
    }

    public int hashCode() {
        List<Aweme> list = this.userNowPosts;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        UserPublishInfo userPublishInfo = this.userPublishInfo;
        int hashCode2 = (hashCode + (userPublishInfo == null ? 0 : userPublishInfo.hashCode())) * 31;
        LogPbBean logPbBean = this.logPbBean;
        return hashCode2 + (logPbBean != null ? logPbBean.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowMultiUserPostResponse(userNowPosts=");
        LIZ.append(this.userNowPosts);
        LIZ.append(", userPublishInfo=");
        LIZ.append(this.userPublishInfo);
        LIZ.append(", logPbBean=");
        LIZ.append(this.logPbBean);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final LogPbBean getLogPbBean() {
        return this.logPbBean;
    }

    public final List<Aweme> getUserNowPosts() {
        return this.userNowPosts;
    }

    public final UserPublishInfo getUserPublishInfo() {
        return this.userPublishInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NowMultiUserPostResponse(List<? extends Aweme> list, UserPublishInfo userPublishInfo, LogPbBean logPbBean) {
        this.userNowPosts = list;
        this.userPublishInfo = userPublishInfo;
        this.logPbBean = logPbBean;
    }
}
