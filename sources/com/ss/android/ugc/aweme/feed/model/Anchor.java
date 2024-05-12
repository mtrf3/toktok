package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes13.dex */
public final class Anchor implements Serializable {

    @InterfaceC65349Pkn("anchor_id")
    public String anchorId;

    @InterfaceC65349Pkn("anchor_info")
    public AnchorCommonStruct anchorInfo;

    @InterfaceC65349Pkn("shop_link")
    public AnchorShopLinkStruct shopLinkStruct;

    @InterfaceC65349Pkn("wikipedia_info")
    public WikipediaInfo wikipediaInfo;

    @InterfaceC65349Pkn("show_type")
    public Integer showType = 0;

    @InterfaceC65349Pkn("business_type")
    public Integer businessType = 0;

    public final String getAnchorId() {
        return this.anchorId;
    }

    public final AnchorCommonStruct getAnchorInfo() {
        return this.anchorInfo;
    }

    public final Integer getBusinessType() {
        return this.businessType;
    }

    public final AnchorShopLinkStruct getShopLinkStruct() {
        return this.shopLinkStruct;
    }

    public final Integer getShowType() {
        return this.showType;
    }

    public final WikipediaInfo getWikipediaInfo() {
        return this.wikipediaInfo;
    }

    public final void setAnchorId(String str) {
        this.anchorId = str;
    }

    public final void setAnchorInfo(AnchorCommonStruct anchorCommonStruct) {
        this.anchorInfo = anchorCommonStruct;
    }

    public final void setBusinessType(Integer num) {
        this.businessType = num;
    }

    public final void setShopLinkStruct(AnchorShopLinkStruct anchorShopLinkStruct) {
        this.shopLinkStruct = anchorShopLinkStruct;
    }

    public final void setShowType(Integer num) {
        this.showType = num;
    }

    public final void setWikipediaInfo(WikipediaInfo wikipediaInfo) {
        this.wikipediaInfo = wikipediaInfo;
    }
}
