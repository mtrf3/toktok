package com.bytedance.android.livesdk.livesetting.other;

import X.C113554cx;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LivePitayaSettingsParams {

    @InterfaceC65349Pkn("ab_params")
    public Map<String, ? extends Object> abParams;

    @InterfaceC65349Pkn("live_ai_services")
    public LiveAIServices aiServices;

    @InterfaceC65349Pkn("enable")
    public int enable;

    @InterfaceC65349Pkn("frequent_settings")
    public LivePitayaTaskFrequentControlManager fequentSettings;

    @InterfaceC65349Pkn("init_after_app_start")
    public int initAfterAppStart;

    @InterfaceC65349Pkn("request_all_pkgs_delay")
    public long requestAllPkgsDelay;

    @InterfaceC65349Pkn("request_all_pkgs_once")
    public int requestAllPkgsOnce;

    @InterfaceC65349Pkn("task_settings")
    public LivePitayaTaskSettingsParams taskSettingsParams;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LivePitayaSettingsParams() {
        /*
            r12 = this;
            r1 = 0
            r2 = 0
            r6 = 0
            r10 = 255(0xff, float:3.57E-43)
            r0 = r12
            r3 = r2
            r4 = r2
            r5 = r1
            r8 = r1
            r9 = r2
            r11 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.other.LivePitayaSettingsParams.<init>():void");
    }

    public LivePitayaSettingsParams(int i, LivePitayaTaskSettingsParams taskSettingsParams, Map<String, ? extends Object> abParams, LiveAIServices aiServices, int i2, long j, int i3, LivePitayaTaskFrequentControlManager fequentSettings) {
        o.LJIIIZ(taskSettingsParams, "taskSettingsParams");
        o.LJIIIZ(abParams, "abParams");
        o.LJIIIZ(aiServices, "aiServices");
        o.LJIIIZ(fequentSettings, "fequentSettings");
        this.enable = i;
        this.taskSettingsParams = taskSettingsParams;
        this.abParams = abParams;
        this.aiServices = aiServices;
        this.requestAllPkgsOnce = i2;
        this.requestAllPkgsDelay = j;
        this.initAfterAppStart = i3;
        this.fequentSettings = fequentSettings;
    }

    public /* synthetic */ LivePitayaSettingsParams(int i, LivePitayaTaskSettingsParams livePitayaTaskSettingsParams, Map map, LiveAIServices liveAIServices, int i2, long j, int i3, LivePitayaTaskFrequentControlManager livePitayaTaskFrequentControlManager, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? new LivePitayaTaskSettingsParams(0L, 1, null) : livePitayaTaskSettingsParams, (i4 & 4) != 0 ? C113554cx.LJJJLIIL() : map, (i4 & 8) != 0 ? new LiveAIServices(null, null, null, null, null, 31, null) : liveAIServices, (i4 & 16) == 0 ? i2 : 1, (i4 & 32) != 0 ? 30000L : j, (i4 & 64) == 0 ? i3 : 0, (i4 & 128) != 0 ? new LivePitayaTaskFrequentControlManager(false, null, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 1023, null) : livePitayaTaskFrequentControlManager);
    }
}
