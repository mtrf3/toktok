package com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PdpAddToShowcaseRequest {

    @InterfaceC65349Pkn("add_scene")
    public final Integer addScene;

    @InterfaceC65349Pkn("platform")
    public final Integer platform;

    @InterfaceC65349Pkn("product_ids")
    public final String productIds;

    @InterfaceC65349Pkn("requestFrom")
    public final Integer requestFrom;

    @InterfaceC65349Pkn("source_from")
    public final Integer sourceFrom;

    /* JADX WARN: Multi-variable type inference failed */
    public PdpAddToShowcaseRequest() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdpAddToShowcaseRequest)) {
            return false;
        }
        PdpAddToShowcaseRequest pdpAddToShowcaseRequest = (PdpAddToShowcaseRequest) obj;
        return o.LJ(this.productIds, pdpAddToShowcaseRequest.productIds) && o.LJ(this.sourceFrom, pdpAddToShowcaseRequest.sourceFrom) && o.LJ(this.platform, pdpAddToShowcaseRequest.platform) && o.LJ(this.requestFrom, pdpAddToShowcaseRequest.requestFrom) && o.LJ(this.addScene, pdpAddToShowcaseRequest.addScene);
    }

    public final int hashCode() {
        String str = this.productIds;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.sourceFrom;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.platform;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.requestFrom;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.addScene;
        return hashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PdpAddToShowcaseRequest(productIds=");
        LIZ.append(this.productIds);
        LIZ.append(", sourceFrom=");
        LIZ.append(this.sourceFrom);
        LIZ.append(", platform=");
        LIZ.append(this.platform);
        LIZ.append(", requestFrom=");
        LIZ.append(this.requestFrom);
        LIZ.append(", addScene=");
        return s0.LIZJ(LIZ, this.addScene, ')', LIZ);
    }

    public PdpAddToShowcaseRequest(String str, Integer num, Integer num2, Integer num3, Integer num4) {
        this.productIds = str;
        this.sourceFrom = num;
        this.platform = num2;
        this.requestFrom = num3;
        this.addScene = num4;
    }

    public /* synthetic */ PdpAddToShowcaseRequest(String str, Integer num, Integer num2, Integer num3, Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) == 0 ? num2 : null, (i & 8) != 0 ? 0 : num3, (i & 16) != 0 ? 0 : num4);
    }
}
