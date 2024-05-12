package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ChangeOrderShippingAddressResponseData {

    @InterfaceC65349Pkn("errors")
    public final List<Error> errors;

    @InterfaceC65349Pkn("result_code")
    public final Integer resultCode;

    @InterfaceC65349Pkn("toast_message")
    public final String toastMessage;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeOrderShippingAddressResponseData)) {
            return false;
        }
        ChangeOrderShippingAddressResponseData changeOrderShippingAddressResponseData = (ChangeOrderShippingAddressResponseData) obj;
        return o.LJ(this.resultCode, changeOrderShippingAddressResponseData.resultCode) && o.LJ(this.toastMessage, changeOrderShippingAddressResponseData.toastMessage) && o.LJ(this.errors, changeOrderShippingAddressResponseData.errors);
    }

    public final int hashCode() {
        Integer num = this.resultCode;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.toastMessage;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<Error> list = this.errors;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ChangeOrderShippingAddressResponseData(resultCode=");
        LIZ.append(this.resultCode);
        LIZ.append(", toastMessage=");
        LIZ.append(this.toastMessage);
        LIZ.append(", errors=");
        return C1NE.LIZIZ(LIZ, this.errors, ')', LIZ);
    }

    public ChangeOrderShippingAddressResponseData(Integer num, String str, List<Error> list) {
        this.resultCode = num;
        this.toastMessage = str;
        this.errors = list;
    }
}
