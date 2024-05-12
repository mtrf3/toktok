package com.ss.android.ugc.aweme.friendstab.experiment;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;

/* loaded from: classes10.dex */
public final class FriendsTabPreloadStrategySettings {
    public static final FriendsTabPreloadStrategySettings LIZ = new FriendsTabPreloadStrategySettings();
    public static final FriendsTabPreloadStrategyModel LIZIZ = new FriendsTabPreloadStrategyModel(0, 1);

    /* loaded from: classes10.dex */
    public static final class FriendsTabPreloadStrategyModel {

        @InterfaceC65349Pkn("enable_compensate_on_foreground")
        public final int enableCompensateOnForeground;

        @InterfaceC65349Pkn("enable_polling_on_background")
        public final int enablePollingOnBackground;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FriendsTabPreloadStrategyModel)) {
                return false;
            }
            FriendsTabPreloadStrategyModel friendsTabPreloadStrategyModel = (FriendsTabPreloadStrategyModel) obj;
            return this.enablePollingOnBackground == friendsTabPreloadStrategyModel.enablePollingOnBackground && this.enableCompensateOnForeground == friendsTabPreloadStrategyModel.enableCompensateOnForeground;
        }

        public final int hashCode() {
            return (this.enablePollingOnBackground * 31) + this.enableCompensateOnForeground;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FriendsTabPreloadStrategyModel(enablePollingOnBackground=");
            LIZ.append(this.enablePollingOnBackground);
            LIZ.append(", enableCompensateOnForeground=");
            return b0.LIZJ(LIZ, this.enableCompensateOnForeground, ')', LIZ);
        }

        public FriendsTabPreloadStrategyModel(int i, int i2) {
            this.enablePollingOnBackground = i;
            this.enableCompensateOnForeground = i2;
        }
    }
}
