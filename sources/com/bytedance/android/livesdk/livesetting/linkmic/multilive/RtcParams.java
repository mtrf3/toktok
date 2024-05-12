package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C15890jp;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class RtcParams {

    @InterfaceC65349Pkn("android_cap_fps_max")
    public final int capFpsMax;

    @InterfaceC65349Pkn("android_cap_fps_min")
    public final int capFpsMin;

    @InterfaceC65349Pkn("res_cap_height")
    public final int capHeight;

    @InterfaceC65349Pkn("res_cap_width")
    public final int capWidth;

    @InterfaceC65349Pkn("rtc_video_param_server_define")
    public final Map<String, Integer> codecParam;

    @InterfaceC65349Pkn("effect_fps")
    public final int effectFps;

    @InterfaceC65349Pkn("res_effect_height")
    public final int effectHeight;

    @InterfaceC65349Pkn("res_effect_width")
    public final int effectWidth;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RtcParams() {
        /*
            r11 = this;
            r1 = 0
            r8 = 0
            r9 = 255(0xff, float:3.57E-43)
            r0 = r11
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r10 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.linkmic.multilive.RtcParams.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RtcParams)) {
            return false;
        }
        RtcParams rtcParams = (RtcParams) obj;
        return this.capWidth == rtcParams.capWidth && this.capHeight == rtcParams.capHeight && this.capFpsMin == rtcParams.capFpsMin && this.capFpsMax == rtcParams.capFpsMax && this.effectWidth == rtcParams.effectWidth && this.effectHeight == rtcParams.effectHeight && this.effectFps == rtcParams.effectFps && o.LJ(this.codecParam, rtcParams.codecParam);
    }

    public final int hashCode() {
        int i = ((((((((((((this.capWidth * 31) + this.capHeight) * 31) + this.capFpsMin) * 31) + this.capFpsMax) * 31) + this.effectWidth) * 31) + this.effectHeight) * 31) + this.effectFps) * 31;
        Map<String, Integer> map = this.codecParam;
        return i + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RtcParams(capWidth=");
        LIZ.append(this.capWidth);
        LIZ.append(", capHeight=");
        LIZ.append(this.capHeight);
        LIZ.append(", capFpsMin=");
        LIZ.append(this.capFpsMin);
        LIZ.append(", capFpsMax=");
        LIZ.append(this.capFpsMax);
        LIZ.append(", effectWidth=");
        LIZ.append(this.effectWidth);
        LIZ.append(", effectHeight=");
        LIZ.append(this.effectHeight);
        LIZ.append(", effectFps=");
        LIZ.append(this.effectFps);
        LIZ.append(", codecParam=");
        return C15890jp.LIZ(LIZ, this.codecParam, ')', LIZ);
    }

    public RtcParams(int i, int i2, int i3, int i4, int i5, int i6, int i7, Map<String, Integer> map) {
        this.capWidth = i;
        this.capHeight = i2;
        this.capFpsMin = i3;
        this.capFpsMax = i4;
        this.effectWidth = i5;
        this.effectHeight = i6;
        this.effectFps = i7;
        this.codecParam = map;
    }

    public /* synthetic */ RtcParams(int i, int i2, int i3, int i4, int i5, int i6, int i7, Map map, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? 0 : i2, (i8 & 4) != 0 ? 0 : i3, (i8 & 8) != 0 ? 0 : i4, (i8 & 16) != 0 ? 0 : i5, (i8 & 32) != 0 ? 0 : i6, (i8 & 64) == 0 ? i7 : 0, (i8 & 128) != 0 ? null : map);
    }
}
