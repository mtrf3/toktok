package com.ss.android.ugc.aweme.ecommercelive.common.settings;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class PinCardRefactorSettings {
    public static final PinCardRefactorConfig LIZ;

    /* loaded from: classes10.dex */
    public static final class PinCardRefactorConfig {

        @InterfaceC65349Pkn("assistant_enable")
        public boolean assistantEnable;

        @InterfaceC65349Pkn("atmosphere_enable")
        public boolean atmosphereEnable;

        @InterfaceC65349Pkn("fans_exclusive_enable")
        public boolean fansExclusiveEnable;

        @InterfaceC65349Pkn("promotion_enable")
        public boolean promotionEnable;

        @InterfaceC65349Pkn("selling_point_enable")
        public boolean sellingPointEnable;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public PinCardRefactorConfig() {
            /*
                r8 = this;
                r1 = 0
                r6 = 31
                r7 = 0
                r0 = r8
                r2 = r1
                r3 = r1
                r4 = r1
                r5 = r1
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommercelive.common.settings.PinCardRefactorSettings.PinCardRefactorConfig.<init>():void");
        }

        public static /* synthetic */ PinCardRefactorConfig copy$default(PinCardRefactorConfig pinCardRefactorConfig, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
            if ((i & 1) != 0) {
                z = pinCardRefactorConfig.sellingPointEnable;
            }
            if ((i & 2) != 0) {
                z2 = pinCardRefactorConfig.promotionEnable;
            }
            if ((i & 4) != 0) {
                z3 = pinCardRefactorConfig.fansExclusiveEnable;
            }
            if ((i & 8) != 0) {
                z4 = pinCardRefactorConfig.assistantEnable;
            }
            if ((i & 16) != 0) {
                z5 = pinCardRefactorConfig.atmosphereEnable;
            }
            return pinCardRefactorConfig.copy(z, z2, z3, z4, z5);
        }

        public final PinCardRefactorConfig copy(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            return new PinCardRefactorConfig(z, z2, z3, z4, z5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PinCardRefactorConfig)) {
                return false;
            }
            PinCardRefactorConfig pinCardRefactorConfig = (PinCardRefactorConfig) obj;
            return this.sellingPointEnable == pinCardRefactorConfig.sellingPointEnable && this.promotionEnable == pinCardRefactorConfig.promotionEnable && this.fansExclusiveEnable == pinCardRefactorConfig.fansExclusiveEnable && this.assistantEnable == pinCardRefactorConfig.assistantEnable && this.atmosphereEnable == pinCardRefactorConfig.atmosphereEnable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v13 */
        /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
        public int hashCode() {
            boolean z = this.sellingPointEnable;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            ?? r02 = this.promotionEnable;
            int i2 = r02;
            if (r02 != 0) {
                i2 = 1;
            }
            int i3 = (i + i2) * 31;
            ?? r03 = this.fansExclusiveEnable;
            int i4 = r03;
            if (r03 != 0) {
                i4 = 1;
            }
            int i5 = (i3 + i4) * 31;
            ?? r04 = this.assistantEnable;
            int i6 = r04;
            if (r04 != 0) {
                i6 = 1;
            }
            return ((i5 + i6) * 31) + (this.atmosphereEnable ? 1 : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PinCardRefactorConfig(sellingPointEnable=");
            LIZ.append(this.sellingPointEnable);
            LIZ.append(", promotionEnable=");
            LIZ.append(this.promotionEnable);
            LIZ.append(", fansExclusiveEnable=");
            LIZ.append(this.fansExclusiveEnable);
            LIZ.append(", assistantEnable=");
            LIZ.append(this.assistantEnable);
            LIZ.append(", atmosphereEnable=");
            return C48339Iy7.LIZJ(LIZ, this.atmosphereEnable, ')', LIZ);
        }

        public final boolean getAssistantEnable() {
            return this.assistantEnable;
        }

        public final boolean getAtmosphereEnable() {
            return this.atmosphereEnable;
        }

        public final boolean getFansExclusiveEnable() {
            return this.fansExclusiveEnable;
        }

        public final boolean getPromotionEnable() {
            return this.promotionEnable;
        }

        public final boolean getSellingPointEnable() {
            return this.sellingPointEnable;
        }

        public final void setAssistantEnable(boolean z) {
            this.assistantEnable = z;
        }

        public final void setAtmosphereEnable(boolean z) {
            this.atmosphereEnable = z;
        }

        public final void setFansExclusiveEnable(boolean z) {
            this.fansExclusiveEnable = z;
        }

        public final void setPromotionEnable(boolean z) {
            this.promotionEnable = z;
        }

        public final void setSellingPointEnable(boolean z) {
            this.sellingPointEnable = z;
        }

        public PinCardRefactorConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            this.sellingPointEnable = z;
            this.promotionEnable = z2;
            this.fansExclusiveEnable = z3;
            this.assistantEnable = z4;
            this.atmosphereEnable = z5;
        }

        public /* synthetic */ PinCardRefactorConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? true : z4, (i & 16) != 0 ? true : z5);
        }
    }

    static {
        new PinCardRefactorSettings();
        boolean z = false;
        LIZ = new PinCardRefactorConfig(z, z, z, z, z, 31, null);
    }

    public static final PinCardRefactorConfig LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        PinCardRefactorConfig pinCardRefactorConfig = LIZ;
        PinCardRefactorConfig pinCardRefactorConfig2 = (PinCardRefactorConfig) LIZLLL.LJIIIIZZ("ecommerce_pin_card_refactor_settings", PinCardRefactorConfig.class, pinCardRefactorConfig);
        if (pinCardRefactorConfig2 == null) {
            return pinCardRefactorConfig;
        }
        return pinCardRefactorConfig2;
    }
}
