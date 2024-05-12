package com.ss.android.ugc.aweme.shoutouts.model;

import X.C770830u;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ShoutoutsOrder {

    @InterfaceC65349Pkn("video_info")
    public final Aweme aweme;

    @InterfaceC65349Pkn("order_id")
    public final String orderId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoutoutsOrder)) {
            return false;
        }
        ShoutoutsOrder shoutoutsOrder = (ShoutoutsOrder) obj;
        return o.LJ(this.orderId, shoutoutsOrder.orderId) && o.LJ(this.aweme, shoutoutsOrder.aweme);
    }

    public final int hashCode() {
        int hashCode = this.orderId.hashCode() * 31;
        Aweme aweme = this.aweme;
        return hashCode + (aweme == null ? 0 : aweme.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShoutoutsOrder(orderId=");
        LIZ.append(this.orderId);
        LIZ.append(", aweme=");
        return C770830u.LIZ(LIZ, this.aweme, ')', LIZ);
    }

    public ShoutoutsOrder(String orderId, Aweme aweme) {
        o.LJIIIZ(orderId, "orderId");
        this.orderId = orderId;
        this.aweme = aweme;
    }
}
