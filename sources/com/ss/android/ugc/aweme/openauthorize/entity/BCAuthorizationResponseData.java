package com.ss.android.ugc.aweme.openauthorize.entity;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class BCAuthorizationResponseData {

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("error_code")
    public final String errorCode;

    @InterfaceC65349Pkn("redirect_url")
    public final String redirectUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public BCAuthorizationResponseData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BCAuthorizationResponseData)) {
            return false;
        }
        BCAuthorizationResponseData bCAuthorizationResponseData = (BCAuthorizationResponseData) obj;
        return o.LJ(this.redirectUrl, bCAuthorizationResponseData.redirectUrl) && o.LJ(this.errorCode, bCAuthorizationResponseData.errorCode) && o.LJ(this.description, bCAuthorizationResponseData.description);
    }

    public final int hashCode() {
        String str = this.redirectUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.errorCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BCAuthorizationResponseData(redirectUrl=");
        LIZ.append(this.redirectUrl);
        LIZ.append(", errorCode=");
        LIZ.append(this.errorCode);
        LIZ.append(", description=");
        return q.LIZIZ(LIZ, this.description, ')', LIZ);
    }

    public BCAuthorizationResponseData(String str, String str2, String str3) {
        this.redirectUrl = str;
        this.errorCode = str2;
        this.description = str3;
    }

    public /* synthetic */ BCAuthorizationResponseData(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
