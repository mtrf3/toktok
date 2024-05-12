package com.bytedance.helios.api.config;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class SampleRateConfig extends F9E {

    @InterfaceC65349Pkn("api_high_priority_configs")
    public final List<ApiSampleRateConfig> apiHighPriorityConfigs;

    @InterfaceC65349Pkn("app_exit_config")
    public final double appExitConfig;

    @InterfaceC65349Pkn("app_ops_config")
    public final double appOpsConfig;

    @InterfaceC65349Pkn("auto_start_config")
    public final double autoStartConfig;

    @InterfaceC65349Pkn("default_low_priority_config")
    public final DefaultSampleRateConfig defaultLowPriorityConfig;

    @InterfaceC65349Pkn("enable_monitor")
    public final boolean enableMonitor;

    @InterfaceC65349Pkn("exception_alog_config")
    public final double exceptionAlogConfig;

    @InterfaceC65349Pkn("exception_config")
    public final double exceptionConfig;

    @InterfaceC65349Pkn("local_apm_config")
    public final double localAPMConfig;

    @InterfaceC65349Pkn("resource_medium_priority_configs")
    public final List<ResourceSampleRateConfig> resourceMediumPriorityConfigs;

    @InterfaceC65349Pkn("strict_mode_config")
    public final double strictModeConfig;

    public SampleRateConfig() {
        this(false, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, null, null, 2047, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enableMonitor), Double.valueOf(this.appOpsConfig), Double.valueOf(this.autoStartConfig), Double.valueOf(this.appExitConfig), Double.valueOf(this.exceptionConfig), Double.valueOf(this.exceptionAlogConfig), Double.valueOf(this.strictModeConfig), Double.valueOf(this.localAPMConfig), this.defaultLowPriorityConfig, this.resourceMediumPriorityConfigs, this.apiHighPriorityConfigs};
    }

    public SampleRateConfig(boolean z, double d, double d2, double d3, double d4, double d5, double d6, double d7, DefaultSampleRateConfig defaultLowPriorityConfig, List<ResourceSampleRateConfig> resourceMediumPriorityConfigs, List<ApiSampleRateConfig> apiHighPriorityConfigs) {
        o.LJIIIZ(defaultLowPriorityConfig, "defaultLowPriorityConfig");
        o.LJIIIZ(resourceMediumPriorityConfigs, "resourceMediumPriorityConfigs");
        o.LJIIIZ(apiHighPriorityConfigs, "apiHighPriorityConfigs");
        this.enableMonitor = z;
        this.appOpsConfig = d;
        this.autoStartConfig = d2;
        this.appExitConfig = d3;
        this.exceptionConfig = d4;
        this.exceptionAlogConfig = d5;
        this.strictModeConfig = d6;
        this.localAPMConfig = d7;
        this.defaultLowPriorityConfig = defaultLowPriorityConfig;
        this.resourceMediumPriorityConfigs = resourceMediumPriorityConfigs;
        this.apiHighPriorityConfigs = apiHighPriorityConfigs;
    }

    public SampleRateConfig(boolean z, double d, double d2, double d3, double d4, double d5, double d6, double d7, DefaultSampleRateConfig defaultSampleRateConfig, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? 1.0E-5d : d, (i & 4) != 0 ? 1.0E-4d : d2, (i & 8) != 0 ? 1.0E-4d : d3, (i & 16) != 0 ? 0.1d : d4, (i & 32) != 0 ? 0.1d : d5, (i & 64) == 0 ? d6 : 0.1d, (i & 128) == 0 ? d7 : 1.0E-4d, (i & 256) != 0 ? new DefaultSampleRateConfig(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 15, null) : defaultSampleRateConfig, (i & 512) != 0 ? C61878OQg.INSTANCE : list, (i & 1024) != 0 ? C61878OQg.INSTANCE : list2);
    }
}
