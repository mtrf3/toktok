package com.ss.android.ugc.aweme.account.login.twostep;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SendSmsCodeResponse {

    @InterfaceC65349Pkn("data")
    public final Data data;

    @InterfaceC65349Pkn("message")
    public final String message;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendSmsCodeResponse)) {
            return false;
        }
        SendSmsCodeResponse sendSmsCodeResponse = (SendSmsCodeResponse) obj;
        return o.LJ(this.message, sendSmsCodeResponse.message) && o.LJ(this.data, sendSmsCodeResponse.data);
    }

    public final int hashCode() {
        String str = this.message;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Data data = this.data;
        return hashCode + (data != null ? data.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SendSmsCodeResponse(message=");
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

        @InterfaceC65349Pkn("error_code")
        public final Integer errorCode;

        @InterfaceC65349Pkn("description")
        public final String errorDescription;

        @InterfaceC65349Pkn("mobile")
        public final String mobile;

        @InterfaceC65349Pkn("next_url")
        public final String nextUrl;

        @InterfaceC65349Pkn("retry_time")
        public final Integer retryTime;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return o.LJ(this.mobile, data.mobile) && o.LJ(this.retryTime, data.retryTime) && o.LJ(this.captcha, data.captcha) && o.LJ(this.errorDescription, data.errorDescription) && o.LJ(this.errorCode, data.errorCode) && o.LJ(this.nextUrl, data.nextUrl);
        }

        public final int hashCode() {
            String str = this.mobile;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.retryTime;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.captcha;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.errorDescription;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num2 = this.errorCode;
            int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str4 = this.nextUrl;
            return hashCode5 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Data(mobile=");
            LIZ.append(this.mobile);
            LIZ.append(", retryTime=");
            LIZ.append(this.retryTime);
            LIZ.append(", captcha=");
            LIZ.append(this.captcha);
            LIZ.append(", errorDescription=");
            LIZ.append(this.errorDescription);
            LIZ.append(", errorCode=");
            LIZ.append(this.errorCode);
            LIZ.append(", nextUrl=");
            return q.LIZIZ(LIZ, this.nextUrl, ')', LIZ);
        }

        public Data(String str, Integer num, String str2, String str3, Integer num2, String str4) {
            this.mobile = str;
            this.retryTime = num;
            this.captcha = str2;
            this.errorDescription = str3;
            this.errorCode = num2;
            this.nextUrl = str4;
        }
    }

    public SendSmsCodeResponse(String str, Data data) {
        this.message = str;
        this.data = data;
    }
}
