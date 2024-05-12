package com.ss.android.ugc.aweme.account.login.v2.ui;

import X.N26;
import X.N28;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicBitmapConfig;

/* loaded from: classes11.dex */
public final class EmailConsentPageImageConfig implements IDynamicBitmapConfig {
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
        return "18d672861696c90ffb63e9a7c134f815";
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
