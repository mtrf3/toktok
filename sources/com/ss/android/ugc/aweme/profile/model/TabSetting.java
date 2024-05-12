package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes16.dex */
public class TabSetting implements Serializable {

    @InterfaceC65349Pkn("ba_tab")
    public BATab baTab;

    @InterfaceC65349Pkn("hide_like_tab")
    public boolean hideLikeTab;

    @InterfaceC65349Pkn("private_tab")
    public PrivateTab privateTab;

    @InterfaceC65349Pkn("repost_tab")
    public RepostTab repostTab;

    @InterfaceC65349Pkn("shop_tab")
    public ShopTab shopTab;

    @InterfaceC65349Pkn("sticker_tab")
    public StickerTab stickerTab;

    public PrivateTab getPrivateTab() {
        return this.privateTab;
    }

    public boolean isHideLikeTab() {
        return this.hideLikeTab;
    }

    public void setHideLikeTab(boolean z) {
        this.hideLikeTab = z;
    }
}
