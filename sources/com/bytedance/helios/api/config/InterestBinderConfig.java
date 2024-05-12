package com.bytedance.helios.api.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class InterestBinderConfig extends F9E {

    @InterfaceC65349Pkn("data_types")
    public final List<String> dataTypes;

    @InterfaceC65349Pkn("interface")
    public final String interfaceName;

    @InterfaceC65349Pkn("methods")
    public final List<BinderMethodConfig> methods;

    @InterfaceC65349Pkn("monitor_error")
    public final double monitorError;

    @InterfaceC65349Pkn("monitor_normal")
    public final double monitorNormal;

    @InterfaceC65349Pkn("pre_analysis")
    public final boolean needPreAnalysis;

    public InterestBinderConfig() {
        this(null, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, null, false, 63, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.interfaceName, Double.valueOf(this.monitorNormal), Double.valueOf(this.monitorError), this.dataTypes, this.methods, Boolean.valueOf(this.needPreAnalysis)};
    }

    public InterestBinderConfig(String interfaceName, double d, double d2, List<String> dataTypes, List<BinderMethodConfig> methods, boolean z) {
        o.LJIIIZ(interfaceName, "interfaceName");
        o.LJIIIZ(dataTypes, "dataTypes");
        o.LJIIIZ(methods, "methods");
        this.interfaceName = interfaceName;
        this.monitorNormal = d;
        this.monitorError = d2;
        this.dataTypes = dataTypes;
        this.methods = methods;
        this.needPreAnalysis = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InterestBinderConfig(java.lang.String r10, double r11, double r13, java.util.List r15, java.util.List r16, boolean r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r7 = r16
            r6 = r15
            r8 = r17
            r1 = r10
            r2 = r11
            r0 = r18 & 1
            if (r0 == 0) goto Ld
            java.lang.String r1 = ""
        Ld:
            r0 = r18 & 2
            r4 = 0
            if (r0 == 0) goto L15
            r2 = 0
        L15:
            r0 = r18 & 4
            if (r0 == 0) goto L2f
        L19:
            r0 = r18 & 8
            if (r0 == 0) goto L1f
            X.OQg r6 = X.C61878OQg.INSTANCE
        L1f:
            r0 = r18 & 16
            if (r0 == 0) goto L25
            X.OQg r7 = X.C61878OQg.INSTANCE
        L25:
            r0 = r18 & 32
            if (r0 == 0) goto L2a
            r8 = 0
        L2a:
            r0 = r9
            r0.<init>(r1, r2, r4, r6, r7, r8)
            return
        L2f:
            r4 = r13
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.api.config.InterestBinderConfig.<init>(java.lang.String, double, double, java.util.List, java.util.List, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
