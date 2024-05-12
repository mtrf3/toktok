package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_wishlist_anchorpanel_url")
/* loaded from: classes6.dex */
public final class LiveWishlistAnchorpanelUrlSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_wish_list%2Fpages%2Fhost_show.js&container_bg_color=252525&height=968rpx&radius=8&disable_mask_click_close=1&hide_loading=1";
    public static final LiveWishlistAnchorpanelUrlSetting INSTANCE = new LiveWishlistAnchorpanelUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveWishlistAnchorpanelUrlSetting.class);
    }
}
