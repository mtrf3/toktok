package com.ss.android.ugc.tiktok.addyours.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class AddYoursDetailResp extends BaseResponse {

    @InterfaceC65349Pkn("has_more")
    public final Boolean hasMore;

    @InterfaceC65349Pkn("pagination")
    public final AddYoursPagination pagination;

    @InterfaceC65349Pkn("topic_info")
    public final AddYoursTopic topicInfo;

    @InterfaceC65349Pkn("videos")
    public final List<Aweme> videos;

    /* JADX WARN: Multi-variable type inference failed */
    public AddYoursDetailResp() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddYoursDetailResp)) {
            return false;
        }
        AddYoursDetailResp addYoursDetailResp = (AddYoursDetailResp) obj;
        return o.LJ(this.videos, addYoursDetailResp.videos) && o.LJ(this.hasMore, addYoursDetailResp.hasMore) && o.LJ(this.pagination, addYoursDetailResp.pagination) && o.LJ(this.topicInfo, addYoursDetailResp.topicInfo);
    }

    public final int hashCode() {
        List<Aweme> list = this.videos;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        AddYoursPagination addYoursPagination = this.pagination;
        int hashCode3 = (hashCode2 + (addYoursPagination == null ? 0 : addYoursPagination.hashCode())) * 31;
        AddYoursTopic addYoursTopic = this.topicInfo;
        return hashCode3 + (addYoursTopic != null ? addYoursTopic.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddYoursDetailResp(videos=");
        LIZ.append(this.videos);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", pagination=");
        LIZ.append(this.pagination);
        LIZ.append(", topicInfo=");
        LIZ.append(this.topicInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddYoursDetailResp(List<? extends Aweme> list, Boolean bool, AddYoursPagination addYoursPagination, AddYoursTopic addYoursTopic) {
        this.videos = list;
        this.hasMore = bool;
        this.pagination = addYoursPagination;
        this.topicInfo = addYoursTopic;
    }

    public /* synthetic */ AddYoursDetailResp(List list, Boolean bool, AddYoursPagination addYoursPagination, AddYoursTopic addYoursTopic, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : addYoursPagination, (i & 8) != 0 ? null : addYoursTopic);
    }
}
