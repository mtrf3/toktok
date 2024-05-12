package com.ss.android.ugc.tiktok.addyours.hub.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.tiktok.addyours.model.AddYoursPagination;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class HubFeedResponse extends BaseResponse {

    @InterfaceC65349Pkn("has_more")
    public final Boolean hasMore;

    @InterfaceC65349Pkn("pagination")
    public final AddYoursPagination pagination;

    @InterfaceC65349Pkn("shared_count")
    public final Long sharedCount;

    @InterfaceC65349Pkn("topic_list")
    public final List<AddYoursTopic> topicList;

    @InterfaceC65349Pkn("unfinished_count")
    public final Long unFinishedCount;

    @InterfaceC65349Pkn("viewed_user")
    public final User viewedUser;

    /* JADX WARN: Multi-variable type inference failed */
    public HubFeedResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HubFeedResponse)) {
            return false;
        }
        HubFeedResponse hubFeedResponse = (HubFeedResponse) obj;
        return o.LJ(this.topicList, hubFeedResponse.topicList) && o.LJ(this.hasMore, hubFeedResponse.hasMore) && o.LJ(this.pagination, hubFeedResponse.pagination) && o.LJ(this.sharedCount, hubFeedResponse.sharedCount) && o.LJ(this.unFinishedCount, hubFeedResponse.unFinishedCount) && o.LJ(this.viewedUser, hubFeedResponse.viewedUser);
    }

    public final int hashCode() {
        List<AddYoursTopic> list = this.topicList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        AddYoursPagination addYoursPagination = this.pagination;
        int hashCode3 = (hashCode2 + (addYoursPagination == null ? 0 : addYoursPagination.hashCode())) * 31;
        Long l = this.sharedCount;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.unFinishedCount;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        User user = this.viewedUser;
        return hashCode5 + (user != null ? user.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HubFeedResponse(topicList=");
        LIZ.append(this.topicList);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", pagination=");
        LIZ.append(this.pagination);
        LIZ.append(", sharedCount=");
        LIZ.append(this.sharedCount);
        LIZ.append(", unFinishedCount=");
        LIZ.append(this.unFinishedCount);
        LIZ.append(", viewedUser=");
        LIZ.append(this.viewedUser);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public HubFeedResponse(List<AddYoursTopic> list, Boolean bool, AddYoursPagination addYoursPagination, Long l, Long l2, User user) {
        this.topicList = list;
        this.hasMore = bool;
        this.pagination = addYoursPagination;
        this.sharedCount = l;
        this.unFinishedCount = l2;
        this.viewedUser = user;
    }

    public /* synthetic */ HubFeedResponse(List list, Boolean bool, AddYoursPagination addYoursPagination, Long l, Long l2, User user, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : addYoursPagination, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : l2, (i & 32) == 0 ? user : null);
    }
}
