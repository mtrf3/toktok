package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class CommuteInfo {

    @InterfaceC65349Pkn("supported_commute_type")
    public CommuteType commuteType;

    /* JADX WARN: Multi-variable type inference failed */
    public CommuteInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CommuteInfo) && this.commuteType == ((CommuteInfo) obj).commuteType;
    }

    public final int hashCode() {
        CommuteType commuteType = this.commuteType;
        if (commuteType == null) {
            return 0;
        }
        return commuteType.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommuteInfo(commuteType=");
        LIZ.append(this.commuteType);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public CommuteInfo(CommuteType commuteType) {
        this.commuteType = commuteType;
    }

    public /* synthetic */ CommuteInfo(CommuteType commuteType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : commuteType);
    }
}
