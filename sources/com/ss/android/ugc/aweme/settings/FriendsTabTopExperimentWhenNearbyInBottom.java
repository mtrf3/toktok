package com.ss.android.ugc.aweme.settings;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;

/* loaded from: classes7.dex */
public final class FriendsTabTopExperimentWhenNearbyInBottom {
    public static final FriendsTabTopExperimentWhenNearbyInBottom LIZ = new FriendsTabTopExperimentWhenNearbyInBottom();
    public static final NearbyFriendsTabTopConfig LIZIZ = new NearbyFriendsTabTopConfig(-1);

    /* loaded from: classes7.dex */
    public static final class NearbyFriendsTabTopConfig {

        @InterfaceC65349Pkn("index_on_the_top")
        public final int indexOnTop;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NearbyFriendsTabTopConfig) && this.indexOnTop == ((NearbyFriendsTabTopConfig) obj).indexOnTop;
        }

        public final int hashCode() {
            return this.indexOnTop;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("NearbyFriendsTabTopConfig(indexOnTop=");
            return b0.LIZJ(LIZ, this.indexOnTop, ')', LIZ);
        }

        public NearbyFriendsTabTopConfig(int i) {
            this.indexOnTop = i;
        }
    }
}
