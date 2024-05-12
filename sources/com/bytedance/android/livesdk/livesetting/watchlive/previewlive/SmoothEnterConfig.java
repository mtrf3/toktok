package com.bytedance.android.livesdk.livesetting.watchlive.previewlive;

import X.InterfaceC65349Pkn;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class SmoothEnterConfig {

    @InterfaceC65349Pkn("enable")
    public boolean enable;

    @InterfaceC65349Pkn("entrance_enable_high_prio")
    public Map<String, Boolean> entranceMap;

    @InterfaceC65349Pkn("force_remove_enable")
    public boolean forceRemove;

    @InterfaceC65349Pkn("force_remove_delay_time")
    public long forceRemoveDelayTime;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SmoothEnterConfig() {
        /*
            r8 = this;
            r1 = 0
            r3 = 0
            r5 = 0
            r6 = 15
            r0 = r8
            r2 = r1
            r7 = r5
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.watchlive.previewlive.SmoothEnterConfig.<init>():void");
    }

    public SmoothEnterConfig(boolean z, boolean z2, long j, Map<String, Boolean> entranceMap) {
        o.LJIIIZ(entranceMap, "entranceMap");
        this.enable = z;
        this.forceRemove = z2;
        this.forceRemoveDelayTime = j;
        this.entranceMap = entranceMap;
    }

    public /* synthetic */ SmoothEnterConfig(boolean z, boolean z2, long j, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) == 0 ? z2 : false, (i & 4) != 0 ? 2000L : j, (i & 8) != 0 ? new HashMap() : map);
    }
}
