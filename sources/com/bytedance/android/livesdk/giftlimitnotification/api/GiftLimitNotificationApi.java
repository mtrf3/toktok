package com.bytedance.android.livesdk.giftlimitnotification.api;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.C76800UCe;
import X.E8M;
import X.EnumC29608Bjg;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.InterfaceC65131PhH;
import com.bytedance.android.livesdk.gift.model.GiftLimitGetResponse;

/* loaded from: classes6.dex */
public interface GiftLimitNotificationApi {
    @E8M("/webcast/gift/prompt/get_limit")
    @InterfaceC65131PhH(EnumC29608Bjg.GIFT)
    AbstractC73672Svk<C28467BFf<GiftLimitGetResponse.Data>> giftLimitNotificationInitial(@InterfaceC64986Pew("room_id") long j);

    @E8M("/webcast/gift/prompt/set_limit")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<C76800UCe>> giftLimitNotificationSetLimit(@InterfaceC64986Pew("room_id") long j, @InterfaceC64985Pev("notification_status") int i, @InterfaceC64985Pev("amount_stall") int i2, @InterfaceC64985Pev("region") String str);

    @E8M("/webcast/gift/prompt/set_freq_ctrl")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<C76800UCe>> giftLimitNotificationSetNotificationFrequency(@InterfaceC64986Pew("room_id") long j, @InterfaceC64985Pev("block_num_days") int i);
}
