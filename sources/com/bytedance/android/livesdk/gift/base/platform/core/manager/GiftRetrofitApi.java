package com.bytedance.android.livesdk.gift.base.platform.core.manager;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.E8M;
import X.EnumC29608Bjg;
import X.InterfaceC195757mF;
import X.InterfaceC36229EJt;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.InterfaceC65131PhH;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.gift.model.CpcPromptResponse;
import com.bytedance.android.livesdk.gift.model.DynamicGiftListResponse;
import com.bytedance.android.livesdk.gift.model.GiftListAckResponse;
import com.bytedance.android.livesdk.gift.model.GiftListResult;
import com.bytedance.android.livesdk.gift.model.GiftSendResponse;
import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import com.bytedance.android.livesdk.gift.model.WishListResponse;
import com.bytedance.android.livesdk.guide.model.GiftGuideTriggerResponse;
import com.bytedance.android.livesdk.guide.model.GuideInfoResponse;
import com.bytedance.android.livesdk.guide.model.GuideReportResponse;
import com.bytedance.android.livesdk.service.model.GiftListExtra;
import java.util.HashMap;

/* loaded from: classes6.dex */
public interface GiftRetrofitApi {
    @E8L("/webcast/gift/cpc_prompt/")
    AbstractC73672Svk<C28467BFf<CpcPromptResponse>> getCPCInfo();

    @InterfaceC65131PhH(EnumC29608Bjg.GIFT)
    @E8L("/webcast/guide/info/")
    AbstractC73672Svk<C28467BFf<GuideInfoResponse.Data>> getGiftGuideInfo(@InterfaceC64986Pew("room_id") long j);

    @E8L("/webcast/wishlist/get/")
    AbstractC73672Svk<C28467BFf<WishListResponse>> getWishList(@InterfaceC64986Pew("anchor_id") long j, @InterfaceC64986Pew("room_id") long j2);

    @E8M("/webcast/guide/report/")
    @InterfaceC65131PhH(EnumC29608Bjg.GIFT)
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<GuideReportResponse.Data>> reportGiftGuide(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("guide_type") String str, @InterfaceC64985Pev("report_type") int i);

    @E8M("/webcast/gift/list/ack/")
    @InterfaceC65131PhH(EnumC29608Bjg.GIFT)
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<GiftListAckResponse>> sendGiftListAck(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("sec_anchor_id") String str, @InterfaceC64985Pev("gifts_ack_info_list") String str2);

    @E8M("/webcast/gift/send/")
    @InterfaceC65131PhH(EnumC29608Bjg.GIFT)
    @InterfaceC195757mF
    AbstractC73672Svk<BaseResponse<SendGiftResult, GiftSendResponse.GiftExtra>> sendGiftWithParams(@InterfaceC64985Pev("gift_id") long j, @InterfaceC64986Pew("room_id") long j2, @InterfaceC64985Pev("to_user_id") long j3, @InterfaceC64985Pev("count") int i, @InterfaceC64985Pev("send_type") int i2, @InterfaceC64985Pev("sec_to_user_id") String str, @InterfaceC64985Pev("to_room_id") long j4, @InterfaceC64985Pev("send_scene") int i3, @InterfaceC64985Pev("enter_from") String str2, @InterfaceC64985Pev("ug_exchange") int i4, @InterfaceC64985Pev("send_gift_req_start_ms") long j5, @InterfaceC64985Pev("color_id") long j6, @InterfaceC36229EJt HashMap<String, String> hashMap, @InterfaceC64985Pev("poll_id") long j7, @InterfaceC64985Pev("gifts_in_box") String str3, @InterfaceC64985Pev("send_gift_start_client_local_ms") long j8, @InterfaceC64985Pev("grade_mode") int i5, @InterfaceC64985Pev("current_score") long j9, @InterfaceC64985Pev("gift_enter_from") String str4, @InterfaceC64985Pev("gift_extra") String str5, @InterfaceC64985Pev("to_user_type") String str6, @InterfaceC64985Pev("user_system_time") long j10, @InterfaceC64985Pev("disable_gift_tracking") int i6, @InterfaceC64985Pev("send_gift_request_id") String str7, @InterfaceC64985Pev("retry_count") int i7, @InterfaceC64985Pev("client_only_previous_error_code") String str8);

    @InterfaceC65131PhH(EnumC29608Bjg.GIFT)
    @E8L("/webcast/gift/list/")
    AbstractC73672Svk<BaseResponse<GiftListResult, GiftListExtra>> syncGiftList(@InterfaceC64986Pew("room_id") String str, @InterfaceC64986Pew("fetch_giftlist_from") int i, @InterfaceC64986Pew("hash") String str2, @InterfaceC64986Pew("recent_gifts") String str3, @InterfaceC64986Pew("user_system_time") long j);

    @InterfaceC65131PhH(EnumC29608Bjg.GIFT)
    @E8L("/webcast/gift/list/v2/dynamic/")
    AbstractC73672Svk<BaseResponse<DynamicGiftListResponse.Data, DynamicGiftListResponse.Extra>> syncGiftListHotData(@InterfaceC64986Pew("room_id") String str, @InterfaceC64986Pew("fetch_giftlist_from") int i, @InterfaceC64986Pew("recent_gifts") String str2, @InterfaceC64986Pew("recent_cold_gift_hashes") String str3, @InterfaceC64986Pew("user_system_time") long j);

    @E8M("/webcast/guide/trigger/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<GiftGuideTriggerResponse.Data>> triggerGiftGuidePredict(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("trigger_type") String str, @InterfaceC64985Pev("watch_duration") long j2, @InterfaceC64985Pev("last_gift_guide_ts") long j3, @InterfaceC64985Pev("client_log_id") long j4, @InterfaceC64985Pev("client_trigger_feature") String str2);
}
