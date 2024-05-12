package com.ss.android.ugc.aweme.settings;

import X.FFL;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PublishLandingNearbyRevisitSettings {
    public static final Config LIZ = new Config(2, 30);

    /* loaded from: classes7.dex */
    public static final class Config {

        @InterfaceC65349Pkn("expire_days")
        public final Integer expireDays;

        @InterfaceC65349Pkn("insert_position")
        public final Integer insertPosition;

        /* JADX WARN: Multi-variable type inference failed */
        public Config() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return o.LJ(this.insertPosition, config.insertPosition) && o.LJ(this.expireDays, config.expireDays);
        }

        public final int hashCode() {
            Integer num = this.insertPosition;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.expireDays;
            return hashCode + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Config(insertPosition=");
            LIZ.append(this.insertPosition);
            LIZ.append(", expireDays=");
            return s0.LIZJ(LIZ, this.expireDays, ')', LIZ);
        }

        public Config(Integer num, Integer num2) {
            this.insertPosition = num;
            this.expireDays = num2;
        }

        public /* synthetic */ Config(Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
        }
    }

    public static Config LIZ() {
        FFL LJIIIZ = FFL.LJIIIZ();
        Config config = LIZ;
        LJIIIZ.getClass();
        Config config2 = (Config) FFL.LJIJ(false, "publish_landing_nearby_revisit", 31744, Config.class, config);
        if (config2 == null) {
            return config;
        }
        return config2;
    }
}
