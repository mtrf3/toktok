package com.bytedance.helios.api.config;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ResourceSampleRateConfig extends DefaultSampleRateConfig {

    @InterfaceC65349Pkn("resource_id")
    public final String resourceId;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ResourceSampleRateConfig() {
        /*
            r12 = this;
            r1 = 0
            r2 = 0
            r10 = 31
            r0 = r12
            r4 = r2
            r6 = r2
            r8 = r2
            r11 = r1
            r0.<init>(r1, r2, r4, r6, r8, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.api.config.ResourceSampleRateConfig.<init>():void");
    }

    @Override // com.bytedance.helios.api.config.DefaultSampleRateConfig
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ResourceSampleRateConfig(resourceId='");
        LIZ.append(this.resourceId);
        LIZ.append("',monitorNormal=");
        LIZ.append(getMonitorNormal());
        LIZ.append(',');
        LIZ.append("monitorError=");
        LIZ.append(getMonitorError());
        LIZ.append(",interceptError=");
        LIZ.append(getInterceptError());
        LIZ.append(",localSampleRate=");
        LIZ.append(getLocalSampleRate());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getResourceId() {
        return this.resourceId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourceSampleRateConfig(String resourceId, double d, double d2, double d3, double d4) {
        super(d, d2, d3, d4);
        o.LJIIIZ(resourceId, "resourceId");
        this.resourceId = resourceId;
    }

    public /* synthetic */ ResourceSampleRateConfig(String str, double d, double d2, double d3, double d4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d, (i & 4) != 0 ? 0.01d : d2, (i & 8) != 0 ? 1.0d : d3, (i & 16) == 0 ? d4 : 1.0d);
    }
}
