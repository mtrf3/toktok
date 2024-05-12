package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;
import java.util.List;

/* loaded from: classes14.dex */
public final class FanTicketRanklistResponse {

    @InterfaceC65349Pkn("data")
    public ResponseData data;

    @InterfaceC65349Pkn("extra")
    public Extra extra;

    /* loaded from: classes14.dex */
    public static final class Extra {

        @InterfaceC65349Pkn("now")
        public long now;
    }

    /* loaded from: classes14.dex */
    public static final class RanklistUser {

        @InterfaceC65349Pkn("index")
        public long index;

        @InterfaceC65349Pkn("score")
        public long score;

        @InterfaceC65349Pkn("user")
        public User user;
    }

    /* loaded from: classes14.dex */
    public static final class ResponseData {

        @InterfaceC65349Pkn("fan_ticket_total")
        public long fanTicketTotal;

        @InterfaceC65349Pkn("own_index")
        public long ownIndex;

        @InterfaceC65349Pkn("own_score")
        public long ownScore;

        @InterfaceC65349Pkn("ranklist_users")
        public List<RanklistUser> ranklistUsers;
    }
}
