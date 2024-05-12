package com.ss.android.ugc.aweme.experiment;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaidContentImageSettings {
    public static final PaidContentImageSettings LIZ = new PaidContentImageSettings();
    public static final CouldntLoadImageSettings LIZIZ = new CouldntLoadImageSettings(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);

    /* loaded from: classes5.dex */
    public static final class Image {

        @InterfaceC65349Pkn("dark")
        public final String dark;

        @InterfaceC65349Pkn("light")
        public final String light;

        /* JADX WARN: Multi-variable type inference failed */
        public Image() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Image)) {
                return false;
            }
            Image image = (Image) obj;
            return o.LJ(this.light, image.light) && o.LJ(this.dark, image.dark);
        }

        public final int hashCode() {
            return this.dark.hashCode() + (this.light.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Image(light=");
            LIZ.append(this.light);
            LIZ.append(", dark=");
            return q.LIZIZ(LIZ, this.dark, ')', LIZ);
        }

        public Image(String light, String dark) {
            o.LJIIIZ(light, "light");
            o.LJIIIZ(dark, "dark");
            this.light = light;
            this.dark = dark;
        }

        public /* synthetic */ Image(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
        }
    }

    public static CouldntLoadImageSettings LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        CouldntLoadImageSettings couldntLoadImageSettings = LIZIZ;
        CouldntLoadImageSettings couldntLoadImageSettings2 = (CouldntLoadImageSettings) LIZLLL.LJIIIIZZ("paid_content_settings", CouldntLoadImageSettings.class, couldntLoadImageSettings);
        if (couldntLoadImageSettings2 == null) {
            return couldntLoadImageSettings;
        }
        return couldntLoadImageSettings2;
    }

    /* loaded from: classes5.dex */
    public static final class CouldntLoadImageSettings {

        @InterfaceC65349Pkn("couldnt_load_img_url")
        public final Image couldntLoadImage;

        @InterfaceC65349Pkn("estimated_earnings_img_url")
        public final Image estimatedEarningsImage;

        @InterfaceC65349Pkn(alternate = {"guidence_to_create_url"}, value = "guidance_to_create_url")
        public final Image sellingSeriesGuidanceImage;

        @InterfaceC65349Pkn("series_creation_success_img_url")
        public final Image seriesCreationSuccessImage;

        @InterfaceC65349Pkn("promote_horn_img_url")
        public final Image seriesPromoteDialogImage;

        /* JADX WARN: Multi-variable type inference failed */
        public CouldntLoadImageSettings() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CouldntLoadImageSettings)) {
                return false;
            }
            CouldntLoadImageSettings couldntLoadImageSettings = (CouldntLoadImageSettings) obj;
            return o.LJ(this.couldntLoadImage, couldntLoadImageSettings.couldntLoadImage) && o.LJ(this.sellingSeriesGuidanceImage, couldntLoadImageSettings.sellingSeriesGuidanceImage) && o.LJ(this.estimatedEarningsImage, couldntLoadImageSettings.estimatedEarningsImage) && o.LJ(this.seriesCreationSuccessImage, couldntLoadImageSettings.seriesCreationSuccessImage) && o.LJ(this.seriesPromoteDialogImage, couldntLoadImageSettings.seriesPromoteDialogImage);
        }

        public final int hashCode() {
            return this.seriesPromoteDialogImage.hashCode() + ((this.seriesCreationSuccessImage.hashCode() + ((this.estimatedEarningsImage.hashCode() + ((this.sellingSeriesGuidanceImage.hashCode() + (this.couldntLoadImage.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CouldntLoadImageSettings(couldntLoadImage=");
            LIZ.append(this.couldntLoadImage);
            LIZ.append(", sellingSeriesGuidanceImage=");
            LIZ.append(this.sellingSeriesGuidanceImage);
            LIZ.append(", estimatedEarningsImage=");
            LIZ.append(this.estimatedEarningsImage);
            LIZ.append(", seriesCreationSuccessImage=");
            LIZ.append(this.seriesCreationSuccessImage);
            LIZ.append(", seriesPromoteDialogImage=");
            LIZ.append(this.seriesPromoteDialogImage);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public CouldntLoadImageSettings(Image couldntLoadImage, Image sellingSeriesGuidanceImage, Image estimatedEarningsImage, Image seriesCreationSuccessImage, Image seriesPromoteDialogImage) {
            o.LJIIIZ(couldntLoadImage, "couldntLoadImage");
            o.LJIIIZ(sellingSeriesGuidanceImage, "sellingSeriesGuidanceImage");
            o.LJIIIZ(estimatedEarningsImage, "estimatedEarningsImage");
            o.LJIIIZ(seriesCreationSuccessImage, "seriesCreationSuccessImage");
            o.LJIIIZ(seriesPromoteDialogImage, "seriesPromoteDialogImage");
            this.couldntLoadImage = couldntLoadImage;
            this.sellingSeriesGuidanceImage = sellingSeriesGuidanceImage;
            this.estimatedEarningsImage = estimatedEarningsImage;
            this.seriesCreationSuccessImage = seriesCreationSuccessImage;
            this.seriesPromoteDialogImage = seriesPromoteDialogImage;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ CouldntLoadImageSettings(com.ss.android.ugc.aweme.experiment.PaidContentImageSettings.Image r4, com.ss.android.ugc.aweme.experiment.PaidContentImageSettings.Image r5, com.ss.android.ugc.aweme.experiment.PaidContentImageSettings.Image r6, com.ss.android.ugc.aweme.experiment.PaidContentImageSettings.Image r7, com.ss.android.ugc.aweme.experiment.PaidContentImageSettings.Image r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r3 = this;
                r0 = r9 & 1
                r2 = 3
                r1 = 0
                if (r0 == 0) goto Lb
                com.ss.android.ugc.aweme.experiment.PaidContentImageSettings$Image r4 = new com.ss.android.ugc.aweme.experiment.PaidContentImageSettings$Image
                r4.<init>(r1, r1, r2, r1)
            Lb:
                r0 = r9 & 2
                if (r0 == 0) goto L14
                com.ss.android.ugc.aweme.experiment.PaidContentImageSettings$Image r5 = new com.ss.android.ugc.aweme.experiment.PaidContentImageSettings$Image
                r5.<init>(r1, r1, r2, r1)
            L14:
                r0 = r9 & 4
                if (r0 == 0) goto L1d
                com.ss.android.ugc.aweme.experiment.PaidContentImageSettings$Image r6 = new com.ss.android.ugc.aweme.experiment.PaidContentImageSettings$Image
                r6.<init>(r1, r1, r2, r1)
            L1d:
                r0 = r9 & 8
                if (r0 == 0) goto L26
                com.ss.android.ugc.aweme.experiment.PaidContentImageSettings$Image r7 = new com.ss.android.ugc.aweme.experiment.PaidContentImageSettings$Image
                r7.<init>(r1, r1, r2, r1)
            L26:
                r0 = r9 & 16
                if (r0 == 0) goto L2f
                com.ss.android.ugc.aweme.experiment.PaidContentImageSettings$Image r8 = new com.ss.android.ugc.aweme.experiment.PaidContentImageSettings$Image
                r8.<init>(r1, r1, r2, r1)
            L2f:
                r3.<init>(r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.experiment.PaidContentImageSettings.CouldntLoadImageSettings.<init>(com.ss.android.ugc.aweme.experiment.PaidContentImageSettings$Image, com.ss.android.ugc.aweme.experiment.PaidContentImageSettings$Image, com.ss.android.ugc.aweme.experiment.PaidContentImageSettings$Image, com.ss.android.ugc.aweme.experiment.PaidContentImageSettings$Image, com.ss.android.ugc.aweme.experiment.PaidContentImageSettings$Image, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
