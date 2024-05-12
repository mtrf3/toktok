package com.bytedance.android.livesdk.boostcard;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.E8M;
import X.EnumC29608Bjg;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.InterfaceC65131PhH;

/* loaded from: classes6.dex */
public interface LiveBoostcardApi {
    @E8M("/webcast/boost/card/ack/")
    @InterfaceC65131PhH(EnumC29608Bjg.GIFT)
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<LiveGiftBoostCardAckResponse>> boostCardAck(@InterfaceC64985Pev("room_id") long j, @InterfaceC64985Pev("ack_type") int i);

    @InterfaceC65131PhH(EnumC29608Bjg.GIFT)
    @E8L("/webcast/boost/card/boosted_users/")
    AbstractC73672Svk<C28467BFf<LiveGiftBoostCardUserStatusResponse>> queryUserStatus(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("need_points") boolean z);
}
