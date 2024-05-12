package com.ss.android.ugc.aweme.friendstab.experiment;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;

/* loaded from: classes10.dex */
public final class FriendsFeedEmptyRetrySetting {
    public static final FriendsTabEmptyRetryModel LIZ = new FriendsTabEmptyRetryModel(1, 3);

    /* loaded from: classes10.dex */
    public static final class FriendsTabEmptyRetryModel {

        @InterfaceC65349Pkn("tt_friends_feed_loadmore_empty_retry_times_android")
        public final int loadMoreRetryTimes;

        @InterfaceC65349Pkn("tt_friends_feed_refresh_empty_retry_times_android")
        public final int refreshRetryTimes;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FriendsTabEmptyRetryModel)) {
                return false;
            }
            FriendsTabEmptyRetryModel friendsTabEmptyRetryModel = (FriendsTabEmptyRetryModel) obj;
            return this.refreshRetryTimes == friendsTabEmptyRetryModel.refreshRetryTimes && this.loadMoreRetryTimes == friendsTabEmptyRetryModel.loadMoreRetryTimes;
        }

        public final int hashCode() {
            return (this.refreshRetryTimes * 31) + this.loadMoreRetryTimes;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FriendsTabEmptyRetryModel(refreshRetryTimes=");
            LIZ.append(this.refreshRetryTimes);
            LIZ.append(", loadMoreRetryTimes=");
            return b0.LIZJ(LIZ, this.loadMoreRetryTimes, ')', LIZ);
        }

        public FriendsTabEmptyRetryModel(int i, int i2) {
            this.refreshRetryTimes = i;
            this.loadMoreRetryTimes = i2;
        }
    }
}
