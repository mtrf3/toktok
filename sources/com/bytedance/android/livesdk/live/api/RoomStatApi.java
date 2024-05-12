package com.bytedance.android.livesdk.live.api;

import X.AbstractC73672Svk;
import X.BOH;
import X.E8M;
import X.EnumC29608Bjg;
import X.InterfaceC195757mF;
import X.InterfaceC36229EJt;
import X.InterfaceC64985Pev;
import X.InterfaceC65131PhH;
import com.bytedance.android.livesdk.live.model.RoomMultiStatsModel;
import com.bytedance.android.livesdk.live.model.RoomStatsModel;
import java.util.HashMap;

/* loaded from: classes6.dex */
public interface RoomStatApi {
    @E8M("/webcast/room/check_alive/")
    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @InterfaceC195757mF
    AbstractC73672Svk<BOH<RoomStatsModel>> checkRoom(@InterfaceC64985Pev("room_ids") String str, @InterfaceC64985Pev("enter_from") String str2);

    @E8M("/webcast/room/check_alive/")
    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @InterfaceC195757mF
    AbstractC73672Svk<BOH<RoomStatsModel>> checkRoom(@InterfaceC36229EJt HashMap<String, String> hashMap);

    @E8M("/webcast/room/check_room_id/")
    @InterfaceC195757mF
    AbstractC73672Svk<BOH<RoomMultiStatsModel>> checkRoomStatus(@InterfaceC36229EJt HashMap<String, String> hashMap);
}
