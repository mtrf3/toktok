package com.bytedance.android.live.banner;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.InterfaceC64986Pew;
import com.bytedance.android.livesdk.model.message.BannerInRoomCollection;

/* loaded from: classes.dex */
public interface BannerRetrofitApi {
    @E8L("/webcast/room/in_room_banner/")
    AbstractC73672Svk<C28467BFf<BannerInRoomCollection>> queryLiveRoomBanner(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("user_type") int i);
}
