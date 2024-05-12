package com.ss.android.ugc.aweme.service.earlyfeedback;

import X.C1JX;
import X.FFL;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class EarlyFeedbackExperiment {
    public static final EarlyFeedbackExperiment LIZ = new EarlyFeedbackExperiment();
    public static final EarlyFeedbackButtonData LIZIZ;

    /* loaded from: classes7.dex */
    public static final class EarlyFeedbackButtonData {

        @InterfaceC65349Pkn("ab_group")
        public final int abGroup;

        @InterfaceC65349Pkn("design")
        public final int design;

        @InterfaceC65349Pkn("expiration_offset_hours_end")
        public final long expirationOffsetHoursEnd;

        @InterfaceC65349Pkn("expiration_offset_hours_start")
        public final long expirationOffsetHoursStart;

        @InterfaceC65349Pkn("is_enable")
        public final boolean isEnable;

        @InterfaceC65349Pkn("ratio")
        public final double ratio;

        @InterfaceC65349Pkn("vv_threshold")
        public final int vvThreshold;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public EarlyFeedbackButtonData() {
            /*
                r13 = this;
                r1 = 0
                r3 = 0
                r6 = 0
                r11 = 127(0x7f, float:1.78E-43)
                r12 = 0
                r0 = r13
                r2 = r1
                r5 = r1
                r8 = r6
                r10 = r1
                r0.<init>(r1, r2, r3, r5, r6, r8, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.service.earlyfeedback.EarlyFeedbackExperiment.EarlyFeedbackButtonData.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EarlyFeedbackButtonData)) {
                return false;
            }
            EarlyFeedbackButtonData earlyFeedbackButtonData = (EarlyFeedbackButtonData) obj;
            return this.abGroup == earlyFeedbackButtonData.abGroup && this.isEnable == earlyFeedbackButtonData.isEnable && Double.compare(this.ratio, earlyFeedbackButtonData.ratio) == 0 && this.vvThreshold == earlyFeedbackButtonData.vvThreshold && this.expirationOffsetHoursStart == earlyFeedbackButtonData.expirationOffsetHoursStart && this.expirationOffsetHoursEnd == earlyFeedbackButtonData.expirationOffsetHoursEnd && this.design == earlyFeedbackButtonData.design;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int i = this.abGroup * 31;
            boolean z = this.isEnable;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            return JBR.LIZJ(this.expirationOffsetHoursEnd, JBR.LIZJ(this.expirationOffsetHoursStart, (C1JX.LIZIZ(this.ratio, (i + i2) * 31, 31) + this.vvThreshold) * 31, 31), 31) + this.design;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EarlyFeedbackButtonData(abGroup=");
            LIZ.append(this.abGroup);
            LIZ.append(", isEnable=");
            LIZ.append(this.isEnable);
            LIZ.append(", ratio=");
            LIZ.append(this.ratio);
            LIZ.append(", vvThreshold=");
            LIZ.append(this.vvThreshold);
            LIZ.append(", expirationOffsetHoursStart=");
            LIZ.append(this.expirationOffsetHoursStart);
            LIZ.append(", expirationOffsetHoursEnd=");
            LIZ.append(this.expirationOffsetHoursEnd);
            LIZ.append(", design=");
            return b0.LIZJ(LIZ, this.design, ')', LIZ);
        }

        public EarlyFeedbackButtonData(int i, boolean z, double d, int i2, long j, long j2, int i3) {
            this.abGroup = i;
            this.isEnable = z;
            this.ratio = d;
            this.vvThreshold = i2;
            this.expirationOffsetHoursStart = j;
            this.expirationOffsetHoursEnd = j2;
            this.design = i3;
        }

        public /* synthetic */ EarlyFeedbackButtonData(int i, boolean z, double d, int i2, long j, long j2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) == 0 ? z : false, (i4 & 4) != 0 ? LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX : d, (i4 & 8) != 0 ? -1 : i2, (i4 & 16) != 0 ? -1L : j, (i4 & 32) == 0 ? j2 : -1L, (i4 & 64) == 0 ? i3 : -1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        EarlyFeedbackButtonData earlyFeedbackButtonData;
        long j = 0;
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        int i2 = 127;
        DefaultConstructorMarker defaultConstructorMarker = null;
        EarlyFeedbackButtonData earlyFeedbackButtonData2 = new EarlyFeedbackButtonData(0, 0 == true ? 1 : 0, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 0 == true ? 1 : 0, j, j, 0 == true ? 1 : 0, i2, defaultConstructorMarker);
        try {
            FFL.LJIIIZ().getClass();
            earlyFeedbackButtonData = (EarlyFeedbackButtonData) FFL.LJIJI(true, "early_feedback", 31744, EarlyFeedbackButtonData.class, earlyFeedbackButtonData2, 1);
            if (earlyFeedbackButtonData == null) {
                earlyFeedbackButtonData = new EarlyFeedbackButtonData(i, objArr7 == true ? 1 : 0, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, objArr6 == true ? 1 : 0, j, j, objArr5 == true ? 1 : 0, i2, defaultConstructorMarker);
            }
        } catch (Throwable unused) {
            earlyFeedbackButtonData = new EarlyFeedbackButtonData(objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, objArr2 == true ? 1 : 0, j, j, objArr == true ? 1 : 0, i2, defaultConstructorMarker);
        }
        LIZIZ = earlyFeedbackButtonData;
    }
}
