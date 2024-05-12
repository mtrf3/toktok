package com.ss.android.ugc.aweme.feed.api;

import X.E8L;
import X.InterfaceC37276Ek4;
import X.InterfaceC64986Pew;
import X.X1D;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.live.Live;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.response.BaseResponse;
import com.ss.android.ugc.aweme.live.response.Extra;

/* loaded from: classes5.dex */
public final class FeedLiveRoomApi {
    public static final RoomApi LIZ;

    /* loaded from: classes5.dex */
    public interface RoomApi {
        @E8L("webcast/d/topview_room/")
        InterfaceC37276Ek4<BaseResponse<Room, Extra>> queryRoomInfo(@InterfaceC64986Pew("uid") long j, @InterfaceC64986Pew("sec_uid") String str);

        @E8L("/webcast/topview/room/")
        InterfaceC37276Ek4<BaseResponse<Room, Extra>> queryTopViewLiveRoomInfo(@InterfaceC64986Pew("uid") long j, @InterfaceC64986Pew("sec_uid") String str);
    }

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("https://");
        LiveOuterService.LJJJLL().LIZ().getClass();
        LIZ2.append(Live.getLiveDomain());
        LIZ = (RoomApi) LIZLLL.LIZ(X1D.LIZIZ(LIZ2)).LJFF().LIZ.LIZ(RoomApi.class);
    }
}
