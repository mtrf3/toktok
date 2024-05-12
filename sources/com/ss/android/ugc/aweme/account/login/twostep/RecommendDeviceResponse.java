package com.ss.android.ugc.aweme.account.login.twostep;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class RecommendDeviceResponse implements Serializable {

    @InterfaceC65349Pkn("data")
    public final Data data;

    @InterfaceC65349Pkn("message")
    public final String message;

    public static /* synthetic */ RecommendDeviceResponse copy$default(RecommendDeviceResponse recommendDeviceResponse, String str, Data data, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recommendDeviceResponse.message;
        }
        if ((i & 2) != 0) {
            data = recommendDeviceResponse.data;
        }
        return recommendDeviceResponse.copy(str, data);
    }

    public final RecommendDeviceResponse copy(String str, Data data) {
        return new RecommendDeviceResponse(str, data);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendDeviceResponse)) {
            return false;
        }
        RecommendDeviceResponse recommendDeviceResponse = (RecommendDeviceResponse) obj;
        return o.LJ(this.message, recommendDeviceResponse.message) && o.LJ(this.data, recommendDeviceResponse.data);
    }

    public int hashCode() {
        String str = this.message;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Data data = this.data;
        return hashCode + (data != null ? data.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecommendDeviceResponse(message=");
        LIZ.append(this.message);
        LIZ.append(", data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* loaded from: classes7.dex */
    public static final class Data implements Serializable {

        @InterfaceC65349Pkn("device_info")
        public final List<RecommendDevice> deviceInfo;

        @InterfaceC65349Pkn("error_code")
        public final Integer errorCode;

        @InterfaceC65349Pkn("description")
        public final String errorDescription;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Data copy$default(Data data, List list, String str, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                list = data.deviceInfo;
            }
            if ((i & 2) != 0) {
                str = data.errorDescription;
            }
            if ((i & 4) != 0) {
                num = data.errorCode;
            }
            return data.copy(list, str, num);
        }

        public final Data copy(List<RecommendDevice> list, String str, Integer num) {
            return new Data(list, str, num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return o.LJ(this.deviceInfo, data.deviceInfo) && o.LJ(this.errorDescription, data.errorDescription) && o.LJ(this.errorCode, data.errorCode);
        }

        public int hashCode() {
            List<RecommendDevice> list = this.deviceInfo;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            String str = this.errorDescription;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.errorCode;
            return hashCode2 + (num != null ? num.hashCode() : 0);
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Data(deviceInfo=");
            LIZ.append(this.deviceInfo);
            LIZ.append(", errorDescription=");
            LIZ.append(this.errorDescription);
            LIZ.append(", errorCode=");
            return s0.LIZJ(LIZ, this.errorCode, ')', LIZ);
        }

        public final List<RecommendDevice> getDeviceInfo() {
            return this.deviceInfo;
        }

        public final Integer getErrorCode() {
            return this.errorCode;
        }

        public final String getErrorDescription() {
            return this.errorDescription;
        }

        public Data(List<RecommendDevice> list, String str, Integer num) {
            this.deviceInfo = list;
            this.errorDescription = str;
            this.errorCode = num;
        }
    }

    public final Data getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public RecommendDeviceResponse(String str, Data data) {
        this.message = str;
        this.data = data;
    }
}
