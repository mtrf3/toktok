package com.ss.android.ugc.aweme.ecommerce.mall.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MallCommonFeedModel implements Serializable {

    @InterfaceC65349Pkn("feed_list")
    public final List<MallFeed> feedList;

    @InterfaceC65349Pkn("has_more")
    public final Boolean hasMore;

    @InterfaceC65349Pkn("next_cursor")
    public final Integer nextCursor;

    @InterfaceC65349Pkn("request_id")
    public final String requestId;

    @InterfaceC65349Pkn("session_id")
    public final String sessionId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MallCommonFeedModel copy$default(MallCommonFeedModel mallCommonFeedModel, List list, Boolean bool, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = mallCommonFeedModel.feedList;
        }
        if ((i & 2) != 0) {
            bool = mallCommonFeedModel.hasMore;
        }
        if ((i & 4) != 0) {
            num = mallCommonFeedModel.nextCursor;
        }
        if ((i & 8) != 0) {
            str = mallCommonFeedModel.requestId;
        }
        if ((i & 16) != 0) {
            str2 = mallCommonFeedModel.sessionId;
        }
        return mallCommonFeedModel.copy(list, bool, num, str, str2);
    }

    public final MallCommonFeedModel copy(List<MallFeed> list, Boolean bool, Integer num, String str, String str2) {
        return new MallCommonFeedModel(list, bool, num, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MallCommonFeedModel)) {
            return false;
        }
        MallCommonFeedModel mallCommonFeedModel = (MallCommonFeedModel) obj;
        return o.LJ(this.feedList, mallCommonFeedModel.feedList) && o.LJ(this.hasMore, mallCommonFeedModel.hasMore) && o.LJ(this.nextCursor, mallCommonFeedModel.nextCursor) && o.LJ(this.requestId, mallCommonFeedModel.requestId) && o.LJ(this.sessionId, mallCommonFeedModel.sessionId);
    }

    public int hashCode() {
        List<MallFeed> list = this.feedList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.nextCursor;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.requestId;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sessionId;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MallCommonFeedModel(feedList=");
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

    public final List<MallFeed> getFeedList() {
        return this.feedList;
    }

    public final Boolean getHasMore() {
        return this.hasMore;
    }

    public final Integer getNextCursor() {
        return this.nextCursor;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public MallCommonFeedModel(List<MallFeed> list, Boolean bool, Integer num, String str, String str2) {
        this.feedList = list;
        this.hasMore = bool;
        this.nextCursor = num;
        this.requestId = str;
        this.sessionId = str2;
    }
}
