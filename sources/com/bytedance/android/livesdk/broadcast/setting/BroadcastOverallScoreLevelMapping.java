package com.bytedance.android.livesdk.broadcast.setting;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class BroadcastOverallScoreLevelMapping {

    @InterfaceC65349Pkn("low_end_device_max")
    public float low_end_device_max;

    @InterfaceC65349Pkn("medium_end_device_max")
    public float medium_end_device_max;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BroadcastOverallScoreLevelMapping() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.setting.BroadcastOverallScoreLevelMapping.<init>():void");
    }

    public final float getLow_end_device_max() {
        return this.low_end_device_max;
    }

    public final float getMedium_end_device_max() {
        return this.medium_end_device_max;
    }

    public final void setLow_end_device_max(float f) {
        this.low_end_device_max = f;
    }

    public final void setMedium_end_device_max(float f) {
        this.medium_end_device_max = f;
    }

    public BroadcastOverallScoreLevelMapping(float f, float f2) {
        this.low_end_device_max = f;
        this.medium_end_device_max = f2;
    }

    public /* synthetic */ BroadcastOverallScoreLevelMapping(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 6.5f : f, (i & 2) != 0 ? 8.0f : f2);
    }
}
