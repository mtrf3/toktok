package com.bytedance.android.livesdkapi.depend.model.live;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes6.dex */
public class CommerceStruct extends F9E implements Serializable {

    @InterfaceC65349Pkn("use_async_load")
    public boolean asyncLoad;

    @InterfaceC65349Pkn("commerce_permission")
    public int commercePermission;

    @InterfaceC65349Pkn("oec_live_enter_room_init_data")
    public String oecInitDataString;

    @InterfaceC65349Pkn("product_num")
    public long productNum;

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.commercePermission), this.oecInitDataString};
    }

    public int getCommercePermission() {
        return this.commercePermission;
    }

    public String getOecInitDataString() {
        return this.oecInitDataString;
    }

    public void setCommercePermission(int i) {
        this.commercePermission = i;
    }

    public void setOecInitDataString(String str) {
        this.oecInitDataString = str;
    }
}
