package com.ss.android.ugc.aweme.live.feedpage;

import X.InterfaceC65316PkG;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.Map;

/* loaded from: classes6.dex */
public class LiveStateResponse extends BaseResponse implements InterfaceC65316PkG {
    public String LJLIL;

    @InterfaceC65349Pkn("data")
    public MapUserIdRoomId mapUserIdRoomId;

    /* loaded from: classes6.dex */
    public static class MapUserIdRoomId {

        @InterfaceC65349Pkn("room_id")
        public Map<Long, Long> userRoomIdMap;
    }

    @Override // X.InterfaceC65316PkG
    public final String getRequestId() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC65316PkG
    public final void setRequestId(String str) {
        this.LJLIL = str;
    }
}
