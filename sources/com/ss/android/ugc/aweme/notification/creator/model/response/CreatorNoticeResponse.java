package com.ss.android.ugc.aweme.notification.creator.model.response;

import X.InterfaceC65349Pkn;
import X.MT7;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class CreatorNoticeResponse extends BaseResponse {

    @InterfaceC65349Pkn("cursor")
    public final String cursor;

    @InterfaceC65349Pkn("extra_list")
    public List<? extends MusNotice> extraList;

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("notice_list")
    public List<? extends MusNotice> notices;
    public MT7 requestType;

    @InterfaceC65349Pkn("filter_ids")
    public final List<Integer> resultFilterIds;

    @InterfaceC65349Pkn("sort_id")
    public final int resultSortId;

    @InterfaceC65349Pkn("tab_id")
    public final int resultTabId;

    @InterfaceC65349Pkn("class_tab_metadatas")
    public List<NoticeTabModel> tabDataModel;

    @InterfaceC65349Pkn("total")
    public final int total;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreatorNoticeResponse copy$default(CreatorNoticeResponse creatorNoticeResponse, List list, List list2, String str, int i, int i2, List list3, int i3, boolean z, List list4, MT7 mt7, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = creatorNoticeResponse.notices;
        }
        if ((i4 & 2) != 0) {
            list2 = creatorNoticeResponse.tabDataModel;
        }
        if ((i4 & 4) != 0) {
            str = creatorNoticeResponse.cursor;
        }
        if ((i4 & 8) != 0) {
            i = creatorNoticeResponse.total;
        }
        if ((i4 & 16) != 0) {
            i2 = creatorNoticeResponse.resultSortId;
        }
        if ((i4 & 32) != 0) {
            list3 = creatorNoticeResponse.resultFilterIds;
        }
        if ((i4 & 64) != 0) {
            i3 = creatorNoticeResponse.resultTabId;
        }
        if ((i4 & 128) != 0) {
            z = creatorNoticeResponse.hasMore;
        }
        if ((i4 & 256) != 0) {
            list4 = creatorNoticeResponse.extraList;
        }
        if ((i4 & 512) != 0) {
            mt7 = creatorNoticeResponse.requestType;
        }
        return creatorNoticeResponse.copy(list, list2, str, i, i2, list3, i3, z, list4, mt7);
    }

    public final CreatorNoticeResponse copy(List<? extends MusNotice> list, List<NoticeTabModel> list2, String str, int i, int i2, List<Integer> list3, int i3, boolean z, List<? extends MusNotice> list4, MT7 requestType) {
        o.LJIIIZ(requestType, "requestType");
        return new CreatorNoticeResponse(list, list2, str, i, i2, list3, i3, z, list4, requestType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreatorNoticeResponse)) {
            return false;
        }
        CreatorNoticeResponse creatorNoticeResponse = (CreatorNoticeResponse) obj;
        return o.LJ(this.notices, creatorNoticeResponse.notices) && o.LJ(this.tabDataModel, creatorNoticeResponse.tabDataModel) && o.LJ(this.cursor, creatorNoticeResponse.cursor) && this.total == creatorNoticeResponse.total && this.resultSortId == creatorNoticeResponse.resultSortId && o.LJ(this.resultFilterIds, creatorNoticeResponse.resultFilterIds) && this.resultTabId == creatorNoticeResponse.resultTabId && this.hasMore == creatorNoticeResponse.hasMore && o.LJ(this.extraList, creatorNoticeResponse.extraList) && this.requestType == creatorNoticeResponse.requestType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        List<? extends MusNotice> list = this.notices;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<NoticeTabModel> list2 = this.tabDataModel;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.cursor;
        int hashCode3 = (((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.total) * 31) + this.resultSortId) * 31;
        List<Integer> list3 = this.resultFilterIds;
        int hashCode4 = (((hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31) + this.resultTabId) * 31;
        boolean z = this.hasMore;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode4 + i) * 31;
        List<? extends MusNotice> list4 = this.extraList;
        return this.requestType.hashCode() + ((i2 + (list4 != null ? list4.hashCode() : 0)) * 31);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CreatorNoticeResponse(notices=");
        LIZ.append(this.notices);
        LIZ.append(", tabDataModel=");
        LIZ.append(this.tabDataModel);
        LIZ.append(", cursor=");
        LIZ.append(this.cursor);
        LIZ.append(", total=");
        LIZ.append(this.total);
        LIZ.append(", resultSortId=");
        LIZ.append(this.resultSortId);
        LIZ.append(", resultFilterIds=");
        LIZ.append(this.resultFilterIds);
        LIZ.append(", resultTabId=");
        LIZ.append(this.resultTabId);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", extraList=");
        LIZ.append(this.extraList);
        LIZ.append(", requestType=");
        LIZ.append(this.requestType);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final void injectRequestType(MT7 requestType) {
        o.LJIIIZ(requestType, "requestType");
        this.requestType = requestType;
    }

    public final void setRequestType(MT7 mt7) {
        o.LJIIIZ(mt7, "<set-?>");
        this.requestType = mt7;
    }

    public CreatorNoticeResponse(List<? extends MusNotice> list, List<NoticeTabModel> list2, String str, int i, int i2, List<Integer> list3, int i3, boolean z, List<? extends MusNotice> list4, MT7 requestType) {
        o.LJIIIZ(requestType, "requestType");
        this.notices = list;
        this.tabDataModel = list2;
        this.cursor = str;
        this.total = i;
        this.resultSortId = i2;
        this.resultFilterIds = list3;
        this.resultTabId = i3;
        this.hasMore = z;
        this.extraList = list4;
        this.requestType = requestType;
    }

    public /* synthetic */ CreatorNoticeResponse(List list, List list2, String str, int i, int i2, List list3, int i3, boolean z, List list4, MT7 mt7, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : list, (i4 & 2) != 0 ? null : list2, (i4 & 4) != 0 ? null : str, (i4 & 8) != 0 ? 0 : i, i2, list3, i3, z, (i4 & 256) == 0 ? list4 : null, mt7);
    }
}
