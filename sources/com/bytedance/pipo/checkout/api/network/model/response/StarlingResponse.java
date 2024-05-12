package com.bytedance.pipo.checkout.api.network.model.response;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class StarlingResponse {

    @InterfaceC65349Pkn("message")
    public StarlingMessage message;

    @InterfaceC65349Pkn("status")
    public Integer status;

    /* JADX WARN: Multi-variable type inference failed */
    public StarlingResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ StarlingResponse copy$default(StarlingResponse starlingResponse, StarlingMessage starlingMessage, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            starlingMessage = starlingResponse.message;
        }
        if ((i & 2) != 0) {
            num = starlingResponse.status;
        }
        return starlingResponse.copy(starlingMessage, num);
    }

    public final StarlingResponse copy(StarlingMessage starlingMessage, Integer num) {
        return new StarlingResponse(starlingMessage, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StarlingResponse)) {
            return false;
        }
        StarlingResponse starlingResponse = (StarlingResponse) obj;
        return o.LJ(this.message, starlingResponse.message) && o.LJ(this.status, starlingResponse.status);
    }

    public int hashCode() {
        StarlingMessage starlingMessage = this.message;
        int hashCode = (starlingMessage == null ? 0 : starlingMessage.hashCode()) * 31;
        Integer num = this.status;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StarlingResponse(message=");
        LIZ.append(this.message);
        LIZ.append(", status=");
        LIZ.append(this.status);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final StarlingMessage getMessage() {
        return this.message;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final void setMessage(StarlingMessage starlingMessage) {
        this.message = starlingMessage;
    }

    public final void setStatus(Integer num) {
        this.status = num;
    }

    public StarlingResponse(StarlingMessage starlingMessage, Integer num) {
        this.message = starlingMessage;
        this.status = num;
    }

    public /* synthetic */ StarlingResponse(StarlingMessage starlingMessage, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new StarlingMessage(null, 1, null) : starlingMessage, (i & 2) != 0 ? null : num);
    }
}
