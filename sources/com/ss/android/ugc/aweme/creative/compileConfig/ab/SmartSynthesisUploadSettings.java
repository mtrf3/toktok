package com.ss.android.ugc.aweme.creative.compileConfig.ab;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public final class SmartSynthesisUploadSettings extends F9E {

    @InterfaceC65349Pkn("delta_vmaf")
    public final double deltaVmaf;

    @InterfaceC65349Pkn("upload_speed_max")
    public final int maxSpeed;

    @InterfaceC65349Pkn("upload_speed_min")
    public final int minSpeed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SmartSynthesisUploadSettings() {
        /*
            r7 = this;
            r1 = 0
            r3 = 0
            r5 = 7
            r6 = 0
            r0 = r7
            r2 = r1
            r0.<init>(r1, r2, r3, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.compileConfig.ab.SmartSynthesisUploadSettings.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.maxSpeed), Integer.valueOf(this.minSpeed), Double.valueOf(this.deltaVmaf)};
    }

    public SmartSynthesisUploadSettings(int i, int i2, double d) {
        this.maxSpeed = i;
        this.minSpeed = i2;
        this.deltaVmaf = d;
    }

    public /* synthetic */ SmartSynthesisUploadSettings(int i, int i2, double d, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d);
    }
}
