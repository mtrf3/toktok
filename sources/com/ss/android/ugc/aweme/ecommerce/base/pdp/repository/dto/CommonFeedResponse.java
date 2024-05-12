package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class CommonFeedResponse {

    @InterfaceC65349Pkn("code")
    public final Integer code;

    @InterfaceC65349Pkn("module_da_info")
    public final String daInfo;

    @InterfaceC65349Pkn("data")
    public final CommonFeedData data;

    @InterfaceC65349Pkn("message")
    public final String message;

    /* JADX WARN: Multi-variable type inference failed */
    public CommonFeedResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonFeedResponse)) {
            return false;
        }
        CommonFeedResponse commonFeedResponse = (CommonFeedResponse) obj;
        return o.LJ(this.code, commonFeedResponse.code) && o.LJ(this.message, commonFeedResponse.message) && o.LJ(this.data, commonFeedResponse.data) && o.LJ(this.daInfo, commonFeedResponse.daInfo);
    }

    public final int hashCode() {
        Integer num = this.code;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CommonFeedData commonFeedData = this.data;
        int hashCode3 = (hashCode2 + (commonFeedData == null ? 0 : commonFeedData.hashCode())) * 31;
        String str2 = this.daInfo;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommonFeedResponse(code=");
        LIZ.append(this.code);
        LIZ.append(", message=");
        LIZ.append(this.message);
        LIZ.append(", data=");
        LIZ.append(this.data);
        LIZ.append(", daInfo=");
        return q.LIZIZ(LIZ, this.daInfo, ')', LIZ);
    }

    public CommonFeedResponse(Integer num, String str, CommonFeedData commonFeedData, String str2) {
        this.code = num;
        this.message = str;
        this.data = commonFeedData;
        this.daInfo = str2;
    }

    public /* synthetic */ CommonFeedResponse(Integer num, String str, CommonFeedData commonFeedData, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : commonFeedData, (i & 8) != 0 ? null : str2);
    }
}
