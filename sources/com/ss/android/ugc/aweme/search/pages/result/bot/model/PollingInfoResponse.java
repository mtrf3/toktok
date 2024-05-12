package com.ss.android.ugc.aweme.search.pages.result.bot.model;

import X.C60462Yw;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PollingInfoResponse implements Serializable {

    @InterfaceC65349Pkn("data")
    public final List<PollingInfoData> data;

    @InterfaceC65349Pkn("polling_status")
    public final Integer pollingStatus;
    public static final C60462Yw Companion = new Object() { // from class: X.2Yw
    };
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public PollingInfoResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PollingInfoResponse copy$default(PollingInfoResponse pollingInfoResponse, List list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = pollingInfoResponse.data;
        }
        if ((i & 2) != 0) {
            num = pollingInfoResponse.pollingStatus;
        }
        return pollingInfoResponse.copy(list, num);
    }

    public final PollingInfoResponse copy(List<PollingInfoData> list, Integer num) {
        return new PollingInfoResponse(list, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PollingInfoResponse)) {
            return false;
        }
        PollingInfoResponse pollingInfoResponse = (PollingInfoResponse) obj;
        return o.LJ(this.data, pollingInfoResponse.data) && o.LJ(this.pollingStatus, pollingInfoResponse.pollingStatus);
    }

    public int hashCode() {
        List<PollingInfoData> list = this.data;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.pollingStatus;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PollingInfoResponse(data=");
        LIZ.append(this.data);
        LIZ.append(", pollingStatus=");
        return s0.LIZJ(LIZ, this.pollingStatus, ')', LIZ);
    }

    public final List<PollingInfoData> getData() {
        return this.data;
    }

    public final Integer getPollingStatus() {
        return this.pollingStatus;
    }

    public PollingInfoResponse(List<PollingInfoData> list, Integer num) {
        this.data = list;
        this.pollingStatus = num;
    }

    public /* synthetic */ PollingInfoResponse(List list, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num);
    }
}
