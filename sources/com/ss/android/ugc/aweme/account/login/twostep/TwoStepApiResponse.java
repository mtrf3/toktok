package com.ss.android.ugc.aweme.account.login.twostep;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class TwoStepApiResponse {

    @InterfaceC65349Pkn("data")
    public final Data data;

    @InterfaceC65349Pkn("message")
    public final String message;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TwoStepApiResponse)) {
            return false;
        }
        TwoStepApiResponse twoStepApiResponse = (TwoStepApiResponse) obj;
        return o.LJ(this.message, twoStepApiResponse.message) && o.LJ(this.data, twoStepApiResponse.data);
    }

    public final int hashCode() {
        String str = this.message;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Data data = this.data;
        return hashCode + (data != null ? data.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TwoStepApiResponse(message=");
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

        @InterfaceC65349Pkn("ticket")
        public final String ticket;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return o.LJ(this.ticket, data.ticket) && o.LJ(this.captcha, data.captcha) && o.LJ(this.errorCode, data.errorCode) && o.LJ(this.errorDescription, data.errorDescription);
        }

        public final int hashCode() {
            String str = this.ticket;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.captcha;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.errorCode;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str3 = this.errorDescription;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Data(ticket=");
            LIZ.append(this.ticket);
            LIZ.append(", captcha=");
            LIZ.append(this.captcha);
            LIZ.append(", errorCode=");
            LIZ.append(this.errorCode);
            LIZ.append(", errorDescription=");
            return q.LIZIZ(LIZ, this.errorDescription, ')', LIZ);
        }

        public Data(String str, String str2, Integer num, String str3) {
            this.ticket = str;
            this.captcha = str2;
            this.errorCode = num;
            this.errorDescription = str3;
        }
    }

    public TwoStepApiResponse(String str, Data data) {
        this.message = str;
        this.data = data;
    }
}
