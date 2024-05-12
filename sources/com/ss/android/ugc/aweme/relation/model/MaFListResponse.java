package com.ss.android.ugc.aweme.relation.model;

import X.C61878OQg;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class MaFListResponse extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("user_list")
    public final List<User> depUserList;

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("log_pb")
    public final LogPbBean logPb;

    @InterfaceC65349Pkn("next_page_token")
    public final String nextPageToken;

    @InterfaceC65349Pkn("recommend_more_users")
    public final List<RecMorePairList> recMoreUserPairList;

    @InterfaceC65349Pkn("users")
    public final List<RecUser> userList;

    public MaFListResponse() {
        this(null, null, null, false, null, null, 63, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MaFListResponse copy$default(MaFListResponse maFListResponse, List list, List list2, String str, boolean z, LogPbBean logPbBean, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = maFListResponse.depUserList;
        }
        if ((i & 2) != 0) {
            list2 = maFListResponse.userList;
        }
        if ((i & 4) != 0) {
            str = maFListResponse.nextPageToken;
        }
        if ((i & 8) != 0) {
            z = maFListResponse.hasMore;
        }
        if ((i & 16) != 0) {
            logPbBean = maFListResponse.logPb;
        }
        if ((i & 32) != 0) {
            list3 = maFListResponse.recMoreUserPairList;
        }
        return maFListResponse.copy(list, list2, str, z, logPbBean, list3);
    }

    public static /* synthetic */ void getDepUserList$annotations() {
    }

    public final MaFListResponse copy(List<? extends User> list, List<RecUser> list2, String nextPageToken, boolean z, LogPbBean logPbBean, List<RecMorePairList> list3) {
        o.LJIIIZ(nextPageToken, "nextPageToken");
        return new MaFListResponse(list, list2, nextPageToken, z, logPbBean, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MaFListResponse)) {
            return false;
        }
        MaFListResponse maFListResponse = (MaFListResponse) obj;
        return o.LJ(this.depUserList, maFListResponse.depUserList) && o.LJ(this.userList, maFListResponse.userList) && o.LJ(this.nextPageToken, maFListResponse.nextPageToken) && this.hasMore == maFListResponse.hasMore && o.LJ(this.logPb, maFListResponse.logPb) && o.LJ(this.recMoreUserPairList, maFListResponse.recMoreUserPairList);
    }

    public final List<User> getUserListWithRid() {
        String str;
        List<User> list = this.depUserList;
        if (list == null) {
            return null;
        }
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

    public final List<RecUser> getUsers() {
        List<RecUser> list = this.userList;
        if (list == null) {
            return C61878OQg.INSTANCE;
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        List<User> list = this.depUserList;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = hashCode * 31;
        List<RecUser> list2 = this.userList;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int LJ = C79062V1e.LJ(this.nextPageToken, (i2 + hashCode2) * 31, 31);
        boolean z = this.hasMore;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (LJ + i3) * 31;
        LogPbBean logPbBean = this.logPb;
        if (logPbBean == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = logPbBean.hashCode();
        }
        int i5 = (i4 + hashCode3) * 31;
        List<RecMorePairList> list3 = this.recMoreUserPairList;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return i5 + i;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MaFListResponse(base: ");
        LIZ.append(super.toString());
        LIZ.append(", users: ");
        LIZ.append(getUsers().size());
        LIZ.append(", nextPageToken: ");
        LIZ.append(this.nextPageToken);
        LIZ.append(", hasMore: ");
        LIZ.append(this.hasMore);
        LIZ.append(", logId: ");
        LogPbBean logPbBean = this.logPb;
        if (logPbBean == null || (str = logPbBean.getImprId()) == null) {
            str = "";
        }
        return JBR.LJFF(LIZ, str, " )", LIZ);
    }

    public final List<User> getDepUserList() {
        return this.depUserList;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final String getNextPageToken() {
        return this.nextPageToken;
    }

    public final List<RecMorePairList> getRecMoreUserPairList() {
        return this.recMoreUserPairList;
    }

    public final List<RecUser> getUserList() {
        return this.userList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MaFListResponse(List<? extends User> list, List<RecUser> list2, String nextPageToken, boolean z, LogPbBean logPbBean, List<RecMorePairList> list3) {
        o.LJIIIZ(nextPageToken, "nextPageToken");
        this.depUserList = list;
        this.userList = list2;
        this.nextPageToken = nextPageToken;
        this.hasMore = z;
        this.logPb = logPbBean;
        this.recMoreUserPairList = list3;
    }

    public MaFListResponse(List list, List list2, String str, boolean z, LogPbBean logPbBean, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? C61878OQg.INSTANCE : list2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : logPbBean, (i & 32) == 0 ? list3 : null);
    }
}
