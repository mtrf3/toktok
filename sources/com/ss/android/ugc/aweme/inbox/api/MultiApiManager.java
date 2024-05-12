package com.ss.android.ugc.aweme.inbox.api;

import X.AbstractC73672Svk;
import X.C221108m2;
import X.C56704MNg;
import X.C62822Ol8;
import X.E4Q;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC36228EJs;
import X.InterfaceC64985Pev;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightDataResponse;
import com.ss.android.ugc.aweme.inbox.widget.multi.horizontal.SkylightFriendPostResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowPageResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxNoticePreviewWindowResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import java.util.Map;

/* loaded from: classes10.dex */
public final class MultiApiManager {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C56704MNg.LJLIL);

    /* loaded from: classes10.dex */
    public interface API {
        @E4Q("/aweme/janus/v1/notice/multi/")
        AbstractC73672Svk<NoticeCombineResponse> fetchCombineNotice(@InterfaceC64989Pez("live_entrance") int i, @InterfaceC64989Pez("req_from") String str, @InterfaceC64989Pez("is_draw") long j, @InterfaceC64989Pez("content_type") int i2, @InterfaceC64989Pez("channel_id") int i3, @InterfaceC64989Pez("count") int i4, @InterfaceC36228EJs Map<String, String> map, @InterfaceC64989Pez("scenario") int i5, @InterfaceC64989Pez("has_shown_following_popup") boolean z, @InterfaceC64989Pez("clean_count_type") int i6, @InterfaceC64989Pez("Ecommercemsgexpversion") Integer num);

        @E4Q("/tiktok/notice/follow_page/v1/")
        AbstractC73672Svk<FollowPageResponse> fetchFollowPageData(@InterfaceC64989Pez("need_follow_request") boolean z, @InterfaceC64989Pez("is_mark_read") int i, @InterfaceC64989Pez("count") int i2, @InterfaceC64989Pez("notice_max_time") long j, @InterfaceC64989Pez("notice_min_time") long j2, @InterfaceC64989Pez("follow_req_offset") long j3, @InterfaceC64989Pez("scenario") int i3, @InterfaceC64989Pez("experiment_params") String str);

        @E4Q("/aweme/v1/notice/multi/")
        AbstractC73672Svk<NoticeListsResponse> fetchGroupNotice(@InterfaceC64989Pez("group_list") String str, @InterfaceC64989Pez("scenario") int i);

        @E4Q("/tiktok/notice/entrance/list/v1/")
        AbstractC73672Svk<InboxEntranceResponse> fetchInboxEntrance(@InterfaceC64989Pez("experiment_params") String str, @InterfaceC64989Pez("additional_group_list") String str2, @InterfaceC64989Pez("scenario") int i, @InterfaceC64989Pez("need_mark_read") Boolean bool, @InterfaceC64989Pez("need_latest_notice_time") Boolean bool2);

        @E8M("/tiktok/notice/preview_window/v1/")
        @InterfaceC195757mF
        AbstractC73672Svk<InboxNoticePreviewWindowResponse> fetchInboxNoticePreviewWindow(@InterfaceC64985Pev("group") int i, @InterfaceC64985Pev("count") int i2, @InterfaceC64985Pev("additional_group_list") String str, @InterfaceC64985Pev("notice_count_source") int i3);

        @E4Q("/tiktok/notice/skylight/v1/")
        AbstractC73672Svk<SkylightDataResponse> fetchSkylightEntrance(@InterfaceC64989Pez("experiment_params") String str, @InterfaceC64989Pez("biz_params") String str2);

        @E8M("/tiktok/v1/friend/post_list")
        AbstractC73672Svk<SkylightFriendPostResponse> fetchSkylightFriendPost(@InterfaceC64989Pez("cursor") Long l, @InterfaceC64989Pez("count") Integer num, @InterfaceC64989Pez("client_read_gids_all") String str, @InterfaceC64989Pez("friend_status_list") String str2);

        @E8M("/tiktok/notice/entrance/update/v1/")
        @InterfaceC195757mF
        AbstractC73672Svk<BaseResponse> updateInboxEntrance(@InterfaceC64985Pev("entrance_id") int i, @InterfaceC64985Pev("action") int i2, @InterfaceC64985Pev("group") int i3, @InterfaceC64985Pev("list_type") int i4);
    }

    public static API LIZ() {
        return (API) LIZ.getValue();
    }
}
