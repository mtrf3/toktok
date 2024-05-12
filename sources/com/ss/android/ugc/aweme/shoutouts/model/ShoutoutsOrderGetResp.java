package com.ss.android.ugc.aweme.shoutouts.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ShoutoutsOrderGetResp {

    @InterfaceC65349Pkn("order_detail")
    public final ShoutoutsOrder orderStruct;

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    @InterfaceC65349Pkn("status_msg")
    public final String statusMsg;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoutoutsOrderGetResp)) {
            return false;
        }
        ShoutoutsOrderGetResp shoutoutsOrderGetResp = (ShoutoutsOrderGetResp) obj;
        return this.statusCode == shoutoutsOrderGetResp.statusCode && o.LJ(this.statusMsg, shoutoutsOrderGetResp.statusMsg) && o.LJ(this.orderStruct, shoutoutsOrderGetResp.orderStruct);
    }

    public final int hashCode() {
        int i = this.statusCode * 31;
        String str = this.statusMsg;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        ShoutoutsOrder shoutoutsOrder = this.orderStruct;
        return hashCode + (shoutoutsOrder != null ? shoutoutsOrder.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShoutoutsOrderGetResp(statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", statusMsg=");
        LIZ.append(this.statusMsg);
        LIZ.append(", orderStruct=");
        LIZ.append(this.orderStruct);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public ShoutoutsOrderGetResp(int i, String str, ShoutoutsOrder shoutoutsOrder) {
        this.statusCode = i;
        this.statusMsg = str;
        this.orderStruct = shoutoutsOrder;
    }
}
