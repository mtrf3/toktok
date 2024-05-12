package com.ss.android.ugc.aweme.influencer.ecommercelive.business.highlights.repo;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UserClickInfo {

    @InterfaceC65349Pkn("product_id")
    public final String productId;

    public static /* synthetic */ UserClickInfo copy$default(UserClickInfo userClickInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userClickInfo.productId;
        }
        return userClickInfo.copy(str);
    }

    public final UserClickInfo copy(String str) {
        return new UserClickInfo(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserClickInfo) && o.LJ(this.productId, ((UserClickInfo) obj).productId);
    }

    public int hashCode() {
        String str = this.productId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserClickInfo(productId=");
        return q.LIZIZ(LIZ, this.productId, ')', LIZ);
    }

    public final String getProductId() {
        return this.productId;
    }

    public UserClickInfo(String str) {
        this.productId = str;
    }
}
