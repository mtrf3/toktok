package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NoticeListsResponse extends BaseResponse {
    public transient List<NoticeItems> collapseNotices;

    @InterfaceC65349Pkn("log_pb")
    public final LogPbBean lobPb;

    @InterfaceC65349Pkn("notice_lists")
    public List<NoticeItems> notices;

    @InterfaceC65349Pkn("unsubscribe_setting_metadata")
    public final UnsubscribeSettingMetadata unsubscribeSetting;

    /* JADX WARN: Multi-variable type inference failed */
    public NoticeListsResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NoticeListsResponse copy$default(NoticeListsResponse noticeListsResponse, List list, List list2, LogPbBean logPbBean, UnsubscribeSettingMetadata unsubscribeSettingMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            list = noticeListsResponse.notices;
        }
        if ((i & 2) != 0) {
            list2 = noticeListsResponse.collapseNotices;
        }
        if ((i & 4) != 0) {
            logPbBean = noticeListsResponse.lobPb;
        }
        if ((i & 8) != 0) {
            unsubscribeSettingMetadata = noticeListsResponse.unsubscribeSetting;
        }
        return noticeListsResponse.copy(list, list2, logPbBean, unsubscribeSettingMetadata);
    }

    public final NoticeListsResponse copy(List<NoticeItems> list, List<NoticeItems> list2, LogPbBean logPbBean, UnsubscribeSettingMetadata unsubscribeSettingMetadata) {
        return new NoticeListsResponse(list, list2, logPbBean, unsubscribeSettingMetadata);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NoticeListsResponse)) {
            return false;
        }
        NoticeListsResponse noticeListsResponse = (NoticeListsResponse) obj;
        return o.LJ(this.notices, noticeListsResponse.notices) && o.LJ(this.collapseNotices, noticeListsResponse.collapseNotices) && o.LJ(this.lobPb, noticeListsResponse.lobPb) && o.LJ(this.unsubscribeSetting, noticeListsResponse.unsubscribeSetting);
    }

    public int hashCode() {
        List<NoticeItems> list = this.notices;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<NoticeItems> list2 = this.collapseNotices;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        LogPbBean logPbBean = this.lobPb;
        int hashCode3 = (hashCode2 + (logPbBean == null ? 0 : logPbBean.hashCode())) * 31;
        UnsubscribeSettingMetadata unsubscribeSettingMetadata = this.unsubscribeSetting;
        return hashCode3 + (unsubscribeSettingMetadata != null ? unsubscribeSettingMetadata.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NoticeListsResponse(notices=");
        LIZ.append(this.notices);
        LIZ.append(", collapseNotices=");
        LIZ.append(this.collapseNotices);
        LIZ.append(", lobPb=");
        LIZ.append(this.lobPb);
        LIZ.append(", unsubscribeSetting=");
        LIZ.append(this.unsubscribeSetting);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final List<NoticeItems> getCollapseNotices() {
        return this.collapseNotices;
    }

    public final LogPbBean getLobPb() {
        return this.lobPb;
    }

    public final List<NoticeItems> getNotices() {
        return this.notices;
    }

    public final UnsubscribeSettingMetadata getUnsubscribeSetting() {
        return this.unsubscribeSetting;
    }

    public final void setCollapseNotices(List<NoticeItems> list) {
        this.collapseNotices = list;
    }

    public final void setNotices(List<NoticeItems> list) {
        this.notices = list;
    }

    public NoticeListsResponse(List<NoticeItems> list, List<NoticeItems> list2, LogPbBean logPbBean, UnsubscribeSettingMetadata unsubscribeSettingMetadata) {
        this.notices = list;
        this.collapseNotices = list2;
        this.lobPb = logPbBean;
        this.unsubscribeSetting = unsubscribeSettingMetadata;
    }

    public /* synthetic */ NoticeListsResponse(List list, List list2, LogPbBean logPbBean, UnsubscribeSettingMetadata unsubscribeSettingMetadata, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : logPbBean, (i & 8) != 0 ? null : unsubscribeSettingMetadata);
    }
}
