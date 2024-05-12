package com.ss.android.ugc.aweme.relation.model;

import X.C61878OQg;
import X.C62724OjY;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FriendsListResponse extends BaseResponse {

    @InterfaceC65349Pkn("friends")
    public final List<C62724OjY> friends;

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("log_pb")
    public final LogPbBean logPb;

    @InterfaceC65349Pkn("next_page_token")
    public final String nextPageToken;

    public FriendsListResponse() {
        this(null, false, null, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsListResponse)) {
            return false;
        }
        FriendsListResponse friendsListResponse = (FriendsListResponse) obj;
        return o.LJ(this.friends, friendsListResponse.friends) && this.hasMore == friendsListResponse.hasMore && o.LJ(this.nextPageToken, friendsListResponse.nextPageToken) && o.LJ(this.logPb, friendsListResponse.logPb);
    }

    public final List<C62724OjY> getUserList() {
        String str;
        List<C62724OjY> list = this.friends;
        for (C62724OjY c62724OjY : list) {
            LogPbBean logPbBean = this.logPb;
            if (logPbBean != null) {
                str = logPbBean.getImprId();
            } else {
                str = null;
            }
            c62724OjY.setRequestId(str);
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.friends.hashCode() * 31;
        boolean z = this.hasMore;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int LJ = C79062V1e.LJ(this.nextPageToken, (hashCode2 + i) * 31, 31);
        LogPbBean logPbBean = this.logPb;
        if (logPbBean == null) {
            hashCode = 0;
        } else {
            hashCode = logPbBean.hashCode();
        }
        return LJ + hashCode;
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FriendsListResponse(message: ");
        LIZ.append(super.toString());
        LIZ.append(", user size: ");
        LIZ.append(getUserList().size());
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

    public FriendsListResponse(List<C62724OjY> friends, boolean z, String nextPageToken, LogPbBean logPbBean) {
        o.LJIIIZ(friends, "friends");
        o.LJIIIZ(nextPageToken, "nextPageToken");
        this.friends = friends;
        this.hasMore = z;
        this.nextPageToken = nextPageToken;
        this.logPb = logPbBean;
    }

    public FriendsListResponse(List list, boolean z, String str, LogPbBean logPbBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? null : logPbBean);
    }
}
