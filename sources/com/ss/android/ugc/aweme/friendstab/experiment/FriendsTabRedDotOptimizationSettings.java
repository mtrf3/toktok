package com.ss.android.ugc.aweme.friendstab.experiment;

import X.C16880lQ;
import X.C47135Ieh;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;

/* loaded from: classes10.dex */
public final class FriendsTabRedDotOptimizationSettings {
    public static final FriendsTabRedDotOptimizationModel LIZ = new FriendsTabRedDotOptimizationModel(500, 10800, 600);

    /* loaded from: classes10.dex */
    public static final class FriendsTabRedDotOptimizationModel {

        @InterfaceC65349Pkn("friends_tab_feed_played_items_record_expire_time_seconds")
        public final long expireTimeSeconds;

        @InterfaceC65349Pkn("friends_tab_report_played_items_count_limit")
        public final long playedItemsCountLimit;

        @InterfaceC65349Pkn("friends_tab_red_dot_polling_interval_seconds")
        public final long pollingIntervalSeconds;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FriendsTabRedDotOptimizationModel)) {
                return false;
            }
            FriendsTabRedDotOptimizationModel friendsTabRedDotOptimizationModel = (FriendsTabRedDotOptimizationModel) obj;
            return this.playedItemsCountLimit == friendsTabRedDotOptimizationModel.playedItemsCountLimit && this.expireTimeSeconds == friendsTabRedDotOptimizationModel.expireTimeSeconds && this.pollingIntervalSeconds == friendsTabRedDotOptimizationModel.pollingIntervalSeconds;
        }

        public final int hashCode() {
            return C16880lQ.LLJIJIL(this.pollingIntervalSeconds) + JBR.LIZJ(this.expireTimeSeconds, C16880lQ.LLJIJIL(this.playedItemsCountLimit) * 31, 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FriendsTabRedDotOptimizationModel(playedItemsCountLimit=");
            LIZ.append(this.playedItemsCountLimit);
            LIZ.append(", expireTimeSeconds=");
            LIZ.append(this.expireTimeSeconds);
            LIZ.append(", pollingIntervalSeconds=");
            return C47135Ieh.LIZIZ(LIZ, this.pollingIntervalSeconds, ')', LIZ);
        }

        public FriendsTabRedDotOptimizationModel(long j, long j2, long j3) {
            this.playedItemsCountLimit = j;
            this.expireTimeSeconds = j2;
            this.pollingIntervalSeconds = j3;
        }
    }

    public static final FriendsTabRedDotOptimizationModel LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        FriendsTabRedDotOptimizationModel friendsTabRedDotOptimizationModel = LIZ;
        FriendsTabRedDotOptimizationModel friendsTabRedDotOptimizationModel2 = (FriendsTabRedDotOptimizationModel) LIZLLL.LJIIIIZZ("friends_tab_red_dot_optimization", FriendsTabRedDotOptimizationModel.class, friendsTabRedDotOptimizationModel);
        if (friendsTabRedDotOptimizationModel2 == null) {
            return friendsTabRedDotOptimizationModel;
        }
        return friendsTabRedDotOptimizationModel2;
    }
}
