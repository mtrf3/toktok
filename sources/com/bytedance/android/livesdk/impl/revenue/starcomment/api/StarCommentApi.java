package com.bytedance.android.livesdk.impl.revenue.starcomment.api;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8M;
import X.EnumC29608Bjg;
import X.InterfaceC64986Pew;
import X.InterfaceC65131PhH;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.gift.model.GiftSendResponse;
import tikcast.api.privilege.StarCommentDeleteResponse;
import tikcast.api.privilege.StarCommentGetQueueResponse;
import tikcast.api.privilege.StarCommentPurchasePageResponse;
import tikcast.api.privilege.StarCommentPurchaseResponse;

/* loaded from: classes6.dex */
public interface StarCommentApi {
    @E8M("/webcast/privilege/star_comment/delete/")
    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    AbstractC73672Svk<C28467BFf<StarCommentDeleteResponse.Data>> deleteStarComment(@InterfaceC64986Pew("star_comment_msg_id") String str, @InterfaceC64986Pew("room_id") String str2, @InterfaceC64986Pew("client_cur_msg_start_time_ms") long j, @InterfaceC64986Pew("current_version") int i, @InterfaceC64986Pew("role") int i2, @InterfaceC64986Pew("need_ban") boolean z);

    @E8M("/webcast/privilege/star_comment/purchase_page/")
    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    AbstractC73672Svk<C28467BFf<StarCommentPurchasePageResponse.Data>> getPurchasePage(@InterfaceC64986Pew("request_type") int i, @InterfaceC64986Pew("sec_anchor_id") String str, @InterfaceC64986Pew("room_id") String str2, @InterfaceC64986Pew("room_user_count") long j, @InterfaceC64986Pew("coins") long j2, @InterfaceC64986Pew("current_version") long j3);

    @E8M("/webcast/privilege/star_comment/get_queue/")
    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    AbstractC73672Svk<C28467BFf<StarCommentGetQueueResponse.Data>> getStarCommentQueue(@InterfaceC64986Pew("room_id") String str, @InterfaceC64986Pew("sec_anchor_id") String str2, @InterfaceC64986Pew("role") int i, @InterfaceC64986Pew("current_version") int i2, @InterfaceC64986Pew("client_cur_msg_start_time_ms") long j, @InterfaceC64986Pew("client_reserve") String str3);

    @E8M("/webcast/privilege/star_comment/purchase/")
    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    AbstractC73672Svk<BaseResponse<StarCommentPurchaseResponse.Data, GiftSendResponse.GiftExtra>> purchaseComment(@InterfaceC64986Pew("room_id") String str, @InterfaceC64986Pew("sec_anchor_id") String str2, @InterfaceC64986Pew("room_user_count") long j, @InterfaceC64986Pew("content") String str3, @InterfaceC64986Pew("option") int i, @InterfaceC64986Pew("coins") long j2, @InterfaceC64986Pew("current_score") long j3, @InterfaceC64986Pew("current_version") int i2, @InterfaceC64986Pew("client_cur_msg_start_time_ms") long j4, @InterfaceC64986Pew("ug_exchange") int i3, @InterfaceC64986Pew("enter_from") String str4);
}
