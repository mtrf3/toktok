package com.ss.android.ugc.aweme.setting.api;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SafeEnvResponse {

    @InterfaceC65349Pkn("data")
    public final Data data;

    @InterfaceC65349Pkn("message")
    public final String message;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SafeEnvResponse)) {
            return false;
        }
        SafeEnvResponse safeEnvResponse = (SafeEnvResponse) obj;
        return o.LJ(this.message, safeEnvResponse.message) && o.LJ(this.data, safeEnvResponse.data);
    }

    public final int hashCode() {
        String str = this.message;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Data data = this.data;
        return hashCode + (data != null ? data.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SafeEnvResponse(message=");
        LIZ.append(this.message);
        LIZ.append(", data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* loaded from: classes2.dex */
    public static final class Data {

        @InterfaceC65349Pkn("error_code")
        public final int errorCode;

        @InterfaceC65349Pkn("safe")
        public final boolean isSafe;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return this.errorCode == data.errorCode && this.isSafe == data.isSafe;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int i = this.errorCode * 31;
            boolean z = this.isSafe;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            return i + i2;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Data(errorCode=");
            LIZ.append(this.errorCode);
            LIZ.append(", isSafe=");
            return C48339Iy7.LIZJ(LIZ, this.isSafe, ')', LIZ);
        }

        public Data(int i, boolean z) {
            this.errorCode = i;
            this.isSafe = z;
        }

        public /* synthetic */ Data(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, z);
        }
    }

    public SafeEnvResponse(String str, Data data) {
        this.message = str;
        this.data = data;
    }
}
