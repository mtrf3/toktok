package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes5.dex */
public class AwemeFEConfigs {

    @InterfaceC65349Pkn("business_ec")
    public BusinessEC businessEc;

    @InterfaceC65349Pkn("goods_report")
    public GoodsReport goodsReport;

    @InterfaceC65349Pkn("link_plan")
    public LinkPlan linkPlan;

    @InterfaceC65349Pkn("live")
    public ShopLiveConfig live;

    @InterfaceC65349Pkn("mp_tab")
    public MpTab mpTab;

    @InterfaceC65349Pkn("seed_label")
    public String seedLabel;

    @InterfaceC65349Pkn("seeding")
    public Seeding seeding;

    @InterfaceC65349Pkn("star_atlas_order")
    public StarAtlasOrder starAtlasOrder;

    @InterfaceC65349Pkn("video_auth")
    public VideoAuth videoAuth;

    public BusinessEC getBusinessEc() {
        BusinessEC businessEC = this.businessEc;
        if (businessEC != null) {
            return businessEC;
        }
        throw new C158056If();
    }

    public GoodsReport getGoodsReport() {
        GoodsReport goodsReport = this.goodsReport;
        if (goodsReport != null) {
            return goodsReport;
        }
        throw new C158056If();
    }

    public LinkPlan getLinkPlan() {
        LinkPlan linkPlan = this.linkPlan;
        if (linkPlan != null) {
            return linkPlan;
        }
        throw new C158056If();
    }

    public ShopLiveConfig getLive() {
        ShopLiveConfig shopLiveConfig = this.live;
        if (shopLiveConfig != null) {
            return shopLiveConfig;
        }
        throw new C158056If();
    }

    public MpTab getMpTab() {
        MpTab mpTab = this.mpTab;
        if (mpTab != null) {
            return mpTab;
        }
        throw new C158056If();
    }

    public String getSeedLabel() {
        String str = this.seedLabel;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public Seeding getSeeding() {
        Seeding seeding = this.seeding;
        if (seeding != null) {
            return seeding;
        }
        throw new C158056If();
    }

    public StarAtlasOrder getStarAtlasOrder() {
        StarAtlasOrder starAtlasOrder = this.starAtlasOrder;
        if (starAtlasOrder != null) {
            return starAtlasOrder;
        }
        throw new C158056If();
    }

    public VideoAuth getVideoAuth() {
        VideoAuth videoAuth = this.videoAuth;
        if (videoAuth != null) {
            return videoAuth;
        }
        throw new C158056If();
    }
}
