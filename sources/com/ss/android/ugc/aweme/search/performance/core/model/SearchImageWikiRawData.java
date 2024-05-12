package com.ss.android.ugc.aweme.search.performance.core.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.search.lynx.core.model.LynxDisplayImageUrl;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class SearchImageWikiRawData implements Serializable {
    public static final int $stable = 8;

    @InterfaceC65349Pkn("display")
    public LynxDisplayImageUrl displayImageUrl;

    public final LynxDisplayImageUrl getDisplayImageUrl() {
        return this.displayImageUrl;
    }

    public final void setDisplayImageUrl(LynxDisplayImageUrl lynxDisplayImageUrl) {
        this.displayImageUrl = lynxDisplayImageUrl;
    }
}
