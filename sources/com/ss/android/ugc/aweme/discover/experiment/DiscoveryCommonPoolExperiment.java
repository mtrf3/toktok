package com.ss.android.ugc.aweme.discover.experiment;

import X.C221108m2;
import X.C62822Ol8;
import X.InterfaceC65349Pkn;
import X.MJD;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class DiscoveryCommonPoolExperiment {
    public static final DiscoveryCommonPoolExperimentConfig LIZ = new DiscoveryCommonPoolExperimentConfig(false, 0);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(MJD.LJLIL);

    /* loaded from: classes10.dex */
    public static final class DiscoveryCommonPoolExperimentConfig {

        @InterfaceC65349Pkn("enable")
        public final boolean enable;

        @InterfaceC65349Pkn("pool_size")
        public final int poolSize;

        /* JADX WARN: Multi-variable type inference failed */
        public DiscoveryCommonPoolExperimentConfig() {
            this(false, 0 == true ? 1 : 0, 3, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DiscoveryCommonPoolExperimentConfig)) {
                return false;
            }
            DiscoveryCommonPoolExperimentConfig discoveryCommonPoolExperimentConfig = (DiscoveryCommonPoolExperimentConfig) obj;
            return this.enable == discoveryCommonPoolExperimentConfig.enable && this.poolSize == discoveryCommonPoolExperimentConfig.poolSize;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        public final int hashCode() {
            boolean z = this.enable;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (r0 * 31) + this.poolSize;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DiscoveryCommonPoolExperimentConfig(enable=");
            LIZ.append(this.enable);
            LIZ.append(", poolSize=");
            return b0.LIZJ(LIZ, this.poolSize, ')', LIZ);
        }

        public DiscoveryCommonPoolExperimentConfig(boolean z, int i) {
            this.enable = z;
            this.poolSize = i;
        }

        public /* synthetic */ DiscoveryCommonPoolExperimentConfig(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 16 : i);
        }
    }
}
