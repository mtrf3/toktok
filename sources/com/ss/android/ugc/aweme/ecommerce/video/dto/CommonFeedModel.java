package com.ss.android.ugc.aweme.ecommerce.video.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class CommonFeedModel implements Serializable {

    @InterfaceC65349Pkn("feed_list")
    public final List<RecommendFeedModel> feedList;

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("next_cursor")
    public final int nextCursor;

    @InterfaceC65349Pkn("request_id")
    public final String requestId;

    @InterfaceC65349Pkn("session_id")
    public final String sessionId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommonFeedModel copy$default(CommonFeedModel commonFeedModel, List list, boolean z, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = commonFeedModel.feedList;
        }
        if ((i2 & 2) != 0) {
            z = commonFeedModel.hasMore;
        }
        if ((i2 & 4) != 0) {
            i = commonFeedModel.nextCursor;
        }
        if ((i2 & 8) != 0) {
            str = commonFeedModel.requestId;
        }
        if ((i2 & 16) != 0) {
            str2 = commonFeedModel.sessionId;
        }
        return commonFeedModel.copy(list, z, i, str, str2);
    }

    public final CommonFeedModel copy(List<RecommendFeedModel> list, boolean z, int i, String str, String str2) {
        return new CommonFeedModel(list, z, i, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonFeedModel)) {
            return false;
        }
        CommonFeedModel commonFeedModel = (CommonFeedModel) obj;
        return o.LJ(this.feedList, commonFeedModel.feedList) && this.hasMore == commonFeedModel.hasMore && this.nextCursor == commonFeedModel.nextCursor && o.LJ(this.requestId, commonFeedModel.requestId) && o.LJ(this.sessionId, commonFeedModel.sessionId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        List<RecommendFeedModel> list = this.feedList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        boolean z = this.hasMore;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (((hashCode + i) * 31) + this.nextCursor) * 31;
        String str = this.requestId;
        int hashCode2 = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sessionId;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommonFeedModel(feedList=");
        LIZ.append(this.feedList);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", nextCursor=");
        LIZ.append(this.nextCursor);
        LIZ.append(", requestId=");
        LIZ.append(this.requestId);
        LIZ.append(", sessionId=");
        return q.LIZIZ(LIZ, this.sessionId, ')', LIZ);
    }

    public final List<RecommendFeedModel> getFeedList() {
        return this.feedList;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final int getNextCursor() {
        return this.nextCursor;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public CommonFeedModel(List<RecommendFeedModel> list, boolean z, int i, String str, String str2) {
        this.feedList = list;
        this.hasMore = z;
        this.nextCursor = i;
        this.requestId = str;
        this.sessionId = str2;
    }
}
