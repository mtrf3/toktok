package com.bytedance.android.livesdk.pack.api;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.pack.model.SendItemErrorExtra;
import webcast.api.bag.BagItemConsumeResponse;
import webcast.api.bag.BagItemListResponse;

/* loaded from: classes6.dex */
public interface PackRetrofitApi {
    @E8M("/webcast/bag/v1/item/consume/")
    @InterfaceC195757mF
    AbstractC73672Svk<BaseResponse<BagItemConsumeResponse.Data, SendItemErrorExtra>> sendItem(@InterfaceC64985Pev("user_id") long j, @InterfaceC64985Pev("item_type") int i, @InterfaceC64985Pev("item_id") long j2, @InterfaceC64985Pev("count") long j3, @InterfaceC64985Pev("min_expire_at") long j4, @InterfaceC64985Pev("room_id") long j5, @InterfaceC64985Pev("anchor_id") long j6);

    @E8L("/webcast/bag/v1/item/list/")
    AbstractC73672Svk<C28467BFf<BagItemListResponse.Data>> syncItemList(@InterfaceC64986Pew("scene") int i, @InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("user_id") long j2, @InterfaceC64986Pew("anchor_id") long j3);

    @E8M("/webcast/battle/trigger_guide")
    @InterfaceC195757mF
    AbstractC73672Svk<BaseResponse<BagItemConsumeResponse.Data, SendItemErrorExtra>> triggerGuideRequest(@InterfaceC64985Pev("channel_id") long j, @InterfaceC64985Pev("battle_id") long j2, @InterfaceC64985Pev("anchor_id") long j3, @InterfaceC64985Pev("scene") int i);
}
