package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public final class GetShowRankResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    /* loaded from: classes14.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("show_rank_users")
        public List<ShowRankUser> showRankUsers = new ArrayList();
    }

    /* loaded from: classes14.dex */
    public static final class ShowRankUser {

        @InterfaceC65349Pkn("avatar_thumb")
        public ImageModel avatarThumb;

        @InterfaceC65349Pkn("follow_status")
        public long followStatus;

        @InterfaceC65349Pkn("nickname")
        public String nickname = "";

        @InterfaceC65349Pkn("order")
        public int order;

        @InterfaceC65349Pkn("score")
        public long score;

        @InterfaceC65349Pkn("user_id")
        public long userId;
    }
}
