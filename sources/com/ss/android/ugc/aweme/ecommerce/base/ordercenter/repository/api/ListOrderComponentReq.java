package com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ListOrderComponentReq {

    @InterfaceC65349Pkn("component_type")
    public final int componentType;

    @InterfaceC65349Pkn("list_order_prompt")
    public final ListOrderPromptReq listOrderPrompt;

    @InterfaceC65349Pkn("list_order_req")
    public final LinkedHashMap<String, Object> listOrderReq;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListOrderComponentReq)) {
            return false;
        }
        ListOrderComponentReq listOrderComponentReq = (ListOrderComponentReq) obj;
        return this.componentType == listOrderComponentReq.componentType && o.LJ(this.listOrderReq, listOrderComponentReq.listOrderReq) && o.LJ(this.listOrderPrompt, listOrderComponentReq.listOrderPrompt);
    }

    public final int hashCode() {
        int i = this.componentType * 31;
        LinkedHashMap<String, Object> linkedHashMap = this.listOrderReq;
        int hashCode = (i + (linkedHashMap == null ? 0 : linkedHashMap.hashCode())) * 31;
        ListOrderPromptReq listOrderPromptReq = this.listOrderPrompt;
        return hashCode + (listOrderPromptReq != null ? listOrderPromptReq.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ListOrderComponentReq(componentType=");
        LIZ.append(this.componentType);
        LIZ.append(", listOrderReq=");
        LIZ.append(this.listOrderReq);
        LIZ.append(", listOrderPrompt=");
        LIZ.append(this.listOrderPrompt);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public ListOrderComponentReq(int i, LinkedHashMap<String, Object> linkedHashMap, ListOrderPromptReq listOrderPromptReq) {
        this.componentType = i;
        this.listOrderReq = linkedHashMap;
        this.listOrderPrompt = listOrderPromptReq;
    }

    public /* synthetic */ ListOrderComponentReq(int i, LinkedHashMap linkedHashMap, ListOrderPromptReq listOrderPromptReq, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : linkedHashMap, (i2 & 4) != 0 ? null : listOrderPromptReq);
    }
}
