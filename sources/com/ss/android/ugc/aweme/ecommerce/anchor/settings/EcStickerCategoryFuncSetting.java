package com.ss.android.ugc.aweme.ecommerce.anchor.settings;

import X.C1NE;
import X.C47261Igj;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EcStickerCategoryFuncSetting {
    public static final EcStickerCategoryFuncConfig LIZ = new EcStickerCategoryFuncConfig(false, C47261Igj.LJJIJIL("ecommerce"));

    /* loaded from: classes7.dex */
    public static final class EcStickerCategoryFuncConfig {

        @InterfaceC65349Pkn("category_key_list")
        public final List<String> categoryKeyList;

        @InterfaceC65349Pkn("force_hide")
        public final boolean forceHide;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EcStickerCategoryFuncConfig)) {
                return false;
            }
            EcStickerCategoryFuncConfig ecStickerCategoryFuncConfig = (EcStickerCategoryFuncConfig) obj;
            return this.forceHide == ecStickerCategoryFuncConfig.forceHide && o.LJ(this.categoryKeyList, ecStickerCategoryFuncConfig.categoryKeyList);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        public final int hashCode() {
            boolean z = this.forceHide;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return this.categoryKeyList.hashCode() + (r0 * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EcStickerCategoryFuncConfig(forceHide=");
            LIZ.append(this.forceHide);
            LIZ.append(", categoryKeyList=");
            return C1NE.LIZIZ(LIZ, this.categoryKeyList, ')', LIZ);
        }

        public EcStickerCategoryFuncConfig(boolean z, List<String> categoryKeyList) {
            o.LJIIIZ(categoryKeyList, "categoryKeyList");
            this.forceHide = z;
            this.categoryKeyList = categoryKeyList;
        }
    }
}
