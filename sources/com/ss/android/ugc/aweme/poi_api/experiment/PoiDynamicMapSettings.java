package com.ss.android.ugc.aweme.poi_api.experiment;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class PoiDynamicMapSettings {
    public static final PoiDynamicMapSettings LIZ = new PoiDynamicMapSettings();

    /* loaded from: classes4.dex */
    public static final class Config {

        @InterfaceC65349Pkn("enable_dynamic_map")
        public final boolean enable;

        public Config() {
            this(false, 1, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Config) && this.enable == ((Config) obj).enable;
        }

        public final int hashCode() {
            boolean z = this.enable;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Config(enable=");
            return C48339Iy7.LIZJ(LIZ, this.enable, ')', LIZ);
        }

        public Config(boolean z) {
            this.enable = z;
        }

        public /* synthetic */ Config(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }

    public static final boolean LIZ() {
        LIZ.getClass();
        Config config = (Config) SettingsManager.LIZLLL().LJIIIIZZ("poi_dynamic_map_config", Config.class, null);
        if (config == null || !config.enable) {
            return false;
        }
        return true;
    }
}
