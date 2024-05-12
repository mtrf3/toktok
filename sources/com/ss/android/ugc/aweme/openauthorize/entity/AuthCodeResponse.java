package com.ss.android.ugc.aweme.openauthorize.entity;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AuthCodeResponse {

    @InterfaceC65349Pkn("code")
    public final String code;

    @InterfaceC65349Pkn("error")
    public final String error;

    @InterfaceC65349Pkn("error_code")
    public final Integer errorCode;

    @InterfaceC65349Pkn("error_description")
    public final String errorDescription;

    @InterfaceC65349Pkn("error_message")
    public final String errorMessage;

    @InterfaceC65349Pkn("redirect_url")
    public final String redirectUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public AuthCodeResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthCodeResponse)) {
            return false;
        }
        AuthCodeResponse authCodeResponse = (AuthCodeResponse) obj;
        return o.LJ(this.code, authCodeResponse.code) && o.LJ(this.error, authCodeResponse.error) && o.LJ(this.errorDescription, authCodeResponse.errorDescription) && o.LJ(this.errorCode, authCodeResponse.errorCode) && o.LJ(this.errorMessage, authCodeResponse.errorMessage) && o.LJ(this.redirectUrl, authCodeResponse.redirectUrl);
    }

    public final int hashCode() {
        String str = this.code;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.error;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorDescription;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.errorCode;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.errorMessage;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.redirectUrl;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AuthCodeResponse(code=");
        LIZ.append(this.code);
        LIZ.append(", error=");
        LIZ.append(this.error);
        LIZ.append(", errorDescription=");
        LIZ.append(this.errorDescription);
        LIZ.append(", errorCode=");
        LIZ.append(this.errorCode);
        LIZ.append(", errorMessage=");
        LIZ.append(this.errorMessage);
        LIZ.append(", redirectUrl=");
        return q.LIZIZ(LIZ, this.redirectUrl, ')', LIZ);
    }

    public AuthCodeResponse(String str, String str2, String str3, Integer num, String str4, String str5) {
        this.code = str;
        this.error = str2;
        this.errorDescription = str3;
        this.errorCode = num;
        this.errorMessage = str4;
        this.redirectUrl = str5;
    }

    public /* synthetic */ AuthCodeResponse(String str, String str2, String str3, Integer num, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str4, (i & 32) == 0 ? str5 : null);
    }
}
