package com.ss.android.ugc.aweme.account.login.auth.ui.ru_instant_login;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class GetTokenResponse {

    @InterfaceC65349Pkn("code")
    public final int code;

    @InterfaceC65349Pkn("data")
    public final Data data;

    @InterfaceC65349Pkn("message")
    public final String message;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetTokenResponse)) {
            return false;
        }
        GetTokenResponse getTokenResponse = (GetTokenResponse) obj;
        return o.LJ(this.message, getTokenResponse.message) && o.LJ(this.data, getTokenResponse.data) && this.code == getTokenResponse.code;
    }

    public final int hashCode() {
        int hashCode = this.message.hashCode() * 31;
        Data data = this.data;
        return ((hashCode + (data == null ? 0 : data.hashCode())) * 31) + this.code;
    }

    /* loaded from: classes7.dex */
    public static final class Data {

        @InterfaceC65349Pkn("token")
        public final String token;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && o.LJ(this.token, ((Data) obj).token);
        }

        public final int hashCode() {
            String str = this.token;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Data(token=");
            return q.LIZIZ(LIZ, this.token, ')', LIZ);
        }

        public Data(String str) {
            this.token = str;
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GetTokenResponse(message=");
        LIZ.append(this.message);
        LIZ.append(", data=");
        LIZ.append(this.data);
        LIZ.append(", code=");
        return b0.LIZJ(LIZ, this.code, ')', LIZ);
    }

    public GetTokenResponse(String message, Data data, int i) {
        o.LJIIIZ(message, "message");
        this.message = message;
        this.data = data;
        this.code = i;
    }
}
