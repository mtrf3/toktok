package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public class FEConfig {

    @InterfaceC65349Pkn("fallback_url")
    public String fallbackUrl;

    @InterfaceC65349Pkn("schema")
    public String schema;

    public String getFallbackUrl() {
        String str = this.fallbackUrl;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getSchema() {
        String str = this.schema;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }
}
