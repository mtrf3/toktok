package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes11.dex */
public class VisionSearchPrivacyLink {

    @InterfaceC65349Pkn("link_text")
    public String linkText;

    @InterfaceC65349Pkn("link_url")
    public String linkUrl;

    public String getLinkText() {
        String str = this.linkText;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getLinkUrl() {
        String str = this.linkUrl;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }
}
