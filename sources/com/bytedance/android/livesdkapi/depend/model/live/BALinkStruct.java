package com.bytedance.android.livesdkapi.depend.model.live;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes6.dex */
public class BALinkStruct extends F9E implements Serializable {

    @InterfaceC65349Pkn("ba_link_data")
    public String baLinkData;

    @InterfaceC65349Pkn("ba_link_permission")
    public int baLinkPermission;

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.baLinkPermission), this.baLinkData};
    }

    public String getBaLinkData() {
        return this.baLinkData;
    }

    public int getBaLinkPermission() {
        return this.baLinkPermission;
    }

    public void setBaLinkData(String str) {
        this.baLinkData = str;
    }

    public void setBaLinkPermission(int i) {
        this.baLinkPermission = i;
    }
}
