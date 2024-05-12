package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ECWishListSchemaConfig {
    public static final RomaSchemaGroupFavoritePageModel LIZ = new RomaSchemaGroupFavoritePageModel("sslocal://lynxview?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fgecko-internal-loose-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_ecommerce_favorite_product%2Fpages%2Ffavorite-product.js&__live_platform__=webcast&target_handler=webcast&thread_strategy=2&use_new_container=1&use_spark=1&hide_nav_bar=1&container_bg_color=FFFFFF&should_full_screen=1&trans_status_bar=1");

    /* loaded from: classes7.dex */
    public static final class RomaSchemaGroupFavoritePageModel {

        @InterfaceC65349Pkn("roma_schema_page_favorite_product")
        public final String romaSchemaPageFavoriteProduct;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RomaSchemaGroupFavoritePageModel) && o.LJ(this.romaSchemaPageFavoriteProduct, ((RomaSchemaGroupFavoritePageModel) obj).romaSchemaPageFavoriteProduct);
        }

        public final int hashCode() {
            return this.romaSchemaPageFavoriteProduct.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("RomaSchemaGroupFavoritePageModel(romaSchemaPageFavoriteProduct=");
            return q.LIZIZ(LIZ, this.romaSchemaPageFavoriteProduct, ')', LIZ);
        }

        public RomaSchemaGroupFavoritePageModel(String romaSchemaPageFavoriteProduct) {
            o.LJIIIZ(romaSchemaPageFavoriteProduct, "romaSchemaPageFavoriteProduct");
            this.romaSchemaPageFavoriteProduct = romaSchemaPageFavoriteProduct;
        }
    }
}
