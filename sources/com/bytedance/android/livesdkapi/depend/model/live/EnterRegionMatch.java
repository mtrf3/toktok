package com.bytedance.android.livesdkapi.depend.model.live;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes15.dex */
public final class EnterRegionMatch extends F9E {

    @InterfaceC65349Pkn("allow_list")
    public List<String> allowList;

    @InterfaceC65349Pkn("deny_list")
    public List<String> denyList;

    @InterfaceC65349Pkn("type")
    public Long type;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.type;
        List<String> list = this.allowList;
        List<String> list2 = this.denyList;
        return new Object[]{l, l, list, list, list, list2, list2, list2};
    }
}
