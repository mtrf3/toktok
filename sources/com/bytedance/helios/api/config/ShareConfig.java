package com.bytedance.helios.api.config;

import X.C00F;
import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.List;

/* loaded from: classes12.dex */
public final class ShareConfig extends F9E {

    @InterfaceC65349Pkn("interest_binders")
    public final List<ShareBinder> interestBinders;

    @InterfaceC65349Pkn("mask_value_online")
    public final boolean maskValue;

    @InterfaceC65349Pkn("monitor_rate")
    public final double monitorRate;

    @InterfaceC65349Pkn("report_rate")
    public final double reportRate;

    @InterfaceC65349Pkn("skip_actions")
    public final List<String> skipActions;

    @InterfaceC65349Pkn("skip_providers")
    public final List<String> skipProviders;

    public ShareConfig() {
        this(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, false, null, null, null, 63, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Double.valueOf(this.reportRate), Double.valueOf(this.monitorRate), Boolean.valueOf(this.maskValue), this.interestBinders, this.skipActions, this.skipProviders};
    }

    public ShareConfig(double d, double d2, boolean z, List<ShareBinder> list, List<String> list2, List<String> list3) {
        C00F.LJ(list, "interestBinders", list2, "skipActions", list3, "skipProviders");
        this.reportRate = d;
        this.monitorRate = d2;
        this.maskValue = z;
        this.interestBinders = list;
        this.skipActions = list2;
        this.skipProviders = list3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ShareConfig(double r10, double r12, boolean r14, java.util.List r15, java.util.List r16, java.util.List r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r7 = r16
            r6 = r15
            r8 = r17
            r1 = r10
            r5 = r14
            r0 = r18 & 1
            r3 = 0
            if (r0 == 0) goto Lf
            r1 = 0
        Lf:
            r0 = r18 & 2
            if (r0 == 0) goto L2f
        L13:
            r0 = r18 & 4
            if (r0 == 0) goto L18
            r5 = 0
        L18:
            r0 = r18 & 8
            if (r0 == 0) goto L1e
            X.OQg r6 = X.C61878OQg.INSTANCE
        L1e:
            r0 = r18 & 16
            if (r0 == 0) goto L24
            X.OQg r7 = X.C61878OQg.INSTANCE
        L24:
            r0 = r18 & 32
            if (r0 == 0) goto L2a
            X.OQg r8 = X.C61878OQg.INSTANCE
        L2a:
            r0 = r9
            r0.<init>(r1, r3, r5, r6, r7, r8)
            return
        L2f:
            r3 = r12
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.api.config.ShareConfig.<init>(double, double, boolean, java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
