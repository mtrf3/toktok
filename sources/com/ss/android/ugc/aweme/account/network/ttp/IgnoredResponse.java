package com.ss.android.ugc.aweme.account.network.ttp;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IgnoredResponse {

    @InterfaceC65349Pkn("data")
    public final Data data;

    @InterfaceC65349Pkn("message")
    public final String message;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IgnoredResponse)) {
            return false;
        }
        IgnoredResponse ignoredResponse = (IgnoredResponse) obj;
        return o.LJ(this.message, ignoredResponse.message) && o.LJ(this.data, ignoredResponse.data);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IgnoredResponse(message=");
        LIZ.append(this.message);
        LIZ.append(", data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* loaded from: classes2.dex */
    public static final class Data {

        @InterfaceC65349Pkn("error_code")
        public int errorCode;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && this.errorCode == ((Data) obj).errorCode;
        }

        public final int hashCode() {
            return this.errorCode;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Data(errorCode=");
            return b0.LIZJ(LIZ, this.errorCode, ')', LIZ);
        }

        public Data(int i) {
            this.errorCode = i;
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
            i = data.errorCode;
        }
        return i2 + i;
    }

    public IgnoredResponse(String str, Data data) {
        this.message = str;
        this.data = data;
    }
}
