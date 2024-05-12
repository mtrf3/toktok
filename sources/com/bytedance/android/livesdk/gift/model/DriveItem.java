package com.bytedance.android.livesdk.gift.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public final class DriveItem extends F9E {

    @InterfaceC65349Pkn("count")
    public Long count;

    @InterfaceC65349Pkn("level")
    public Integer level;

    @InterfaceC65349Pkn("type")
    public Integer type;

    @Override // X.F9E
    public final Object[] getObjects() {
        Integer num = this.level;
        Integer num2 = this.type;
        Long l = this.count;
        return new Object[]{num, num, num2, num2, l, l};
    }
}
