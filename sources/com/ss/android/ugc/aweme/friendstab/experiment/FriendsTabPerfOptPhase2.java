package com.ss.android.ugc.aweme.friendstab.experiment;

import X.C221108m2;
import X.C48339Iy7;
import X.C62822Ol8;
import X.InterfaceC65349Pkn;
import X.LG3;
import X.LX1;
import X.X1D;

/* loaded from: classes10.dex */
public final class FriendsTabPerfOptPhase2 {
    public static final FriendsTabPerfOptConfig LIZ = new FriendsTabPerfOptConfig(false, false, false);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(LG3.LJLIL);

    /* loaded from: classes4.dex */
    public static final class FriendsTabPerfOptConfig {

        @InterfaceC65349Pkn("fetch_feed_opt")
        public final boolean fetchFeedOpt;

        @InterfaceC65349Pkn("resp_to_first_frame_opt")
        public final boolean respToFirstFrameOpt;

        @InterfaceC65349Pkn("view_inflate_opt")
        public final boolean viewInflateOpt;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FriendsTabPerfOptConfig)) {
                return false;
            }
            FriendsTabPerfOptConfig friendsTabPerfOptConfig = (FriendsTabPerfOptConfig) obj;
            return this.viewInflateOpt == friendsTabPerfOptConfig.viewInflateOpt && this.fetchFeedOpt == friendsTabPerfOptConfig.fetchFeedOpt && this.respToFirstFrameOpt == friendsTabPerfOptConfig.respToFirstFrameOpt;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public final int hashCode() {
            boolean z = this.viewInflateOpt;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            ?? r02 = this.fetchFeedOpt;
            int i2 = r02;
            if (r02 != 0) {
                i2 = 1;
            }
            return ((i + i2) * 31) + (this.respToFirstFrameOpt ? 1 : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FriendsTabPerfOptConfig(viewInflateOpt=");
            LIZ.append(this.viewInflateOpt);
            LIZ.append(", fetchFeedOpt=");
            LIZ.append(this.fetchFeedOpt);
            LIZ.append(", respToFirstFrameOpt=");
            return C48339Iy7.LIZJ(LIZ, this.respToFirstFrameOpt, ')', LIZ);
        }

        public FriendsTabPerfOptConfig(boolean z, boolean z2, boolean z3) {
            this.viewInflateOpt = z;
            this.fetchFeedOpt = z2;
            this.respToFirstFrameOpt = z3;
        }
    }

    public static FriendsTabPerfOptConfig LIZ() {
        return (FriendsTabPerfOptConfig) LIZIZ.getValue();
    }

    public static boolean LIZIZ() {
        if (LIZ().respToFirstFrameOpt && !LX1.LJIILIIL) {
            return true;
        }
        return false;
    }
}
