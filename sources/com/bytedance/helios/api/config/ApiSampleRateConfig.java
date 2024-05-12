package com.bytedance.helios.api.config;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ApiSampleRateConfig extends DefaultSampleRateConfig {

    @InterfaceC65349Pkn("api_ids")
    public final List<Integer> apiIds;

    public ApiSampleRateConfig() {
        this(null, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 31, null);
    }

    @Override // com.bytedance.helios.api.config.DefaultSampleRateConfig
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ApiSampleRateConfig(apiIds='");
        LIZ.append(this.apiIds);
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

    public final List<Integer> getApiIds() {
        return this.apiIds;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiSampleRateConfig(List<Integer> apiIds, double d, double d2, double d3, double d4) {
        super(d, d2, d3, d4);
        o.LJIIIZ(apiIds, "apiIds");
        this.apiIds = apiIds;
    }

    public ApiSampleRateConfig(List list, double d, double d2, double d3, double d4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d, (i & 4) != 0 ? 0.01d : d2, (i & 8) != 0 ? 1.0d : d3, (i & 16) == 0 ? d4 : 1.0d);
    }
}
