package com.bytedance.pipo.checkout.api.network.model.request;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PaymentElements {

    @InterfaceC65349Pkn("element")
    public String element;

    @InterfaceC65349Pkn("param_name")
    public String paramName;

    @InterfaceC65349Pkn("param_value")
    public String paramValue;

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentElements() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PaymentElements copy$default(PaymentElements paymentElements, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentElements.element;
        }
        if ((i & 2) != 0) {
            str2 = paymentElements.paramName;
        }
        if ((i & 4) != 0) {
            str3 = paymentElements.paramValue;
        }
        return paymentElements.copy(str, str2, str3);
    }

    public final PaymentElements copy(String str, String str2, String str3) {
        return new PaymentElements(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentElements)) {
            return false;
        }
        PaymentElements paymentElements = (PaymentElements) obj;
        return o.LJ(this.element, paymentElements.element) && o.LJ(this.paramName, paymentElements.paramName) && o.LJ(this.paramValue, paymentElements.paramValue);
    }

    public int hashCode() {
        String str = this.element;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paramName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paramValue;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaymentElements(element=");
        LIZ.append((Object) this.element);
        LIZ.append(", paramName=");
        LIZ.append((Object) this.paramName);
        LIZ.append(", paramValue=");
        LIZ.append((Object) this.paramValue);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getElement() {
        return this.element;
    }

    public final String getParamName() {
        return this.paramName;
    }

    public final String getParamValue() {
        return this.paramValue;
    }

    public final void setElement(String str) {
        this.element = str;
    }

    public final void setParamName(String str) {
        this.paramName = str;
    }

    public final void setParamValue(String str) {
        this.paramValue = str;
    }

    public PaymentElements(String str, String str2, String str3) {
        this.element = str;
        this.paramName = str2;
        this.paramValue = str3;
    }

    public /* synthetic */ PaymentElements(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
