package com.ss.android.ugc.aweme.network.experiment;

import X.C141335gf;
import X.C3C5;
import X.C48339Iy7;
import X.FFL;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class HybridTrafficColoringSettings {
    public static final HybridTrafficColoringModel LIZ;

    /* loaded from: classes7.dex */
    public static final class HybridTrafficColoringModel {

        @InterfaceC65349Pkn("context_pass_enabled")
        public final boolean contextPassEnabled;

        @InterfaceC65349Pkn("enabled")
        public final boolean enabled;

        @InterfaceC65349Pkn("header_mod_enabled")
        public final boolean headerModEnabled;

        @InterfaceC65349Pkn("query_mod_enabled")
        public final boolean queryModEnabled;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public HybridTrafficColoringModel() {
            /*
                r7 = this;
                r1 = 0
                r5 = 15
                r6 = 0
                r0 = r7
                r2 = r1
                r3 = r1
                r4 = r1
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.network.experiment.HybridTrafficColoringSettings.HybridTrafficColoringModel.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HybridTrafficColoringModel)) {
                return false;
            }
            HybridTrafficColoringModel hybridTrafficColoringModel = (HybridTrafficColoringModel) obj;
            return this.enabled == hybridTrafficColoringModel.enabled && this.headerModEnabled == hybridTrafficColoringModel.headerModEnabled && this.queryModEnabled == hybridTrafficColoringModel.queryModEnabled && this.contextPassEnabled == hybridTrafficColoringModel.contextPassEnabled;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v9 */
        public final int hashCode() {
            boolean z = this.enabled;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            ?? r02 = this.headerModEnabled;
            int i2 = r02;
            if (r02 != 0) {
                i2 = 1;
            }
            int i3 = (i + i2) * 31;
            ?? r03 = this.queryModEnabled;
            int i4 = r03;
            if (r03 != 0) {
                i4 = 1;
            }
            return ((i3 + i4) * 31) + (this.contextPassEnabled ? 1 : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("HybridTrafficColoringModel(enabled=");
            LIZ.append(this.enabled);
            LIZ.append(", headerModEnabled=");
            LIZ.append(this.headerModEnabled);
            LIZ.append(", queryModEnabled=");
            LIZ.append(this.queryModEnabled);
            LIZ.append(", contextPassEnabled=");
            return C48339Iy7.LIZJ(LIZ, this.contextPassEnabled, ')', LIZ);
        }

        public HybridTrafficColoringModel(boolean z, boolean z2, boolean z3, boolean z4) {
            this.enabled = z;
            this.headerModEnabled = z2;
            this.queryModEnabled = z3;
            this.contextPassEnabled = z4;
        }

        public /* synthetic */ HybridTrafficColoringModel(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4);
        }
    }

    static {
        boolean z = false;
        LIZ = new HybridTrafficColoringModel(z, z, z, z, 15, null);
    }

    public static final HybridTrafficColoringModel LIZ() {
        Object LIZ2;
        try {
            FFL LJIIIZ = FFL.LJIIIZ();
            HybridTrafficColoringModel hybridTrafficColoringModel = LIZ;
            LJIIIZ.getClass();
            LIZ2 = (HybridTrafficColoringModel) FFL.LJIJ(true, "hybrid_traffic_coloring_settings", 31744, HybridTrafficColoringModel.class, hybridTrafficColoringModel);
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (C3C5.m12isFailureimpl(LIZ2)) {
            LIZ2 = null;
        }
        HybridTrafficColoringModel hybridTrafficColoringModel2 = (HybridTrafficColoringModel) LIZ2;
        if (hybridTrafficColoringModel2 == null) {
            return LIZ;
        }
        return hybridTrafficColoringModel2;
    }
}
