package com.ss.android.ugc.aweme.account.login.twostep;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class VerifyTOTPResponse implements Serializable {

    @InterfaceC65349Pkn("data")
    public final VerifyData data;

    @InterfaceC65349Pkn("message")
    public final String message;

    public static /* synthetic */ VerifyTOTPResponse copy$default(VerifyTOTPResponse verifyTOTPResponse, VerifyData verifyData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            verifyData = verifyTOTPResponse.data;
        }
        if ((i & 2) != 0) {
            str = verifyTOTPResponse.message;
        }
        return verifyTOTPResponse.copy(verifyData, str);
    }

    public final VerifyTOTPResponse copy(VerifyData verifyData, String str) {
        return new VerifyTOTPResponse(verifyData, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyTOTPResponse)) {
            return false;
        }
        VerifyTOTPResponse verifyTOTPResponse = (VerifyTOTPResponse) obj;
        return o.LJ(this.data, verifyTOTPResponse.data) && o.LJ(this.message, verifyTOTPResponse.message);
    }

    public int hashCode() {
        VerifyData verifyData = this.data;
        int hashCode = (verifyData == null ? 0 : verifyData.hashCode()) * 31;
        String str = this.message;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    /* loaded from: classes7.dex */
    public static final class VerifyData implements Serializable {

        @InterfaceC65349Pkn("description")
        public final String description;

        @InterfaceC65349Pkn("error_code")
        public final Integer errorCode;

        @InterfaceC65349Pkn("ticket")
        public final String ticket;

        public static /* synthetic */ VerifyData copy$default(VerifyData verifyData, String str, String str2, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = verifyData.ticket;
            }
            if ((i & 2) != 0) {
                str2 = verifyData.description;
            }
            if ((i & 4) != 0) {
                num = verifyData.errorCode;
            }
            return verifyData.copy(str, str2, num);
        }

        public final VerifyData copy(String str, String str2, Integer num) {
            return new VerifyData(str, str2, num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VerifyData)) {
                return false;
            }
            VerifyData verifyData = (VerifyData) obj;
            return o.LJ(this.ticket, verifyData.ticket) && o.LJ(this.description, verifyData.description) && o.LJ(this.errorCode, verifyData.errorCode);
        }

        public int hashCode() {
            String str = this.ticket;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.description;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.errorCode;
            return hashCode2 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VerifyData(ticket=");
            LIZ.append(this.ticket);
            LIZ.append(", description=");
            LIZ.append(this.description);
            LIZ.append(", errorCode=");
            return s0.LIZJ(LIZ, this.errorCode, ')', LIZ);
        }

        public final String getDescription() {
            return this.description;
        }

        public final Integer getErrorCode() {
            return this.errorCode;
        }

        public final String getTicket() {
            return this.ticket;
        }

        public VerifyData(String str, String str2, Integer num) {
            this.ticket = str;
            this.description = str2;
            this.errorCode = num;
        }
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VerifyTOTPResponse(data=");
        LIZ.append(this.data);
        LIZ.append(", message=");
        return q.LIZIZ(LIZ, this.message, ')', LIZ);
    }

    public final VerifyData getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public VerifyTOTPResponse(VerifyData verifyData, String str) {
        this.data = verifyData;
        this.message = str;
    }
}
