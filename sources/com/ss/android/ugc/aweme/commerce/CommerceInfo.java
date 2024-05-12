package com.ss.android.ugc.aweme.commerce;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes13.dex */
public class CommerceInfo implements Serializable {

    @InterfaceC65349Pkn("challenge_list")
    public List<Challenge> challengeList;

    @InterfaceC65349Pkn("head_image_url")
    public UrlModel headImageUrl;

    @InterfaceC65349Pkn("offline_info_list")
    public List<OfflineInfo> offlineInfoList;

    @InterfaceC65349Pkn("quick_shop_name")
    public String quickShopName;

    @InterfaceC65349Pkn("quick_shop_url")
    public String quickShopUrl;

    @InterfaceC65349Pkn("site_id")
    public String siteId;

    public List<Challenge> getChallengeList() {
        return this.challengeList;
    }

    public UrlModel getHeadImageUrl() {
        return this.headImageUrl;
    }

    public List<OfflineInfo> getOfflineInfoList() {
        return this.offlineInfoList;
    }

    public String getQuickShopName() {
        return this.quickShopName;
    }

    public String getQuickShopUrl() {
        return this.quickShopUrl;
    }

    public String getSiteId() {
        return this.siteId;
    }

    public void setHeadImageUrl(UrlModel urlModel) {
        this.headImageUrl = urlModel;
    }

    public void setOfflineInfoList(List<OfflineInfo> list) {
        this.offlineInfoList = list;
    }
}
