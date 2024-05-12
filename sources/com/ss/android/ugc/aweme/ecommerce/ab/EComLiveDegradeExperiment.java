package com.ss.android.ugc.aweme.ecommerce.ab;

import X.C48339Iy7;
import X.FFL;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class EComLiveDegradeExperiment {
    public static final EComLiveDegradeExperiment LIZ = new EComLiveDegradeExperiment();
    public static final EComLiveDegradeExperimentConfig LIZIZ;

    /* loaded from: classes5.dex */
    public static final class EComLiveDegradeExperimentConfig {

        @InterfaceC65349Pkn("entrance_anim_degrade")
        public boolean entranceAnimDegrade;

        @InterfaceC65349Pkn("page_anim_degrade")
        public boolean pageAnimDegrade;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public EComLiveDegradeExperimentConfig() {
            /*
                r3 = this;
                r2 = 3
                r1 = 0
                r0 = 0
                r3.<init>(r0, r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.ab.EComLiveDegradeExperiment.EComLiveDegradeExperimentConfig.<init>():void");
        }

        public static /* synthetic */ EComLiveDegradeExperimentConfig copy$default(EComLiveDegradeExperimentConfig eComLiveDegradeExperimentConfig, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = eComLiveDegradeExperimentConfig.pageAnimDegrade;
            }
            if ((i & 2) != 0) {
                z2 = eComLiveDegradeExperimentConfig.entranceAnimDegrade;
            }
            return eComLiveDegradeExperimentConfig.copy(z, z2);
        }

        public final EComLiveDegradeExperimentConfig copy(boolean z, boolean z2) {
            return new EComLiveDegradeExperimentConfig(z, z2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EComLiveDegradeExperimentConfig)) {
                return false;
            }
            EComLiveDegradeExperimentConfig eComLiveDegradeExperimentConfig = (EComLiveDegradeExperimentConfig) obj;
            return this.pageAnimDegrade == eComLiveDegradeExperimentConfig.pageAnimDegrade && this.entranceAnimDegrade == eComLiveDegradeExperimentConfig.entranceAnimDegrade;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        public int hashCode() {
            boolean z = this.pageAnimDegrade;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (r0 * 31) + (this.entranceAnimDegrade ? 1 : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EComLiveDegradeExperimentConfig(pageAnimDegrade=");
            LIZ.append(this.pageAnimDegrade);
            LIZ.append(", entranceAnimDegrade=");
            return C48339Iy7.LIZJ(LIZ, this.entranceAnimDegrade, ')', LIZ);
        }

        public final boolean getEntranceAnimDegrade() {
            return this.entranceAnimDegrade;
        }

        public final boolean getPageAnimDegrade() {
            return this.pageAnimDegrade;
        }

        public final void setEntranceAnimDegrade(boolean z) {
            this.entranceAnimDegrade = z;
        }

        public final void setPageAnimDegrade(boolean z) {
            this.pageAnimDegrade = z;
        }

        public EComLiveDegradeExperimentConfig(boolean z, boolean z2) {
            this.pageAnimDegrade = z;
            this.entranceAnimDegrade = z2;
        }

        public /* synthetic */ EComLiveDegradeExperimentConfig(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }
    }

    static {
        boolean z = false;
        LIZIZ = new EComLiveDegradeExperimentConfig(z, z, 3, null);
    }

    public static final EComLiveDegradeExperimentConfig LIZ() {
        FFL LJIIIZ = FFL.LJIIIZ();
        EComLiveDegradeExperimentConfig eComLiveDegradeExperimentConfig = LIZIZ;
        LJIIIZ.getClass();
        EComLiveDegradeExperimentConfig eComLiveDegradeExperimentConfig2 = (EComLiveDegradeExperimentConfig) FFL.LJIJ(true, "ecom_live_degrade_exp_precise", 31744, EComLiveDegradeExperimentConfig.class, eComLiveDegradeExperimentConfig);
        if (eComLiveDegradeExperimentConfig2 == null) {
            return eComLiveDegradeExperimentConfig;
        }
        return eComLiveDegradeExperimentConfig2;
    }

    public static boolean LIZIZ() {
        return LIZ().getPageAnimDegrade();
    }
}
