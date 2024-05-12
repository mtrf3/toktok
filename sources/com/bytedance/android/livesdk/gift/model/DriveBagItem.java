package com.bytedance.android.livesdk.gift.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public final class DriveBagItem extends F9E {

    @InterfaceC65349Pkn("equipped")
    public Boolean equipped;

    @InterfaceC65349Pkn("item")
    public DriveItem item;

    @InterfaceC65349Pkn("next_expire")
    public Long nextExpire;

    @Override // X.F9E
    public final Object[] getObjects() {
        DriveItem driveItem = this.item;
        Long l = this.nextExpire;
        Boolean bool = this.equipped;
        return new Object[]{driveItem, driveItem, l, l, bool, bool};
    }
}
