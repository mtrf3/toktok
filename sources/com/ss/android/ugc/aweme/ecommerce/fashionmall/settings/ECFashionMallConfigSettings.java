package com.ss.android.ugc.aweme.ecommerce.fashionmall.settings;

import X.C48339Iy7;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ECFashionMallConfigSettings {
    public static final EcFashionMallConfigModel LIZ = new EcFashionMallConfigModel(true, "sslocal://lynxview?use_new_container=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_ecommerce_ttmall_ttf%2Fpages%2Fhome.js&use_spark=1&__live_platform__=webcast&trans_status_bar=1&hide_nav_bar=1&previous_page=mall&enter_from=mall&business_from=ecom&target_handler=webcast", true);

    /* loaded from: classes10.dex */
    public static final class EcFashionMallConfigModel {

        @InterfaceC65349Pkn("enable_ec_mall_shop_message_refresh")
        public final boolean enableEcMallShopMessageRefresh;

        @InterfaceC65349Pkn("unity_card_schema")
        public final String homeSchema;

        @InterfaceC65349Pkn("use_unity_cache")
        public final boolean useCache;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EcFashionMallConfigModel)) {
                return false;
            }
            EcFashionMallConfigModel ecFashionMallConfigModel = (EcFashionMallConfigModel) obj;
            return this.useCache == ecFashionMallConfigModel.useCache && o.LJ(this.homeSchema, ecFashionMallConfigModel.homeSchema) && this.enableEcMallShopMessageRefresh == ecFashionMallConfigModel.enableEcMallShopMessageRefresh;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public final int hashCode() {
            boolean z = this.useCache;
            int i = 1;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int LJ = C79062V1e.LJ(this.homeSchema, r0 * 31, 31);
            if (!this.enableEcMallShopMessageRefresh) {
                i = 0;
            }
            return LJ + i;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EcFashionMallConfigModel(useCache=");
            LIZ.append(this.useCache);
            LIZ.append(", homeSchema=");
            LIZ.append(this.homeSchema);
            LIZ.append(", enableEcMallShopMessageRefresh=");
            return C48339Iy7.LIZJ(LIZ, this.enableEcMallShopMessageRefresh, ')', LIZ);
        }

        public EcFashionMallConfigModel(boolean z, String homeSchema, boolean z2) {
            o.LJIIIZ(homeSchema, "homeSchema");
            this.useCache = z;
            this.homeSchema = homeSchema;
            this.enableEcMallShopMessageRefresh = z2;
        }

        public /* synthetic */ EcFashionMallConfigModel(boolean z, String str, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? "sslocal://lynxview?use_new_container=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_ecommerce_ttmall_ttf%2Fpages%2Fhome.js&use_spark=1&__live_platform__=webcast&trans_status_bar=1&hide_nav_bar=1&previous_page=mall&enter_from=mall&business_from=ecom&target_handler=webcast" : str, z2);
        }
    }

    public static final EcFashionMallConfigModel LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        EcFashionMallConfigModel ecFashionMallConfigModel = LIZ;
        EcFashionMallConfigModel ecFashionMallConfigModel2 = (EcFashionMallConfigModel) LIZLLL.LJIIIIZZ("ec_fashion_mall_config", EcFashionMallConfigModel.class, ecFashionMallConfigModel);
        if (ecFashionMallConfigModel2 == null) {
            return ecFashionMallConfigModel;
        }
        return ecFashionMallConfigModel2;
    }
}
