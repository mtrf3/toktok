package com.bytedance.helios.api.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.OQY;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class SkynetConfig extends F9E {

    @InterfaceC65349Pkn("analyze_delay_time")
    public final long analyzeDelayTime;

    @InterfaceC65349Pkn("analyze_interval_time")
    public final long analyzeIntervalTime;

    @InterfaceC65349Pkn("domain_allow_list")
    public final Set<String> domainAllowList;

    @InterfaceC65349Pkn("domain_block_list")
    public final Set<String> domainBlockList;

    @InterfaceC65349Pkn("enabled")
    public final boolean enabled;

    @InterfaceC65349Pkn("fuse_upload_sample_rate")
    public final double fuseUploadSampleRate;

    @InterfaceC65349Pkn("sample_rate")
    public final double sampleRate;

    public SkynetConfig() {
        this(false, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 0L, 0L, null, null, 127, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enabled), Double.valueOf(this.sampleRate), Double.valueOf(this.fuseUploadSampleRate), Long.valueOf(this.analyzeIntervalTime), Long.valueOf(this.analyzeDelayTime), this.domainAllowList, this.domainBlockList};
    }

    public SkynetConfig(boolean z, double d, double d2, long j, long j2, Set<String> domainAllowList, Set<String> domainBlockList) {
        o.LJIIIZ(domainAllowList, "domainAllowList");
        o.LJIIIZ(domainBlockList, "domainBlockList");
        this.enabled = z;
        this.sampleRate = d;
        this.fuseUploadSampleRate = d2;
        this.analyzeIntervalTime = j;
        this.analyzeDelayTime = j2;
        this.domainAllowList = domainAllowList;
        this.domainBlockList = domainBlockList;
    }

    public SkynetConfig(boolean z, double d, double d2, long j, long j2, Set set, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0.001d : d, (i & 4) != 0 ? 0.1d : d2, (i & 8) != 0 ? 86400000L : j, (i & 16) != 0 ? 60000L : j2, (i & 32) != 0 ? OQY.INSTANCE : set, (i & 64) != 0 ? new LinkedHashSet() : set2);
    }
}
