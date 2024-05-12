package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public final class TopicListResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes14.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("topics")
        public List<CohostTopic> topics = new ArrayList();
    }
}
