package com.ss.android.ugc.aweme.cct;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes11.dex */
public final class OpenNewCCTSettings {
    public static final CCTModel LIZ = new CCTModel();

    /* loaded from: classes11.dex */
    public static final class CCTModel implements Serializable {

        @InterfaceC65349Pkn("fallback_browser")
        public final boolean fallbackBrowser;

        public final boolean getFallbackBrowser() {
            return this.fallbackBrowser;
        }
    }
}
