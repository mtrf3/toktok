package com.ss.android.ugc.aweme.poi.experiment;

import X.FFL;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiServerConfigSettings {
    public static final Config LIZ = new Config(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);

    /* loaded from: classes4.dex */
    public static final class Config {

        @InterfaceC65349Pkn("poi_consumption_reverse")
        public final Integer poiConsumptionReverse;

        @InterfaceC65349Pkn("publish_landing_nearby")
        public final Integer publishLandingNearby;

        @InterfaceC65349Pkn("region_poi_discovery")
        public final Integer regionPoiDiscovery;

        @InterfaceC65349Pkn("region_poi_discovery_gps_freq")
        public final Integer regionPoiDiscoveryGpsFreq;

        /* JADX WARN: Multi-variable type inference failed */
        public Config() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return o.LJ(this.poiConsumptionReverse, config.poiConsumptionReverse) && o.LJ(this.publishLandingNearby, config.publishLandingNearby) && o.LJ(this.regionPoiDiscovery, config.regionPoiDiscovery) && o.LJ(this.regionPoiDiscoveryGpsFreq, config.regionPoiDiscoveryGpsFreq);
        }

        public final int hashCode() {
            Integer num = this.poiConsumptionReverse;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.publishLandingNearby;
            int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.regionPoiDiscovery;
            int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.regionPoiDiscoveryGpsFreq;
            return hashCode3 + (num4 != null ? num4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Config(poiConsumptionReverse=");
            LIZ.append(this.poiConsumptionReverse);
            LIZ.append(", publishLandingNearby=");
            LIZ.append(this.publishLandingNearby);
            LIZ.append(", regionPoiDiscovery=");
            LIZ.append(this.regionPoiDiscovery);
            LIZ.append(", regionPoiDiscoveryGpsFreq=");
            return s0.LIZJ(LIZ, this.regionPoiDiscoveryGpsFreq, ')', LIZ);
        }

        public Config(Integer num, Integer num2, Integer num3, Integer num4) {
            this.poiConsumptionReverse = num;
            this.publishLandingNearby = num2;
            this.regionPoiDiscovery = num3;
            this.regionPoiDiscoveryGpsFreq = num4;
        }

        public /* synthetic */ Config(Integer num, Integer num2, Integer num3, Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? 0 : num2, (i & 4) != 0 ? 0 : num3, (i & 8) != 0 ? 0 : num4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Config LIZ() {
        FFL LJIIIZ = FFL.LJIIIZ();
        Config config = LIZ;
        LJIIIZ.getClass();
        Config config2 = (Config) FFL.LJIJ(false, "poi_core", 31744, Config.class, config);
        if (config2 == null) {
            return new Config(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
        }
        return config2;
    }
}
