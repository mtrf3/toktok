package com.bytedance.android.livesdk.model;

import X.C30896CAq;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public class Gift extends C30896CAq {

    @InterfaceC65349Pkn("can_put_in_gift_box")
    public boolean canPutInGiftBox;

    @InterfaceC65349Pkn("color_infos")
    public List<GiftColorInfo> colorInfos;

    @InterfaceC65349Pkn("combo")
    public boolean combo;

    @InterfaceC65349Pkn("describe")
    public String describe;

    @InterfaceC65349Pkn("diamond_count")
    public int diamondCount;

    @InterfaceC65349Pkn("duration")
    public int duration;

    @InterfaceC65349Pkn("for_linkmic")
    public boolean forLinkMic;

    @InterfaceC65349Pkn("gift_box_info")
    public GiftBoxInfo giftBoxInfo;

    @InterfaceC65349Pkn("gift_panel_banner")
    public GiftPanelBanner giftPanelBanner;

    @InterfaceC65349Pkn("lock_info")
    public GiftLockInfo giftSubInfo;

    @InterfaceC65349Pkn("gift_sub_type")
    public int giftSubType;

    @InterfaceC65349Pkn("gift_vertical_scenarios")
    public List<Integer> giftVerticalScenarios;

    @InterfaceC65349Pkn("icon")
    public ImageModel icon;

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("image")
    public ImageModel image;

    @InterfaceC65349Pkn("is_box_gift")
    public boolean isBoxGift;

    @InterfaceC65349Pkn("is_broadcast_gift")
    public boolean isBroadcastGift;

    @InterfaceC65349Pkn("is_displayed_on_panel")
    public boolean isDisplayedOnPanel;

    @InterfaceC65349Pkn("is_effect_befview")
    public boolean isEffectBEFView;

    @InterfaceC65349Pkn("is_random_gift")
    public boolean isRandomGift;

    @InterfaceC65349Pkn("gift_label_icon")
    public ImageModel leftLogo;

    @InterfaceC65349Pkn("gold_effect")
    public String liveUserPngInfo;

    @InterfaceC65349Pkn("preview_image")
    public ImageModel previewImage;

    @InterfaceC65349Pkn("primary_effect_id")
    public long primaryEffectId;

    @InterfaceC65349Pkn("random_effect_info")
    public GiftRandomEffectInfo randomEffectInfo;

    @InterfaceC65349Pkn("tracker_params")
    public Map<String, String> trackerParams;

    @InterfaceC65349Pkn("type")
    public int type;

    @InterfaceC65349Pkn("name")
    public String name = "";

    @InterfaceC65349Pkn("nameColor")
    public int nameColor = -1;

    @InterfaceC65349Pkn("describeColor")
    public int describeColor = -1711276033;

    @InterfaceC65349Pkn("gift_rank_recommend_info")
    public String recommendInfo = "";

    public final boolean LIZ() {
        int i = this.type;
        if (i == 2 || i == 4 || i == 8 || this.isBoxGift) {
            return true;
        }
        return false;
    }
}
