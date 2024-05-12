package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.Gift;
import java.util.List;

/* loaded from: classes14.dex */
public class GiftListResult {

    @InterfaceC65349Pkn("cold_gift_hash")
    public String coldGiftHash = "";

    @InterfaceC65349Pkn("doodle_templates")
    public List<DoodleTemplate> doodleTemplates;

    @InterfaceC65349Pkn("gifts")
    public List<Gift> giftList;

    @InterfaceC65349Pkn("pages")
    public List<GiftPage> giftPages;

    @InterfaceC65349Pkn("gifts_info")
    public GiftsInfo giftsInfo;

    @InterfaceC65349Pkn("hot_fields")
    public List<String> hotFields;

    @InterfaceC65349Pkn("is_full_gift_data")
    public boolean isFullGiftData;

    @InterfaceC65349Pkn("pannel_refresh")
    public int refreshStatus;

    @InterfaceC65349Pkn("hash")
    public String responseHash;
}
