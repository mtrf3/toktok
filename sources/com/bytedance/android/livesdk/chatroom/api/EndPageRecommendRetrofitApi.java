package com.bytedance.android.livesdk.chatroom.api;

import X.AbstractC73672Svk;
import X.E8L;
import X.InterfaceC64986Pew;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* loaded from: classes6.dex */
public interface EndPageRecommendRetrofitApi {
    @E8L("/webcast/room/recommend_live/")
    AbstractC73672Svk<BaseListResponse<Room, FeedExtra>> getRecommendV1(@InterfaceC64986Pew("room_id") long j);

    @E8L("/webcast/feed/")
    AbstractC73672Svk<BaseListResponse<FeedItem, FeedExtra>> getRecommendV2(@InterfaceC64986Pew("req_from") String str, @InterfaceC64986Pew("channel_id") String str2, @InterfaceC64986Pew("count") long j, @InterfaceC64986Pew("is_draw") long j2, @InterfaceC64986Pew("draw_room_id") long j3, @InterfaceC64986Pew("draw_room_owner_id") long j4);
}
