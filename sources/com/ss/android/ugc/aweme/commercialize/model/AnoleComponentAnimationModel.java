package com.ss.android.ugc.aweme.commercialize.model;

import X.C15890jp;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class AnoleComponentAnimationModel implements Serializable {

    @InterfaceC65349Pkn("curve")
    public final String curve;

    @InterfaceC65349Pkn("delay")
    public final long delay;

    @InterfaceC65349Pkn("duration")
    public final long duration;

    @InterfaceC65349Pkn("params")
    public final Map<String, Object> params;

    @InterfaceC65349Pkn("type")
    public final String type;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnoleComponentAnimationModel copy$default(AnoleComponentAnimationModel anoleComponentAnimationModel, String str, long j, long j2, String str2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = anoleComponentAnimationModel.type;
        }
        if ((i & 2) != 0) {
            j = anoleComponentAnimationModel.duration;
        }
        if ((i & 4) != 0) {
            j2 = anoleComponentAnimationModel.delay;
        }
        if ((i & 8) != 0) {
            str2 = anoleComponentAnimationModel.curve;
        }
        if ((i & 16) != 0) {
            map = anoleComponentAnimationModel.params;
        }
        return anoleComponentAnimationModel.copy(str, j, j2, str2, map);
    }

    public final AnoleComponentAnimationModel copy(String str, long j, long j2, String str2, Map<String, ? extends Object> map) {
        return new AnoleComponentAnimationModel(str, j, j2, str2, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnoleComponentAnimationModel)) {
            return false;
        }
        AnoleComponentAnimationModel anoleComponentAnimationModel = (AnoleComponentAnimationModel) obj;
        return o.LJ(this.type, anoleComponentAnimationModel.type) && this.duration == anoleComponentAnimationModel.duration && this.delay == anoleComponentAnimationModel.delay && o.LJ(this.curve, anoleComponentAnimationModel.curve) && o.LJ(this.params, anoleComponentAnimationModel.params);
    }

    public final double getFinalHeightValue() {
        Double d;
        Map<String, Object> map = this.params;
        Object obj = null;
        if (map != null) {
            obj = map.get("to_height");
        }
        if ((obj instanceof Double) && (d = (Double) obj) != null) {
            return d.doubleValue();
        }
        return -1.0d;
    }

    public final Double getFinalOpacityValue() {
        Object obj;
        Double d;
        Map<String, Object> map = this.params;
        if (map != null) {
            obj = map.get("to_opacity");
        } else {
            obj = null;
        }
        if (!(obj instanceof Double) || (d = (Double) obj) == null) {
            return null;
        }
        return Double.valueOf(Math.max(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, Math.min(d.doubleValue(), 100.0d)));
    }

    public final Double getFinalScaleValue() {
        Object obj;
        Double d;
        Map<String, Object> map = this.params;
        if (map != null) {
            obj = map.get("to_scale");
        } else {
            obj = null;
        }
        if (!(obj instanceof Double) || (d = (Double) obj) == null) {
            return null;
        }
        return Double.valueOf(Math.max(d.doubleValue(), LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX));
    }

    public final double getFinalWidthValue() {
        Double d;
        Map<String, Object> map = this.params;
        Object obj = null;
        if (map != null) {
            obj = map.get("to_width");
        }
        if ((obj instanceof Double) && (d = (Double) obj) != null) {
            return d.doubleValue();
        }
        return -1.0d;
    }

    public final Double getInitialOpacityValue() {
        Object obj;
        Double d;
        Map<String, Object> map = this.params;
        if (map != null) {
            obj = map.get("from_opacity");
        } else {
            obj = null;
        }
        if (!(obj instanceof Double) || (d = (Double) obj) == null) {
            return null;
        }
        return Double.valueOf(Math.max(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, Math.min(d.doubleValue(), 100.0d)));
    }

    public final Double getInitialScaleValue() {
        Object obj;
        Double d;
        Map<String, Object> map = this.params;
        if (map != null) {
            obj = map.get("from_scale");
        } else {
            obj = null;
        }
        if (!(obj instanceof Double) || (d = (Double) obj) == null) {
            return null;
        }
        return Double.valueOf(Math.max(d.doubleValue(), LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX));
    }

    public final String getResizeType() {
        Object obj;
        Map<String, Object> map = this.params;
        if (map != null) {
            obj = map.get("resize_type");
        } else {
            obj = null;
        }
        if (!(obj instanceof String)) {
            return null;
        }
        return (String) obj;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.type;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.delay, JBR.LIZJ(this.duration, hashCode * 31, 31), 31);
        String str2 = this.curve;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (LIZJ + hashCode2) * 31;
        Map<String, Object> map = this.params;
        if (map != null) {
            i = map.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnoleComponentAnimationModel(type=");
        LIZ.append(this.type);
        LIZ.append(", duration=");
        LIZ.append(this.duration);
        LIZ.append(", delay=");
        LIZ.append(this.delay);
        LIZ.append(", curve=");
        LIZ.append(this.curve);
        LIZ.append(", params=");
        return C15890jp.LIZ(LIZ, this.params, ')', LIZ);
    }

    public final String getCurve() {
        return this.curve;
    }

    public final long getDelay() {
        return this.delay;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final Map<String, Object> getParams() {
        return this.params;
    }

    public final String getType() {
        return this.type;
    }

    public AnoleComponentAnimationModel(String str, long j, long j2, String str2, Map<String, ? extends Object> map) {
        this.type = str;
        this.duration = j;
        this.delay = j2;
        this.curve = str2;
        this.params = map;
    }
}
