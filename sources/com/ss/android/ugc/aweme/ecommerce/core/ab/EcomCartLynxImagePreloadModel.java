package com.ss.android.ugc.aweme.ecommerce.core.ab;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class EcomCartLynxImagePreloadModel extends F9E {

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    @InterfaceC65349Pkn("product_count")
    public final int productCount;

    @InterfaceC65349Pkn("seller_count")
    public final int sellerCount;

    /* JADX WARN: Multi-variable type inference failed */
    public EcomCartLynxImagePreloadModel() {
        this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, null);
    }

    public static /* synthetic */ EcomCartLynxImagePreloadModel copy$default(EcomCartLynxImagePreloadModel ecomCartLynxImagePreloadModel, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = ecomCartLynxImagePreloadModel.enable;
        }
        if ((i3 & 2) != 0) {
            i = ecomCartLynxImagePreloadModel.productCount;
        }
        if ((i3 & 4) != 0) {
            i2 = ecomCartLynxImagePreloadModel.sellerCount;
        }
        return ecomCartLynxImagePreloadModel.copy(z, i, i2);
    }

    public final EcomCartLynxImagePreloadModel copy(boolean z, int i, int i2) {
        return new EcomCartLynxImagePreloadModel(z, i, i2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable), Integer.valueOf(this.productCount), Integer.valueOf(this.sellerCount)};
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final int getProductCount() {
        return this.productCount;
    }

    public final int getSellerCount() {
        return this.sellerCount;
    }

    public EcomCartLynxImagePreloadModel(boolean z, int i, int i2) {
        this.enable = z;
        this.productCount = i;
        this.sellerCount = i2;
    }

    public /* synthetic */ EcomCartLynxImagePreloadModel(boolean z, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }
}
