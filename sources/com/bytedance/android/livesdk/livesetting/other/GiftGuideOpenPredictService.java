package com.bytedance.android.livesdk.livesetting.other;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GiftGuideOpenPredictService {

    @InterfaceC65349Pkn("business_name")
    public String businessName;

    @InterfaceC65349Pkn("enable")
    public int enable;

    /* JADX WARN: Multi-variable type inference failed */
    public GiftGuideOpenPredictService() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public GiftGuideOpenPredictService(String businessName, int i) {
        o.LJIIIZ(businessName, "businessName");
        this.businessName = businessName;
        this.enable = i;
    }

    public /* synthetic */ GiftGuideOpenPredictService(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "live_gift_guide_client_collect" : str, (i2 & 2) != 0 ? 0 : i);
    }
}
