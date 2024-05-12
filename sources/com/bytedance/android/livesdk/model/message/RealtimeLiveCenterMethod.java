package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import webcast.data.RealtimeLiveCenterBaseData;
import webcast.data.RealtimeLiveCenterShopData;
import webcast.data.RealtimeLiveCenterTips;

/* loaded from: classes14.dex */
public final class RealtimeLiveCenterMethod extends CR6 {

    @InterfaceC65349Pkn("base_info")
    public RealtimeLiveCenterBaseData baseInfo;

    @InterfaceC65349Pkn("room_id")
    public String roomId;

    @InterfaceC65349Pkn("shop_info")
    public RealtimeLiveCenterShopData shopInfo;

    @InterfaceC65349Pkn("tips_info")
    public RealtimeLiveCenterTips tipsInfo;

    public RealtimeLiveCenterMethod() {
        this.type = EnumC31509CYf.REALTIME_LIVE_CENTER_METHOD;
        this.roomId = "";
    }
}
