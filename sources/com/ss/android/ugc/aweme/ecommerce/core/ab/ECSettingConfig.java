package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ECSettingConfig {

    @InterfaceC65349Pkn("coupon_panel_schema")
    public final String couponPanelSchema;

    @InterfaceC65349Pkn("prefetch_schema")
    public final PrefetchSchemaConfig prefetchSchema;

    /* JADX WARN: Multi-variable type inference failed */
    public ECSettingConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ECSettingConfig)) {
            return false;
        }
        ECSettingConfig eCSettingConfig = (ECSettingConfig) obj;
        return o.LJ(this.couponPanelSchema, eCSettingConfig.couponPanelSchema) && o.LJ(this.prefetchSchema, eCSettingConfig.prefetchSchema);
    }

    public final int hashCode() {
        String str = this.couponPanelSchema;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        PrefetchSchemaConfig prefetchSchemaConfig = this.prefetchSchema;
        return hashCode + (prefetchSchemaConfig != null ? prefetchSchemaConfig.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ECSettingConfig(couponPanelSchema=");
        LIZ.append(this.couponPanelSchema);
        LIZ.append(", prefetchSchema=");
        LIZ.append(this.prefetchSchema);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public ECSettingConfig(String str, PrefetchSchemaConfig prefetchSchemaConfig) {
        this.couponPanelSchema = str;
        this.prefetchSchema = prefetchSchemaConfig;
    }

    public /* synthetic */ ECSettingConfig(String str, PrefetchSchemaConfig prefetchSchemaConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : prefetchSchemaConfig);
    }
}
