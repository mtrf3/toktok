package com.ss.android.ugc.aweme.commercialize.ecommerce.wishlist.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class WishListGeckoResponse implements Serializable {

    @InterfaceC65349Pkn("lynx_schema")
    public final LynxSchema lynxSchema;

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    @InterfaceC65349Pkn("status_msg")
    public final String statusMsg;

    public static /* synthetic */ WishListGeckoResponse copy$default(WishListGeckoResponse wishListGeckoResponse, int i, String str, LynxSchema lynxSchema, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = wishListGeckoResponse.statusCode;
        }
        if ((i2 & 2) != 0) {
            str = wishListGeckoResponse.statusMsg;
        }
        if ((i2 & 4) != 0) {
            lynxSchema = wishListGeckoResponse.lynxSchema;
        }
        return wishListGeckoResponse.copy(i, str, lynxSchema);
    }

    public final WishListGeckoResponse copy(int i, String str, LynxSchema lynxSchema) {
        return new WishListGeckoResponse(i, str, lynxSchema);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WishListGeckoResponse)) {
            return false;
        }
        WishListGeckoResponse wishListGeckoResponse = (WishListGeckoResponse) obj;
        return this.statusCode == wishListGeckoResponse.statusCode && o.LJ(this.statusMsg, wishListGeckoResponse.statusMsg) && o.LJ(this.lynxSchema, wishListGeckoResponse.lynxSchema);
    }

    public int hashCode() {
        int i = this.statusCode * 31;
        String str = this.statusMsg;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        LynxSchema lynxSchema = this.lynxSchema;
        return hashCode + (lynxSchema != null ? lynxSchema.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WishListGeckoResponse(statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", statusMsg=");
        LIZ.append(this.statusMsg);
        LIZ.append(", lynxSchema=");
        LIZ.append(this.lynxSchema);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final LynxSchema getLynxSchema() {
        return this.lynxSchema;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public WishListGeckoResponse(int i, String str, LynxSchema lynxSchema) {
        this.statusCode = i;
        this.statusMsg = str;
        this.lynxSchema = lynxSchema;
    }
}
