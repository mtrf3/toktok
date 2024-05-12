package com.bytedance.android.livesdk.usermanage;

import X.AbstractC73672Svk;
import X.C28465BFd;
import X.C28467BFf;
import X.C76800UCe;
import X.E8L;
import X.InterfaceC64986Pew;

/* loaded from: classes6.dex */
public interface KickOutApi {
    @E8L("/webcast/room/kick/list/")
    AbstractC73672Svk<C28465BFd> getKickedOutList(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("count") int i, @InterfaceC64986Pew("offset") int i2, @InterfaceC64986Pew("sec_user_id") String str);

    @E8L("/webcast/room/kick/user/")
    AbstractC73672Svk<C28467BFf<C76800UCe>> kickOut(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("kick_uid") long j2);

    @E8L("/webcast/room/unkick/user/")
    AbstractC73672Svk<C28467BFf<C76800UCe>> unKickOut(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("kick_uid") long j2);
}
