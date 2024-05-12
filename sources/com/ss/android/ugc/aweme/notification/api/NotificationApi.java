package com.ss.android.ugc.aweme.notification.api;

import X.AbstractC73672Svk;
import X.C221108m2;
import X.C62822Ol8;
import X.E4Q;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC36228EJs;
import X.InterfaceC64985Pev;
import X.InterfaceC64989Pez;
import X.MD9;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.SystemNoticeResponse;
import com.ss.android.ugc.aweme.notification.bean.LiveNoticeMessageResponse;
import com.ss.android.ugc.aweme.notification.bean.NotificationSubscribeSettingsList;
import com.ss.android.ugc.aweme.notification.creator.model.response.CreatorNoticeResponse;
import java.util.Map;

/* loaded from: classes10.dex */
public final class NotificationApi {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(MD9.LJLIL);

    /* loaded from: classes10.dex */
    public interface Api {
        @E4T("/aweme/v1/notice/del/")
        AbstractC73672Svk<BaseResponse> deleteNotice(@InterfaceC64989Pez("notice_id") String str);

        @E4Q("/aweme/janus/v1/notice/multi/")
        AbstractC73672Svk<NoticeCombineResponse> fetchCombineNotice(@InterfaceC64989Pez("live_entrance") int i, @InterfaceC64989Pez("req_from") String str, @InterfaceC64989Pez("is_draw") long j, @InterfaceC64989Pez("content_type") int i2, @InterfaceC64989Pez("channel_id") int i3, @InterfaceC64989Pez("count") int i4, @InterfaceC36228EJs Map<String, String> map, @InterfaceC64989Pez("scenario") int i5);

        @E4Q("/tiktok/notice/creator_inbox/v1/")
        AbstractC73672Svk<CreatorNoticeResponse> fetchCreatorNotice(@InterfaceC64989Pez("tab_id") int i, @InterfaceC64989Pez("experiment_params") String str, @InterfaceC64989Pez("tab_to_sort_map") String str2, @InterfaceC64989Pez("filter_option_ids") String str3, @InterfaceC64989Pez("cursor") String str4, @InterfaceC64989Pez("last_read_time") int i2, @InterfaceC64989Pez("wall_time") int i3, @InterfaceC64989Pez("need_mark_read") boolean z, @InterfaceC64989Pez("need_mark_read_all") boolean z2);

        @E4Q("/aweme/v1/notice/multi/")
        AbstractC73672Svk<NoticeListsResponse> fetchGroupNotice(@InterfaceC64989Pez("group_list") String str, @InterfaceC64989Pez("scenario") int i);

        @E4Q("/aweme/janus/v1/notice/multi/feed/")
        AbstractC73672Svk<LiveNoticeMessageResponse> fetchLiveNotice(@InterfaceC64989Pez("req_from") String str, @InterfaceC64989Pez("is_draw") long j, @InterfaceC64989Pez("content_type") int i, @InterfaceC64989Pez("channel_id") int i2);

        @E4Q("aweme/v1/report/inbox/notice/")
        AbstractC73672Svk<NoticeListsResponse> fetchReportInboxNotice();

        @E4Q("https://oec-api.tiktokv.com/chat/api/client/getLatestMessage")
        AbstractC73672Svk<NoticeListsResponse> fetchShopInboxNotice();

        @E4Q("/tiktok/notice/system_notice_box/v1/")
        AbstractC73672Svk<SystemNoticeResponse> fetchSystemNotice(@InterfaceC64989Pez("group") String str, @InterfaceC64989Pez("channel_list_type") int i, @InterfaceC64989Pez("experiment_params") String str2);

        @E4Q("/aweme/v1/promote/api/user/settings/")
        AbstractC73672Svk<Object> getSubscribeMarketingStatus();

        @E4Q("/tiktok/notice/unsubscribe_setting/get/v1/")
        AbstractC73672Svk<NotificationSubscribeSettingsList> getSubscribeSettingsStatus(@InterfaceC64989Pez("group") int i);

        @InterfaceC195787mI
        @E4T("/tiktok/notice/report/v1/")
        AbstractC73672Svk<BaseResponse> reportNoticeAction(@InterfaceC64985Pev("nid") long j, @InterfaceC64985Pev("user_action") int i, @InterfaceC64985Pev("action_meta") String str, @InterfaceC64985Pev("report_list") String str2);

        @InterfaceC195787mI
        @E4T("/aweme/v1/promote/api/user/settings/")
        AbstractC73672Svk<BaseResponse> setSubscribeMarketingStatus(@InterfaceC64985Pev("marketing_notification") int i);

        @InterfaceC195787mI
        @E4T("/tiktok/notice/unsubscribe_setting/update/v1/")
        AbstractC73672Svk<BaseResponse> updateSubscribeSettingsgStatus(@InterfaceC64985Pev("group") int i, @InterfaceC64985Pev("label") int i2, @InterfaceC64985Pev("is_unsubscribe") boolean z);
    }

    public static Api LIZ() {
        return (Api) LIZ.getValue();
    }
}
