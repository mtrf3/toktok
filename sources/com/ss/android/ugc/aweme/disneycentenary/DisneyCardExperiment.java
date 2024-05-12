package com.ss.android.ugc.aweme.disneycentenary;

import X.C48339Iy7;
import X.FFL;
import X.InterfaceC65349Pkn;
import X.LFH;
import X.X1D;

/* loaded from: classes10.dex */
public final class DisneyCardExperiment {
    public static final DisneyCardExperiment LIZ = new DisneyCardExperiment();
    public static final DisneyCardConfig LIZIZ = new DisneyCardConfig(false, false, false);

    /* loaded from: classes10.dex */
    public static final class DisneyCardConfig {

        @InterfaceC65349Pkn("check_offline_resource")
        public final boolean checkOfflineResource;

        @InterfaceC65349Pkn("enable")
        public final boolean enable;

        @InterfaceC65349Pkn("enable_preload")
        public final boolean enablePreload;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DisneyCardConfig)) {
                return false;
            }
            DisneyCardConfig disneyCardConfig = (DisneyCardConfig) obj;
            return this.enable == disneyCardConfig.enable && this.enablePreload == disneyCardConfig.enablePreload && this.checkOfflineResource == disneyCardConfig.checkOfflineResource;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public final int hashCode() {
            boolean z = this.enable;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            ?? r02 = this.enablePreload;
            int i2 = r02;
            if (r02 != 0) {
                i2 = 1;
            }
            return ((i + i2) * 31) + (this.checkOfflineResource ? 1 : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("DisneyCardConfig(enable=");
            LIZ.append(this.enable);
            LIZ.append(", enablePreload=");
            LIZ.append(this.enablePreload);
            LIZ.append(", checkOfflineResource=");
            return C48339Iy7.LIZJ(LIZ, this.checkOfflineResource, ')', LIZ);
        }

        public DisneyCardConfig(boolean z, boolean z2, boolean z3) {
            this.enable = z;
            this.enablePreload = z2;
            this.checkOfflineResource = z3;
        }
    }

    public static boolean LIZ() {
        if (LFH.LIZIZ.LIZLLL().block().LJIIIIZZ()) {
            return false;
        }
        FFL LJIIIZ = FFL.LJIIIZ();
        DisneyCardConfig disneyCardConfig = LIZIZ;
        LJIIIZ.getClass();
        DisneyCardConfig disneyCardConfig2 = (DisneyCardConfig) FFL.LJIJ(false, "feed_disney_card_config", 31744, DisneyCardConfig.class, disneyCardConfig);
        if (disneyCardConfig2 == null) {
            return false;
        }
        return disneyCardConfig2.enable;
    }
}
