package com.bytedance.android.livesdkapi.depend.model.live;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes16.dex */
public final class OfficialRoomInfo extends F9E {

    @InterfaceC65349Pkn("is_show_more_anchor")
    public Boolean isShowMoreAnchor;

    @InterfaceC65349Pkn("is_use_server_subtitle")
    public Boolean isUseServerSubtitle;

    @InterfaceC65349Pkn("server_subtitle")
    public String serverSubtitle;

    @Override // X.F9E
    public final Object[] getObjects() {
        Boolean bool = this.isShowMoreAnchor;
        Boolean bool2 = this.isUseServerSubtitle;
        String str = this.serverSubtitle;
        return new Object[]{bool, bool, bool2, bool2, str, str};
    }
}
