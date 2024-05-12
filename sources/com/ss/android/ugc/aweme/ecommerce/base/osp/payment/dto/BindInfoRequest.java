package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class BindInfoRequest implements Serializable {

    @InterfaceC65349Pkn("payment_method_list")
    public final List<BindInfoReqInfo> paymentMethodList;

    /* JADX WARN: Multi-variable type inference failed */
    public BindInfoRequest() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BindInfoRequest copy$default(BindInfoRequest bindInfoRequest, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bindInfoRequest.paymentMethodList;
        }
        return bindInfoRequest.copy(list);
    }

    public final BindInfoRequest copy(List<BindInfoReqInfo> list) {
        return new BindInfoRequest(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BindInfoRequest) && o.LJ(this.paymentMethodList, ((BindInfoRequest) obj).paymentMethodList);
    }

    public int hashCode() {
        List<BindInfoReqInfo> list = this.paymentMethodList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BindInfoRequest(paymentMethodList=");
        return C1NE.LIZIZ(LIZ, this.paymentMethodList, ')', LIZ);
    }

    public final List<BindInfoReqInfo> getPaymentMethodList() {
        return this.paymentMethodList;
    }

    public BindInfoRequest(List<BindInfoReqInfo> list) {
        this.paymentMethodList = list;
    }

    public /* synthetic */ BindInfoRequest(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
