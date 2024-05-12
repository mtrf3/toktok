package com.ss.android.ugc.aweme.setting.performance;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class ToolsBaseInfoConfig extends F9E implements Serializable {

    @InterfaceC65349Pkn("collect_duration")
    public final long collectDuration;

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    @InterfaceC65349Pkn("sampling_rate")
    public final long samplingRate;

    @InterfaceC65349Pkn("scene_collect_duration")
    public final long sceneCollectDuration;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ToolsBaseInfoConfig() {
        /*
            r10 = this;
            r1 = 0
            r2 = 0
            r8 = 15
            r9 = 0
            r0 = r10
            r4 = r2
            r6 = r2
            r0.<init>(r1, r2, r4, r6, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.performance.ToolsBaseInfoConfig.<init>():void");
    }

    public static /* synthetic */ ToolsBaseInfoConfig copy$default(ToolsBaseInfoConfig toolsBaseInfoConfig, boolean z, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = toolsBaseInfoConfig.enable;
        }
        if ((i & 2) != 0) {
            j = toolsBaseInfoConfig.collectDuration;
        }
        if ((i & 4) != 0) {
            j2 = toolsBaseInfoConfig.sceneCollectDuration;
        }
        if ((i & 8) != 0) {
            j3 = toolsBaseInfoConfig.samplingRate;
        }
        return toolsBaseInfoConfig.copy(z, j, j2, j3);
    }

    public final ToolsBaseInfoConfig copy(boolean z, long j, long j2, long j3) {
        return new ToolsBaseInfoConfig(z, j, j2, j3);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable), Long.valueOf(this.collectDuration), Long.valueOf(this.sceneCollectDuration), Long.valueOf(this.samplingRate)};
    }

    public final long getCollectDuration() {
        return this.collectDuration;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final long getSamplingRate() {
        return this.samplingRate;
    }

    public final long getSceneCollectDuration() {
        return this.sceneCollectDuration;
    }

    public ToolsBaseInfoConfig(boolean z, long j, long j2, long j3) {
        this.enable = z;
        this.collectDuration = j;
        this.sceneCollectDuration = j2;
        this.samplingRate = j3;
    }

    public /* synthetic */ ToolsBaseInfoConfig(boolean z, long j, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 5000L : j, (i & 4) != 0 ? 2000L : j2, (i & 8) != 0 ? 50L : j3);
    }
}
