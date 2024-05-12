package com.bytedance.android.livesdk.gift.assets;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ResourceModel extends F9E {

    @InterfaceC65349Pkn("uri")
    public String uri;

    @InterfaceC65349Pkn("url_list")
    public List<String> urlList;

    public ResourceModel() {
        this(null, null, 3, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.uri, this.urlList};
    }

    public ResourceModel(String str, List<String> urlList) {
        o.LJIIIZ(urlList, "urlList");
        this.uri = str;
        this.urlList = urlList;
    }

    public ResourceModel(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? C61878OQg.INSTANCE : list);
    }
}
