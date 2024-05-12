package com.ss.android.ugc.aweme.recommendationcard.data;

import X.InterfaceC65349Pkn;

/* loaded from: classes9.dex */
public final class EffectStructV2 {

    @InterfaceC65349Pkn("effect_id")
    public final String effectId;

    @InterfaceC65349Pkn("icon_url")
    public final UrlStructV2 iconUrl;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("resource_id")
    public final String resourceId;

    public EffectStructV2(String str, UrlStructV2 urlStructV2, String str2, String str3) {
        this.name = str;
        this.iconUrl = urlStructV2;
        this.effectId = str2;
        this.resourceId = str3;
    }
}
