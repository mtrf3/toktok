package com.bytedance.android.feed.api;

import X.AbstractC73672Svk;
import X.E8L;
import X.EnumC29608Bjg;
import X.InterfaceC195747mE;
import X.InterfaceC36228EJs;
import X.InterfaceC64986Pew;
import X.InterfaceC65131PhH;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.model.FeedItem;
import java.util.Map;

/* loaded from: classes.dex */
public interface FeedApi {
    @InterfaceC65131PhH(EnumC29608Bjg.FEED)
    @E8L
    AbstractC73672Svk<BaseListResponse<FeedItem, FeedExtra>> drawerDropsFeed(@InterfaceC195747mE String str, @InterfaceC64986Pew("max_time") long j, @InterfaceC64986Pew("req_from") String str2, @InterfaceC64986Pew("channel_id") String str3, @InterfaceC64986Pew("draw_room_id") long j2, @InterfaceC64986Pew("draw_room_owner_id") long j3, @InterfaceC36228EJs Map<String, String> map);

    @InterfaceC65131PhH(EnumC29608Bjg.FEED)
    @E8L
    AbstractC73672Svk<BaseListResponse<FeedItem, FeedExtra>> feed(@InterfaceC195747mE String str, @InterfaceC64986Pew("max_time") long j, @InterfaceC64986Pew("req_from") String str2, @InterfaceC64986Pew("is_draw") long j2, @InterfaceC64986Pew("draw_room_id") long j3, @InterfaceC64986Pew("draw_room_owner_id") long j4, @InterfaceC36228EJs Map<String, String> map);

    @InterfaceC65131PhH(EnumC29608Bjg.FEED)
    @E8L
    AbstractC73672Svk<BaseListResponse<FeedItem, FeedExtra>> feed(@InterfaceC195747mE String str, @InterfaceC64986Pew("max_time") long j, @InterfaceC64986Pew("req_from") String str2, @InterfaceC64986Pew("draw_room_owner_id") long j2, @InterfaceC36228EJs Map<String, String> map);

    @InterfaceC65131PhH(EnumC29608Bjg.FEED)
    @E8L
    AbstractC73672Svk<BaseListResponse<FeedItem, FeedExtra>> feed(@InterfaceC195747mE String str, @InterfaceC64986Pew("max_time") long j, @InterfaceC64986Pew("req_from") String str2, @InterfaceC64986Pew("channel_id") String str3, @InterfaceC64986Pew("is_draw") long j2, @InterfaceC64986Pew("draw_room_id") long j3, @InterfaceC64986Pew("draw_room_owner_id") long j4, @InterfaceC36228EJs Map<String, String> map);

    @InterfaceC65131PhH(EnumC29608Bjg.FEED)
    @E8L
    AbstractC73672Svk<BaseListResponse<FeedItem, FeedExtra>> feed(@InterfaceC195747mE String str, @InterfaceC64986Pew("max_time") long j, @InterfaceC64986Pew("req_from") String str2, @InterfaceC64986Pew("channel_id") String str3, @InterfaceC64986Pew("draw_room_id") String str4, @InterfaceC64986Pew("draw_room_owner_id") String str5, @InterfaceC64986Pew("hashtag_id") long j2, @InterfaceC64986Pew("style") long j3, @InterfaceC36228EJs Map<String, String> map);

    @InterfaceC65131PhH(EnumC29608Bjg.FEED)
    @E8L
    AbstractC73672Svk<BaseListResponse<FeedItem, FeedExtra>> feed(@InterfaceC195747mE String str, @InterfaceC64986Pew("max_time") long j, @InterfaceC64986Pew("req_from") String str2, @InterfaceC64986Pew("ec_template_id") String str3, @InterfaceC36228EJs Map<String, String> map);

    @InterfaceC65131PhH(EnumC29608Bjg.FEED)
    @E8L
    AbstractC73672Svk<BaseListResponse<FeedItem, FeedExtra>> feed(@InterfaceC195747mE String str, @InterfaceC64986Pew("max_time") long j, @InterfaceC64986Pew("req_from") String str2, @InterfaceC36228EJs Map<String, String> map);

    @InterfaceC65131PhH(EnumC29608Bjg.FEED)
    @E8L
    AbstractC73672Svk<BaseListResponse<FeedItem, FeedExtra>> feed(@InterfaceC195747mE String str, @InterfaceC36228EJs Map<String, String> map);
}
