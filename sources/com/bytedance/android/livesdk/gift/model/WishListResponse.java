package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;

/* loaded from: classes17.dex */
public class WishListResponse {

    @InterfaceC65349Pkn("list")
    public WishList wishList;

    /* loaded from: classes17.dex */
    public static class Wish {

        @InterfaceC65349Pkn("gift")
        public GiftWishExtra giftWishExtra;

        @InterfaceC65349Pkn("id")
        public long id;

        @InterfaceC65349Pkn("progress")
        public int progress;

        @InterfaceC65349Pkn("target")
        public int target;

        @InterfaceC65349Pkn("type")
        public int wishType;

        /* loaded from: classes17.dex */
        public static class GiftWishExtra {

            @InterfaceC65349Pkn("diamond_count")
            public int giftDiamondCount;

            @InterfaceC65349Pkn("icon")
            public ImageModel giftIcon;

            @InterfaceC65349Pkn("name")
            public String giftName;

            @InterfaceC65349Pkn("type")
            public int giftType;
        }
    }

    /* loaded from: classes17.dex */
    public static class WishContributor {

        @InterfaceC65349Pkn("avatar")
        public ImageModel avatar;

        @InterfaceC65349Pkn("display_id")
        public String displayId;

        @InterfaceC65349Pkn("score")
        public Long score;

        @InterfaceC65349Pkn("sec_user_id")
        public String secUserId;

        @InterfaceC65349Pkn("user_id")
        public Long userId;

        @InterfaceC65349Pkn("user_id_str")
        public String userIdStr;
    }

    /* loaded from: classes17.dex */
    public static class WishList {

        @InterfaceC65349Pkn("audit_status")
        public Integer auditStatus;

        @InterfaceC65349Pkn("contributors")
        public List<WishContributor> contributors;

        @InterfaceC65349Pkn("contributors_length")
        public int contributorsLength;

        @InterfaceC65349Pkn("description")
        public String description;

        @InterfaceC65349Pkn("status")
        public int status;

        @InterfaceC65349Pkn("wishes")
        public List<Wish> wishes;
    }
}
