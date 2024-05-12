package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes13.dex */
public class QuickShopInfo implements Serializable {

    @InterfaceC65349Pkn("quick_shop_name")
    public String quickShopName;

    @InterfaceC65349Pkn("quick_shop_url")
    public String quickShopUrl;

    @InterfaceC65349Pkn("second_floor_info")
    public QuickShopSecondFloorInfo secondFloorInfo;

    @InterfaceC65349Pkn("with_text_entry")
    public boolean withTextEntry;

    public String getQuickShopName() {
        return this.quickShopName;
    }

    public String getQuickShopUrl() {
        return this.quickShopUrl;
    }

    public QuickShopSecondFloorInfo getSecondFloorInfo() {
        return this.secondFloorInfo;
    }

    public boolean isWithTextEntry() {
        return this.withTextEntry;
    }

    public void setQuickShopName(String str) {
        this.quickShopName = str;
    }

    public void setQuickShopUrl(String str) {
        this.quickShopUrl = str;
    }

    public void setSecondFloorInfo(QuickShopSecondFloorInfo quickShopSecondFloorInfo) {
        this.secondFloorInfo = quickShopSecondFloorInfo;
    }

    public void setWithTextEntry(boolean z) {
        this.withTextEntry = z;
    }
}
