package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.C78920UyC;
import X.FFL;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EcPdpSlowFuncOpt {
    public static final Config LIZ = new Config(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);

    /* loaded from: classes7.dex */
    public static final class Config {

        @InterfaceC65349Pkn("enable_common_opt")
        public final Boolean enableCommonOpt;

        @InterfaceC65349Pkn("enable_lighten_display")
        public final Boolean enableLightenDisplay;

        @InterfaceC65349Pkn("enable_log_opt")
        public final Boolean enableLogOpt;

        @InterfaceC65349Pkn("enable_xml_opt")
        public final Boolean enableXmlOpt;

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
            return o.LJ(this.enableCommonOpt, config.enableCommonOpt) && o.LJ(this.enableXmlOpt, config.enableXmlOpt) && o.LJ(this.enableLogOpt, config.enableLogOpt) && o.LJ(this.enableLightenDisplay, config.enableLightenDisplay);
        }

        public final int hashCode() {
            Boolean bool = this.enableCommonOpt;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.enableXmlOpt;
            int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            Boolean bool3 = this.enableLogOpt;
            int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            Boolean bool4 = this.enableLightenDisplay;
            return hashCode3 + (bool4 != null ? bool4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Config(enableCommonOpt=");
            LIZ.append(this.enableCommonOpt);
            LIZ.append(", enableXmlOpt=");
            LIZ.append(this.enableXmlOpt);
            LIZ.append(", enableLogOpt=");
            LIZ.append(this.enableLogOpt);
            LIZ.append(", enableLightenDisplay=");
            return C78920UyC.LIZIZ(LIZ, this.enableLightenDisplay, ')', LIZ);
        }

        public Config(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
            this.enableCommonOpt = bool;
            this.enableXmlOpt = bool2;
            this.enableLogOpt = bool3;
            this.enableLightenDisplay = bool4;
        }

        public /* synthetic */ Config(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? Boolean.FALSE : bool2, (i & 4) != 0 ? Boolean.FALSE : bool3, (i & 8) != 0 ? Boolean.FALSE : bool4);
        }
    }

    public static Config LIZ() {
        FFL LJIIIZ = FFL.LJIIIZ();
        Config config = LIZ;
        LJIIIZ.getClass();
        Config config2 = (Config) FFL.LJIJ(true, "ec_pdp_slow_func_opt", 31744, Config.class, config);
        if (config2 == null) {
            return config;
        }
        return config2;
    }

    public static boolean LIZIZ() {
        return o.LJ(LIZ().enableLogOpt, Boolean.TRUE);
    }

    public static boolean LIZJ() {
        return o.LJ(LIZ().enableXmlOpt, Boolean.TRUE);
    }
}
