package com.bytedance.android.livesdk.comp.api.linkcore.model;

import X.AnonymousClass391;
import X.C47959Irz;
import X.C74221TAz;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class Insets {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("insetsForAndroid")
    public List<Integer> insets;

    @InterfaceC65349Pkn("align_less_ratio")
    public String lessThanRatioAlign;

    @InterfaceC65349Pkn("align_greater_ratio")
    public String moreThanRatioAlign;

    @InterfaceC65349Pkn("ratio")
    public float ratio;

    @InterfaceC65349Pkn("scale_type")
    public String scaleType;

    @InterfaceC65349Pkn("stream_offset")
    public final float streamOffset;

    @InterfaceC65349Pkn("view_percent")
    public List<Float> viewPercent;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Insets copy$default(Insets insets, List list, List list2, float f, String str, String str2, String str3, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = insets.viewPercent;
        }
        if ((i & 2) != 0) {
            list2 = insets.insets;
        }
        if ((i & 4) != 0) {
            f = insets.ratio;
        }
        if ((i & 8) != 0) {
            str = insets.moreThanRatioAlign;
        }
        if ((i & 16) != 0) {
            str2 = insets.lessThanRatioAlign;
        }
        if ((i & 32) != 0) {
            str3 = insets.scaleType;
        }
        if ((i & 64) != 0) {
            f2 = insets.streamOffset;
        }
        return insets.copy(list, list2, f, str, str2, str3, f2);
    }

    public final Insets copy(List<Float> list, List<Integer> insets, float f, String moreThanRatioAlign, String lessThanRatioAlign, String scaleType, float f2) {
        o.LJIIIZ(insets, "insets");
        o.LJIIIZ(moreThanRatioAlign, "moreThanRatioAlign");
        o.LJIIIZ(lessThanRatioAlign, "lessThanRatioAlign");
        o.LJIIIZ(scaleType, "scaleType");
        return new Insets(list, insets, f, moreThanRatioAlign, lessThanRatioAlign, scaleType, f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Insets)) {
            return false;
        }
        Insets insets = (Insets) obj;
        return o.LJ(this.viewPercent, insets.viewPercent) && o.LJ(this.insets, insets.insets) && Float.compare(this.ratio, insets.ratio) == 0 && o.LJ(this.moreThanRatioAlign, insets.moreThanRatioAlign) && o.LJ(this.lessThanRatioAlign, insets.lessThanRatioAlign) && o.LJ(this.scaleType, insets.scaleType) && Float.compare(this.streamOffset, insets.streamOffset) == 0;
    }

    public int hashCode() {
        int hashCode;
        List<Float> list = this.viewPercent;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return Float.floatToIntBits(this.streamOffset) + C79062V1e.LJ(this.scaleType, C79062V1e.LJ(this.lessThanRatioAlign, C79062V1e.LJ(this.moreThanRatioAlign, C47959Irz.LIZIZ(this.ratio, AnonymousClass391.LIZIZ(this.insets, hashCode * 31, 31), 31), 31), 31), 31);
    }

    public final int lessThanRatioAlign() {
        String str = this.lessThanRatioAlign;
        switch (str.hashCode()) {
            case -1580828439:
                if (!str.equals("bottom_center")) {
                    return 34;
                }
                return 132;
            case -1568783182:
                if (!str.equals("right_top")) {
                    return 34;
                }
                return 40;
            case -1514196637:
                if (!str.equals("left_bottom")) {
                    return 34;
                }
                return 130;
            case -1494981747:
                if (!str.equals("left_center")) {
                    return 34;
                }
                return 66;
            case -1364013995:
                if (!str.equals("center")) {
                    return 34;
                }
                return 68;
            case -1349088399:
                if (!str.equals("custom")) {
                    return 34;
                }
                return 256;
            case -1113993601:
                if (!str.equals("top_center")) {
                    return 34;
                }
                return 36;
            case 1699249582:
                if (!str.equals("right_bottom")) {
                    return 34;
                }
                return 136;
            case 1718464472:
                if (!str.equals("right_center")) {
                    return 34;
                }
                return 72;
            case 1718760733:
                str.equals("left_top");
                return 34;
            default:
                return 34;
        }
    }

    public final int moreThanRatioAlign() {
        String str = this.moreThanRatioAlign;
        switch (str.hashCode()) {
            case -1580828439:
                if (!str.equals("bottom_center")) {
                    return 34;
                }
                return 132;
            case -1568783182:
                if (!str.equals("right_top")) {
                    return 34;
                }
                return 40;
            case -1514196637:
                if (!str.equals("left_bottom")) {
                    return 34;
                }
                return 130;
            case -1494981747:
                if (!str.equals("left_center")) {
                    return 34;
                }
                return 66;
            case -1364013995:
                if (!str.equals("center")) {
                    return 34;
                }
                return 68;
            case -1349088399:
                if (!str.equals("custom")) {
                    return 34;
                }
                return 256;
            case -1113993601:
                if (!str.equals("top_center")) {
                    return 34;
                }
                return 36;
            case 1699249582:
                if (!str.equals("right_bottom")) {
                    return 34;
                }
                return 136;
            case 1718464472:
                if (!str.equals("right_center")) {
                    return 34;
                }
                return 72;
            case 1718760733:
                str.equals("left_top");
                return 34;
            default:
                return 34;
        }
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Insets(viewPercent=");
        LIZ.append(this.viewPercent);
        LIZ.append(", insets=");
        LIZ.append(this.insets);
        LIZ.append(", ratio=");
        LIZ.append(this.ratio);
        LIZ.append(", moreThanRatioAlign=");
        LIZ.append(this.moreThanRatioAlign);
        LIZ.append(", lessThanRatioAlign=");
        LIZ.append(this.lessThanRatioAlign);
        LIZ.append(", scaleType=");
        LIZ.append(this.scaleType);
        LIZ.append(", streamOffset=");
        return C74221TAz.LIZLLL(LIZ, this.streamOffset, ')', LIZ);
    }

    /* loaded from: classes14.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isContains(Insets insets, int i, int i2) {
            o.LJIIIZ(insets, "<this>");
            return (i & i2) == i2;
        }

        public Companion() {
        }
    }

    public final List<Integer> getInsets() {
        return this.insets;
    }

    public final String getLessThanRatioAlign() {
        return this.lessThanRatioAlign;
    }

    public final String getMoreThanRatioAlign() {
        return this.moreThanRatioAlign;
    }

    public final float getRatio() {
        return this.ratio;
    }

    public final String getScaleType() {
        return this.scaleType;
    }

    public final float getStreamOffset() {
        return this.streamOffset;
    }

    public final List<Float> getViewPercent() {
        return this.viewPercent;
    }

    public final void setInsets(List<Integer> list) {
        o.LJIIIZ(list, "<set-?>");
        this.insets = list;
    }

    public final void setLessThanRatioAlign(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.lessThanRatioAlign = str;
    }

    public final void setMoreThanRatioAlign(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.moreThanRatioAlign = str;
    }

    public final void setRatio(float f) {
        this.ratio = f;
    }

    public final void setScaleType(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.scaleType = str;
    }

    public final void setViewPercent(List<Float> list) {
        this.viewPercent = list;
    }

    public Insets(List<Float> list, List<Integer> insets, float f, String moreThanRatioAlign, String lessThanRatioAlign, String scaleType, float f2) {
        o.LJIIIZ(insets, "insets");
        o.LJIIIZ(moreThanRatioAlign, "moreThanRatioAlign");
        o.LJIIIZ(lessThanRatioAlign, "lessThanRatioAlign");
        o.LJIIIZ(scaleType, "scaleType");
        this.viewPercent = list;
        this.insets = insets;
        this.ratio = f;
        this.moreThanRatioAlign = moreThanRatioAlign;
        this.lessThanRatioAlign = lessThanRatioAlign;
        this.scaleType = scaleType;
        this.streamOffset = f2;
    }

    public /* synthetic */ Insets(List list, List list2, float f, String str, String str2, String str3, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, f, str, str2, str3, (i & 64) != 0 ? 0.0f : f2);
    }
}
