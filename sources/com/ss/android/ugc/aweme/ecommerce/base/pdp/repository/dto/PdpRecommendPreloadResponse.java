package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PdpRecommendPreloadResponse {
    public static final /* synthetic */ int LIZ = 0;

    @InterfaceC65349Pkn("code")
    public final Integer code;

    @InterfaceC65349Pkn("data_str")
    public final String data;

    @InterfaceC65349Pkn("message")
    public final String message;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdpRecommendPreloadResponse)) {
            return false;
        }
        PdpRecommendPreloadResponse pdpRecommendPreloadResponse = (PdpRecommendPreloadResponse) obj;
        return o.LJ(this.code, pdpRecommendPreloadResponse.code) && o.LJ(this.message, pdpRecommendPreloadResponse.message) && o.LJ(this.data, pdpRecommendPreloadResponse.data);
    }

    public final int hashCode() {
        Integer num = this.code;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.data;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("PdpRecommendPreloadResponse(code=");
        LIZ2.append(this.code);
        LIZ2.append(", message=");
        LIZ2.append(this.message);
        LIZ2.append(", data=");
        return q.LIZIZ(LIZ2, this.data, ')', LIZ2);
    }

    public PdpRecommendPreloadResponse(Integer num, String str, String str2) {
        this.code = num;
        this.message = str;
        this.data = str2;
    }

    public /* synthetic */ PdpRecommendPreloadResponse(Integer num, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1 : num, str, (i & 4) != 0 ? null : str2);
    }
}
