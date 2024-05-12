package com.ss.android.ugc.aweme.account.login.twostep;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class BindOrUpdateTOTPResponse implements Serializable {

    @InterfaceC65349Pkn("data")
    public final RegisterData data;

    @InterfaceC65349Pkn("message")
    public final String message;

    public static /* synthetic */ BindOrUpdateTOTPResponse copy$default(BindOrUpdateTOTPResponse bindOrUpdateTOTPResponse, RegisterData registerData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            registerData = bindOrUpdateTOTPResponse.data;
        }
        if ((i & 2) != 0) {
            str = bindOrUpdateTOTPResponse.message;
        }
        return bindOrUpdateTOTPResponse.copy(registerData, str);
    }

    public final BindOrUpdateTOTPResponse copy(RegisterData registerData, String str) {
        return new BindOrUpdateTOTPResponse(registerData, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BindOrUpdateTOTPResponse)) {
            return false;
        }
        BindOrUpdateTOTPResponse bindOrUpdateTOTPResponse = (BindOrUpdateTOTPResponse) obj;
        return o.LJ(this.data, bindOrUpdateTOTPResponse.data) && o.LJ(this.message, bindOrUpdateTOTPResponse.message);
    }

    public int hashCode() {
        RegisterData registerData = this.data;
        int hashCode = (registerData == null ? 0 : registerData.hashCode()) * 31;
        String str = this.message;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    /* loaded from: classes7.dex */
    public static final class RegisterData implements Serializable {

        @InterfaceC65349Pkn("description")
        public final String description;

        @InterfaceC65349Pkn("error_code")
        public final Integer errorCode;

        @InterfaceC65349Pkn("totp_key_uri")
        public final String totpKeyUri;

        @InterfaceC65349Pkn("totp_secret")
        public final String totpSecret;

        public static /* synthetic */ RegisterData copy$default(RegisterData registerData, String str, String str2, String str3, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = registerData.totpSecret;
            }
            if ((i & 2) != 0) {
                str2 = registerData.totpKeyUri;
            }
            if ((i & 4) != 0) {
                str3 = registerData.description;
            }
            if ((i & 8) != 0) {
                num = registerData.errorCode;
            }
            return registerData.copy(str, str2, str3, num);
        }

        public final RegisterData copy(String str, String str2, String str3, Integer num) {
            return new RegisterData(str, str2, str3, num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RegisterData)) {
                return false;
            }
            RegisterData registerData = (RegisterData) obj;
            return o.LJ(this.totpSecret, registerData.totpSecret) && o.LJ(this.totpKeyUri, registerData.totpKeyUri) && o.LJ(this.description, registerData.description) && o.LJ(this.errorCode, registerData.errorCode);
        }

        public int hashCode() {
            String str = this.totpSecret;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.totpKeyUri;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.description;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.errorCode;
            return hashCode3 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("RegisterData(totpSecret=");
            LIZ.append(this.totpSecret);
            LIZ.append(", totpKeyUri=");
            LIZ.append(this.totpKeyUri);
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

        public final String getTotpKeyUri() {
            return this.totpKeyUri;
        }

        public final String getTotpSecret() {
            return this.totpSecret;
        }

        public RegisterData(String str, String str2, String str3, Integer num) {
            this.totpSecret = str;
            this.totpKeyUri = str2;
            this.description = str3;
            this.errorCode = num;
        }
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BindOrUpdateTOTPResponse(data=");
        LIZ.append(this.data);
        LIZ.append(", message=");
        return q.LIZIZ(LIZ, this.message, ')', LIZ);
    }

    public final RegisterData getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public BindOrUpdateTOTPResponse(RegisterData registerData, String str) {
        this.data = registerData;
        this.message = str;
    }
}
