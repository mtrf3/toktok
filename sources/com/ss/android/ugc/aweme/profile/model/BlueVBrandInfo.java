package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* loaded from: classes13.dex */
public class BlueVBrandInfo implements Serializable {

    @InterfaceC65349Pkn("brand_id")
    public int brandId;

    @InterfaceC65349Pkn("brand_name")
    public String brandName;

    @InterfaceC65349Pkn("category_id")
    public int categoryId;

    @InterfaceC65349Pkn("category_name")
    public String categoryName;

    @InterfaceC65349Pkn("heat")
    public long heat;

    @InterfaceC65349Pkn("logo_url")
    public UrlModel logoUrl;

    @InterfaceC65349Pkn("rank")
    public int rank;

    @InterfaceC65349Pkn("rank_diff")
    public int rankDiff;

    @InterfaceC65349Pkn("tag_name")
    public String tagName;

    public int getBrandId() {
        return this.brandId;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public int getCategoryId() {
        return this.categoryId;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public long getHeat() {
        return this.heat;
    }

    public UrlModel getLogoUrl() {
        return this.logoUrl;
    }

    public int getRank() {
        return this.rank;
    }

    public int getRankDiff() {
        return this.rankDiff;
    }

    public String getTagName() {
        return this.tagName;
    }

    public void setBrandId(int i) {
        this.brandId = i;
    }

    public void setBrandName(String str) {
        this.brandName = str;
    }

    public void setCategoryId(int i) {
        this.categoryId = i;
    }

    public void setCategoryName(String str) {
        this.categoryName = str;
    }

    public void setHeat(long j) {
        this.heat = j;
    }

    public void setLogoUrl(UrlModel urlModel) {
        this.logoUrl = urlModel;
    }

    public void setRank(int i) {
        this.rank = i;
    }

    public void setRankDiff(int i) {
        this.rankDiff = i;
    }

    public void setTagName(String str) {
        this.tagName = str;
    }
}
