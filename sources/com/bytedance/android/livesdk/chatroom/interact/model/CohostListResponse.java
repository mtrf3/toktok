package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostListUser;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public final class CohostListResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes14.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("group_channel_id")
        public long groupChannelId;

        @InterfaceC65349Pkn("total_position_count")
        public long totalPositionCount;

        @InterfaceC65349Pkn("users")
        public List<CohostListUser> users = new ArrayList();
    }
}
