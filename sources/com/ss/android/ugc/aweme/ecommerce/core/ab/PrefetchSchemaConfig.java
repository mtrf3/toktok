package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PrefetchSchemaConfig {

    @InterfaceC65349Pkn("sku_prefetch")
    public final SkuPrefetchConfig skuPrefetch;

    /* JADX WARN: Multi-variable type inference failed */
    public PrefetchSchemaConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PrefetchSchemaConfig) && o.LJ(this.skuPrefetch, ((PrefetchSchemaConfig) obj).skuPrefetch);
    }

    public final int hashCode() {
        SkuPrefetchConfig skuPrefetchConfig = this.skuPrefetch;
        if (skuPrefetchConfig == null) {
            return 0;
        }
        return skuPrefetchConfig.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PrefetchSchemaConfig(skuPrefetch=");
        LIZ.append(this.skuPrefetch);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public PrefetchSchemaConfig(SkuPrefetchConfig skuPrefetchConfig) {
        this.skuPrefetch = skuPrefetchConfig;
    }

    public /* synthetic */ PrefetchSchemaConfig(SkuPrefetchConfig skuPrefetchConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : skuPrefetchConfig);
    }
}
