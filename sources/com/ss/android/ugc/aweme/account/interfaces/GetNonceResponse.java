package com.ss.android.ugc.aweme.account.interfaces;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GetNonceResponse {

    @InterfaceC65349Pkn("data")
    public final Data data;

    @InterfaceC65349Pkn("message")
    public final String message;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetNonceResponse)) {
            return false;
        }
        GetNonceResponse getNonceResponse = (GetNonceResponse) obj;
        return o.LJ(this.message, getNonceResponse.message) && o.LJ(this.data, getNonceResponse.data);
    }

    public final int hashCode() {
        String str = this.message;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Data data = this.data;
        return hashCode + (data != null ? data.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GetNonceResponse(message=");
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

        @InterfaceC65349Pkn("nonce")
        public final String nonce;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return o.LJ(this.nonce, data.nonce) && o.LJ(this.description, data.description);
        }

        public final int hashCode() {
            return this.description.hashCode() + (this.nonce.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Data(nonce=");
            LIZ.append(this.nonce);
            LIZ.append(", description=");
            return q.LIZIZ(LIZ, this.description, ')', LIZ);
        }

        public Data(String nonce, String description) {
            o.LJIIIZ(nonce, "nonce");
            o.LJIIIZ(description, "description");
            this.nonce = nonce;
            this.description = description;
        }
    }

    public GetNonceResponse(String str, Data data) {
        this.message = str;
        this.data = data;
    }
}
