package com.ss.android.ugc.aweme.account.login.trusted;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TrustedUsersResponse {

    @InterfaceC65349Pkn("data")
    public final Data data;

    @InterfaceC65349Pkn("message")
    public final String message;

    /* JADX WARN: Multi-variable type inference failed */
    public TrustedUsersResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrustedUsersResponse)) {
            return false;
        }
        TrustedUsersResponse trustedUsersResponse = (TrustedUsersResponse) obj;
        return o.LJ(this.message, trustedUsersResponse.message) && o.LJ(this.data, trustedUsersResponse.data);
    }

    public final int hashCode() {
        String str = this.message;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Data data = this.data;
        return hashCode + (data != null ? data.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TrustedUsersResponse(message=");
        LIZ.append(this.message);
        LIZ.append(", data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* loaded from: classes2.dex */
    public static final class Data {

        @InterfaceC65349Pkn("trust_users")
        public final List<TrustedEnvUser> records;

        /* JADX WARN: Multi-variable type inference failed */
        public Data() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && o.LJ(this.records, ((Data) obj).records);
        }

        public final int hashCode() {
            List<TrustedEnvUser> list = this.records;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Data(records=");
            return C1NE.LIZIZ(LIZ, this.records, ')', LIZ);
        }

        public Data(List<TrustedEnvUser> list) {
            this.records = list;
        }

        public /* synthetic */ Data(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list);
        }
    }

    public TrustedUsersResponse(String str, Data data) {
        this.message = str;
        this.data = data;
    }

    public /* synthetic */ TrustedUsersResponse(String str, Data data, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : data);
    }
}
