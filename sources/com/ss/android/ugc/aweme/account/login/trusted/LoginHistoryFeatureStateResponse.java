package com.ss.android.ugc.aweme.account.login.trusted;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class LoginHistoryFeatureStateResponse {

    @InterfaceC65349Pkn("data")
    public final Data data;

    @InterfaceC65349Pkn("message")
    public final String message;

    /* JADX WARN: Multi-variable type inference failed */
    public LoginHistoryFeatureStateResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginHistoryFeatureStateResponse)) {
            return false;
        }
        LoginHistoryFeatureStateResponse loginHistoryFeatureStateResponse = (LoginHistoryFeatureStateResponse) obj;
        return o.LJ(this.message, loginHistoryFeatureStateResponse.message) && o.LJ(this.data, loginHistoryFeatureStateResponse.data);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LoginHistoryFeatureStateResponse(message=");
        LIZ.append(this.message);
        LIZ.append(", data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* loaded from: classes2.dex */
    public static final class Data {

        @InterfaceC65349Pkn("user_device_record_status")
        public final int status;

        public Data() {
            this(0, 1, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && this.status == ((Data) obj).status;
        }

        public final int hashCode() {
            return this.status;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Data(status=");
            return b0.LIZJ(LIZ, this.status, ')', LIZ);
        }

        public Data(int i) {
            this.status = i;
        }

        public /* synthetic */ Data(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i);
        }
    }

    public final int hashCode() {
        int hashCode;
        String str = this.message;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        Data data = this.data;
        if (data != null) {
            i = data.status;
        }
        return i2 + i;
    }

    public LoginHistoryFeatureStateResponse(String str, Data data) {
        this.message = str;
        this.data = data;
    }

    public /* synthetic */ LoginHistoryFeatureStateResponse(String str, Data data, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : data);
    }
}
