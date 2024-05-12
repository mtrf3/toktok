package com.ss.android.ugc.aweme.account.login.auth.ui.ru_instant_login;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class GetTicketResponse {

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
        if (!(obj instanceof GetTicketResponse)) {
            return false;
        }
        GetTicketResponse getTicketResponse = (GetTicketResponse) obj;
        return o.LJ(this.message, getTicketResponse.message) && o.LJ(this.data, getTicketResponse.data) && this.code == getTicketResponse.code;
    }

    public final int hashCode() {
        int hashCode = this.message.hashCode() * 31;
        Data data = this.data;
        return ((hashCode + (data == null ? 0 : data.hashCode())) * 31) + this.code;
    }

    /* loaded from: classes15.dex */
    public static final class Data {

        @InterfaceC65349Pkn("method")
        public final String method;

        @InterfaceC65349Pkn("ticket")
        public final String ticket;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return o.LJ(this.ticket, data.ticket) && o.LJ(this.method, data.method);
        }

        public final int hashCode() {
            String str = this.ticket;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.method;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Data(ticket=");
            LIZ.append(this.ticket);
            LIZ.append(", method=");
            return q.LIZIZ(LIZ, this.method, ')', LIZ);
        }

        public Data(String str, String str2) {
            this.ticket = str;
            this.method = str2;
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GetTicketResponse(message=");
        LIZ.append(this.message);
        LIZ.append(", data=");
        LIZ.append(this.data);
        LIZ.append(", code=");
        return b0.LIZJ(LIZ, this.code, ')', LIZ);
    }

    public GetTicketResponse(String message, Data data, int i) {
        o.LJIIIZ(message, "message");
        this.message = message;
        this.data = data;
        this.code = i;
    }
}
