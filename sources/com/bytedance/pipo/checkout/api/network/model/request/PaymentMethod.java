package com.bytedance.pipo.checkout.api.network.model.request;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PaymentMethod {

    @InterfaceC65349Pkn("element_params")
    public PmsParams elementParams;

    @InterfaceC65349Pkn("method_id")
    public String methodId;

    @InterfaceC65349Pkn("method_params")
    public Map<String, String> methodParams;

    @InterfaceC65349Pkn("method_type")
    public String methodType;

    @InterfaceC65349Pkn("payment_elements")
    public List<PaymentElements> paymentElements;

    @InterfaceC65349Pkn("payment_method_token")
    public String paymentMethodToken;

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethod() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentMethod copy$default(PaymentMethod paymentMethod, String str, List list, PmsParams pmsParams, String str2, String str3, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentMethod.methodId;
        }
        if ((i & 2) != 0) {
            list = paymentMethod.paymentElements;
        }
        if ((i & 4) != 0) {
            pmsParams = paymentMethod.elementParams;
        }
        if ((i & 8) != 0) {
            str2 = paymentMethod.paymentMethodToken;
        }
        if ((i & 16) != 0) {
            str3 = paymentMethod.methodType;
        }
        if ((i & 32) != 0) {
            map = paymentMethod.methodParams;
        }
        return paymentMethod.copy(str, list, pmsParams, str2, str3, map);
    }

    public final PaymentMethod copy(String str, List<PaymentElements> paymentElements, PmsParams pmsParams, String str2, String str3, Map<String, String> map) {
        o.LJIIIZ(paymentElements, "paymentElements");
        return new PaymentMethod(str, paymentElements, pmsParams, str2, str3, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethod)) {
            return false;
        }
        PaymentMethod paymentMethod = (PaymentMethod) obj;
        return o.LJ(this.methodId, paymentMethod.methodId) && o.LJ(this.paymentElements, paymentMethod.paymentElements) && o.LJ(this.elementParams, paymentMethod.elementParams) && o.LJ(this.paymentMethodToken, paymentMethod.paymentMethodToken) && o.LJ(this.methodType, paymentMethod.methodType) && o.LJ(this.methodParams, paymentMethod.methodParams);
    }

    public int hashCode() {
        String str = this.methodId;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.paymentElements.hashCode()) * 31;
        PmsParams pmsParams = this.elementParams;
        int hashCode2 = (hashCode + (pmsParams == null ? 0 : pmsParams.hashCode())) * 31;
        String str2 = this.paymentMethodToken;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.methodType;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, String> map = this.methodParams;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaymentMethod(methodId=");
        LIZ.append((Object) this.methodId);
        LIZ.append(", paymentElements=");
        LIZ.append(this.paymentElements);
        LIZ.append(", elementParams=");
        LIZ.append(this.elementParams);
        LIZ.append(", paymentMethodToken=");
        LIZ.append((Object) this.paymentMethodToken);
        LIZ.append(", methodType=");
        LIZ.append((Object) this.methodType);
        LIZ.append(", methodParams=");
        LIZ.append(this.methodParams);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final PmsParams getElementParams() {
        return this.elementParams;
    }

    public final String getMethodId() {
        return this.methodId;
    }

    public final Map<String, String> getMethodParams() {
        return this.methodParams;
    }

    public final String getMethodType() {
        return this.methodType;
    }

    public final List<PaymentElements> getPaymentElements() {
        return this.paymentElements;
    }

    public final String getPaymentMethodToken() {
        return this.paymentMethodToken;
    }

    public final void setElementParams(PmsParams pmsParams) {
        this.elementParams = pmsParams;
    }

    public final void setMethodId(String str) {
        this.methodId = str;
    }

    public final void setMethodParams(Map<String, String> map) {
        this.methodParams = map;
    }

    public final void setMethodType(String str) {
        this.methodType = str;
    }

    public final void setPaymentElements(List<PaymentElements> list) {
        o.LJIIIZ(list, "<set-?>");
        this.paymentElements = list;
    }

    public final void setPaymentMethodToken(String str) {
        this.paymentMethodToken = str;
    }

    public PaymentMethod(String str, List<PaymentElements> paymentElements, PmsParams pmsParams, String str2, String str3, Map<String, String> map) {
        o.LJIIIZ(paymentElements, "paymentElements");
        this.methodId = str;
        this.paymentElements = paymentElements;
        this.elementParams = pmsParams;
        this.paymentMethodToken = str2;
        this.methodType = str3;
        this.methodParams = map;
    }

    public /* synthetic */ PaymentMethod(String str, List list, PmsParams pmsParams, String str2, String str3, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? null : pmsParams, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) == 0 ? map : null);
    }
}
