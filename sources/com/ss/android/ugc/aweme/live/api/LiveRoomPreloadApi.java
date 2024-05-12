package com.ss.android.ugc.aweme.live.api;

import X.AbstractC73672Svk;
import X.C28468BFg;
import X.E8L;
import X.InterfaceC37276Ek4;
import X.InterfaceC64986Pew;

/* loaded from: classes6.dex */
public interface LiveRoomPreloadApi {
    @E8L("/webcast/room/preload_room/")
    AbstractC73672Svk<C28468BFg> preloadRoom(@InterfaceC64986Pew("owner_user_id") long j, @InterfaceC64986Pew("room_id") long j2, @InterfaceC64986Pew("scene") String str);

    @E8L("/webcast/room/preload_room/")
    InterfaceC37276Ek4<C28468BFg> preloadRoomSync(@InterfaceC64986Pew("owner_user_id") long j, @InterfaceC64986Pew("room_id") long j2, @InterfaceC64986Pew("scene") String str);
}
