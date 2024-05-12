package com.bytedance.android.livesdk.livesetting.model;

import X.InterfaceC65349Pkn;

/* loaded from: classes16.dex */
public final class PerformanceSample {

    @InterfaceC65349Pkn("live_performance_audience_cpu_sample_rate")
    public int audienceCpuSampleRate = 10;

    @InterfaceC65349Pkn("live_performance_audience_gpu_sample_rate")
    public int audienceGpuSampleRate = 10;

    @InterfaceC65349Pkn("live_performance_audience_mem_sample_rate")
    public int audienceMemSampleRate = 10;

    @InterfaceC65349Pkn("live_performance_host_cpu_sample_rate")
    public int hostCpuSampleRate = 10;

    @InterfaceC65349Pkn("live_performance_host_mem_sample_rate")
    public int hostMemSampleRate = 10;

    @InterfaceC65349Pkn("live_performance_auidence_opt_experiment")
    public boolean isAudienceExperiment;

    @InterfaceC65349Pkn("live_performance_host_opt_experiment")
    public boolean isHostExperiment;
}
