package com.ss.android.ugc.aweme.experiment;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;

/* loaded from: classes10.dex */
public final class FollowFeedPreloadExceedSetting {
    public static final FollowFeedPreloadExceedSettingModel LIZ = new FollowFeedPreloadExceedSettingModel(1800000, 7200000);

    /* loaded from: classes10.dex */
    public static final class FollowFeedPreloadExceedSettingModel {

        @InterfaceC65349Pkn("first_group")
        public final int firstGroup;

        @InterfaceC65349Pkn("second_group")
        public final int secondGroup;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FollowFeedPreloadExceedSettingModel)) {
                return false;
            }
            FollowFeedPreloadExceedSettingModel followFeedPreloadExceedSettingModel = (FollowFeedPreloadExceedSettingModel) obj;
            return this.firstGroup == followFeedPreloadExceedSettingModel.firstGroup && this.secondGroup == followFeedPreloadExceedSettingModel.secondGroup;
        }

        public final int hashCode() {
            return (this.firstGroup * 31) + this.secondGroup;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FollowFeedPreloadExceedSettingModel(firstGroup=");
            LIZ.append(this.firstGroup);
            LIZ.append(", secondGroup=");
            return b0.LIZJ(LIZ, this.secondGroup, ')', LIZ);
        }

        public FollowFeedPreloadExceedSettingModel(int i, int i2) {
            this.firstGroup = i;
            this.secondGroup = i2;
        }
    }
}
