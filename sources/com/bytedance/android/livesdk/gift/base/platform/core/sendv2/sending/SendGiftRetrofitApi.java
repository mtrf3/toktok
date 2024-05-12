package com.bytedance.android.livesdk.gift.base.platform.core.sendv2.sending;

import X.E8M;
import X.EnumC29608Bjg;
import X.InterfaceC195757mF;
import X.InterfaceC36229EJt;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.InterfaceC65131PhH;
import X.InterfaceC67352kd;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.gift.model.GiftSendResponse;
import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import java.util.HashMap;

/* loaded from: classes6.dex */
public interface SendGiftRetrofitApi {
    @E8M("/webcast/gift/send/")
    @InterfaceC65131PhH(EnumC29608Bjg.GIFT)
    @InterfaceC195757mF
    Object sendGiftWithParams(@InterfaceC64985Pev("gift_id") long j, @InterfaceC64986Pew("room_id") long j2, @InterfaceC64985Pev("to_user_id") long j3, @InterfaceC64985Pev("count") int i, @InterfaceC64985Pev("send_type") int i2, @InterfaceC64985Pev("sec_to_user_id") String str, @InterfaceC64985Pev("to_room_id") long j4, @InterfaceC64985Pev("send_scene") int i3, @InterfaceC64985Pev("enter_from") String str2, @InterfaceC64985Pev("ug_exchange") int i4, @InterfaceC64985Pev("send_gift_req_start_ms") long j5, @InterfaceC64985Pev("color_id") long j6, @InterfaceC36229EJt HashMap<String, String> hashMap, @InterfaceC64985Pev("poll_id") long j7, @InterfaceC64985Pev("gifts_in_box") String str3, @InterfaceC64985Pev("send_gift_start_client_local_ms") long j8, @InterfaceC64985Pev("grade_mode") int i5, @InterfaceC64985Pev("current_score") long j9, @InterfaceC64985Pev("gift_enter_from") String str4, @InterfaceC64985Pev("gift_extra") String str5, @InterfaceC64985Pev("to_user_type") String str6, @InterfaceC64985Pev("user_system_time") long j10, @InterfaceC64985Pev("disable_gift_tracking") int i6, @InterfaceC64985Pev("send_gift_request_id") String str7, @InterfaceC64985Pev("retry_count") int i7, @InterfaceC64985Pev("client_only_previous_error_code") String str8, InterfaceC67352kd<? super BaseResponse<SendGiftResult, GiftSendResponse.GiftExtra>> interfaceC67352kd);
}
