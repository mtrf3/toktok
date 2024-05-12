package com.ss.android.ugc.aweme.feed.model.live;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;

/* loaded from: classes6.dex */
public class CommerceStruct implements Serializable {

    @InterfaceC65349Pkn("use_async_load")
    public boolean asyncLoad;

    @InterfaceC65349Pkn("commerce_permission")
    public int commercePermission;

    @InterfaceC65349Pkn("oec_live_enter_room_init_data")
    public String oecInitDataString;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommerceStruct{commercePermission=");
        LIZ.append(this.commercePermission);
        LIZ.append(", commercePack=");
        return q.LIZIZ(LIZ, this.oecInitDataString, '}', LIZ);
    }

    public boolean getAsyncLoad() {
        return this.asyncLoad;
    }

    public int getCommercePermission() {
        return this.commercePermission;
    }

    public String getOecInitDataString() {
        return this.oecInitDataString;
    }

    public void setAsyncLoad(boolean z) {
        this.asyncLoad = z;
    }

    public void setCommercePermission(int i) {
        this.commercePermission = i;
    }

    public void setOecInitDataString(String str) {
        this.oecInitDataString = str;
    }
}
