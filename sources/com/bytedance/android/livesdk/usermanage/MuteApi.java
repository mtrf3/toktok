package com.bytedance.android.livesdk.usermanage;

import X.AbstractC73672Svk;
import X.C28465BFd;
import X.C28467BFf;
import X.E8L;
import X.InterfaceC64986Pew;

/* loaded from: classes6.dex */
public interface MuteApi {
    @E8L("/webcast/room/silence/list/")
    AbstractC73672Svk<C28465BFd> getMuteList(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("count") int i, @InterfaceC64986Pew("offset") int i2, @InterfaceC64986Pew("sec_user_id") String str);

    @E8L("/webcast/room/silence/")
    AbstractC73672Svk<C28467BFf<Object>> mute(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("user_id") long j2, @InterfaceC64986Pew("silence_type") long j3, @InterfaceC64986Pew("sec_user_id") String str, @InterfaceC64986Pew("duration") long j4);

    @E8L("/webcast/room/unsilence/")
    AbstractC73672Svk<C28467BFf<Object>> unmute(@InterfaceC64986Pew("room_id") long j, @InterfaceC64986Pew("user_id") long j2, @InterfaceC64986Pew("sec_user_id") String str);
}
