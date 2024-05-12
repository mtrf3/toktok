package com.bytedance.pipo.checkout.api.network.model.response;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class MandateElement {

    @InterfaceC65349Pkn("attribute_object")
    public String attributeObject;

    @InterfaceC65349Pkn("mandate_element_param_name")
    public String mandateElementParamName;

    /* JADX WARN: Multi-variable type inference failed */
    public MandateElement() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MandateElement copy$default(MandateElement mandateElement, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mandateElement.mandateElementParamName;
        }
        if ((i & 2) != 0) {
            str2 = mandateElement.attributeObject;
        }
        return mandateElement.copy(str, str2);
    }

    public final MandateElement copy(String str, String str2) {
        return new MandateElement(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MandateElement)) {
            return false;
        }
        MandateElement mandateElement = (MandateElement) obj;
        return o.LJ(this.mandateElementParamName, mandateElement.mandateElementParamName) && o.LJ(this.attributeObject, mandateElement.attributeObject);
    }

    public int hashCode() {
        String str = this.mandateElementParamName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.attributeObject;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MandateElement(mandateElementParamName=");
        LIZ.append((Object) this.mandateElementParamName);
        LIZ.append(", attributeObject=");
        LIZ.append((Object) this.attributeObject);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getAttributeObject() {
        return this.attributeObject;
    }

    public final String getMandateElementParamName() {
        return this.mandateElementParamName;
    }

    public final void setAttributeObject(String str) {
        this.attributeObject = str;
    }

    public final void setMandateElementParamName(String str) {
        this.mandateElementParamName = str;
    }

    public MandateElement(String str, String str2) {
        this.mandateElementParamName = str;
        this.attributeObject = str2;
    }

    public /* synthetic */ MandateElement(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
