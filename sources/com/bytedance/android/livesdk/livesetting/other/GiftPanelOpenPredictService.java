package com.bytedance.android.livesdk.livesetting.other;

import X.C113554cx;
import X.InterfaceC65349Pkn;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GiftPanelOpenPredictService {

    @InterfaceC65349Pkn("business_name")
    public String businessName;

    @InterfaceC65349Pkn("config")
    public Map<String, ? extends Object> config;

    @InterfaceC65349Pkn("enable")
    public int enable;

    @InterfaceC65349Pkn("period")
    public int period;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GiftPanelOpenPredictService() {
        /*
            r7 = this;
            r1 = 0
            r2 = 0
            r5 = 15
            r0 = r7
            r3 = r2
            r4 = r1
            r6 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.other.GiftPanelOpenPredictService.<init>():void");
    }

    public GiftPanelOpenPredictService(String businessName, int i, int i2, Map<String, ? extends Object> config) {
        o.LJIIIZ(businessName, "businessName");
        o.LJIIIZ(config, "config");
        this.businessName = businessName;
        this.enable = i;
        this.period = i2;
        this.config = config;
    }

    public /* synthetic */ GiftPanelOpenPredictService(String str, int i, int i2, Map map, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "live_gift_panel_open_behavior_prediction" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 15 : i2, (i3 & 8) != 0 ? C113554cx.LJJJLIIL() : map);
    }
}
