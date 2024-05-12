package com.ss.android.ugc.aweme.setting.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UnbindValidateResponse {

    @InterfaceC65349Pkn("data")
    public final Data data;

    @InterfaceC65349Pkn("message")
    public final String message;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnbindValidateResponse)) {
            return false;
        }
        UnbindValidateResponse unbindValidateResponse = (UnbindValidateResponse) obj;
        return o.LJ(this.message, unbindValidateResponse.message) && o.LJ(this.data, unbindValidateResponse.data);
    }

    public final int hashCode() {
        String str = this.message;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Data data = this.data;
        return hashCode + (data != null ? data.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UnbindValidateResponse(message=");
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

        @InterfaceC65349Pkn("extra_eligible_login_methods")
        public final ArrayList<String> extraEligibleLoginMethod;

        /* JADX WARN: Multi-variable type inference failed */
        public Data() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return this.errorCode == data.errorCode && o.LJ(this.extraEligibleLoginMethod, data.extraEligibleLoginMethod);
        }

        public final int hashCode() {
            int i = this.errorCode * 31;
            ArrayList<String> arrayList = this.extraEligibleLoginMethod;
            return i + (arrayList == null ? 0 : arrayList.hashCode());
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Data(errorCode=");
            LIZ.append(this.errorCode);
            LIZ.append(", extraEligibleLoginMethod=");
            LIZ.append(this.extraEligibleLoginMethod);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public Data(int i, ArrayList<String> arrayList) {
            this.errorCode = i;
            this.extraEligibleLoginMethod = arrayList;
        }

        public /* synthetic */ Data(int i, ArrayList arrayList, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : arrayList);
        }
    }

    public UnbindValidateResponse(String str, Data data) {
        this.message = str;
        this.data = data;
    }
}
