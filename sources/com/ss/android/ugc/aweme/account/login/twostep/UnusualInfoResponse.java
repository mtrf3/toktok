package com.ss.android.ugc.aweme.account.login.twostep;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UnusualInfoResponse implements Serializable {

    @InterfaceC65349Pkn("data")
    public final Data data;

    @InterfaceC65349Pkn("message")
    public final String message;

    public static /* synthetic */ UnusualInfoResponse copy$default(UnusualInfoResponse unusualInfoResponse, String str, Data data, int i, Object obj) {
        if ((i & 1) != 0) {
            str = unusualInfoResponse.message;
        }
        if ((i & 2) != 0) {
            data = unusualInfoResponse.data;
        }
        return unusualInfoResponse.copy(str, data);
    }

    public final UnusualInfoResponse copy(String str, Data data) {
        return new UnusualInfoResponse(str, data);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnusualInfoResponse)) {
            return false;
        }
        UnusualInfoResponse unusualInfoResponse = (UnusualInfoResponse) obj;
        return o.LJ(this.message, unusualInfoResponse.message) && o.LJ(this.data, unusualInfoResponse.data);
    }

    public int hashCode() {
        String str = this.message;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Data data = this.data;
        return hashCode + (data != null ? data.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UnusualInfoResponse(message=");
        LIZ.append(this.message);
        LIZ.append(", data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* loaded from: classes2.dex */
    public static final class Data implements Serializable {

        @InterfaceC65349Pkn("error_code")
        public final Integer errorCode;

        @InterfaceC65349Pkn("description")
        public final String errorDescription;

        @InterfaceC65349Pkn("new_notice")
        public final Integer new_notice;

        public static /* synthetic */ Data copy$default(Data data, Integer num, String str, Integer num2, int i, Object obj) {
            if ((i & 1) != 0) {
                num = data.new_notice;
            }
            if ((i & 2) != 0) {
                str = data.errorDescription;
            }
            if ((i & 4) != 0) {
                num2 = data.errorCode;
            }
            return data.copy(num, str, num2);
        }

        public final Data copy(Integer num, String str, Integer num2) {
            return new Data(num, str, num2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return o.LJ(this.new_notice, data.new_notice) && o.LJ(this.errorDescription, data.errorDescription) && o.LJ(this.errorCode, data.errorCode);
        }

        public int hashCode() {
            Integer num = this.new_notice;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.errorDescription;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num2 = this.errorCode;
            return hashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Data(new_notice=");
            LIZ.append(this.new_notice);
            LIZ.append(", errorDescription=");
            LIZ.append(this.errorDescription);
            LIZ.append(", errorCode=");
            return s0.LIZJ(LIZ, this.errorCode, ')', LIZ);
        }

        public final Integer getErrorCode() {
            return this.errorCode;
        }

        public final String getErrorDescription() {
            return this.errorDescription;
        }

        public final Integer getNew_notice() {
            return this.new_notice;
        }

        public Data(Integer num, String str, Integer num2) {
            this.new_notice = num;
            this.errorDescription = str;
            this.errorCode = num2;
        }
    }

    public final Data getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public UnusualInfoResponse(String str, Data data) {
        this.message = str;
        this.data = data;
    }
}
