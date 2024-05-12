package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public final class TopicPairResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes14.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("pair_id")
        public long pairId;

        @InterfaceC65349Pkn("rival_avatars")
        public List<ImageModel> rivalAvatars = new ArrayList();

        @InterfaceC65349Pkn("setting")
        public Setting setting;

        /* loaded from: classes14.dex */
        public static final class Setting {

            @InterfaceC65349Pkn("expect_succ_sec")
            public long expectSuccSec;

            @InterfaceC65349Pkn("timeout_sec")
            public long timeoutSec;
        }
    }
}
