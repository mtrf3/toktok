package com.ss.android.ugc.aweme.ecommerce.anchor.settings;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;

/* loaded from: classes13.dex */
public final class EcStickerCategorySetting {
    public static final EcStickerCategoryConfig LIZ = new EcStickerCategoryConfig(false, false);

    /* loaded from: classes13.dex */
    public static final class EcStickerCategoryConfig {

        @InterfaceC65349Pkn("enable_category")
        public final boolean enableCategory;

        @InterfaceC65349Pkn("enable_guide")
        public final boolean enableGuide;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EcStickerCategoryConfig)) {
                return false;
            }
            EcStickerCategoryConfig ecStickerCategoryConfig = (EcStickerCategoryConfig) obj;
            return this.enableGuide == ecStickerCategoryConfig.enableGuide && this.enableCategory == ecStickerCategoryConfig.enableCategory;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        public final int hashCode() {
            boolean z = this.enableGuide;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (r0 * 31) + (this.enableCategory ? 1 : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EcStickerCategoryConfig(enableGuide=");
            LIZ.append(this.enableGuide);
            LIZ.append(", enableCategory=");
            return C48339Iy7.LIZJ(LIZ, this.enableCategory, ')', LIZ);
        }

        public EcStickerCategoryConfig(boolean z, boolean z2) {
            this.enableGuide = z;
            this.enableCategory = z2;
        }
    }
}
