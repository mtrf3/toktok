package com.ss.android.ugc.aweme.account.login.twostep;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AddVerificationResponse implements Serializable {

    @InterfaceC65349Pkn("data")
    public final Data data;

    @InterfaceC65349Pkn("message")
    public final String message;

    public static /* synthetic */ AddVerificationResponse copy$default(AddVerificationResponse addVerificationResponse, String str, Data data, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addVerificationResponse.message;
        }
        if ((i & 2) != 0) {
            data = addVerificationResponse.data;
        }
        return addVerificationResponse.copy(str, data);
    }

    public final AddVerificationResponse copy(String str, Data data) {
        return new AddVerificationResponse(str, data);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddVerificationResponse)) {
            return false;
        }
        AddVerificationResponse addVerificationResponse = (AddVerificationResponse) obj;
        return o.LJ(this.message, addVerificationResponse.message) && o.LJ(this.data, addVerificationResponse.data);
    }

    public int hashCode() {
        String str = this.message;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Data data = this.data;
        return hashCode + (data != null ? data.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AddVerificationResponse(message=");
        LIZ.append(this.message);
        LIZ.append(", data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* loaded from: classes7.dex */
    public static final class Data implements Serializable {

        @InterfaceC65349Pkn("default_verify_way")
        public final String default_verify_way;

        @InterfaceC65349Pkn("error_code")
        public final Integer errorCode;

        @InterfaceC65349Pkn("description")
        public final String errorDescription;

        @InterfaceC65349Pkn("two_step_verify_ways")
        public final List<VerifyWay> two_step_verify_ways;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Data copy$default(Data data, List list, String str, String str2, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                list = data.two_step_verify_ways;
            }
            if ((i & 2) != 0) {
                str = data.default_verify_way;
            }
            if ((i & 4) != 0) {
                str2 = data.errorDescription;
            }
            if ((i & 8) != 0) {
                num = data.errorCode;
            }
            return data.copy(list, str, str2, num);
        }

        public final Data copy(List<VerifyWay> list, String str, String str2, Integer num) {
            return new Data(list, str, str2, num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return o.LJ(this.two_step_verify_ways, data.two_step_verify_ways) && o.LJ(this.default_verify_way, data.default_verify_way) && o.LJ(this.errorDescription, data.errorDescription) && o.LJ(this.errorCode, data.errorCode);
        }

        public int hashCode() {
            List<VerifyWay> list = this.two_step_verify_ways;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            String str = this.default_verify_way;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.errorDescription;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.errorCode;
            return hashCode3 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Data(two_step_verify_ways=");
            LIZ.append(this.two_step_verify_ways);
            LIZ.append(", default_verify_way=");
            LIZ.append(this.default_verify_way);
            LIZ.append(", errorDescription=");
            LIZ.append(this.errorDescription);
            LIZ.append(", errorCode=");
            return s0.LIZJ(LIZ, this.errorCode, ')', LIZ);
        }

        public final String getDefault_verify_way() {
            return this.default_verify_way;
        }

        public final Integer getErrorCode() {
            return this.errorCode;
        }

        public final String getErrorDescription() {
            return this.errorDescription;
        }

        public final List<VerifyWay> getTwo_step_verify_ways() {
            return this.two_step_verify_ways;
        }

        public Data(List<VerifyWay> list, String str, String str2, Integer num) {
            this.two_step_verify_ways = list;
            this.default_verify_way = str;
            this.errorDescription = str2;
            this.errorCode = num;
        }
    }

    public final Data getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public AddVerificationResponse(String str, Data data) {
        this.message = str;
        this.data = data;
    }
}
