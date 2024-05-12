package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class VisionSearchPrivacy {

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("links")
    public List<VisionSearchPrivacyLink> links = new ArrayList();

    @InterfaceC65349Pkn("title")
    public String title;

    public String getContent() {
        String str = this.content;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getTitle() {
        String str = this.title;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public List<VisionSearchPrivacyLink> getLinks() {
        return this.links;
    }
}
