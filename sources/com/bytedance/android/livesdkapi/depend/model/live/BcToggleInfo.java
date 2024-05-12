package com.bytedance.android.livesdkapi.depend.model.live;

import X.C29724BlY;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class BcToggleInfo {
    public static final C29724BlY Companion = new C29724BlY();

    @InterfaceC65349Pkn("bc_toggle_show_interval")
    public int showInterval;

    @InterfaceC65349Pkn("ecom_bc_toggle")
    public int status = 3;

    @InterfaceC65349Pkn("bc_toggle_text")
    public String toggleText = "";

    public final boolean isAvailable() {
        int i = this.status;
        if (i < 0 || 2 < i) {
            return false;
        }
        return true;
    }

    public final boolean isClose() {
        if (this.status == 0) {
            return true;
        }
        return false;
    }

    public final boolean isOpen() {
        int i = this.status;
        if (1 <= i && 2 >= i) {
            return true;
        }
        return false;
    }
}
