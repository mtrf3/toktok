package com.ss.android.ugc.aweme.comment.commentlist.ui;

import X.N26;
import X.N28;
import com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicFileConfig;

/* loaded from: classes11.dex */
public final class CommentFontConfig implements IDynamicFileConfig {
    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicFileConfig, com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final boolean enable() {
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicFileConfig, com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final Integer fallback() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicFileConfig, com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final /* bridge */ /* synthetic */ Integer fallback() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicFileConfig, com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final String key() {
        return "text_dark_medium";
    }

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicFileConfig, com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final N28 priority() {
        return N28.HIGH;
    }

    @Override // com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicFileConfig, com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig
    public final N26 type() {
        return N26.FILE;
    }
}
