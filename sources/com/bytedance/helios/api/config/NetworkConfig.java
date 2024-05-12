package com.bytedance.helios.api.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class NetworkConfig extends F9E {

    @InterfaceC65349Pkn("after_delay_interval")
    public final long afterDelayInterval;

    @InterfaceC65349Pkn("allow_api_sample_rate")
    public final double allowApiSampleRate;

    @InterfaceC65349Pkn("allow_network_api_configs")
    public final List<AllowNetworkApiConfig> allowNetworkApiConfigs;

    @InterfaceC65349Pkn("allow_network_apm_configs")
    public final List<AllowNetworkApmConfig> allowNetworkApmConfigs;

    @InterfaceC65349Pkn("allow_network_id_configs")
    public final List<AllowNetworkIdConfig> allowNetworkIdConfigs;

    @InterfaceC65349Pkn("auto_skip_api_configs")
    public final Map<Integer, AutoSkipApiConfig> autoSkipApiConfigs;

    @InterfaceC65349Pkn("before_delay_interval")
    public final long beforeDelayInterval;

    @InterfaceC65349Pkn("block_network_api_configs")
    public final List<AllowNetworkApiConfig> blockNetworkApiConfigs;

    @InterfaceC65349Pkn("block_network_apm_configs")
    public final List<AllowNetworkApmConfig> blockNetworkApmConfigs;

    @InterfaceC65349Pkn("body_delay_interval")
    public final long bodyDelayInterval;

    @InterfaceC65349Pkn("cost_time_sample_rate")
    public final double costTimeSampleRate;

    @InterfaceC65349Pkn("dfid_checker_config")
    public final DFIDCheckerConfig dfidCheckerConfig;

    @InterfaceC65349Pkn("enable_fuse_engine_control")
    public final boolean enableFuseEngineControl;

    @InterfaceC65349Pkn("enable_guard_engine_control")
    public final boolean enableGuardEngineControl;

    @InterfaceC65349Pkn("enabled")
    public final boolean enabled;

    @InterfaceC65349Pkn("network_backtrace_sample_rate")
    public final double networkBacktraceSampleRate;

    @InterfaceC65349Pkn("pair_cache_interval")
    public final long pairCacheInterval;

    @InterfaceC65349Pkn("parse_body")
    public final boolean parseBody;

    @InterfaceC65349Pkn("report_block_list")
    public final List<String> reportBlockList;

    @InterfaceC65349Pkn("shutdown_config")
    public final ShutdownConfig shutdownConfig;

    @InterfaceC65349Pkn("skynet_config")
    public final SkynetConfig skynetConfig;

    @InterfaceC65349Pkn("stack_config")
    public final StackConfig stackConfig;

    @InterfaceC65349Pkn("upload_backtrace_url")
    public final UploadBacktraceConfig uploadBacktraceUrl;

    public NetworkConfig() {
        this(false, false, 0L, 0L, null, null, null, null, null, 0L, 0L, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, null, null, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, false, false, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, null, null, null, 8388607, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enabled), Boolean.valueOf(this.parseBody), Long.valueOf(this.beforeDelayInterval), Long.valueOf(this.afterDelayInterval), this.allowNetworkIdConfigs, this.allowNetworkApiConfigs, this.blockNetworkApiConfigs, this.allowNetworkApmConfigs, this.blockNetworkApmConfigs, Long.valueOf(this.pairCacheInterval), Long.valueOf(this.bodyDelayInterval), Double.valueOf(this.costTimeSampleRate), this.reportBlockList, this.autoSkipApiConfigs, this.uploadBacktraceUrl, Double.valueOf(this.networkBacktraceSampleRate), this.skynetConfig, Boolean.valueOf(this.enableFuseEngineControl), Boolean.valueOf(this.enableGuardEngineControl), Double.valueOf(this.allowApiSampleRate), this.stackConfig, this.shutdownConfig, this.dfidCheckerConfig};
    }

    public NetworkConfig(boolean z, boolean z2, long j, long j2, List<AllowNetworkIdConfig> allowNetworkIdConfigs, List<AllowNetworkApiConfig> allowNetworkApiConfigs, List<AllowNetworkApiConfig> blockNetworkApiConfigs, List<AllowNetworkApmConfig> allowNetworkApmConfigs, List<AllowNetworkApmConfig> blockNetworkApmConfigs, long j3, long j4, double d, List<String> reportBlockList, Map<Integer, AutoSkipApiConfig> autoSkipApiConfigs, UploadBacktraceConfig uploadBacktraceUrl, double d2, SkynetConfig skynetConfig, boolean z3, boolean z4, double d3, StackConfig stackConfig, ShutdownConfig shutdownConfig, DFIDCheckerConfig dfidCheckerConfig) {
        o.LJIIIZ(allowNetworkIdConfigs, "allowNetworkIdConfigs");
        o.LJIIIZ(allowNetworkApiConfigs, "allowNetworkApiConfigs");
        o.LJIIIZ(blockNetworkApiConfigs, "blockNetworkApiConfigs");
        o.LJIIIZ(allowNetworkApmConfigs, "allowNetworkApmConfigs");
        o.LJIIIZ(blockNetworkApmConfigs, "blockNetworkApmConfigs");
        o.LJIIIZ(reportBlockList, "reportBlockList");
        o.LJIIIZ(autoSkipApiConfigs, "autoSkipApiConfigs");
        o.LJIIIZ(uploadBacktraceUrl, "uploadBacktraceUrl");
        o.LJIIIZ(skynetConfig, "skynetConfig");
        o.LJIIIZ(stackConfig, "stackConfig");
        o.LJIIIZ(dfidCheckerConfig, "dfidCheckerConfig");
        this.enabled = z;
        this.parseBody = z2;
        this.beforeDelayInterval = j;
        this.afterDelayInterval = j2;
        this.allowNetworkIdConfigs = allowNetworkIdConfigs;
        this.allowNetworkApiConfigs = allowNetworkApiConfigs;
        this.blockNetworkApiConfigs = blockNetworkApiConfigs;
        this.allowNetworkApmConfigs = allowNetworkApmConfigs;
        this.blockNetworkApmConfigs = blockNetworkApmConfigs;
        this.pairCacheInterval = j3;
        this.bodyDelayInterval = j4;
        this.costTimeSampleRate = d;
        this.reportBlockList = reportBlockList;
        this.autoSkipApiConfigs = autoSkipApiConfigs;
        this.uploadBacktraceUrl = uploadBacktraceUrl;
        this.networkBacktraceSampleRate = d2;
        this.skynetConfig = skynetConfig;
        this.enableFuseEngineControl = z3;
        this.enableGuardEngineControl = z4;
        this.allowApiSampleRate = d3;
        this.stackConfig = stackConfig;
        this.shutdownConfig = shutdownConfig;
        this.dfidCheckerConfig = dfidCheckerConfig;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NetworkConfig(boolean r58, boolean r59, long r60, long r62, java.util.List r64, java.util.List r65, java.util.List r66, java.util.List r67, java.util.List r68, long r69, long r71, double r73, java.util.List r75, java.util.Map r76, com.bytedance.helios.api.config.UploadBacktraceConfig r77, double r78, com.bytedance.helios.api.config.SkynetConfig r80, boolean r81, boolean r82, double r83, com.bytedance.helios.api.config.StackConfig r85, com.bytedance.helios.api.config.ShutdownConfig r86, com.bytedance.helios.api.config.DFIDCheckerConfig r87, int r88, kotlin.jvm.internal.DefaultConstructorMarker r89) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.helios.api.config.NetworkConfig.<init>(boolean, boolean, long, long, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, long, long, double, java.util.List, java.util.Map, com.bytedance.helios.api.config.UploadBacktraceConfig, double, com.bytedance.helios.api.config.SkynetConfig, boolean, boolean, double, com.bytedance.helios.api.config.StackConfig, com.bytedance.helios.api.config.ShutdownConfig, com.bytedance.helios.api.config.DFIDCheckerConfig, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
