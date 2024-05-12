package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PaymentElement implements Serializable {

    @InterfaceC65349Pkn("element")
    public final String element;

    @InterfaceC65349Pkn("is_encrypted")
    public final Boolean isEncrypted;

    @InterfaceC65349Pkn("need_encryption")
    public final Boolean needEncryption;

    @InterfaceC65349Pkn("param_name")
    public final String paramName;

    @InterfaceC65349Pkn("param_value")
    public String paramValue;

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentElement() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PaymentElement copy$default(PaymentElement paymentElement, String str, String str2, String str3, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentElement.element;
        }
        if ((i & 2) != 0) {
            str2 = paymentElement.paramName;
        }
        if ((i & 4) != 0) {
            str3 = paymentElement.paramValue;
        }
        if ((i & 8) != 0) {
            bool = paymentElement.needEncryption;
        }
        if ((i & 16) != 0) {
            bool2 = paymentElement.isEncrypted;
        }
        return paymentElement.copy(str, str2, str3, bool, bool2);
    }

    public final PaymentElement copy(String str, String str2, String str3, Boolean bool, Boolean bool2) {
        return new PaymentElement(str, str2, str3, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentElement)) {
            return false;
        }
        PaymentElement paymentElement = (PaymentElement) obj;
        return o.LJ(this.element, paymentElement.element) && o.LJ(this.paramName, paymentElement.paramName) && o.LJ(this.paramValue, paymentElement.paramValue) && o.LJ(this.needEncryption, paymentElement.needEncryption) && o.LJ(this.isEncrypted, paymentElement.isEncrypted);
    }

    public int hashCode() {
        String str = this.element;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.paramName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paramValue;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.needEncryption;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isEncrypted;
        return hashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaymentElement(element=");
        LIZ.append(this.element);
        LIZ.append(", paramName=");
        LIZ.append(this.paramName);
        LIZ.append(", paramValue=");
        LIZ.append(this.paramValue);
        LIZ.append(", needEncryption=");
        LIZ.append(this.needEncryption);
        LIZ.append(", isEncrypted=");
        return C78920UyC.LIZIZ(LIZ, this.isEncrypted, ')', LIZ);
    }

    public final String getElement() {
        return this.element;
    }

    public final Boolean getNeedEncryption() {
        return this.needEncryption;
    }

    public final String getParamName() {
        return this.paramName;
    }

    public final String getParamValue() {
        return this.paramValue;
    }

    public final Boolean isEncrypted() {
        return this.isEncrypted;
    }

    public final void setParamValue(String str) {
        this.paramValue = str;
    }

    public PaymentElement(String str, String str2, String str3, Boolean bool, Boolean bool2) {
        this.element = str;
        this.paramName = str2;
        this.paramValue = str3;
        this.needEncryption = bool;
        this.isEncrypted = bool2;
    }

    public /* synthetic */ PaymentElement(String str, String str2, String str3, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) == 0 ? bool : null, (i & 16) != 0 ? Boolean.FALSE : bool2);
    }
}
