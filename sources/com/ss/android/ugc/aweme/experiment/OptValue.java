package com.ss.android.ugc.aweme.experiment;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class OptValue {

    @InterfaceC65349Pkn("enable_home_tab_dynamic_text")
    public final Integer enableHomeTabDynamicText;

    @InterfaceC65349Pkn("enable_slide_title_animation")
    public final Integer enableSlideTitleAnimation;

    @InterfaceC65349Pkn("slide_params_opt")
    public final Integer isEnableSlideParamsOpt;

    @InterfaceC65349Pkn("enable_slide_toast")
    public final Integer isEnableSlideToast;

    @InterfaceC65349Pkn("toast_x_tab_max_days")
    public final int toastMaxDays;

    /* JADX WARN: Multi-variable type inference failed */
    public OptValue() {
        this(null, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OptValue)) {
            return false;
        }
        OptValue optValue = (OptValue) obj;
        return o.LJ(this.isEnableSlideParamsOpt, optValue.isEnableSlideParamsOpt) && o.LJ(this.isEnableSlideToast, optValue.isEnableSlideToast) && this.toastMaxDays == optValue.toastMaxDays && o.LJ(this.enableHomeTabDynamicText, optValue.enableHomeTabDynamicText) && o.LJ(this.enableSlideTitleAnimation, optValue.enableSlideTitleAnimation);
    }

    public final int hashCode() {
        Integer num = this.isEnableSlideParamsOpt;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.isEnableSlideToast;
        int hashCode2 = (((hashCode + (num2 == null ? 0 : num2.hashCode())) * 31) + this.toastMaxDays) * 31;
        Integer num3 = this.enableHomeTabDynamicText;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.enableSlideTitleAnimation;
        return hashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OptValue(isEnableSlideParamsOpt=");
        LIZ.append(this.isEnableSlideParamsOpt);
        LIZ.append(", isEnableSlideToast=");
        LIZ.append(this.isEnableSlideToast);
        LIZ.append(", toastMaxDays=");
        LIZ.append(this.toastMaxDays);
        LIZ.append(", enableHomeTabDynamicText=");
        LIZ.append(this.enableHomeTabDynamicText);
        LIZ.append(", enableSlideTitleAnimation=");
        return s0.LIZJ(LIZ, this.enableSlideTitleAnimation, ')', LIZ);
    }

    public OptValue(Integer num, Integer num2, int i, Integer num3, Integer num4) {
        this.isEnableSlideParamsOpt = num;
        this.isEnableSlideToast = num2;
        this.toastMaxDays = i;
        this.enableHomeTabDynamicText = num3;
        this.enableSlideTitleAnimation = num4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ OptValue(java.lang.Integer r7, java.lang.Integer r8, int r9, java.lang.Integer r10, java.lang.Integer r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r4 = r10
            r1 = r7
            r2 = r8
            r0 = r12 & 1
            r3 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            if (r0 == 0) goto Ld
            r1 = r5
        Ld:
            r0 = r12 & 2
            if (r0 == 0) goto L12
            r2 = r5
        L12:
            r0 = r12 & 4
            if (r0 == 0) goto L26
        L16:
            r0 = r12 & 8
            if (r0 == 0) goto L1b
            r4 = r5
        L1b:
            r0 = r12 & 16
            if (r0 == 0) goto L24
        L1f:
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        L24:
            r5 = r11
            goto L1f
        L26:
            r3 = r9
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.experiment.OptValue.<init>(java.lang.Integer, java.lang.Integer, int, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
