package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class UrlModel {

    @InterfaceC65349Pkn("height")
    public Integer height;

    @InterfaceC65349Pkn("uri")
    public String uri;

    @InterfaceC65349Pkn("url_key")
    public String urlKey;

    @InterfaceC65349Pkn("url_list")
    public List<String> urlList = new ArrayList();

    @InterfaceC65349Pkn("width")
    public Integer width;

    public Integer getHeight() {
        Integer num = this.height;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public String getUri() {
        String str = this.uri;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getUrlKey() {
        String str = this.urlKey;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public Integer getWidth() {
        Integer num = this.width;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public List<String> getUrlList() {
        return this.urlList;
    }
}
