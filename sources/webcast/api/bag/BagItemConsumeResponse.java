package webcast.api.bag;

import X.InterfaceC65349Pkn;
import webcast.data.BagItemPreUpdateInfo;

/* loaded from: classes6.dex */
public final class BagItemConsumeResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    @InterfaceC65349Pkn("extra")
    public Extra extra;

    /* loaded from: classes6.dex */
    public static final class Data {

        @InterfaceC65349Pkn("available")
        public boolean available;

        @InterfaceC65349Pkn("battle_id")
        public long battleId;

        @InterfaceC65349Pkn("count")
        public long count;

        @InterfaceC65349Pkn("item_id")
        public long itemId;

        @InterfaceC65349Pkn("item_type")
        public int itemType;

        @InterfaceC65349Pkn("min_expire_at")
        public long minExpireAt;

        @InterfaceC65349Pkn("pre_update_info")
        public BagItemPreUpdateInfo preUpdateInfo;
    }

    /* loaded from: classes9.dex */
    public static final class Extra {
    }
}
