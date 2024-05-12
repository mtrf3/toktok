package com.bytedance.android.livesdk.gift.model;

import X.C30896CAq;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.BannerInRoom;
import com.bytedance.android.livesdk.model.Gift;
import java.util.List;

/* loaded from: classes14.dex */
public class Prop extends C30896CAq {

    @InterfaceC65349Pkn("banner")
    public BannerInRoom banner;

    @InterfaceC65349Pkn("count")
    public int count;

    @InterfaceC65349Pkn("description")
    public String description;

    @InterfaceC65349Pkn("diamond")
    public int diamond;

    @InterfaceC65349Pkn("diamond_icon")
    public ImageModel diamondLabel;

    @InterfaceC65349Pkn("fragments_compound_count")
    public Long fragmentsCompoundCount;

    @InterfaceC65349Pkn("gift")
    public Gift gift = new Gift();

    @InterfaceC65349Pkn("gifts")
    public List<HotfixGiftDataForProp> gifts;

    @InterfaceC65349Pkn("icon")
    public ImageModel icon;

    @InterfaceC65349Pkn("prop_def_id")
    public long id;

    @InterfaceC65349Pkn("is_aweme_free_gift")
    public int isAwemeFreeGift;

    @InterfaceC65349Pkn("is_fragment")
    public Boolean isFragment;

    @InterfaceC65349Pkn("label_icon")
    public ImageModel labelIcon;

    @InterfaceC65349Pkn("manual")
    public String manual;

    @InterfaceC65349Pkn("name")
    public String name;

    @InterfaceC65349Pkn("next_expire")
    public long nextExpire;
    public long nowTimeDiff;

    @InterfaceC65349Pkn("primary_effect_id")
    public int primaryEffectId;

    @InterfaceC65349Pkn("prop_def_type")
    public long propType;

    @InterfaceC65349Pkn("reddot_tip")
    public boolean reddotTip;

    @InterfaceC65349Pkn("scheme_url")
    public String schemeUrl;

    public long getNowTimeDiff() {
        return this.nowTimeDiff;
    }

    public static Prop newInstance(Prop prop) {
        Prop prop2 = new Prop();
        if (prop == null) {
            return prop2;
        }
        prop2.primaryEffectId = prop.primaryEffectId;
        prop2.nextExpire = prop.nextExpire;
        prop2.description = prop.description;
        prop2.id = prop.id;
        prop2.manual = prop.manual;
        prop2.diamond = prop.diamond;
        prop2.reddotTip = prop.reddotTip;
        prop2.icon = prop.icon;
        prop2.count = prop.count;
        prop2.name = prop.name;
        prop2.gift = prop.gift;
        prop2.labelIcon = prop.labelIcon;
        prop2.diamondLabel = prop.diamondLabel;
        prop2.isAwemeFreeGift = prop.isAwemeFreeGift;
        prop2.nowTimeDiff = prop.nowTimeDiff;
        prop2.banner = prop.banner;
        return prop2;
    }

    public void setNowTimeDiff(long j) {
        this.nowTimeDiff = j;
    }
}
