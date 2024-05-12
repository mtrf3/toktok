package com.ss.android.ugc.aweme.account.login.twostep;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SendEmailCodeResponse {

    @InterfaceC65349Pkn("data")
    public final Data data;

    @InterfaceC65349Pkn("message")
    public final String message;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendEmailCodeResponse)) {
            return false;
        }
        SendEmailCodeResponse sendEmailCodeResponse = (SendEmailCodeResponse) obj;
        return o.LJ(this.message, sendEmailCodeResponse.message) && o.LJ(this.data, sendEmailCodeResponse.data);
    }

    public final int hashCode() {
        String str = this.message;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Data data = this.data;
        return hashCode + (data != null ? data.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SendEmailCodeResponse(message=");
        LIZ.append(this.message);
        LIZ.append(", data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* loaded from: classes7.dex */
    public static final class Data {

        @InterfaceC65349Pkn("captcha")
        public final String captcha;

        @InterfaceC65349Pkn("email")
        public final String email;

        @InterfaceC65349Pkn("error_code")
        public final Integer errorCode;

        @InterfaceC65349Pkn("description")
        public final String errorDescription;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return o.LJ(this.email, data.email) && o.LJ(this.captcha, data.captcha) && o.LJ(this.errorDescription, data.errorDescription) && o.LJ(this.errorCode, data.errorCode);
        }

        public final int hashCode() {
            String str = this.email;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.captcha;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.errorDescription;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.errorCode;
            return hashCode3 + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Data(email=");
            LIZ.append(this.email);
            LIZ.append(", captcha=");
            LIZ.append(this.captcha);
            LIZ.append(", errorDescription=");
            LIZ.append(this.errorDescription);
            LIZ.append(", errorCode=");
            return s0.LIZJ(LIZ, this.errorCode, ')', LIZ);
        }

        public Data(String str, String str2, String str3, Integer num) {
            this.email = str;
            this.captcha = str2;
            this.errorDescription = str3;
            this.errorCode = num;
        }
    }

    public SendEmailCodeResponse(String str, Data data) {
        this.message = str;
        this.data = data;
    }
}
