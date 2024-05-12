package com.ss.android.ugc.aweme.poi.experiment;

import X.FFL;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class NearbyPreloadGeckoExperiment {
    public static final NearbyPreloadGeckoConfig LIZ;

    /* loaded from: classes10.dex */
    public static final class NearbyPreloadGeckoConfig {

        @InterfaceC65349Pkn("strategy")
        public final int strategy;

        @InterfaceC65349Pkn("sub_strategy")
        public final int subStrategy;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public NearbyPreloadGeckoConfig() {
            /*
                r3 = this;
                r2 = 3
                r1 = 0
                r0 = 0
                r3.<init>(r0, r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.experiment.NearbyPreloadGeckoExperiment.NearbyPreloadGeckoConfig.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NearbyPreloadGeckoConfig)) {
                return false;
            }
            NearbyPreloadGeckoConfig nearbyPreloadGeckoConfig = (NearbyPreloadGeckoConfig) obj;
            return this.strategy == nearbyPreloadGeckoConfig.strategy && this.subStrategy == nearbyPreloadGeckoConfig.subStrategy;
        }

        public final int hashCode() {
            return (this.strategy * 31) + this.subStrategy;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("NearbyPreloadGeckoConfig(strategy=");
            LIZ.append(this.strategy);
            LIZ.append(", subStrategy=");
            return b0.LIZJ(LIZ, this.subStrategy, ')', LIZ);
        }

        public NearbyPreloadGeckoConfig(int i, int i2) {
            this.strategy = i;
            this.subStrategy = i2;
        }

        public /* synthetic */ NearbyPreloadGeckoConfig(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
        }
    }

    static {
        int i = 0;
        LIZ = new NearbyPreloadGeckoConfig(i, i, 3, null);
    }

    public static NearbyPreloadGeckoConfig LIZ() {
        FFL LJIIIZ = FFL.LJIIIZ();
        NearbyPreloadGeckoConfig nearbyPreloadGeckoConfig = LIZ;
        LJIIIZ.getClass();
        NearbyPreloadGeckoConfig nearbyPreloadGeckoConfig2 = (NearbyPreloadGeckoConfig) FFL.LJIJ(false, "gecko_sync_nearby", 31744, NearbyPreloadGeckoConfig.class, nearbyPreloadGeckoConfig);
        if (nearbyPreloadGeckoConfig2 == null) {
            return nearbyPreloadGeckoConfig;
        }
        return nearbyPreloadGeckoConfig2;
    }
}
