package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class SystemNoticeResponse extends BaseResponse {

    @InterfaceC65349Pkn("channel_list")
    public final List<NoticeChannelInfo> channelList;

    @InterfaceC65349Pkn("unsubscribe_channel_settings")
    public final List<GroupUnsubscribeSetting> groupUnsubscribeSettings;

    @InterfaceC65349Pkn("notice_list")
    public final NoticeItems noticeItem;

    @InterfaceC65349Pkn("unsubscribe_setting_metadata")
    public final UnsubscribeSettingMetadata unsubscribeSetting;

    /* JADX WARN: Multi-variable type inference failed */
    public SystemNoticeResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SystemNoticeResponse copy$default(SystemNoticeResponse systemNoticeResponse, NoticeItems noticeItems, List list, UnsubscribeSettingMetadata unsubscribeSettingMetadata, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            noticeItems = systemNoticeResponse.noticeItem;
        }
        if ((i & 2) != 0) {
            list = systemNoticeResponse.channelList;
        }
        if ((i & 4) != 0) {
            unsubscribeSettingMetadata = systemNoticeResponse.unsubscribeSetting;
        }
        if ((i & 8) != 0) {
            list2 = systemNoticeResponse.groupUnsubscribeSettings;
        }
        return systemNoticeResponse.copy(noticeItems, list, unsubscribeSettingMetadata, list2);
    }

    public final SystemNoticeResponse copy(NoticeItems noticeItems, List<NoticeChannelInfo> list, UnsubscribeSettingMetadata unsubscribeSettingMetadata, List<GroupUnsubscribeSetting> list2) {
        return new SystemNoticeResponse(noticeItems, list, unsubscribeSettingMetadata, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemNoticeResponse)) {
            return false;
        }
        SystemNoticeResponse systemNoticeResponse = (SystemNoticeResponse) obj;
        return o.LJ(this.noticeItem, systemNoticeResponse.noticeItem) && o.LJ(this.channelList, systemNoticeResponse.channelList) && o.LJ(this.unsubscribeSetting, systemNoticeResponse.unsubscribeSetting) && o.LJ(this.groupUnsubscribeSettings, systemNoticeResponse.groupUnsubscribeSettings);
    }

    public int hashCode() {
        NoticeItems noticeItems = this.noticeItem;
        int hashCode = (noticeItems == null ? 0 : noticeItems.hashCode()) * 31;
        List<NoticeChannelInfo> list = this.channelList;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        UnsubscribeSettingMetadata unsubscribeSettingMetadata = this.unsubscribeSetting;
        int hashCode3 = (hashCode2 + (unsubscribeSettingMetadata == null ? 0 : unsubscribeSettingMetadata.hashCode())) * 31;
        List<GroupUnsubscribeSetting> list2 = this.groupUnsubscribeSettings;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SystemNoticeResponse(noticeItem=");
        LIZ.append(this.noticeItem);
        LIZ.append(", channelList=");
        LIZ.append(this.channelList);
        LIZ.append(", unsubscribeSetting=");
        LIZ.append(this.unsubscribeSetting);
        LIZ.append(", groupUnsubscribeSettings=");
        return C1NE.LIZIZ(LIZ, this.groupUnsubscribeSettings, ')', LIZ);
    }

    public final List<NoticeChannelInfo> getChannelList() {
        return this.channelList;
    }

    public final List<GroupUnsubscribeSetting> getGroupUnsubscribeSettings() {
        return this.groupUnsubscribeSettings;
    }

    public final NoticeItems getNoticeItem() {
        return this.noticeItem;
    }

    public final UnsubscribeSettingMetadata getUnsubscribeSetting() {
        return this.unsubscribeSetting;
    }

    public SystemNoticeResponse(NoticeItems noticeItems, List<NoticeChannelInfo> list, UnsubscribeSettingMetadata unsubscribeSettingMetadata, List<GroupUnsubscribeSetting> list2) {
        this.noticeItem = noticeItems;
        this.channelList = list;
        this.unsubscribeSetting = unsubscribeSettingMetadata;
        this.groupUnsubscribeSettings = list2;
    }

    public /* synthetic */ SystemNoticeResponse(NoticeItems noticeItems, List list, UnsubscribeSettingMetadata unsubscribeSettingMetadata, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : noticeItems, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : unsubscribeSettingMetadata, (i & 8) != 0 ? null : list2);
    }
}
