package com.ss.android.ugc.aweme.ug.dynamicresource;

import X.N26;
import X.N28;
import android.graphics.drawable.Drawable;

/* loaded from: classes7.dex */
public interface IDynamicBitmapConfig extends IDynamicResourceConfig<Drawable> {
    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    boolean enable();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    Drawable fallback();

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    /* synthetic */ Drawable fallback();

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    String key();

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    N28 priority();

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    N26 type();
}
