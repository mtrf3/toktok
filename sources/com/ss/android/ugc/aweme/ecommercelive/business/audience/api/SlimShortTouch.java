package com.ss.android.ugc.aweme.ecommercelive.business.audience.api;

import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.ShortTouchPreviewSetting;

/* loaded from: classes13.dex */
public final class SlimShortTouch {

    @InterfaceC65349Pkn("anime_type")
    public int animeType = -1;

    @InterfaceC65349Pkn("icon_skin")
    public String iconSkin;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("preview_setting")
    public final ShortTouchPreviewSetting previewSetting;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    public final int getAnimeType() {
        return this.animeType;
    }

    public final String getIconSkin() {
        return this.iconSkin;
    }

    public final String getName() {
        return this.name;
    }

    public final ShortTouchPreviewSetting getPreviewSetting() {
        return this.previewSetting;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final void setAnimeType(int i) {
        this.animeType = i;
    }

    public final void setIconSkin(String str) {
        this.iconSkin = str;
    }
}
