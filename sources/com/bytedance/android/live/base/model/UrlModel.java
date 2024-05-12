package com.bytedance.android.live.base.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes.dex */
public class UrlModel extends F9E {

    @InterfaceC65349Pkn("uri")
    public String uri;

    @InterfaceC65349Pkn("url_list")
    public List<String> urlList;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.uri, this.urlList};
    }

    public final ImageModel L() {
        return new ImageModel(this.uri, this.urlList);
    }
}
