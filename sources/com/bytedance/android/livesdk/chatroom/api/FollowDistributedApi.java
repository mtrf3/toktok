package com.bytedance.android.livesdk.chatroom.api;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* loaded from: classes6.dex */
public interface FollowDistributedApi {
    @E8M("/webcast/linkmic/online/user_room_info/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<Room>> getFollowRoomInfo(@InterfaceC64985Pev("scene") int i, @InterfaceC64985Pev("user_id") long j);
}
