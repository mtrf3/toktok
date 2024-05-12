package com.bytedance.android.livesdk.livesetting.gift;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveGiftPanelOpenIntentionParams {

    @InterfaceC65349Pkn("business_name")
    public String businessName;

    @InterfaceC65349Pkn("enable")
    public int enable;

    /* JADX WARN: Multi-variable type inference failed */
    public LiveGiftPanelOpenIntentionParams() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public LiveGiftPanelOpenIntentionParams(int i, String businessName) {
        o.LJIIIZ(businessName, "businessName");
        this.enable = i;
        this.businessName = businessName;
    }

    public /* synthetic */ LiveGiftPanelOpenIntentionParams(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "live_gift_panel_open_info_collect" : str);
    }
}
