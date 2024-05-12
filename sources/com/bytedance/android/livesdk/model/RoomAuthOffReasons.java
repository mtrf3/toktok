package com.bytedance.android.livesdk.model;

import X.EnumC31118CJe;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public class RoomAuthOffReasons {

    @InterfaceC65349Pkn("gift")
    public String gift;

    @InterfaceC65349Pkn("gift_off_reason")
    public int unAvailableClickReason;

    public EnumC31118CJe getUnAvailableClickReason() {
        return EnumC31118CJe.parseEnum(this.unAvailableClickReason);
    }

    public String getGift() {
        return this.gift;
    }
}
