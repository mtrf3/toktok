package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.Gift;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public final class DynamicGiftListResponse {

    @InterfaceC65349Pkn("data")
    public Data data;

    @InterfaceC65349Pkn("extra")
    public Extra extra;

    /* loaded from: classes14.dex */
    public static final class Data {

        @InterfaceC65349Pkn("gifts_info")
        public GiftsInfo giftsInfo;

        @InterfaceC65349Pkn("is_full_gift_data")
        public boolean isFullGiftData;

        @InterfaceC65349Pkn("pannel_refresh")
        public int pannelRefresh;

        @InterfaceC65349Pkn("pages")
        public List<GiftPage> pages = new ArrayList();

        @InterfaceC65349Pkn("hot_fields")
        public List<String> hotFields = new ArrayList();

        @InterfaceC65349Pkn("special_gifts")
        public List<Gift> specialGifts = new ArrayList();

        @InterfaceC65349Pkn("cold_gift_hash")
        public String coldGiftHash = "";

        @InterfaceC65349Pkn("cold_gift_url")
        public String coldGiftUrl = "";

        @InterfaceC65349Pkn("cold_gift_fallback_url")
        public String coldGiftFallbackUrl = "";
    }

    /* loaded from: classes14.dex */
    public static final class Extra extends com.bytedance.android.livesdk.model.Extra {

        @InterfaceC65349Pkn("log_id")
        public String logId = "";
    }
}
