package com.ss.android.ugc.aweme.account.login.twostep;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class BindVerifyResponse implements Serializable {

    @InterfaceC65349Pkn("data")
    public final BindErrorData data;

    @InterfaceC65349Pkn("message")
    public final String message;

    public static /* synthetic */ BindVerifyResponse copy$default(BindVerifyResponse bindVerifyResponse, BindErrorData bindErrorData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bindErrorData = bindVerifyResponse.data;
        }
        if ((i & 2) != 0) {
            str = bindVerifyResponse.message;
        }
        return bindVerifyResponse.copy(bindErrorData, str);
    }

    public final BindVerifyResponse copy(BindErrorData bindErrorData, String str) {
        return new BindVerifyResponse(bindErrorData, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BindVerifyResponse)) {
            return false;
        }
        BindVerifyResponse bindVerifyResponse = (BindVerifyResponse) obj;
        return o.LJ(this.data, bindVerifyResponse.data) && o.LJ(this.message, bindVerifyResponse.message);
    }

    public int hashCode() {
        BindErrorData bindErrorData = this.data;
        int hashCode = (bindErrorData == null ? 0 : bindErrorData.hashCode()) * 31;
        String str = this.message;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    /* loaded from: classes2.dex */
    public static final class BindErrorData implements Serializable {

        @InterfaceC65349Pkn("description")
        public final String description;

        @InterfaceC65349Pkn("error_code")
        public final Integer errorCode;

        public static /* synthetic */ BindErrorData copy$default(BindErrorData bindErrorData, String str, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bindErrorData.description;
            }
            if ((i & 2) != 0) {
                num = bindErrorData.errorCode;
            }
            return bindErrorData.copy(str, num);
        }

        public final BindErrorData copy(String str, Integer num) {
            return new BindErrorData(str, num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BindErrorData)) {
                return false;
            }
            BindErrorData bindErrorData = (BindErrorData) obj;
            return o.LJ(this.description, bindErrorData.description) && o.LJ(this.errorCode, bindErrorData.errorCode);
        }

        public int hashCode() {
            String str = this.description;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.errorCode;
            return hashCode + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BindErrorData(description=");
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

        public BindErrorData(String str, Integer num) {
            this.description = str;
            this.errorCode = num;
        }
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BindVerifyResponse(data=");
        LIZ.append(this.data);
        LIZ.append(", message=");
        return q.LIZIZ(LIZ, this.message, ')', LIZ);
    }

    public final BindErrorData getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public BindVerifyResponse(BindErrorData bindErrorData, String str) {
        this.data = bindErrorData;
        this.message = str;
    }
}
