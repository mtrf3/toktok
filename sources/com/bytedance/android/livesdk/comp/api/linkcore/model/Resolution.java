package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.RtcParams;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class Resolution {

    @InterfaceC65349Pkn("bits")
    public final int _bitrate_kbps;

    @InterfaceC65349Pkn("e_h")
    public final int _effectHeight;

    @InterfaceC65349Pkn("e_w")
    public final int _effectWidth;

    @InterfaceC65349Pkn("fps")
    public final int _fps;

    @InterfaceC65349Pkn("h")
    public final int _height;

    @InterfaceC65349Pkn("w")
    public final int _width;
    public int bitrateKbps;

    @InterfaceC65349Pkn("business_id")
    public final String businessId;
    public int effectHeight;
    public int effectWidth;
    public transient int fps;
    public int height;
    public final RtcParams rtcParams;
    public int width;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Resolution() {
        /*
            r11 = this;
            r1 = 0
            r5 = 0
            r9 = 255(0xff, float:3.57E-43)
            r0 = r11
            r2 = r1
            r3 = r1
            r4 = r1
            r6 = r1
            r7 = r1
            r8 = r5
            r10 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.api.linkcore.model.Resolution.<init>():void");
    }

    private final int component1() {
        return this._width;
    }

    private final int component2() {
        return this._height;
    }

    private final int component3() {
        return this._fps;
    }

    private final int component4() {
        return this._bitrate_kbps;
    }

    private final int component6() {
        return this._effectWidth;
    }

    private final int component7() {
        return this._effectHeight;
    }

    public static /* synthetic */ Resolution copy$default(Resolution resolution, int i, int i2, int i3, int i4, String str, int i5, int i6, RtcParams rtcParams, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = resolution._width;
        }
        if ((i7 & 2) != 0) {
            i2 = resolution._height;
        }
        if ((i7 & 4) != 0) {
            i3 = resolution._fps;
        }
        if ((i7 & 8) != 0) {
            i4 = resolution._bitrate_kbps;
        }
        if ((i7 & 16) != 0) {
            str = resolution.businessId;
        }
        if ((i7 & 32) != 0) {
            i5 = resolution._effectWidth;
        }
        if ((i7 & 64) != 0) {
            i6 = resolution._effectHeight;
        }
        if ((i7 & 128) != 0) {
            rtcParams = resolution.rtcParams;
        }
        return resolution.copy(i, i2, i3, i4, str, i5, i6, rtcParams);
    }

    public final Resolution copy(int i, int i2, int i3, int i4, String businessId, int i5, int i6, RtcParams rtcParams) {
        o.LJIIIZ(businessId, "businessId");
        return new Resolution(i, i2, i3, i4, businessId, i5, i6, rtcParams);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Resolution)) {
            return false;
        }
        Resolution resolution = (Resolution) obj;
        return this._width == resolution._width && this._height == resolution._height && this._fps == resolution._fps && this._bitrate_kbps == resolution._bitrate_kbps && o.LJ(this.businessId, resolution.businessId) && this._effectWidth == resolution._effectWidth && this._effectHeight == resolution._effectHeight && o.LJ(this.rtcParams, resolution.rtcParams);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Resolution(_width=");
        LIZ.append(this._width);
        LIZ.append(", _height=");
        LIZ.append(this._height);
        LIZ.append(", _fps=");
        LIZ.append(this._fps);
        LIZ.append(", _bitrate_kbps=");
        LIZ.append(this._bitrate_kbps);
        LIZ.append(", businessId=");
        LIZ.append(this.businessId);
        LIZ.append(", _effectWidth=");
        LIZ.append(this._effectWidth);
        LIZ.append(", _effectHeight=");
        LIZ.append(this._effectHeight);
        LIZ.append(", rtcParams=");
        LIZ.append(this.rtcParams);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int getBitrateKbps() {
        int i;
        Map<String, Integer> map;
        Integer num;
        RtcParams rtcParams = this.rtcParams;
        if (rtcParams != null && (map = rtcParams.codecParam) != null && (num = map.get("bitrate_kbps")) != null) {
            i = num.intValue();
        } else {
            i = this.bitrateKbps;
        }
        if (i > 0) {
            return i;
        }
        return this._bitrate_kbps;
    }

    public final int getEffectHeight() {
        int i;
        RtcParams rtcParams = this.rtcParams;
        if (rtcParams != null) {
            i = rtcParams.effectHeight;
        } else {
            i = this.effectHeight;
        }
        if (i > 0) {
            return i;
        }
        return this._effectHeight;
    }

    public final int getEffectWidth() {
        int i;
        RtcParams rtcParams = this.rtcParams;
        if (rtcParams != null) {
            i = rtcParams.effectWidth;
        } else {
            i = this.effectWidth;
        }
        if (i > 0) {
            return i;
        }
        return this._effectWidth;
    }

    public final int getFps() {
        int i;
        Map<String, Integer> map;
        Integer num;
        RtcParams rtcParams = this.rtcParams;
        if (rtcParams != null && (map = rtcParams.codecParam) != null && (num = map.get("fps")) != null) {
            i = num.intValue();
        } else {
            i = this.fps;
        }
        if (i > 0) {
            return i;
        }
        return this._fps;
    }

    public final int getHeight() {
        int i;
        Map<String, Integer> map;
        Integer num;
        RtcParams rtcParams = this.rtcParams;
        if (rtcParams != null && (map = rtcParams.codecParam) != null && (num = map.get("height")) != null) {
            i = num.intValue();
        } else {
            i = this.height;
        }
        if (i > 0) {
            return i;
        }
        return this._height;
    }

    public final int getWidth() {
        int i;
        Map<String, Integer> map;
        Integer num;
        RtcParams rtcParams = this.rtcParams;
        if (rtcParams != null && (map = rtcParams.codecParam) != null && (num = map.get("width")) != null) {
            i = num.intValue();
        } else {
            i = this.width;
        }
        if (i > 0) {
            return i;
        }
        return this._width;
    }

    public int hashCode() {
        int hashCode;
        int LJ = (((C79062V1e.LJ(this.businessId, ((((((this._width * 31) + this._height) * 31) + this._fps) * 31) + this._bitrate_kbps) * 31, 31) + this._effectWidth) * 31) + this._effectHeight) * 31;
        RtcParams rtcParams = this.rtcParams;
        if (rtcParams == null) {
            hashCode = 0;
        } else {
            hashCode = rtcParams.hashCode();
        }
        return LJ + hashCode;
    }

    public final String getBusinessId() {
        return this.businessId;
    }

    public final RtcParams getRtcParams() {
        return this.rtcParams;
    }

    public final void setBitrateKbps(int i) {
        this.bitrateKbps = i;
    }

    public final void setEffectHeight(int i) {
        this.effectHeight = i;
    }

    public final void setEffectWidth(int i) {
        this.effectWidth = i;
    }

    public final void setFps(int i) {
        this.fps = i;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public final Resolution copy(String str, RtcParams rtcParams) {
        RtcParams rtcParams2 = rtcParams;
        String str2 = str;
        int i = this._width;
        int i2 = this._height;
        int i3 = this._fps;
        int i4 = this._bitrate_kbps;
        if (str2 == null) {
            str2 = this.businessId;
        }
        int i5 = this._effectWidth;
        int i6 = this._effectHeight;
        if (rtcParams2 == null) {
            rtcParams2 = this.rtcParams;
        }
        return new Resolution(i, i2, i3, i4, str2, i5, i6, rtcParams2);
    }

    public static /* synthetic */ Resolution copy$default(Resolution resolution, String str, RtcParams rtcParams, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            rtcParams = null;
        }
        return resolution.copy(str, rtcParams);
    }

    public Resolution(int i, int i2, int i3, int i4, String businessId, int i5, int i6, RtcParams rtcParams) {
        o.LJIIIZ(businessId, "businessId");
        this._width = i;
        this._height = i2;
        this._fps = i3;
        this._bitrate_kbps = i4;
        this.businessId = businessId;
        this._effectWidth = i5;
        this._effectHeight = i6;
        this.rtcParams = rtcParams;
        this.width = i;
        this.height = i2;
        this.fps = i3;
        this.bitrateKbps = i4;
        this.effectWidth = i5;
        this.effectHeight = i6;
    }

    public /* synthetic */ Resolution(int i, int i2, int i3, int i4, String str, int i5, int i6, RtcParams rtcParams, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) != 0 ? 0 : i3, (i7 & 8) != 0 ? 0 : i4, (i7 & 16) != 0 ? "linkmic_grid_float_1" : str, (i7 & 32) != 0 ? 0 : i5, (i7 & 64) == 0 ? i6 : 0, (i7 & 128) != 0 ? null : rtcParams);
    }
}
