package com.ss.android.ugc.aweme.livewallpaper.config;

import X.N26;
import X.N28;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicBitmapConfig;

/* loaded from: classes11.dex */
public final class WallpaperGuide1Config implements IDynamicBitmapConfig {
    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicBitmapConfig, com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final boolean enable() {
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicBitmapConfig, com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final Drawable fallback() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicBitmapConfig, com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final /* bridge */ /* synthetic */ Drawable fallback() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicBitmapConfig, com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final String key() {
        return "58ebd6efcfde32e9d844bd9b920b671c";
    }

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicBitmapConfig, com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final N28 priority() {
        return N28.NORMAL;
    }

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicBitmapConfig, com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final N26 type() {
        return N26.IMAGE;
    }
}
