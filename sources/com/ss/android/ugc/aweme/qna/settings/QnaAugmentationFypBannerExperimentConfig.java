package com.ss.android.ugc.aweme.qna.settings;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class QnaAugmentationFypBannerExperimentConfig extends F9E {

    @InterfaceC65349Pkn("qna_experiment_ver")
    public final int qna_experiment_ver;

    @InterfaceC65349Pkn("v1_lower_bound")
    public final int v1_lower_bound;

    @InterfaceC65349Pkn("v1_upper_bound")
    public final int v1_upper_bound;

    @InterfaceC65349Pkn("v2_lower_bound")
    public final int v2_lower_bound;

    @InterfaceC65349Pkn("v2_upper_bound")
    public final int v2_upper_bound;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public QnaAugmentationFypBannerExperimentConfig() {
        /*
            r8 = this;
            r1 = 0
            r6 = 31
            r7 = 0
            r0 = r8
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.qna.settings.QnaAugmentationFypBannerExperimentConfig.<init>():void");
    }

    public static /* synthetic */ QnaAugmentationFypBannerExperimentConfig copy$default(QnaAugmentationFypBannerExperimentConfig qnaAugmentationFypBannerExperimentConfig, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = qnaAugmentationFypBannerExperimentConfig.qna_experiment_ver;
        }
        if ((i6 & 2) != 0) {
            i2 = qnaAugmentationFypBannerExperimentConfig.v1_upper_bound;
        }
        if ((i6 & 4) != 0) {
            i3 = qnaAugmentationFypBannerExperimentConfig.v1_lower_bound;
        }
        if ((i6 & 8) != 0) {
            i4 = qnaAugmentationFypBannerExperimentConfig.v2_upper_bound;
        }
        if ((i6 & 16) != 0) {
            i5 = qnaAugmentationFypBannerExperimentConfig.v2_lower_bound;
        }
        return qnaAugmentationFypBannerExperimentConfig.copy(i, i2, i3, i4, i5);
    }

    public final QnaAugmentationFypBannerExperimentConfig copy(int i, int i2, int i3, int i4, int i5) {
        return new QnaAugmentationFypBannerExperimentConfig(i, i2, i3, i4, i5);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.qna_experiment_ver), Integer.valueOf(this.v1_upper_bound), Integer.valueOf(this.v1_lower_bound), Integer.valueOf(this.v2_upper_bound), Integer.valueOf(this.v2_lower_bound)};
    }

    public final int getQna_experiment_ver() {
        return this.qna_experiment_ver;
    }

    public final int getV1_lower_bound() {
        return this.v1_lower_bound;
    }

    public final int getV1_upper_bound() {
        return this.v1_upper_bound;
    }

    public final int getV2_lower_bound() {
        return this.v2_lower_bound;
    }

    public final int getV2_upper_bound() {
        return this.v2_upper_bound;
    }

    public QnaAugmentationFypBannerExperimentConfig(int i, int i2, int i3, int i4, int i5) {
        this.qna_experiment_ver = i;
        this.v1_upper_bound = i2;
        this.v1_lower_bound = i3;
        this.v2_upper_bound = i4;
        this.v2_lower_bound = i5;
    }

    public /* synthetic */ QnaAugmentationFypBannerExperimentConfig(int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? -1 : i2, (i6 & 4) != 0 ? -1 : i3, (i6 & 8) != 0 ? -1 : i4, (i6 & 16) == 0 ? i5 : -1);
    }
}
