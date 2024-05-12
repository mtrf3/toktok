package com.ss.android.ugc.aweme.account.settings;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes16.dex */
public final class SaveLoginInfoPopupFrequencyModel extends F9E {

    @InterfaceC65349Pkn("interval")
    public final int interval;

    @InterfaceC65349Pkn("max_count")
    public final int max_count;

    @InterfaceC65349Pkn("new_user_exemption")
    public final int new_user_exemption;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.interval), Integer.valueOf(this.max_count), Integer.valueOf(this.new_user_exemption)};
    }

    public SaveLoginInfoPopupFrequencyModel(int i, int i2, int i3) {
        this.interval = i;
        this.max_count = i2;
        this.new_user_exemption = i3;
    }
}
