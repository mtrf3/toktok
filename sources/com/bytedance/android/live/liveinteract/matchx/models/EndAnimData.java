package com.bytedance.android.live.liveinteract.matchx.models;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EndAnimData {

    @InterfaceC65349Pkn("business")
    public final String business;

    @InterfaceC65349Pkn("detail")
    public final EndAnimDetail detail;

    /* JADX WARN: Multi-variable type inference failed */
    public EndAnimData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EndAnimData)) {
            return false;
        }
        EndAnimData endAnimData = (EndAnimData) obj;
        return o.LJ(this.detail, endAnimData.detail) && o.LJ(this.business, endAnimData.business);
    }

    public final int hashCode() {
        EndAnimDetail endAnimDetail = this.detail;
        return this.business.hashCode() + ((endAnimDetail == null ? 0 : endAnimDetail.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EndAnimData(detail=");
        LIZ.append(this.detail);
        LIZ.append(", business=");
        return q.LIZIZ(LIZ, this.business, ')', LIZ);
    }

    public EndAnimData(EndAnimDetail endAnimDetail, String business) {
        o.LJIIIZ(business, "business");
        this.detail = endAnimDetail;
        this.business = business;
    }

    public /* synthetic */ EndAnimData(EndAnimDetail endAnimDetail, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : endAnimDetail, (i & 2) != 0 ? "" : str);
    }
}
