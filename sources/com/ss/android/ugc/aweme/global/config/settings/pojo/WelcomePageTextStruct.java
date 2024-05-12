package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes5.dex */
public class WelcomePageTextStruct {

    @InterfaceC65349Pkn("description")
    public String description;

    @InterfaceC65349Pkn("image_url")
    public String imageUrl;

    @InterfaceC65349Pkn("page_num")
    public Integer pageNum;

    @InterfaceC65349Pkn("title")
    public String title;

    public String getDescription() {
        String str = this.description;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getImageUrl() {
        String str = this.imageUrl;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public Integer getPageNum() {
        Integer num = this.pageNum;
        if (num != null) {
            return num;
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
}
