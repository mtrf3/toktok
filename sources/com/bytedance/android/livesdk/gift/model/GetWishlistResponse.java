package com.bytedance.android.livesdk.gift.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public final class GetWishlistResponse extends F9E {

    @InterfaceC65349Pkn("data")
    public WishListResponse data;

    @Override // X.F9E
    public final Object[] getObjects() {
        WishListResponse wishListResponse = this.data;
        return new Object[]{wishListResponse, wishListResponse};
    }
}
