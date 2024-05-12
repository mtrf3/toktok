package com.ss.android.ugc.aweme.account.unbind;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UnbindResponse {

    @InterfaceC65349Pkn("data")
    public final Data data;

    @InterfaceC65349Pkn("message")
    public final String message;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnbindResponse)) {
            return false;
        }
        UnbindResponse unbindResponse = (UnbindResponse) obj;
        return o.LJ(this.message, unbindResponse.message) && o.LJ(this.data, unbindResponse.data);
    }

    public final int hashCode() {
        String str = this.message;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Data data = this.data;
        return hashCode + (data != null ? data.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UnbindResponse(message=");
        LIZ.append(this.message);
        LIZ.append(", data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* loaded from: classes2.dex */
    public static final class Data {

        @InterfaceC65349Pkn("description")
        public final String description;

        @InterfaceC65349Pkn("error_code")
        public int errorCode;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return this.errorCode == data.errorCode && o.LJ(this.description, data.description);
        }

        public final int hashCode() {
            int i = this.errorCode * 31;
            String str = this.description;
            return i + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Data(errorCode=");
            LIZ.append(this.errorCode);
            LIZ.append(", description=");
            return q.LIZIZ(LIZ, this.description, ')', LIZ);
        }

        public Data(int i, String str) {
            this.errorCode = i;
            this.description = str;
        }

        public /* synthetic */ Data(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, str);
        }
    }

    public UnbindResponse(String str, Data data) {
        this.message = str;
        this.data = data;
    }
}
