package com.ss.android.ugc.aweme.live.feedpage;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;

/* loaded from: classes10.dex */
public final class LiveRoomInfoResponse extends BaseResponse {

    @InterfaceC65349Pkn("data")
    public NewLiveRoomStruct roomStruct;

    public final NewLiveRoomStruct getRoomStruct() {
        return this.roomStruct;
    }

    public final void setRoomStruct(NewLiveRoomStruct newLiveRoomStruct) {
        this.roomStruct = newLiveRoomStruct;
    }
}
