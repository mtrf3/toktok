package com.bytedance.android.livesdkapi.depend.model.live;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes13.dex */
public final class CoverInfo extends F9E {

    @InterfaceC65349Pkn("height")
    public Long height;

    @InterfaceC65349Pkn("uri")
    public String uri;

    @InterfaceC65349Pkn("url_list")
    public List<String> urlList;

    @InterfaceC65349Pkn("width")
    public Long width;

    @Override // X.F9E
    public final Object[] getObjects() {
        List<String> list = this.urlList;
        String str = this.uri;
        Long l = this.width;
        Long l2 = this.height;
        return new Object[]{list, list, list, str, str, l, l, l2, l2};
    }
}
