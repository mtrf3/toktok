package com.ss.android.ugc.aweme.profile.experiment;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import defpackage.b0;

/* loaded from: classes5.dex */
public final class NewFollowerNotificationSetting {
    public static final NewFollowerNotificationSettingOnProfileModel LIZ = new NewFollowerNotificationSettingOnProfileModel(90, 20);

    /* loaded from: classes5.dex */
    public static final class NewFollowerNotificationSettingOnProfileModel {

        @InterfaceC65349Pkn("unclick_times_threshold")
        public final int unclickTimesThreshold;

        @InterfaceC65349Pkn("without_notice_days_threshold")
        public final int withoutNoticeDaysThreshold;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewFollowerNotificationSettingOnProfileModel)) {
                return false;
            }
            NewFollowerNotificationSettingOnProfileModel newFollowerNotificationSettingOnProfileModel = (NewFollowerNotificationSettingOnProfileModel) obj;
            return this.withoutNoticeDaysThreshold == newFollowerNotificationSettingOnProfileModel.withoutNoticeDaysThreshold && this.unclickTimesThreshold == newFollowerNotificationSettingOnProfileModel.unclickTimesThreshold;
        }

        public final int hashCode() {
            return (this.withoutNoticeDaysThreshold * 31) + this.unclickTimesThreshold;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("NewFollowerNotificationSettingOnProfileModel(withoutNoticeDaysThreshold=");
            LIZ.append(this.withoutNoticeDaysThreshold);
            LIZ.append(", unclickTimesThreshold=");
            return b0.LIZJ(LIZ, this.unclickTimesThreshold, ')', LIZ);
        }

        public NewFollowerNotificationSettingOnProfileModel(int i, int i2) {
            this.withoutNoticeDaysThreshold = i;
            this.unclickTimesThreshold = i2;
        }
    }

    public static final NewFollowerNotificationSettingOnProfileModel LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        NewFollowerNotificationSettingOnProfileModel newFollowerNotificationSettingOnProfileModel = LIZ;
        NewFollowerNotificationSettingOnProfileModel newFollowerNotificationSettingOnProfileModel2 = (NewFollowerNotificationSettingOnProfileModel) LIZLLL.LJIIIIZZ("new_follower_notification_setting_on_profile", NewFollowerNotificationSettingOnProfileModel.class, newFollowerNotificationSettingOnProfileModel);
        if (newFollowerNotificationSettingOnProfileModel2 == null) {
            return newFollowerNotificationSettingOnProfileModel;
        }
        return newFollowerNotificationSettingOnProfileModel2;
    }
}
