package com.ss.android.ugc.aweme.ug.dynamicresource;

import X.N26;
import X.N28;

/* loaded from: classes7.dex */
public interface IDynamicFileConfig extends IDynamicResourceConfig<Integer> {
    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    boolean enable();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    Integer fallback();

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    /* synthetic */ Integer fallback();

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    String key();

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    N28 priority();

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    N26 type();
}
