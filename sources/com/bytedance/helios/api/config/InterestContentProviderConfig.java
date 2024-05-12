package com.bytedance.helios.api.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class InterestContentProviderConfig extends F9E {

    @InterfaceC65349Pkn("authority")
    public final String authority;

    @InterfaceC65349Pkn("data_types")
    public final List<String> dataTypes;

    @InterfaceC65349Pkn("monitor_error")
    public final double monitorError;

    @InterfaceC65349Pkn("monitor_normal")
    public final double monitorNormal;

    public InterestContentProviderConfig() {
        this(null, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, 15, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.authority, Double.valueOf(this.monitorNormal), Double.valueOf(this.monitorError), this.dataTypes};
    }

    public InterestContentProviderConfig(String authority, double d, double d2, List<String> dataTypes) {
        o.LJIIIZ(authority, "authority");
        o.LJIIIZ(dataTypes, "dataTypes");
        this.authority = authority;
        this.monitorNormal = d;
        this.monitorError = d2;
        this.dataTypes = dataTypes;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public InterestContentProviderConfig(java.lang.String r8, double r9, double r11, java.util.List r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r6 = r13
            r1 = r8
            r2 = r9
            r0 = r14 & 1
            if (r0 == 0) goto L9
            java.lang.String r1 = ""
        L9:
            r0 = r14 & 2
            r4 = 0
            if (r0 == 0) goto L11
            r2 = 0
        L11:
            r0 = r14 & 4
            if (r0 == 0) goto L20
        L15:
            r0 = r14 & 8
            if (r0 == 0) goto L1b
            X.OQg r6 = X.C61878OQg.INSTANCE
        L1b:
            r0 = r7
            r0.<init>(r1, r2, r4, r6)
            return
        L20:
            r4 = r11
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.api.config.InterestContentProviderConfig.<init>(java.lang.String, double, double, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
