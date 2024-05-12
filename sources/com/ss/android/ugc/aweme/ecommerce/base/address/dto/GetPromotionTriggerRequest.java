package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GetPromotionTriggerRequest {

    @InterfaceC65349Pkn("promotion_trigger_time")
    public final Long promotionTriggerTime;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetPromotionTriggerRequest) && o.LJ(this.promotionTriggerTime, ((GetPromotionTriggerRequest) obj).promotionTriggerTime);
    }

    public final int hashCode() {
        Long l = this.promotionTriggerTime;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GetPromotionTriggerRequest(promotionTriggerTime=");
        return JBR.LJ(LIZ, this.promotionTriggerTime, ')', LIZ);
    }

    public GetPromotionTriggerRequest(Long l) {
        this.promotionTriggerTime = l;
    }
}
