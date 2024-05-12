package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.U26;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PdpRecallBoxRequest {

    @InterfaceC65349Pkn("product_id")
    public final List<String> productId;

    @InterfaceC65349Pkn("template")
    public final String template;

    @InterfaceC65349Pkn("traffic_source_list")
    public final Object trafficSourceList;

    /* JADX WARN: Multi-variable type inference failed */
    public PdpRecallBoxRequest() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdpRecallBoxRequest)) {
            return false;
        }
        PdpRecallBoxRequest pdpRecallBoxRequest = (PdpRecallBoxRequest) obj;
        return o.LJ(this.template, pdpRecallBoxRequest.template) && o.LJ(this.productId, pdpRecallBoxRequest.productId) && o.LJ(this.trafficSourceList, pdpRecallBoxRequest.trafficSourceList);
    }

    public final int hashCode() {
        String str = this.template;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.productId;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Object obj = this.trafficSourceList;
        return hashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PdpRecallBoxRequest(template=");
        LIZ.append(this.template);
        LIZ.append(", productId=");
        LIZ.append(this.productId);
        LIZ.append(", trafficSourceList=");
        return U26.LIZJ(LIZ, this.trafficSourceList, ')', LIZ);
    }

    public PdpRecallBoxRequest(String str, List<String> list, Object obj) {
        this.template = str;
        this.productId = list;
        this.trafficSourceList = obj;
    }

    public /* synthetic */ PdpRecallBoxRequest(String str, List list, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : obj);
    }
}
