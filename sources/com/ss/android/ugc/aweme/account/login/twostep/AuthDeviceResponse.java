package com.ss.android.ugc.aweme.account.login.twostep;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AuthDeviceResponse implements Serializable {

    @InterfaceC65349Pkn("data")
    public final Data data;

    @InterfaceC65349Pkn("message")
    public final String message;

    public static /* synthetic */ AuthDeviceResponse copy$default(AuthDeviceResponse authDeviceResponse, String str, Data data, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authDeviceResponse.message;
        }
        if ((i & 2) != 0) {
            data = authDeviceResponse.data;
        }
        return authDeviceResponse.copy(str, data);
    }

    public final AuthDeviceResponse copy(String str, Data data) {
        return new AuthDeviceResponse(str, data);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthDeviceResponse)) {
            return false;
        }
        AuthDeviceResponse authDeviceResponse = (AuthDeviceResponse) obj;
        return o.LJ(this.message, authDeviceResponse.message) && o.LJ(this.data, authDeviceResponse.data);
    }

    public int hashCode() {
        String str = this.message;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Data data = this.data;
        return hashCode + (data != null ? data.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AuthDeviceResponse(message=");
        LIZ.append(this.message);
        LIZ.append(", data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* loaded from: classes7.dex */
    public static final class Data implements Serializable {

        @InterfaceC65349Pkn("auth_device")
        public final List<Device> auth_device;

        @InterfaceC65349Pkn("error_code")
        public final Integer errorCode;

        @InterfaceC65349Pkn("description")
        public final String errorDescription;

        @InterfaceC65349Pkn("ticket")
        public final String ticket;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Data copy$default(Data data, List list, String str, Integer num, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                list = data.auth_device;
            }
            if ((i & 2) != 0) {
                str = data.errorDescription;
            }
            if ((i & 4) != 0) {
                num = data.errorCode;
            }
            if ((i & 8) != 0) {
                str2 = data.ticket;
            }
            return data.copy(list, str, num, str2);
        }

        public final Data copy(List<Device> list, String str, Integer num, String str2) {
            return new Data(list, str, num, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return o.LJ(this.auth_device, data.auth_device) && o.LJ(this.errorDescription, data.errorDescription) && o.LJ(this.errorCode, data.errorCode) && o.LJ(this.ticket, data.ticket);
        }

        public int hashCode() {
            List<Device> list = this.auth_device;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            String str = this.errorDescription;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.errorCode;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.ticket;
            return hashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Data(auth_device=");
            LIZ.append(this.auth_device);
            LIZ.append(", errorDescription=");
            LIZ.append(this.errorDescription);
            LIZ.append(", errorCode=");
            LIZ.append(this.errorCode);
            LIZ.append(", ticket=");
            return q.LIZIZ(LIZ, this.ticket, ')', LIZ);
        }

        public final List<Device> getAuth_device() {
            return this.auth_device;
        }

        public final Integer getErrorCode() {
            return this.errorCode;
        }

        public final String getErrorDescription() {
            return this.errorDescription;
        }

        public final String getTicket() {
            return this.ticket;
        }

        public Data(List<Device> list, String str, Integer num, String str2) {
            this.auth_device = list;
            this.errorDescription = str;
            this.errorCode = num;
            this.ticket = str2;
        }
    }

    public final Data getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public AuthDeviceResponse(String str, Data data) {
        this.message = str;
        this.data = data;
    }
}
