package com.ss.android.ugc.aweme.profile.experiment;

import X.C16880lQ;
import X.C47135Ieh;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;

/* loaded from: classes5.dex */
public final class HomepageRecommendSetting {
    public static final HomepageRecommendConfigModel LIZ;

    /* loaded from: classes5.dex */
    public static final class HomepageRecommendConfigModel {

        @InterfaceC65349Pkn("low_follower_bound")
        public final long lowFollowerBound;

        @InterfaceC65349Pkn("low_muf_bound")
        public final long lowMufBound;

        @InterfaceC65349Pkn("x_days")
        public final long xDays;

        @InterfaceC65349Pkn("y_hide")
        public final long yHide;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HomepageRecommendConfigModel)) {
                return false;
            }
            HomepageRecommendConfigModel homepageRecommendConfigModel = (HomepageRecommendConfigModel) obj;
            return this.lowFollowerBound == homepageRecommendConfigModel.lowFollowerBound && this.xDays == homepageRecommendConfigModel.xDays && this.yHide == homepageRecommendConfigModel.yHide && this.lowMufBound == homepageRecommendConfigModel.lowMufBound;
        }

        public final int hashCode() {
            return C16880lQ.LLJIJIL(this.lowMufBound) + JBR.LIZJ(this.yHide, JBR.LIZJ(this.xDays, C16880lQ.LLJIJIL(this.lowFollowerBound) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("HomepageRecommendConfigModel(lowFollowerBound=");
            LIZ.append(this.lowFollowerBound);
            LIZ.append(", xDays=");
            LIZ.append(this.xDays);
            LIZ.append(", yHide=");
            LIZ.append(this.yHide);
            LIZ.append(", lowMufBound=");
            return C47135Ieh.LIZIZ(LIZ, this.lowMufBound, ')', LIZ);
        }

        public HomepageRecommendConfigModel(long j, long j2, long j3, long j4) {
            this.lowFollowerBound = j;
            this.xDays = j2;
            this.yHide = j3;
            this.lowMufBound = j4;
        }
    }

    static {
        new HomepageRecommendSetting();
        LIZ = new HomepageRecommendConfigModel(1000L, 14L, 3L, 5L);
    }

    public static final HomepageRecommendConfigModel LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        HomepageRecommendConfigModel homepageRecommendConfigModel = LIZ;
        HomepageRecommendConfigModel homepageRecommendConfigModel2 = (HomepageRecommendConfigModel) LIZLLL.LJIIIIZZ("my_profile_recommend_card_config", HomepageRecommendConfigModel.class, homepageRecommendConfigModel);
        if (homepageRecommendConfigModel2 == null) {
            return homepageRecommendConfigModel;
        }
        return homepageRecommendConfigModel2;
    }
}
