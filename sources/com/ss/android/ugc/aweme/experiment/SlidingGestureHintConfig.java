package com.ss.android.ugc.aweme.experiment;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SlidingGestureHintConfig {

    @InterfaceC65349Pkn("fyp_ad_slide_at_middle")
    public final Integer fypCanSlideAtMiddle;

    @InterfaceC65349Pkn("hint_show_count")
    public final Integer hintShowCount;

    @InterfaceC65349Pkn("is_enable")
    public final Integer isEnable;

    /* JADX WARN: Multi-variable type inference failed */
    public SlidingGestureHintConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlidingGestureHintConfig)) {
            return false;
        }
        SlidingGestureHintConfig slidingGestureHintConfig = (SlidingGestureHintConfig) obj;
        return o.LJ(this.isEnable, slidingGestureHintConfig.isEnable) && o.LJ(this.fypCanSlideAtMiddle, slidingGestureHintConfig.fypCanSlideAtMiddle) && o.LJ(this.hintShowCount, slidingGestureHintConfig.hintShowCount);
    }

    public final int hashCode() {
        Integer num = this.isEnable;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.fypCanSlideAtMiddle;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.hintShowCount;
        return hashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SlidingGestureHintConfig(isEnable=");
        LIZ.append(this.isEnable);
        LIZ.append(", fypCanSlideAtMiddle=");
        LIZ.append(this.fypCanSlideAtMiddle);
        LIZ.append(", hintShowCount=");
        return s0.LIZJ(LIZ, this.hintShowCount, ')', LIZ);
    }

    public SlidingGestureHintConfig(Integer num, Integer num2, Integer num3) {
        this.isEnable = num;
        this.fypCanSlideAtMiddle = num2;
        this.hintShowCount = num3;
    }

    public /* synthetic */ SlidingGestureHintConfig(Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? 0 : num2, (i & 4) != 0 ? 0 : num3);
    }
}
