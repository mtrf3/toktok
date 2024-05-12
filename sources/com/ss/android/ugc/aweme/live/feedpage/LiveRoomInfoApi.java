package com.ss.android.ugc.aweme.live.feedpage;

import X.AbstractC73672Svk;
import X.C86107Xqp;
import X.E8L;
import X.InterfaceC64986Pew;

/* loaded from: classes16.dex */
public interface LiveRoomInfoApi {
    public static final C86107Xqp LIZ = C86107Xqp.LIZ;

    @E8L("/webcast/room/info_by_user/")
    AbstractC73672Svk<LiveRoomInfoResponse> fetchUserRoom(@InterfaceC64986Pew("user_id") long j, @InterfaceC64986Pew("sec_user_id") String str);
}
