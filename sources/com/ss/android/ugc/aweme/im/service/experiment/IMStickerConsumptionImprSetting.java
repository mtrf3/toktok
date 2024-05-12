package com.ss.android.ugc.aweme.im.service.experiment;

import X.C16880lQ;
import X.C221108m2;
import X.C47135Ieh;
import X.C62822Ol8;
import X.C71752rj;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class IMStickerConsumptionImprSetting {
    public static final StickerConsumptionImprSettingModel LIZIZ;
    public static final IMStickerConsumptionImprSetting LIZ = new IMStickerConsumptionImprSetting();
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C71752rj.LJLIL);

    /* loaded from: classes2.dex */
    public static final class StickerConsumptionImprSettingModel {

        @InterfaceC65349Pkn("popular_sticker_cache_exp_hours")
        public final long popularStickerCacheExpHours;

        @InterfaceC65349Pkn("red_dot_first_reshow_days")
        public final int redDotFirstReshowDays;

        @InterfaceC65349Pkn("red_dot_hide_days")
        public final int redDotHideAfterDays;

        @InterfaceC65349Pkn("red_dot_second_reshow_days")
        public final long redDotSecondReshowDays;

        @InterfaceC65349Pkn("red_dot_show_days")
        public final int redDotShowAfterDays;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public StickerConsumptionImprSettingModel() {
            /*
                r10 = this;
                r1 = 0
                r4 = 0
                r8 = 31
                r9 = 0
                r0 = r10
                r2 = r1
                r3 = r1
                r6 = r4
                r0.<init>(r1, r2, r3, r4, r6, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.service.experiment.IMStickerConsumptionImprSetting.StickerConsumptionImprSettingModel.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StickerConsumptionImprSettingModel)) {
                return false;
            }
            StickerConsumptionImprSettingModel stickerConsumptionImprSettingModel = (StickerConsumptionImprSettingModel) obj;
            return this.redDotShowAfterDays == stickerConsumptionImprSettingModel.redDotShowAfterDays && this.redDotHideAfterDays == stickerConsumptionImprSettingModel.redDotHideAfterDays && this.redDotFirstReshowDays == stickerConsumptionImprSettingModel.redDotFirstReshowDays && this.redDotSecondReshowDays == stickerConsumptionImprSettingModel.redDotSecondReshowDays && this.popularStickerCacheExpHours == stickerConsumptionImprSettingModel.popularStickerCacheExpHours;
        }

        public final int hashCode() {
            return C16880lQ.LLJIJIL(this.popularStickerCacheExpHours) + JBR.LIZJ(this.redDotSecondReshowDays, ((((this.redDotShowAfterDays * 31) + this.redDotHideAfterDays) * 31) + this.redDotFirstReshowDays) * 31, 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("StickerConsumptionImprSettingModel(redDotShowAfterDays=");
            LIZ.append(this.redDotShowAfterDays);
            LIZ.append(", redDotHideAfterDays=");
            LIZ.append(this.redDotHideAfterDays);
            LIZ.append(", redDotFirstReshowDays=");
            LIZ.append(this.redDotFirstReshowDays);
            LIZ.append(", redDotSecondReshowDays=");
            LIZ.append(this.redDotSecondReshowDays);
            LIZ.append(", popularStickerCacheExpHours=");
            return C47135Ieh.LIZIZ(LIZ, this.popularStickerCacheExpHours, ')', LIZ);
        }

        public StickerConsumptionImprSettingModel(int i, int i2, int i3, long j, long j2) {
            this.redDotShowAfterDays = i;
            this.redDotHideAfterDays = i2;
            this.redDotFirstReshowDays = i3;
            this.redDotSecondReshowDays = j;
            this.popularStickerCacheExpHours = j2;
        }

        public /* synthetic */ StickerConsumptionImprSettingModel(int i, int i2, int i3, long j, long j2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 7 : i, (i4 & 2) != 0 ? 2 : i2, (i4 & 4) != 0 ? 10 : i3, (i4 & 8) != 0 ? 30L : j, (i4 & 16) != 0 ? 24L : j2);
        }
    }

    static {
        int i = 0;
        long j = 0;
        LIZIZ = new StickerConsumptionImprSettingModel(i, i, i, j, j, 31, null);
    }

    public static StickerConsumptionImprSettingModel LIZ() {
        return (StickerConsumptionImprSettingModel) LIZJ.getValue();
    }
}
