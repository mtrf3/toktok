package com.bytedance.android.livesdk.chatroom.detail;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.EnumC29608Bjg;
import X.InterfaceC64986Pew;
import X.InterfaceC65131PhH;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* loaded from: classes6.dex */
public interface RoomApi {
    @E8L("/webcast/room/collect_unread/")
    AbstractC73672Svk<C28467BFf<Object>> collectUnreadRequest(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("anchor_id") long j2, @InterfaceC64986Pew("unread_extra") String str, @InterfaceC64986Pew("room_ids") String str2);

    @InterfaceC65131PhH(EnumC29608Bjg.ROOM)
    @E8L("/webcast/room/info_by_user/")
    AbstractC73672Svk<C28467BFf<Room>> fetchUserRoom(@InterfaceC64986Pew("user_id") long j, @InterfaceC64986Pew("sec_user_id") String str);
}
