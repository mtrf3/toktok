package com.bytedance.android.livesdk.livesetting.other;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LivePitayaTaskFrequentControlManager {

    @InterfaceC65349Pkn("cpu_rate_limit")
    public double cpuRateLimit;

    @InterfaceC65349Pkn("cpu_rate_limit_anchor")
    public double cpuRateLimitAnchor;

    @InterfaceC65349Pkn("cpu_speed_limit")
    public double cpuSpeedLimit;

    @InterfaceC65349Pkn("cpu_speed_limit_anchor")
    public double cpuSpeedLimitAnchor;

    @InterfaceC65349Pkn("enable_frequent_control")
    public boolean enableFrequentControl;

    @InterfaceC65349Pkn("enable_frequent_control_white_list")
    public List<String> enableFrequentControlWhiteList;

    @InterfaceC65349Pkn("fps_limit")
    public double fpsLimit;

    @InterfaceC65349Pkn("fps_limit_anchor")
    public double fpsLimitAnchor;

    @InterfaceC65349Pkn("memory_limit")
    public double memoryLimit;

    @InterfaceC65349Pkn("memory_limit_anchor")
    public double memoryLimitAnchor;

    public LivePitayaTaskFrequentControlManager() {
        this(false, null, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 1023, null);
    }

    public LivePitayaTaskFrequentControlManager(boolean z, List<String> enableFrequentControlWhiteList, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        o.LJIIIZ(enableFrequentControlWhiteList, "enableFrequentControlWhiteList");
        this.enableFrequentControl = z;
        this.enableFrequentControlWhiteList = enableFrequentControlWhiteList;
        this.fpsLimit = d;
        this.cpuRateLimit = d2;
        this.cpuSpeedLimit = d3;
        this.memoryLimit = d4;
        this.fpsLimitAnchor = d5;
        this.cpuRateLimitAnchor = d6;
        this.cpuSpeedLimitAnchor = d7;
        this.memoryLimitAnchor = d8;
    }

    public LivePitayaTaskFrequentControlManager(boolean z, List list, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C61878OQg.INSTANCE : list, (i & 4) != 0 ? 100.0d : d, (i & 8) != 0 ? 100.0d : d2, (i & 16) != 0 ? 100.0d : d3, (i & 32) != 0 ? 100.0d : d4, (i & 64) != 0 ? 100.0d : d5, (i & 128) != 0 ? 100.0d : d6, (i & 256) != 0 ? 100.0d : d7, (i & 512) == 0 ? d8 : 100.0d);
    }
}
