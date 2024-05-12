package com.bytedance.android.livesdk.livesetting.broadcast;

import X.InterfaceC65349Pkn;
import X.WM7;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class FluencyNegativeTestSettings {

    @InterfaceC65349Pkn("drop_frames")
    public double dropFrames;

    @InterfaceC65349Pkn("enable")
    public boolean enable;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public int scene;

    /* JADX WARN: Multi-variable type inference failed */
    public FluencyNegativeTestSettings() {
        this(false, 0 == true ? 1 : 0, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 7, null);
    }

    public FluencyNegativeTestSettings(boolean z, int i, double d) {
        this.enable = z;
        this.scene = i;
        this.dropFrames = d;
    }

    public /* synthetic */ FluencyNegativeTestSettings(boolean z, int i, double d, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d);
    }
}
