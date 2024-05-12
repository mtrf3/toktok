package com.ss.android.ugc.aweme.prop.experiment;

import X.C221108m2;
import X.C62822Ol8;
import X.C74221TAz;
import X.E0W;
import X.IJV;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class PropDetailTwoNetworkCallConcurrent {
    public static final PropDetailTwoNetworkCallConcurrentConfig LIZ;
    public static final boolean LIZIZ;

    /* loaded from: classes7.dex */
    public static final class PropDetailTwoNetworkCallConcurrentConfig {

        @InterfaceC65349Pkn("featureON")
        public final boolean featureON;

        @InterfaceC65349Pkn("deviceScoreMin")
        public final float minScore;

        public PropDetailTwoNetworkCallConcurrentConfig() {
            this(false, 0.0f, 3, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PropDetailTwoNetworkCallConcurrentConfig)) {
                return false;
            }
            PropDetailTwoNetworkCallConcurrentConfig propDetailTwoNetworkCallConcurrentConfig = (PropDetailTwoNetworkCallConcurrentConfig) obj;
            return this.featureON == propDetailTwoNetworkCallConcurrentConfig.featureON && Float.compare(this.minScore, propDetailTwoNetworkCallConcurrentConfig.minScore) == 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        public final int hashCode() {
            boolean z = this.featureON;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return Float.floatToIntBits(this.minScore) + (r0 * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PropDetailTwoNetworkCallConcurrentConfig(featureON=");
            LIZ.append(this.featureON);
            LIZ.append(", minScore=");
            return C74221TAz.LIZLLL(LIZ, this.minScore, ')', LIZ);
        }

        public PropDetailTwoNetworkCallConcurrentConfig(boolean z, float f) {
            this.featureON = z;
            this.minScore = f;
        }

        public /* synthetic */ PropDetailTwoNetworkCallConcurrentConfig(boolean z, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 8.0f : f);
        }
    }

    static {
        boolean z = false;
        LIZ = new PropDetailTwoNetworkCallConcurrentConfig(z, 0.0f, 3, null);
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(E0W.LJLIL);
        if (((PropDetailTwoNetworkCallConcurrentConfig) LIZIZ2.getValue()).featureON && IJV.LIZ() >= ((PropDetailTwoNetworkCallConcurrentConfig) LIZIZ2.getValue()).minScore) {
            z = true;
        }
        LIZIZ = z;
    }
}
